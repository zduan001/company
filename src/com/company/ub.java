package com.company;

import java.util.*;

public class ub {
}

// Hard
// 1. Word Pattern
class Solution291_ub {
    public boolean wordPatternMatch(String pattern, String str) {
        if (pattern == null || pattern.isEmpty()) return str.isEmpty();
        String[] map = new String[26];
        return helper(pattern, str, map);
    }

    private boolean helper(String p, String s, String[] map) {
        if (p.length() == 0) {
            return s.length() == 0;
        } else if (s.length() == 0) {
            return p.length() == 0;
        } else if (map[p.charAt(0) - 'a'] != null) {
            String cur = map[p.charAt(0) - 'a'];
            if (!s.startsWith(cur)) {
                return false;
            } else {
                return helper(p.substring(1), s.substring(cur.length()), map);
            }
        } else {
            for (int i = 1; i<= s.length(); i++) {
                String cur = s.substring(0, i);
                boolean found = false;
                for(int k = 0; k< map.length; k++) {
                    if (map[k] != null && map[k].equals(cur)) {
                        found = true;
                        break;
                    }
                }
                if (found) {continue;}
                map[p.charAt(0) - 'a'] = cur;
                if (helper(p.substring(1), s.substring(i), map)) {
                    return true;
                }
                map[p.charAt(0) - 'a'] = null;
            }
            return false;
        }
    }
}

class Solution699_ub {
    class Interval {
        int start;
        int end;
        int height;
        Interval() { start = 0; end = 0; }
        Interval(int s, int e, int h) { start = s; end = e; height = h; }
    }
    public List<Integer> fallingSquares(int[][] positions) {
        List<Integer> res = new ArrayList<>();
        List<Interval> existing = new ArrayList<>();

        int n = positions.length;
        if (n == 0) {
            return res;
        }

        int tmp = 0;
        for(int i = 0; i< positions.length; i++) {
            int maxHeight = positions[i][1];
            int start = positions[i][0];
            int end = positions[i][0] + positions[i][1];
            for (int j = 0; j< existing.size(); j++) {
                if (overLapse(start, end, existing.get(j).start, existing.get(j).end)) {
                    maxHeight = Math.max(maxHeight, existing.get(j).height + positions[i][1]);
                }
            }
            existing.add(new Interval(start, end, maxHeight));
            tmp = Math.max(tmp, maxHeight);
            res.add(tmp);
        }
        return res;
    }

    private boolean overLapse(int start1, int end1, int start2, int end2) {
        if (start1 <= start2 && start2 < end1) {
            return true;
        }
        if (start2 <= start1 && start1 < end2) {
            return true;
        }
        return false;
    }
}

class Solution297_ub_hard_3 {
    StringBuilder sb;
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        sb = new StringBuilder();
        dfs(root);
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }

    private void dfs(TreeNode root) {
        if (root == null) {
            sb.append("null");
            sb.append(",");
            return;
        }
        sb.append(String.valueOf(root.val));
        sb.append(",");
        dfs(root.left);
        dfs(root.right);
    }

    int index;
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] arr = data.split(",");
        index = 0;
        TreeNode res = des(arr);
        return res;
    }

    private TreeNode des(String[] arr) {
        if (index >= arr.length) {
            return null;
        }
        if (arr[index].equals("null")) {
            index++;
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(arr[index]));
        index++;
        root.left = des(arr);
        root.right = des(arr);
        return root;
    }
}

/**
 * 1. try 1-9 at every '.' location recursively
 * 2. at every step verify if the board is still a valid board, return early if it is not.
 *
 */
class Solution_37_ub_4 {
    public void solveSudoku(char[][] board) {
        if (board == null || board.length == 0 || board[0].length == 0) {
            return;
        }
        solve(board);
    }

