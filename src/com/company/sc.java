package com.company;


import edu.princeton.cs.algs4.DirectedEdge;
import edu.princeton.cs.algs4.EdgeWeightedDigraph;
import edu.princeton.cs.algs4.IndexMinPQ;

import java.util.*;

// https://qiuzhihui.gitbooks.io/r-book/content/sc_onsite.html
public class sc {
}

class p1_AmicableNuber {
    public Set<List<Integer>> findAll(int[] input) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i< input.length; i++) {
            Set<Integer> set = new HashSet<>();
            set.add(1);
            for(int j = 2; j <= Math.sqrt(input[i]); j++) {
                if (input[i]%j == 0) {
                    set.add(j);
                    set.add(input[i]/j);
                }
            }
            int sum = 0;
            for(Integer val : set) {
                sum += val;
            }
            map.put(input[i], sum);
        }
        Set<List<Integer>> res = new HashSet<>();
        for(Integer key : map.keySet()) {
            int sum = map.get(key);
            if (map.keySet().contains(sum)) {
                List<Integer> list = new ArrayList<>();
                list.add(Math.min(key, sum));
                list.add(Math.max(sum, key));
                res.add(list);
            }
        }
        return res;
    }

    public Set<int[]> find(int n) {
        Set<int[]> res = new HashSet<>();
        if (n < 2) return res;
        int[] record = new int[n];
        for(int i = 0; i < n ; i++) {
            int sum = 1;
            for(int j = 2; j <= Math.sqrt(i+1); j++) {
                if ((i+1)%j == 0) {
                    sum += j;
                    sum += (i+1)/j;
                }
                record[i] = sum;
            }
        }

        for(int i = 0; i< n; i++) {
            if ((i+1) < record[i] &&
                    record[i] <=n &&
                    record[record[i]-1] == i+1) {
                res.add(new int[] {i+1, record[i]});
            }
        }
        return res;
    }

}


class p3 {
    public int find(int[] input) {
        int n = input.length;
        if (n == 3) {
            return input[0] + input[1] + input[2];
        } else if (n ==2) {
            return Math.max(input[0], input[1]);
        } else if (n == 1) {
            return input[0];
        } else {
            Arrays.sort(input);
            int i = n -1;
            int sum = 0;
            while(i > 2) {
                sum += Math.min(input[0] + input[i] + input[0] + input[i-1],
                        input[0] + input[1] + input[1] + input[i]);
                i = i-2;
            }
            if (i == 2) {
                sum += (input[0] + input[1] + input[2]);
            } else if (i == 1) {
                sum += Math.max(input[0], input[1]);
            } else if (i == 0) {
                sum += input[0];
            }
            return sum;
        }
    }
}

/**
 * Length 2D dp.
 */
class p4 {
    public int findMax(int[] input) {
        int n = input.length;
        int[][] dp = new int[n][n];
        for(int i = 0; i < n; i++) {
            dp[i][i] = input[i];
        }
        for(int l =2; l <= n; l++){
            for(int i = 0; i <= n-l; i++) {
                int j = i+l-1;
                for(int k = i; k < j; k++) {
                    int tmp = Math.max(dp[i][k]+ dp[k+1][j],
                            dp[i][k] * dp[k+1][j]);
                    dp[i][j] = Math.max(dp[i][j], tmp);
                }
            }
        }
        return dp[0][n-1];
    }
}

class p5_3d_grid {

}

class p8_html_parser {
    class TreeNode {
        List<TreeNode> children;
        String content;
        public TreeNode(String s) {
            content = s;
            children = new ArrayList<>();
        }
    }
    int index;

    public TreeNode buildTree(String[][] input) {
        int n = input.length;
        TreeNode res = process(input);
        return res;
    }

    private TreeNode process(String[][] input) {
        if (index >= input.length) {
            return null;
        }
        String name = input[index][0];
        String type = input[index][1];
        TreeNode res= null;
        if ((type).equals("close")) {
            return null;
        }
        if ((type).equals("text")) {
            res = new TreeNode(name);
            index++;
            return res;
        } else if ((type).equals("open")) {
            res = new TreeNode(name);
            index++;
            TreeNode tmp;
            while((tmp = process(input)) != null) {
                res.children.add(tmp);
            }
            index++;
        }
        return res;
    }
}

