package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class lyft {
}

/**
 * 1. malformat input file is a big problem? cause very complicate code.
 */
class InMemeoryDB {
    enum Type {
        Set,
        Unset,
        Block,
        Commit,
        Rollback,
        Get
    }
    class Action {
        public Type actionType;
        public int key;
        public int value;

        public Action (Type type, int actionkKey, int actionValue) {
            actionType = type;
            key = actionkKey;
            value = actionValue;
        }
    }

    class BufferNotClearException extends Exception {
        public BufferNotClearException() {
            super("Execution buffer is not empty. please commit or rollback first");
        }
    }

    class EmptyValueException extends Exception {
        public EmptyValueException() {
            super("There is no value associate with the key");
        }
    }
    class UnBlockedException extends Exception {
        public UnBlockedException() {
            super("Before Modify the DB, obtain the block first");
        }
    }
    class DoubleBlockedException extends Exception {
        public DoubleBlockedException() {
            super("DB is blocked, commit or rollback first");
        }
    }
    class NotBlockedException extends Exception {
        public NotBlockedException() {
            super("DB is not blocked, block it before commit or rollback first");
        }
    }

    Map<Integer, List<Integer>> map;
    Map<Integer, Integer> numOfValue;
    List<Action> actionBuffer;
    boolean isBlocked;

    public InMemeoryDB() {
        map = new HashMap<>();
        numOfValue = new HashMap<>();
        actionBuffer = new ArrayList<>();
    }

    public void process() throws Exception {
        try {
            File inputFile = new File("/Users/davidduan/test.txt");
            BufferedReader br = new BufferedReader(new FileReader(inputFile));

            String s;
            while ((s = br.readLine()) != null) {
                Action action = processCommand(s);
                if (action == null) {
                    continue;
                }
                switch (action.actionType) {
                    case Block:
                        block();
                        break;
                    case Set:
                    case Unset:
                        bufferCommand(action);
                        break;
                    case Commit:
                        commit();
                        break;
                    case Rollback:
                        rollback();
                        break;
                    case Get:
                        get(action.key);
                        break;
                    default:
                        break;

                }
            }
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
    }

    private Action processCommand(String s) {
        try{
            String[] arr = s.split(" ");
            if (arr.length == 3 && arr[0].equals("SET")) {
                Action action =
                        new Action(Type.Set,
                                Integer.parseInt(arr[1]),
                                Integer.parseInt(arr[2]));
                return action;
            } else if (arr.length == 1) {
                if (arr[0].equals("BLOCK")) {
                    Action action = new Action(Type.Block, -1, -1);
                    return action;
                } else if (arr[0].equals("COMMIT")) {
                    Action action = new Action(Type.Commit, -1, -1);
                    return action;
                } else if (arr[0].equals("ROLLBACK")) {
                    Action action = new Action(Type.Rollback, -1, -1);
                    return action;
                }
            } else if (arr.length == 2) {
                if (arr[0].equals("GET")) {
                    return new Action(Type.Get, Integer.parseInt(arr[1]), -1);
                } else if (arr[0].equals("UNSET")) {
                    return new Action(Type.Unset, Integer.parseInt(arr[1]), -1);
                }
            }
        } catch (NumberFormatException ex) {
            System.out.println(ex.toString());
        }
        return null;
    }

    private void block() throws Exception {
        if (!actionBuffer.isEmpty()) {
            throw new BufferNotClearException();
        }
        if (isBlocked) {
            throw new DoubleBlockedException();
        }
        isBlocked = true;
    }

    private void commit() throws NotBlockedException{
        if (!isBlocked) {
            throw new NotBlockedException();
        }
        for (Action action : actionBuffer) {
            if (action.actionType == Type.Set) {
                set(action.key, action.value);
            } else if (action.actionType == Type.Unset){
                unset(action.key);
            }
        }
        actionBuffer.clear();
        isBlocked = false;
    }

    private void rollback() throws NotBlockedException {
        if (!isBlocked) {
            throw new NotBlockedException();
        }
        actionBuffer.clear();
        isBlocked = false;
    }

    private int get(int key) throws EmptyValueException {
        List<Integer> res = map.getOrDefault(key, new ArrayList<>());
        if (res.size() < 1) {
            throw new EmptyValueException();
        }
        System.out.println(res.get(res.size() -1));
        return res.get(res.size()-1);
    }

    private void set(int key, int value) {
        List<Integer> res = map.getOrDefault(key, new ArrayList<>());
        if (res.size() > 0) {
            decreaseNumOfValue(res.get(res.size()-1));
        }
        res.add(value);
        map.put(key, res);
        increaseNumOfValue(value);
    }

    private void unset(int key) {
        List<Integer> res = map.getOrDefault(key, new ArrayList<>());
        if (res.size() > 0) {
            decreaseNumOfValue(res.get(res.size()-1));
            res.remove(res.size()-1);
        }
    }

    private void bufferCommand(Action action) throws UnBlockedException {
        if (!isBlocked) {
            throw new UnBlockedException();
        }
        actionBuffer.add(action);
    }

    private void increaseNumOfValue(int value) {
        int count = numOfValue.getOrDefault(value, 0);
        count++;
        numOfValue.put(value, count);
    }

    private void decreaseNumOfValue(int value) {
        int count = numOfValue.getOrDefault(value, 0);
        if (count > 0) {
            count--;
            numOfValue.put(value, count);
        }
    }

    public int getNumOfValue(int val) {
        return numOfValue.getOrDefault(val, 0);
    }
}


/**
 * LRU if this need to be multi thread, I need to be very careful.
 * multi thread?
 * async download?
 */
class LRU_ImageDownaloder {
    class CacheNode{
        String mUri;
        long mFileSize;
        boolean mDownloaded;
        CacheNode prev;
        CacheNode next;