    private boolean solve(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    for(char c = '1'; c <='9'; c++) {
                        if (isValid(board, i, j, c)) {
                            board[i][j] = c;
                            if (solve(board)) {
                                return true;
                            }
                            board[i][j] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isValid(char[][] board, int row, int col, char c) {
        for(int i = 0; i< 9; i++) {
            if (board[i][col] != '.' && board[i][col] == c) return false;
            if (board[row][i] != '.' && board[row][i] == c) return false;
            int x = 3*(row/3)+i/3;
            int y = 3*(col/3)+i%3;
            if (board[x][y] != '.' && board[x][y] == c) return false;
        }
        return true;
    }
}

/***
 * need to work on it.
 */
//class Solution140_ub_5 {
//    public List<String> wordBreak(String s, List<String> wordDict) {
//
//    }
//
//    private void dp(String s, int index, Set<String> dic, List<List<String>>)
//}

/**
 * All One operation.
 * similar structure can be used for LFU
 */
class AllOne_x {
    class Row{
        int count;
        Set<String> strSet;
        Row prev;
        Row next;
        public Row() {
            count = 0;
            strSet = new HashSet<>();
        }
    }
    Map<String, Row> map;
    Row mFirst;
    Row mLast;

    /** Initialize your data structure here. */
    public AllOne_x() {
        map = new HashMap<>();
        mFirst = new Row();
        mFirst.count = 0;
        mLast = new Row();
        mLast.count = Integer.MAX_VALUE;
    }

    /** Inserts a new key <Key> with value 1. Or increments an existing key by 1. */
    public void inc(String key) {
        Row cur = mFirst;
        if (map.keySet().contains(key)) {
            cur = map.get(key);
        }

        boolean shouldRemoveCur = false;
        if (cur != mFirst) {
            cur.strSet.remove(key);
            if (cur.strSet.isEmpty()) {
                shouldRemoveCur = true;
            }
        }

        Row nextRow = cur.next;
        if (nextRow.count - 1 != cur.count) {
            nextRow = addRowAfter(cur);
        }
        nextRow.count = cur.count+1;
        nextRow.strSet.add(key);
        map.put(key, nextRow);
        if (shouldRemoveCur) {
            removeRow(cur);
        }
    }

    /** Decrements an existing key by 1. If Key's value is 1, remove it from the data structure. */
    public void dec(String key) {

    }

    /** Returns one of the keys with maximal value. */
    public String getMaxKey() {
        if (mLast.prev == mFirst) {
            return null;
        }
        for(String s : mLast.prev.strSet) {
            return s;
        }
        return null;
    }

    /** Returns one of the keys with Minimal value. */
    public String getMinKey() {
        if (mFirst.next == mLast) {
            return null;
        }
        for(String s : mFirst.next.strSet) {
            return s;
        }
        return null;
    }

    private void removeRow(Row row) {
        row.prev.next = row.next;
        row.next.prev = row.prev;
    }

    private Row addRowAfter(Row row) {
        Row newRow = new Row();
        newRow.next = row.next;
        newRow.next = newRow;
        newRow.next.prev = newRow;
        newRow.prev = row;
        return newRow;
    }
}

class Solution76_ub_8 {
    public String minWindow(String s, String t) {
        int[] map = new int[256];
        int[] tmp = new int[256];
        for(int i = 0; i < t.length(); i++) {
            map[t.charAt(i)]++;
        }
        int res = Integer.MAX_VALUE;
        int left = -1;
        int right = -1;
        int r = 0;
        int l = 0;

        while(r <s.length()) {
            tmp[s.charAt(r)]++;
            while(l <= r && check(map, tmp)) {
                if (res > (r-l+1)) {
                    res = r - l +1;
                    left = l;
                    right = r;
                }
                tmp[s.charAt(l)]--;
                l++;
            }
            r++;
        }
        if(left == -1) {
            return "";
        }
        return s.substring(left, right+1);

    }

    private boolean check(int[] a, int[] b) {
        for(int i = 0; i< a.length; i++) {
            if (a[i] > b [i]) {
                return false;
            }
        }
        return true;
    }
}

// Java implementation of counting the
// inversion using merge sort

class Test
{

    /* This method sorts the input array and returns the
       number of inversions in the array */
    static int mergeSort(int arr[], int array_size)
    {
        int temp[] = new int[array_size];
        return _mergeSort(arr, temp, 0, array_size - 1);
    }

    /* An auxiliary recursive method that sorts the input array and
      returns the number of inversions in the array. */
    static int _mergeSort(int arr[], int temp[], int left, int right)
    {
        int mid, inv_count = 0;
        if (right > left)
        {
        /* Divide the array into two parts and call _mergeSortAndCountInv()
           for each of the parts */
            mid = (right + left)/2;

        /* Inversion count will be sum of inversions in left-part, right-part
          and number of inversions in merging */
            inv_count  = _mergeSort(arr, temp, left, mid);
            inv_count += _mergeSort(arr, temp, mid+1, right);

        /*Merge the two parts*/
            inv_count += merge(arr, temp, left, mid+1, right);
        }
        return inv_count;
    }

    /* This method merges two sorted arrays and returns inversion count in
       the arrays.*/
    static int merge(int arr[], int temp[], int left, int mid, int right)
    {
        int i, j, k;
        int inv_count = 0;

        i = left; /* i is index for left subarray*/
        j = mid;  /* j is index for right subarray*/
        k = left; /* k is index for resultant merged subarray*/
        while ((i <= mid - 1) && (j <= right))
        {
            if (arr[i] <= arr[j])
            {
                temp[k++] = arr[i++];
            }
            else
            {
                temp[k++] = arr[j++];

                /*this is tricky -- see above explanation/diagram for merge()*/
                inv_count = inv_count + (mid - i);
            }
        }

      /* Copy the remaining elements of left subarray
       (if there are any) to temp*/
        while (i <= mid - 1)
            temp[k++] = arr[i++];

      /* Copy the remaining elements of right subarray
       (if there are any) to temp*/
        while (j <= right)
            temp[k++] = arr[j++];

      /*Copy back the merged elements to original array*/
        for (i=left; i <= right; i++)
            arr[i] = temp[i];

        return inv_count;
    }

    // Driver method to test the above function
    public static void main(String[] args)
    {
        int arr[] = new int[]{1, 20, 6, 4, 5};
        System.out.println("Number of inversions are " + mergeSort(arr, 5));

    }
}

class Solution_516_ub_11 {
    public int longestPalindromeSubseq(String s) {
        int m = s.length();
        if (m ==0) return 0;
        int[][] dp = new int[m][m];
        for(int i = 0; i < m; i++) {
            dp[i][i] = 1;
            if (i+1 < m) {
                if (s.charAt(i) == s.charAt(i+1)) {
                    dp[i][i+1] = 2;
                } else {
                    dp[i][i+1] = 1;
                }
            }
        }

        for (int l = 2; l < m; l ++) {
            for(int i = 0; i < m; i++) {
                if (i + l < m) {
                    if (s.charAt(i) == s.charAt(i+l)) {
                        dp[i][i+l] = 2 + dp[i+1][i+l-1];
                    } else {
                        dp[i][i+l] = Math.max(dp[i+1][i+l], dp[i][i+l-1]);
                    }
                }
            }
        }
        return dp[0][m-1];
    }
}

class Solution_692_ub_12 {
    public List<String> topKFrequent(String[] words, int k) {
        int m = words.length;
        if (m < k) {
            // copy words into res list;
        }
        List<String> res = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        int maxCount = 0;
        for (int i = 0; i < words.length; i++) {
            map.put(words[i], map.getOrDefault(words[i], 0) + 1);
            maxCount = Math.max(maxCount, map.get(words[i]));
        }
        List<String>[] bucket = new List[maxCount+1];
        for(String key : map.keySet()){
            int count = map.get(key);
            if (bucket[count] == null) {
                bucket[count] = new ArrayList<>();
            }
            bucket[count].add(key);
        }

        for(int i = maxCount; i >=0; i--) {
            if (bucket[i].size() < k) {
                res.addAll(bucket[i]);
                k -= bucket[i].size();
                continue;
            } else {
                for (int j = 0; j < k; j++) {
                    res.add(bucket[i].get(j));
                }
                k = 0;
            }
            if (k == 0) {
                break;
            }
        }
        Collections.sort(res);
        return res;
    }
}

class Solution_207_ub21 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> map = new HashMap<>();

        for(int i = 0;i < prerequisites.length;i++) {
            List<Integer> request = map.getOrDefault(prerequisites[i][0], new ArrayList<>());
            request.add(prerequisites[1][1]);
            map.put(prerequisites[i][0], request);
        }
        boolean[] visited = new boolean[numCourses];
        boolean[] visiting = new boolean[numCourses];

        for (int i = 0; i < numCourses; i++) {
            if (!topLogicalSort(i, visiting, visited, map)) {
                return false;
            }
            visited[i] = true;
        }
        return true;
    }

    private boolean topLogicalSort(
            int node,
            boolean[] visiting,
            boolean[] visited,
            Map<Integer, List<Integer>> map) {
        List<Integer> preRequest = map.get(node);
        if (preRequest == null || preRequest.size() == 0) {
            return true;
        }
        if (visiting[node]) {
            return false;
        }
        visiting[node] = true;
        for(Integer i : preRequest) {
            if (!visited[i]) {
                if (!topLogicalSort(i, visiting, visited, map)) {
                    return false;
                }
            }
        }
        visiting[node] = false;
        return true;
    }
}

class Solution_num_decode {
    public int numDecodings(String s) {
        int n = s.length();
        if (n == 0) return 0;
        int[] dp = new int[n+1];
        dp[n]=1;
        dp[n-1] = s.charAt(n-1) == '0' ? 0 : 1;
        for(int i = n-2; i>=0; i--) {
            if (s.charAt(i) == '0') continue;
            int tmp = Integer.parseInt(s.substring(i, i+2));
            if (tmp <= 26) {
                dp[i] = dp[i+1]+ dp[i+2];
            } else {
                dp[i] = dp[i+1];
            }
        }
        return dp[0];
    }
}


class Solution_rob_III {
    Map<TreeNode, Integer> map = new HashMap<>();
    public int rob(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (map.keySet().contains(root)) {
            return map.get(root);
        }

        int res1 = root.val;
        if (root.left != null) {
            res1 += rob(root.left.left) + rob(root.left.right);
        }
        if (root.right != null) {
            res1 += rob(root.right.right) + rob(root.right.right);
        }

        int res2 = rob(root.left) + rob(root.right);

        map.put(root, Math.max(res1, res2));
        return map.get(root);
    }
}