/**
 * this return the ture/false of if I can find a route
 * still need backtrack to find the path.
 */
class p9_2D {
    int[] dx = new int[] {-1, 1, 0, 0, 1, 1, -1, -1};
    int[] dy = new int[] {0, 0, -1, 1, -1, 1, -1, 1};

    public boolean canPasss(int[][] input, int[][] radar, int r) {
        // assum all input array element are 0,0
        // 1 mark all ragar reachable are as 1;
        int m = input.length;
        int n = input[0].length;

        int t = radar.length;
        for(int i = 0; i < t; i++) {
            int x = radar[i][0];
            int y = radar[i][1];
            for (int k = 0; k < 8; k++) {
                if (x+dx[k] >=0 && x+dx[k] < m && (y + dy[k]) >= 0 && (y+dy[k]) < n) {
                    input[x+dx[k]][y+dy[k]] = 1;
                }
            }
        }

        Queue<int[]> q = new LinkedList<>();
        for(int i = 0; i< m; i++) {
            if(input[i][0] != 1) {
                q.add(new int[]{i,0});
                input[i][0] = 1;
            }
        }

        while(!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0];
            int y = cur[1];
            if (y == n-1) {
                return true;
            }
            for (int k = 0; k < 4; k++) {
                if (x+dx[k] >=0 && x+dx[k] < m && (y + dy[k]) >= 0 && (y+dy[k]) < n) {
                    if(input[x+dx[k]][y+dy[k]] != 1) {
                        input[x + dx[k]][y + dy[k]] = 1;
                        q.add(new int[]{x + dx[k],y + dy[k]});
                    }
                }
            }
        }
        return false;
    }
}

class p10_ternary {
    public String parseTernary(String expression) {
        int n = expression.length();
        if (n == 0) return null;

        Stack<Character> stack = new Stack<>();
        int i = n-1;
        while(i >=0) {
            if (expression.charAt(i) == '?') {
                Character a = stack.pop();
                Character b = stack.pop();
                if (expression.charAt(i-1) == 'T') {
                    stack.push(a);
                } else {
                    stack.push(b);
                }
                i--;
            } else if (expression.charAt(i) != ':') {
                stack.push(expression.charAt(i));
            }
            i--;
        }
        return stack.pop().toString();
    }

}

class p12_UglyNumber {
    public int findnth(int n) {
        int[] t = new int[n];
        t[0] = 1;
        int index2 = 0;
        int index3 = 0;
        int index5 = 0;
        for(int i = 1; i < n; i++) {
            int val = Math.min(2*t[index2], Math.min(3*t[index3], 5*t[index5]));
            t[i] = val;
            if (val == 2*t[index2]) {index2++;}
            if (val == 3*t[index3]) {index3++;}
            if (val == 5*t[index5]) {index5++;}
        }
        return t[n-1];
    }

    public int findnthII(int n) {
        PriorityQueue<Long> p = new PriorityQueue<>();
        Set<Long> s = new HashSet<>();
        p.add(1l);
        s.add(1l);
        int[] t = new int[n];
        for(int i = 0; i < n; i++) {
            t[i] = Integer.parseInt(p.poll().toString());
            if (!s.contains((long)2*t[i])) {
                p.add((long)2 * t[i]);
                s.add((long)2*t[i]);
            }
            if (!s.contains((long)3*t[i])) {
                p.add((long)3*t[i]);
                s.add((long)3*t[i]);
            }
            if (!s.contains((long)5*t[i])) {
                p.add((long)5*t[i]);
                s.add((long)5*t[i]);
            }
        }
        return t[n-1];
    }
}

class p13_merge_ksortedlist{

    class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }

    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> q = new PriorityQueue<>((a,b) -> a.val - b.val);
        ListNode dummy = new ListNode(-1);
        ListNode tmp = dummy;
        int m = lists.length;
        if (m == 0) {return dummy.next;}
        for(int i = 0; i < m; i++) {
            q.add(lists[i]);
        }
        while(!q.isEmpty()) {
            tmp.next = q.poll();
            tmp = tmp.next;
            if (tmp.next != null) {
                q.add(tmp.next);
            }
        }
        return dummy.next;
    }
}