        public CacheNode(String uri) {
            mUri = uri;
        }
    }

    CacheNode first = new CacheNode("");
    CacheNode last = new CacheNode("");

    Map<String, CacheNode> map = new HashMap<>();
    private ExecutorService pool = Executors.newFixedThreadPool(5);

    public void processInstruction(String filePath) throws Exception{
        File inputFile = new File(filePath);
        BufferedReader br = new BufferedReader(new FileReader(inputFile));
        int size = Integer.parseInt(br.readLine());
        int cacheSize = Integer.parseInt(br.readLine());
        if (cacheSize <= 0) {
            return;
        }
        first.next = last;
        last.prev = first;
        int count = 0;

        String str;
        while((str = br.readLine()) != null) {
            synchronized (map) { // no need to lock here. assume only 1 thread use this cache.
                if (map.containsKey(str)) {
                    // move the item to the first;
                    CacheNode tmp = map.get(str);
                    System.out.println(str + " IN CACHE");
                    moveToFront(tmp);
                } else {
                    // insert a new item to the beginning
                    final CacheNode tmp = new CacheNode(str);
                    insertToFront(tmp, str);
                    final String urlStr = new String(str);
                    pool.execute(new Runnable() {
                        @Override
                        public void run() {
                            download(urlStr, tmp);
                        }
                    });
                    //download(str);
                    count++;

                    while (count > cacheSize) {
                        // remove the last one.
                        removeTheLast();
                        count--;
                    }
                }
            }
        }
    }

    private void moveToFront(CacheNode node) {
        synchronized (node) {
            node.prev.next = node.next;
            node.next.prev = node.prev;
            node.next = first.next;
            first.next = node;
            node.prev = first;
            node.next.prev = node;
        }
    }

    private void removeTheLast() {
        CacheNode x = last.prev;
        if (x == first) {
            return;
        }
        x.prev.next = last;
        last.prev = x.prev;
        map.remove(x.mUri);
    }

    private void insertToFront(CacheNode node, String path) {
        node.next = first.next;
        first.next = node;
        node.prev = first;
        node.next.prev = node;
        map.put(path, node);
    }

    private void download(String uri, CacheNode node){
        try {
            URL url = new URL(uri);
            String fileName = uri.substring(uri.lastIndexOf('/') + 1, uri.length());
            Path targetPath = new File(fileName).toPath();
            Files.copy(url.openStream(), targetPath, StandardCopyOption.REPLACE_EXISTING);
            long fileSize = targetPath.toFile().length();
            synchronized (node) {
                node.mDownloaded = true;
                node.mFileSize = fileSize;
            }
            System.out.println(uri + " DOWNLOADED " + String.valueOf(fileSize));
        } catch (Exception ex) {
            System.out.println(uri + " DOWNLOADED Failed");
        }
    }
}

class Solution_FindRange{
    public int[] find(int[] input, int start, int end) {
        int l = 0;
        int r = input.length -1;
        int[] res = new int[2];
        if (input.length == 0) {
            return res;
        }
        Arrays.fill(res, -1);

        while(l <= r) {
            int m = l + (r-l)/2;
            if ((m ==0  || start > input[m-1]) && start <= input[m]) {
                res[0] = m;
                break;
            }

            if (start > input[m]) {
                l = m+1;
            } else {
                r = m-1;
            }
        }

        l = 0;
        r = input.length-1;
        while(l<=r) {
            int m = l + (r-l)/2;
            if (((m == input.length-1) || end < input[m+1]) && end >= input[m]) {
                res[1] = m;
                break;
            }

            if (input[m] > end) {
                r = m - 1;
            } else {
                l = m+1;
            }
        }
        return res;
    }
}