class p29_332 {
    List<String> itinerary = new ArrayList<>();
    public List<String> findItinerary(String[][] tickets) {
        Map<String, List<String>> map = new HashMap<>();
        int m = tickets.length;
        for(int i = 0; i < m; i++){
            List<String> dest = map.getOrDefault(tickets[i][0], new ArrayList<>());
            dest.add(tickets[i][1]);
            map.put(tickets[i][0], dest);
        }

        for(String s : map.keySet()) {
            List<String> dest = map.getOrDefault(s, new ArrayList<>());
            Collections.sort(dest);
            // may need to put sorted arraylist back to map?
        }
        dfs("JFK", map);
        Collections.reverse(itinerary);
        return itinerary;
    }

    private void dfs(String s, Map<String, List<String>> map) {
        List<String> dests = map.get(s);
        while(dests != null && !dests.isEmpty()) {
            String next = dests.get(0);
            dests.remove(0);
            dfs(next, map);
        }
        itinerary.add(s);
    }
}

class p7_hungarianAlgorithm {
    int minCost = Integer.MAX_VALUE;
    public int findCost(int[][] input) {
        int n = input.length;
        int[] set = new int[n];
        Arrays.fill(set, -1);
        dfs(n, input, 0, set);
        return minCost;
    }

    private void dfs(int n, int[][]input, int index, int[] set) {
        if (index == n) {
            int cost = findCost(input, set);
            minCost = Math.min(minCost, cost);
            return;
        }
        for(int i = 0; i < n; i++) {
            if (checkIndex(set, i)) {
                set[index] = i;
                dfs(n, input, index+1, set);
                set[index] = -1;
            }
        }
    }

    private int findCost(int[][] input, int[] set) {
        int res = 0;
        for (int i = 0; i < set.length; i++) {
            res += input[i][set[i]];
        }
        return res;
    }

    private boolean checkIndex(int[] set, int k) {
        for(int i = 0; i < set.length; i++) {
            if (set[i] == k) {
                return false;
            }
        }
        return true;
    }
}

/**
 * no dup
 */
class px_rotationArray{
    public int search(int[] nums, int target) {
        int n = nums.length;
        if (n == 0) return -1;
        int l = 0;
        int r = n-1;
        while(l < r) {
            int mid = l + (r-l)/2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[l] <= nums[mid]) {
                if (nums[l] <= target && target < nums[mid]) {
                    r = mid-1;
                } else {
                    l = mid+1;
                }
            } else {
                if (nums[mid] < target && target <= nums[r]) {
                    l = mid + 1;
                } else {
                    r = mid -1;
                }
            }
        }
        if (nums[l] == target) {
            return l;
        }
        return -1;
    }

    public int searchWithDup(int[] nums, int target) {
        int n = nums.length;
        if (n == 0) return -1;
        int l = 0;
        int r = n-1;
        while(l < r) {
            int mid = l + (r-l)/2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[l] < nums[mid]) {
                if (nums[l] <= target && target < nums[mid]) {
                    r = mid-1;
                } else {
                    l = mid+1;
                }
            } else if (nums[l] > nums[mid]) {
                if (nums[mid] < target && target <= nums[r]) {
                    l = mid + 1;
                } else {
                    r = mid -1;
                }
            } else {
                l ++;
            }
        }
        if (nums[l] == target) {
            return l;
        }
        return -1;
    }

    public int searchII(int[] nums, int target) {
        int n = nums.length;
        if (n == 0) return -1;
        int minIndex = findMin(nums);
        if (target == nums[minIndex]) return minIndex;

        int l = target <= nums[n-1] ? minIndex : 0;
        int r = target > nums[n-1] ? minIndex : n-1;

        while(l < r) {
            int mid = l + (r-l)/2;
            if (nums[mid] == target) { return mid; }
            if (nums[mid] < target) {
                l = mid+1;
            } else {
                r = mid-1;
            }
        }
        if (nums[l] == target) {
            return l;
        }
        return -1;
    }

    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        while(l < r) {
            int mid = l + (r-l)/2;
            if (nums[mid] < nums[r]) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }
}

class p14_8x8 {
//    public int find(int[] start, int[] end) {
//        int[][] dp = new int[8][8]
//    }
}

class px_WordLadderII {
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        List<List<String>> res = new ArrayList<>();
        Set<String> set = new HashSet<>(wordList);

        if(!set.contains(endWord)) {return res;}
        set.remove(endWord);

        final int l = beginWord.length();
        Set<String> q = new HashSet<>();
        q.add(beginWord);
        Set<String> p = new HashSet<>();
        Map<String, Set<String>> children = new HashMap<>();
        boolean found = false;

        while(!q.isEmpty() && !found) {
            for(String s : q) {
                set.remove(s);
            }

            for(String s : q) {
                char[] cur = s.toCharArray();
                for(int i = 0; i < l; i++) {
                    char ch = cur[i];
                    for(int j = 'a'; j <= 'z'; j++) {
                        cur[i] = (char)j;
                        if (String.valueOf(cur).equals(endWord)) {
                            found = true;
                            Set<String> tmp = children.getOrDefault(s, new HashSet<>());
                            tmp.add(String.valueOf(cur));
                            children.put(s, tmp);
                        } else if(set.contains(String.valueOf(cur)) && !found) {
                            p.add(String.valueOf(cur));
                            Set<String> tmp = children.getOrDefault(s, new HashSet<>());
                            tmp.add(String.valueOf(cur));
                            children.put(s, tmp);
                        }
                    }
                    cur[i] = ch;
                }
            }
            q = p;
            p = new HashSet<>();
        }

        if (found) {
            List<String> path = new ArrayList<>();
            path.add(beginWord);
            findAllPath(beginWord, endWord, children, path, res);
        }
        return res;
    }

    private void findAllPath(String word,
                             String endWord,
                             Map<String, Set<String>> children,
                             List<String> path,
                             List<List<String>> res) {
        if (word.equals(endWord)) {
            res.add(new ArrayList<>(path));
            return;
        }
        Set<String> set = children.get(word);
        if (set == null) {return;}
        for(String s : set) {
            path.add(s);
            findAllPath(s, endWord, children, path, res);
            path.remove(path.size()-1);
        }
    }
}

class px_Codec {
    StringBuilder res;
    int index;
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder res = new StringBuilder();
        dfs(root);
        res.deleteCharAt(res.length()-1);
        return res.toString();
    }

    private void dfs(TreeNode root) {
        if (root == null) {
            res.append("null");
            res.append(",");
            return;
        }
        res.append(String.valueOf(root.val));
        res.append(",");
        dfs(root.left);
        dfs(root.right);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] arr = data.split(",");
        index = 0;
        return process(arr);
    }

    private TreeNode process(String[] arr){
        if (arr[index].equals("null")) {
            index++;
            return null;
        } else {
            TreeNode root = new TreeNode(Integer.parseInt(arr[index]));
            index++;
            root.left = process(arr);
            root.right = process(arr);
            return root;
        }
    }
}

class p17_Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int m = preorder.length;
        int n = inorder.length;
        if (m == 0 || n == 0 || m != n) return null;
        return build(preorder, inorder, 0, m-1, 0,m-1);
    }

    private TreeNode build(
            int[] preorder,
            int[] inorder,
            int pi,
            int pj,
            int ii,
            int ij) {
        if (pi == pj) {
            return new TreeNode(preorder[pi]);
        } else if(pi > pj || ii > ij) {
            return null;
        }

        int val = preorder[pi];
        int pivot = -1;
        for(int i = ii; i<=ij; i++) {
            if (inorder[i] == val) {
                pivot = i;
                break;
            }
        }
        int leftlength = pivot - ii;

        TreeNode root = new TreeNode(preorder[pi]);
        TreeNode left = build(preorder, inorder, pi+1, pi+leftlength, ii, pivot-1);
        TreeNode right = build(preorder, inorder,pi+leftlength+1, pj, pivot+1, ij);
        root.left = left;
        root.right = right;
        return root;
    }
}

class p6_Solution {
//    List<Long[]> badIp;
    Map<Integer, Set<Long>> badIp;
    public void takeIPRange(String[] input) {
        badIp = new HashMap<>();
        for (String s : input) {
            String[] cidr = s.split("/");
            Long[] prefix = ipToLong(cidr[0], cidr[1]);
            Set<Long> set = badIp.getOrDefault(Integer.parseInt(cidr[1]), new HashSet<>());
            set.add(prefix[0]);
            badIp.put(Integer.parseInt(cidr[1]), set);
        }
    }

    public boolean isBadIp(String ip) {
        String[] seg = ip.split("\\.");
        long x = 0;
        for(int i = 0; i< seg.length; i++) {
            x = x * 256 + Integer.parseInt(seg[i]);
        }

        for(Integer offset : badIp.keySet()) {
            if (badIp.get(offset).contains(x >> (32-offset))) {
                return true;
            }
        }
        return false;
    }

    private Long[] ipToLong(String s, String bit) {
        String[] seg = s.split("\\.");
        long x = 0;
        for(int i = 0; i< seg.length; i++) {
            x = x * 256 + Integer.parseInt(seg[i]);
        }
        int length = Integer.parseInt(bit);
        return new Long[]{x>>(32-length), (long)length};
    }
}

class p14 {
    public int findWays(int i, int j, int m, int n, int steps, int size) {
        int[][] dp = new int[size][size];
        Queue<int[]> q = new LinkedList<>();
        q.add(null);
        int k = 0;
        int[] dx = new int[] {0,0,1,-1};
        int[] dy = new int[] {1,-1,0,0};
        while(k < steps && !q.isEmpty()) {
            int[] cur = q.poll();
            if (cur == null) {
                if (!q.isEmpty()) {
                    q.add(null);
                    k++;
                    continue;
                }
            } else {
                int x = cur[0];
                int y = cur[1];
                for(int l = 0; l < 4; l++) {
                    if (x+ dx[l] >=0 &&
                        x+dx[l] < size &&
                        y+ dy[l] >= 0 &&
                        y + dy[l] <size) {
                        q.add(new int[]{x+dx[l], y+dy[l]});
                    }
                }
                dp[x][y]++;
            }
        }
        return dp[m][n];
    }
}

class p_16Solution {
    class TrieNode {
        TrieNode[] next = new TrieNode[26];
        String word;
    }

    public List<String> findWords(char[][] board, String[] words) {
        List<String> res = new ArrayList<>();
        int m = board.length;
        if (m == 0) return res;
        int n = board[0].length;
        if (n == 0) return res;
        TrieNode root = buildTrieNode(words);
        for(int i = 0; i< m; i++) {
            for(int j = 0; j < n; j++) {
                dfs(board,i,j,root, res);
            }
        }
        return res;
    }

    int[] dx = new int[]{0,0,-1,1};
    int[] dy = new int[]{1,-1,0,0};
    private void dfs(char[][] board, int i, int j, TrieNode p, List<String> res) {
        char c = board[i][j];
        if (c == '#' || p.next[c- 'a'] == null) {
            return;
        }
        p = p.next[c - 'a'];
        if (p.word != null) {
            res.add(p.word);
            p.word = null;
        }

        board[i][j] = '#';
        for(int k = 0; k< 4; k++) {
            if (i + dx[k] >=0 &&
                    i + dx[k] < board.length &&
                    j + dy[k] >= 0 &&
                    j + dy[k] < board[0].length) {
                dfs(board, i+dx[k], j+dy[k], p, res);
            }
        }
        board[i][j] = c;
    }

    public TrieNode buildTrieNode(String[] words) {
        TrieNode root = new TrieNode();
        TrieNode p;
        for(String s : words) {
            p = root;
            for(int i = 0; i < s.length(); i++) {
                if(p.next[s.charAt(i) - 'a'] == null) {
                    p.next[s.charAt(i) - 'a'] = new TrieNode();
                }
                p = p.next[s.charAt(i) - 'a'];
            }
            p.word = s;
        }
        return root;
    }
}


class p19_solution317 {
//    public int shortestDistance(int[][] grid) {
//        int m = grid.length;
//        int n = grid[0].length;
//
//
//    }
}



//class p31 {
//    class Person {
//        List<Person> friend;
//    }
//
//    public int findFriendDistance(Person a, Person b) {
//        Set<Person> aFriend = new HashSet<>();
//        Set<Person> bFriend = new HashSet<>();
//
//        Map<Person, Person> aMap = new HashMap<>();
//        Map<Person, Person> bMap = new HashMap<>();
//
//        Queue<Person> aQ = new LinkedList<>();
//        int i = 0;
//        aQ.add(a);
//        aQ.add(null);
//        while(i <=3) {
//            Person p = aQ.poll();
//            if (p == null) {
//                i++;
//                aQ.add(null);
//                continue;
//            }
//            for(Person person : p.friend) {
//                if (person == b) {
//                    // create the result and return;
//                }
//                if (!aMap.containsKey(person)) {
//                    aMap.put(person, p);
//                }
//                if (!aFriend.contains(person)) {
//                    aFriend.add(person);
//                    aQ.add(person);
//                }
//            }
//        }
//
//        Queue<Person> bQ = new LinkedList<>();
//        i = 0;
//        bQ.add(b);
//        bQ.add(null);
//        while(i <=3) {
//            Person p = bQ.poll();
//            if (p == null) {
//                i++;
//                bQ.add(null);
//                continue;
//            }
//            for(Person person : p.friend) {
//                if (person == a) {
//                    // create the result and return;
//                }
//                if(!bMap.containsKey(person)) {
//                    bMap.put(person, p);
//                }
//                if (!bFriend.contains(person)) {
//                    bFriend.add(person);
//                    bQ.add(person);
//                }
//            }
//        }
//
//        for(Person bF : bFriend) {
//            if (aFriend.contains(bF)) {
//                // search both end on aMap and bMap
//            }
//        }
//
//    }
//}

// p32 -- sort k sorted list.....

// p33 -- knight jump, should be fine...

// p34 -- just did.
class Solution486_p34 {
    public boolean PredictTheWinner(int[] nums) {
        int m = nums.length;
        int[][] dp = new int[m][m];
        for(int i = 0;i<m; i++) {
            Arrays.fill(dp[i], -1);
        }
        for (int i = 0; i< m; i++) {
            dp[i][i] = nums[i];
        }
        util(nums, dp, 0, m-1);
        int sum = 0;
        for (int i = 0; i< nums.length; i++) {
            sum += nums[i];
        }

        return dp[0][m-1] > sum/2;

    }

    private int util(int[] nums, int[][] dp, int l, int r) {
        if (l >=r) {return 0;}
        if (dp[l][r] != -1) {
            return dp[l][r];
        }

        int a = nums[l] + Math.min(util(nums, dp, l+2, r), util(nums, dp, l+1, r-1));
        int b = nums[r] + Math.min(util(nums, dp, l, r-2), util(nums, dp, l+1, r-1));

        dp[l][r] = Math.max(a,b);
        return dp[l][r];
    }
}

// p35
class Solution101 {
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode r1, TreeNode r2) {
        if (r1 == null && r2 == null) { return true;}
        if (r1 == null || r2 == null) { return false;}
        return r1.val == r2.val &&
                isMirror(r1.left, r2.right) &&
                isMirror(r1.right, r2.left);
    }
}

// p36
class Solution139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> set = new HashSet<>();
        for(String str : wordDict) {
            set.add(str);
        }

        boolean[] dp = new boolean[s.length()+1];
        dp[0] = true;

        for (int i = 1; i <= s.length(); i++) {
            for (int j = i-1; j>=0; j--) {
                if (dp[j] && set.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}

class Dijkstra {

    private double[] distTo;
    private DirectedEdge[] lastEdgeTo;
    private IndexMinPQ<Double> pq;

    public Dijkstra(EdgeWeightedDigraph graph, int source) {
        for(DirectedEdge edge : graph.edges()) {
            if (edge.weight() < 0) {
                throw new IllegalArgumentException("akflsfj;f");
            }
        }

        distTo = new double[graph.V()];
        lastEdgeTo = new DirectedEdge[graph.V()];

        for(int i = 0; i< graph.V(); i++) {
            distTo[i] = Double.POSITIVE_INFINITY;
        }
        distTo[source] = 0.0;

        pq.insert(source, distTo[source]);
        while(!pq.isEmpty()) {
            int v = pq.delMin();
            for(DirectedEdge edge : graph.adj(v)) {
                relax(edge);
            }
        }
    }

    private void relax(DirectedEdge edge) {
        int v = edge.from();
        int w = edge.to();

        if (distTo[w] > distTo[v] + edge.weight()) {
            distTo[w] = distTo[v] + edge.weight();
            lastEdgeTo[w] = edge;
            if (pq.contains(w)) {
                pq.decreaseKey(w, distTo[w]);
            } else {
                pq.insert(w, distTo[w]);
            }
        }
    }

}

class Solution_385_I {
    class NestedInteger {
        // Constructor initializes an empty nested list.
        public NestedInteger() {}

        // Constructor initializes a single integer.
        public NestedInteger(int value){}

        // @return true if this NestedInteger holds a single integer, rather than a nested list.
        public boolean isInteger(){return true;}

        // @return the single integer that this NestedInteger holds, if it holds a single integer
        // Return null if this NestedInteger holds a nested list
        public Integer getInteger() {return null;}

        // Set this NestedInteger to hold a single integer.
        public void setInteger(int value) {return;}

        // Set this NestedInteger to hold a nested list and adds a nested integer to it.
        public void add(NestedInteger ni) {}

        // @return the nested list that this NestedInteger holds, if it holds a nested list
        // Return null if this NestedInteger holds a single integer
        public List<NestedInteger> getList() {return null;}
    }

    public NestedInteger deserialize(String s) {
        NestedInteger res = new NestedInteger();
        if (s == null || s.length() == 0) return res;
        if(!s.startsWith("[")) {
            res.setInteger(Integer.parseInt(s));
        } else if (s.length() >2) {
            int start = 1, count = 0;
            for (int i = 1; i < s.length(); i++) {
                char c = s.charAt(i);
                if (count == 0 && (c == ',' || i == s.length() -1)) {
                    res.add(deserialize(s.substring(start, i)));
                    start = i+1;
                } else if(c == '[') {
                    count++;
                } else if (c == ']') {
                    count--;
                }
            }
        }
        return res;
    }
}

// need to write p20.


class Solution_33_p5 {
    public int search(int[] nums, int target) {
        int m = nums.length;
        int l = 0;
        int r = m-1;
        while(l<r) {
            int mid = l + (r-l)/2;
            if (nums[mid] == target) {
                return mid;
            }

            if (nums[l] < nums[mid]) {
                if (nums[l] <= target && target < nums[mid]) {
                    r = mid-1;
                } else {
                    l = mid+1;
                }
            } else if (nums[l] > nums[mid]) {
                if (nums[mid] < target && target <= nums[r]) {
                    l = mid+1;
                } else {
                    r = mid-1;
                }
            } else {
                l++;
            }
        }
        if (nums[l] == target) {
            return l;
        }
        return -1;
    }
}


class Solution114 {
    public void flatten(TreeNode root) {
        Stack<TreeNode> s = new Stack<>();
        TreeNode prev = root;
        TreeNode last = null;
        TreeNode res = new TreeNode(-1);
        last = res;
        while(prev != null || !s.isEmpty()) {
            while(prev!= null) {
                s.push(prev);
                prev = prev.left;
            }

            TreeNode x = s.pop();
            if (last != null) {
                last.right = x;
                x.left = last;
            }
            last = x;

            prev = x.right;
        }

        last = res.right;
        while(last != null) {
            System.out.println(last.val);
            last = last.right;
        }

        // res is the head of the flattened.

    }
}

class Solution679 {
    public boolean judgePoint24(int[] nums) {
        return nums[0] == 24;


    }

    private boolean dfs(double[] a) {
        if (a.length == 1) {
            return a[0] == 24;
        }

        for(int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                double[] b = new double[a.length-1];
                for (int k = 0, l = 0; k < a.length; k++) {
                    if (k != i && k != j) {
                        b[l++] = a[k];
                    }
                }
                for (double k: compute(a[i], a[j])) {
                    b[a.length-2] = k;
                    if(dfs(b)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private double[] compute(double a, double b) {
        return new double[] {a+b, a-b, b-a, a*b, a/b, b/a };
    }
}





