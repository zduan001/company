package com.company;


import edu.princeton.cs.algs4.In;
import sun.misc.BASE64Encoder;

import javax.management.monitor.Monitor;
import java.io.*;
import java.net.URL;
import java.nio.file.Files;

import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.security.MessageDigest;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;

public class Dec {


}

class Solution692 {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        int uniqueCount = 0;
        for(String s : words) {
            map.put(s, map.getOrDefault(s, 0) +1);
            uniqueCount = Math.max(uniqueCount, map.get(s));
        }
        List<String>[] track = new List[uniqueCount+1];
        for(String s : map.keySet()){
            if (track[map.get(s)] == null) {
                track[map.get(s)] = new ArrayList<>();
            }
            track[map.get(s)].add(s);
        }

        List<String> res = new ArrayList<>();
        for(int i = uniqueCount; i >0; i--) {
            Collections.sort(track[i]);
            if (track[i].size() <= k) {
                res.addAll(track[i]);
                k -= track[i].size();
            } else {
                for (int j = 0; j < k; j++) {
                    res.add(track[i].get(j));
                }
                k = 0;
            }
            if (k == 0) { break;}
        }
        return res;
    }
}

class Solution693 {
    public boolean hasAlternatingBits(int n) {
        boolean lastIsOne = (n & 1) == 1;
        n = n >>1;
        while(n != 0) {
            if (!lastIsOne != ((n&1) == 1)) {
                return false;
            } else {
                lastIsOne = !lastIsOne;
                n = n >> 1;
            }
        }
        return true;
    }
}

class Solution694 {
    public int numDistinctIslands(int[][] grid) {
        Set<List<List<Integer>>> track = new HashSet<>();
        int h = grid.length;
        if (h == 0) return 0;
        int w = grid[0].length;
        if (w == 0) return 0;
        for (int i = 0; i< h; i++) {
            for(int j = 0; j < w; j++) {
                if (grid[i][j] == 1) {
                    List<List<Integer>> island = new ArrayList<>();
                    island.add(Arrays.asList(0,0));
                    grid[i][j] = 0;
                    dfs(grid, i, j, i, j, island);
                    track.add(island);
                }
            }
        }
        return track.size();
    }

    private void dfs(int[][] grid, int x0, int y0, int x, int y, List<List<Integer>> island) {
        int h = grid.length;
        int w = grid[0].length;
        int[] dx = {-1,1,0,0};
        int[] dy = {0,0,-1,1};
        for(int i = 0; i < 4 ;i++) {
            int l = x+dx[i];
            int m = y+dy[i];
            if (l >= 0 && l < h && m >=0 && m < w && grid[l][m] == 1) {
                island.add(Arrays.asList(l-x0, m-y0));
                grid[l][m] = 0;
                dfs(grid, x0, y0, l, m, island);
            }
        }
    }
}


class Solution695 {
    int[] xd = {-1,1,0,0};
    int[] yd = {0,0,-1,1};
    public int maxAreaOfIsland(int[][] grid) {
        int res = 0;
        int l = grid.length;
        int m = grid[0].length;
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    grid[i][j] = 0;
                    res = Math.max(res, dfs(grid, i, j, l, m));
                }
            }
        }
        return res;
    }

    private int dfs(int[][] grid, int i, int j, int l, int m) {
        int res = 1;
        for (int k = 0; k < 4; k++) {
            int x = i + xd[k];
            int y = j + yd[k];
            if (x >= 0 && x < l && y >= 0 && y < m && grid[x][y] == 1) {
                grid[x][y] = 0;
                res += dfs(grid, x, y, l, m);
            }
        }
        return res;
    }
}

class Solution696 {
    public int countBinarySubstrings(String s) {
        int m = s.length();
        int res = 0;
        for (int i = 0; i< m-1; i++) {
            if (s.charAt(i) != s.charAt(i+1)) {
                int l = i;
                int r = i+1;
                while(l >=0 &&
                        r < m &&
                        s.charAt(l) == s.charAt(i) && s.charAt(r) == s.charAt(i+1)) {
                    res++;
                    l--;
                    r++;
                }
                i = r-2;
            }
        }
        return res;
    }
}

class Solution697 {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxDegree = 0;
        for(int i : nums) {
            int degree = map.getOrDefault(i, 0)+1;
            maxDegree = Math.max(maxDegree, degree);
            map.put(i, degree);
        }
        List<Integer> list = new ArrayList<>();
        for(int key : map.keySet()) {
            if (map.get(key) == maxDegree) {
                list.add(key);
            }
        }
        int res = Integer.MAX_VALUE;
        for (int key : list) {
            int l = 0;
            int r = nums.length-1;
            while(nums[l] != key) {l++;}
            while(nums[r] != key) {r--;}
            res = Math.min(res, r-l+1);
        }
        return res;
    }
}

//class Solution698 {
//    public boolean canPartitionKSubsets(int[] nums, int k) {
//        int m = nums.length;
//        int[] sum = new int[m];
//        sum[0] = nums[0];
//        for (int i = 0; i< m; i++) {
//            sum[i] = sum[i-1] + nums[i];
//        }
//        int[] splitor = new int[k-1];
//
//    }
//
//    private boolean dfs(int[] sum, int i, int[] splitor, int index) {
//        if (index == splitor.length) {
//            return true;
//        } else {
//            for(int k = i+1; k < sum.length; k ++) {
//
//            }
//        }
//    }
//}

//12/2/17
class Solution249 {
    public List<List<String>> groupStrings(String[] strings) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strings) {
            String tmp = cal(s);
            List<String> list = map.getOrDefault(tmp, new ArrayList<>());
            list.add(s);
            map.put(tmp, list);
        }
        List<List<String>> res = new ArrayList<>();
        res.addAll(map.values());
        return res;
    }

    private String cal(String s) {
        StringBuilder res = new StringBuilder();
        for (int i = 1; i< s.length(); i++) {
            res = res.append(String.valueOf((s.charAt(i) - s.charAt(i-1) + 26) % 26));
        }
        return res.toString();
    }
}

class Solutionfinddup {
    Map<String, List<String>> map;

    public Solutionfinddup() {
        map = new HashMap<>();
    }

    public List<List<String>> groupFiles(String path) throws Exception{
        path = "/Users/davidduan/tmp/txt";
        File f = new File(path);
        dfs(f);
        List<List<String>> res = new ArrayList<>();
        res.addAll(map.values());
        return res;
    }

    private void dfs(File file) throws Exception{
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for(File f : files) {
                dfs(f);
            }
        } else {
            if (Files.isSymbolicLink(file.toPath())) {
                return;
            }
            byte[] buffer = new byte[4096];
            int count;
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
            while((count = bis.read(buffer)) > 0) {
                digest.update(buffer, 0, count);
            }
            byte[] hash = digest.digest();
            String key = new BASE64Encoder().encode(hash);
            List<String> files = map.getOrDefault(key, new ArrayList<>());
            files.add(file.getAbsolutePath());
            map.put(key, files);
        }
    }
}

// 12/3/17

// Uber
class Solution291_I {
    public boolean wordPatternMatch(String pattern, String str) {
        if (pattern == null || pattern.isEmpty()) { return str.isEmpty();}
        String[] map = new String[26];
        return dfs(pattern, str, map);
    }

    private boolean dfs(String pattern, String str, String[] map) {
        if (str.isEmpty()) {
            return pattern.isEmpty();
        } else if (pattern.isEmpty()) {
            return str.isEmpty();
        } else if (map[pattern.charAt(0) - 'a'] != null) {
            if (!str.startsWith(map[pattern.charAt(0)-'a'])) {
                return false;
            } else {
                return dfs(pattern.substring(1), str.substring(map[pattern.charAt(0) -'a'].length()), map);
            }
        } else {
            for (int i = 1; i <= str.length(); i++) {
                String tmp = str.substring(0,i);
                boolean contains = false;
                for (int k = 0; k < map.length; k++) {
                    if (map[k] != null && map[k].equals(tmp))
                    {
                        contains = true;
                        break;
                    }
                }
                if (contains == true) { continue;}
                map[pattern.charAt(0) - 'a'] = str.substring(0,i);
                if (dfs(pattern.substring(1), str.substring(i), map)) { return true;}
                map[pattern.charAt(0) - 'a'] = null;
            }
            return false;
        }
    }
}

class Solution_Merge {
    public static class Interval{
        int start;
        int end;
        public Interval(int a, int b) {
            start = a;
            end = b;
        }
    }

    public List<Interval> and(List<Interval> a, List<Interval> b) {
        int i = 0;
        int j = 0;
        List<Interval> res = new ArrayList<>();
        while(i < a.size() && j < b.size()) {
            Interval tmp = cross(a.get(i), b.get(j));
            if (tmp == null) {
                i++; j++;
                continue;
            }
            res.add(tmp);
            if (a.get(i).end > b.get(j).end) {
                j++;
            } else{
                i++;
            }
        }

        return res;
    }

    private Interval cross(Interval a, Interval b) {
        int l = Math.max(a.start, b.start);
        int j = Math.min(a.end, b.end);
        if (l > j) return null;
        return new Interval(l, j);
    }

    private Interval join(Interval a, Interval b) {
        return null;
    }
}

class Solution140 {
    public List<String> wordBreak(String s, List<String> wordDict) {
        Set<String> dict = new HashSet<>(wordDict);
        List<String> res = new ArrayList<>();
        int m = s.length();
        if (m == 0) return res;
        ArrayList<ArrayList<String>>[] dp = new ArrayList[m+1];
        dp[0] = new ArrayList<>();
        dp[0].add(new ArrayList<>());
        for(int i = 1; i <= s.length(); i++) {
            for (int j = i-1; j >= 0 ; j--) {
                if (dp[j] != null && dict.contains(s.substring(j,i))) {
                    if (dp[i] == null) {
                        dp[i] = new ArrayList<>();
                    }
                    for(ArrayList arr : dp[j]) {
                        ArrayList<String> tmp = new ArrayList<>(arr);
                        tmp.add(s.substring(j,i));
                        dp[i].add(tmp);
                    }
                }
            }
        }
        if (dp[m] == null) { return res;}

        for(ArrayList<String> tmp : dp[m]) {
            StringBuilder sb = new StringBuilder();
            for(String x : tmp) {
                sb.append(x);
                sb.append(" ");
            }
            if (sb.length() > 0) {
                sb.deleteCharAt(sb.length()-1);
            }
            res.add(sb.toString());
        }
        return res;
    }
}

//12/4/17

class Solution4sum {
    public List<List<Integer>> fourSum(int[] num, int target) {
        ArrayList<List<Integer>> ans = new ArrayList<>();
        if (num.length < 4) return ans;
        Arrays.sort(num);
        for (int i = 0; i < num.length - 3; i++) {
            if (num[i] + num[i + 1] + num[i + 2] + num[i + 3] > target)
                break; //first candidate too large, search finished
            if (num[i] + num[num.length - 1] + num[num.length - 2] + num[num.length - 3] < target)
                continue; //first candidate too small
            if (i > 0 && num[i] == num[i - 1]) continue; //prevents duplicate result in ans list
            for (int j = i + 1; j < num.length - 2; j++) {
                if (num[i] + num[j] + num[j + 1] + num[j + 2] > target) break; //second candidate too large
                if (num[i] + num[j] + num[num.length - 1] + num[num.length - 2] < target)
                    continue; //second candidate too small
                if (j > i + 1 && num[j] == num[j - 1]) continue; //prevents duplicate results in ans list
                int low = j + 1, high = num.length - 1;
                while (low < high) {
                    int sum = num[i] + num[j] + num[low] + num[high];
                    if (sum == target) {
                        ans.add(Arrays.asList(num[i], num[j], num[low], num[high]));
                        while (low < high && num[low] == num[low + 1]) low++; //skipping over duplicate on low
                        while (low < high && num[high] == num[high - 1]) high--; //skipping over duplicate on high
                        low++;
                        high--;
                    }
                    //move window
                    else if (sum < target) low++;
                    else high--;
                }
            }
        }
        return ans;
    }
}

class Solution10 {
    public boolean isMatch(String s, String p) {
        if (p.isEmpty()) {
            return s.isEmpty();
        }

        if (p.length() > 1 && p.charAt(1) == '*') {
            return (isMatch(s, p.substring(2))) ||
                    (!s.isEmpty() &&(isEqual(s.charAt(0), p.charAt(0)) && isMatch(s.substring(1), p)));
        } else {
            return !s.isEmpty() && isEqual(s.charAt(0), p.charAt(0)) && isMatch(s.substring(1), p.substring(1));
        }
    }

    public boolean isEqual(char s, char p) {
        return p == '.' || p == s;
    }
}

class Solution30 {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> res = new ArrayList<>();
        int count = 0;
        int m = words.length;
        if (m == 0) return res;
        int l = words[0].length();
        Map<String, Integer> map = new HashMap<>();
        clear(words, map);
        int left = 0;
        for (int i = 0; i< s.length() -l; i = i+l) {
            String tmp = s.substring(i, i+l);
            if (!map.keySet().contains(tmp)) {
                count = 0;
                left = i+l;
                clear(words, map);
                continue;
            }

            int index = map.get(tmp);
            if (index == -1) {
                map.put(tmp, i);
                count++;
                if (count == m) {
                    res.add(left);
                    map.put(s.substring(left, left+l), -1);
                    left += l;
                    count--;
                }
            } else {
                while(left <= index) {
                    map.put(s.substring(left, left+l), -1);
                    count--;
                    left += l;
                }
                map.put(tmp, i);
                count++;
            }
        }
        return res;
    }

    private void clear(String[] words, Map<String, Integer> map) {
        for(String s : words) {
            map.put(s, -1);
        }
    }
}

// 12/6/17
class Solution31 {
    public void nextPermutation(int[] nums) {
        int m = nums.length;
        if (m < 2) return;
        int i = m-1;
        while(i>=1) {
            if (nums[i-1] < nums[i]) {
                break;
            }
            i--;
        }
        if (i != 0) {
            swap(nums, i - 1);
        }
        reverse(nums, i);
    }

    private void swap(int[] nums, int i) {
        for(int j = nums.length-1; j > i; j--) {
            if (nums[j]>nums[i]) {
                int tmp = nums[j];
                nums[j] = nums[i];
                nums[i] = tmp;
                break;
            }
        }
    }

    private void reverse(int[] nums, int i) {
        int left = i;
        int right = nums.length -1;
        while(left < right) {
            int tmp = nums[left];
            nums[left] = nums[right];
            nums[right] = tmp;
            left++;
            right--;
        }
    }
}

// 12/6/17
class Solution32 {
    public int longestValidParentheses(String s) {
        int res = 0;
        int m = s.length();
        if (m == 0) return 0;
        int[] dp = new int[m];
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                if (s.charAt(i-1) == '(') {
                    dp[i] = (i-2>=0 ? dp[i-2] : 0) + 2;
                } else {
                    if(i-dp[i-1]-1 >=0 && s.charAt(i-dp[i-1]-1) == '(') {
                        dp[i] = dp[i-1] + 2 + (i-dp[i-1]-2 >=0 ? dp[i-dp[i-1]-2] : 0);
                    }
                }
                res = Math.max(dp[i], res);
            }
        }
        return res;
    }
}


class Solution39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(candidates, 0, 0, target, res, new ArrayList<>());
        return res;
    }

    public void dfs(int[] candidates,
                    int index,
                    int sum,
                    int target,
                    List<List<Integer>> res,
                    List<Integer> l) {
        if (sum == target) {
            List<Integer> tmp = new ArrayList<>(l);
            res.add(tmp);
            return;
        } else if (sum > target) {
            return;
        } else {
            for(int i = index; i < candidates.length; i++) {
                l.add(candidates[i]);
                dfs(candidates, i, sum + candidates[i], target, res, l);
                l.remove(l.size()-1);
            }
        }
    }
}

class Solution40 {
    public List<List<Integer>> combinationSum2(int[] cand, int target) {
        Arrays.sort(cand);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> path = new ArrayList<Integer>();
        dfs_com(cand, 0, target, path, res);
        return res;
    }
    void dfs_com(int[] cand, int cur, int target, List<Integer> path, List<List<Integer>> res) {
        if (target == 0) {
            res.add(new ArrayList(path));
            return ;
        }
        if (target < 0) return;
        for (int i = cur; i < cand.length; i++){
            if (i > cur && cand[i] == cand[i-1]) continue;
            path.add(path.size(), cand[i]);
            dfs_com(cand, i+1, target - cand[i], path, res);
            path.remove(path.size()-1);
        }
    }
}

class Solution41 {
    public int firstMissingPositive(int[] nums) {
        for(int i = 0; i< nums.length; i++) {
            while (nums[i] > 0 &&
                    nums[i] < nums.length &&
                    nums[i] != nums[nums[i]-1]) {
                swap(nums, i, nums[i]-1);
            }
        }

        for (int i = 0 ; i< nums.length; i++) {
            if (nums[i] != i+1) {
                return i+1;
            }
        }
        return nums.length+1;
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}

// 12/7/17
class Solution44 {
    public boolean isMatch(String s, String p) {
        if (p.isEmpty()) {
            return s.isEmpty();
        }

        if (p.charAt(0) == '*') {
            return (s.length() > 0 && isMatch(s.substring(1), p)) ||
                    isMatch(s, p.substring(1));
        } else if(equal(s.charAt(0), p.charAt(0))){
            return isMatch(s.substring(1), p.substring(1));
        } else {
            return false;
        }
    }

    private boolean equal(char a, char b) {
        return b == '?' || a == b;
    }
}

class Solution44_II {
    public boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();
        boolean[][] dp = new boolean[m+1][n+1];
        dp[0][0] = true;
        for (int j = 1; j<=n; j++) {
            if (p.charAt(j-1) == '*' && dp[0][j-1]) {
                dp[0][j] = true;
            }
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (equal(s.charAt(i-1), p.charAt(j-1))) {
                    dp[i][j] = dp[i-1][j-1];
                } else if (p.charAt(j-1) == '*') {
                    dp[i][j] = dp[i-1][j] || dp[i][j-1];
                }
            }
        }
        return dp[m][n];
    }

    private boolean equal(char a, char b) {
        return b == '?' || a == b;
    }
}

class Solution10_II {
    public boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();
        boolean[][] dp = new boolean[m+1][n+1];
        dp[0][0] = true;
        for (int j = 1; j <= n; j++) {
            if (p.charAt(j-1) == '*') {
                dp[0][j] = dp[0][j-2];
            }
        }

        for (int i = 1; i <= m ; i++) {
            for (int j = 1; j <= n; j++) {
                if (equal(s.charAt(i-1), p.charAt(j-1))) {
                    dp[i][j] = dp[i-1][j-1];
                } else if (p.charAt(j-1) == '*') {
                    dp[i][j] = equal(s.charAt(i-1), p.charAt(j-2)) && dp[i-1][j] || dp[i][j-2];
                }
            }
        }
        return dp[m][n];
    }

    private boolean equal(char a, char b) {
        return b == '.' || a == b;
    }
}

class Solution45 {
    public int jump(int[] nums) {
        int m = nums.length;
        if (m < 1) {
            return 0;
        }
        int[] dp = new int[m];
        for (int i = 0; i< m; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        dp[0] = 0;
        for(int i = 0; i < m; i++) {
            for (int j = 1; j<=nums[i]; j++) {
                if (i+j < m) {
                    dp[i+j] = Math.min(dp[i+j], dp[i] + 1);
                }
                if (i+j == m-1) {
                    return dp[m-1];
                }
            }
        }
        return dp[m-1];
    }
}

//12/8/17
class Solution56 {
    class Interval {
        int start;
        int end;
        Interval() { start = 0; end = 0; }
        Interval(int s, int e) { start = s; end = e; }
    }
    public List<Interval> merge(List<Interval> intervals) {

//        List<Interval> res = new ArrayList<>();
//        for(int i = 0; i< intervals.size(); i++) {
//            List<Interval> tmp = new ArrayList<>();
//            Interval cur = intervals.get(i);
//            for (int j = 0; j < res.size(); j++) {
//                if (isOverlap(cur, res.get(j))) {
//                    cur = merge(cur, res.get(j));
//                } else {
//                    tmp.add(res.get(j));
//                }
//            }
//            tmp.add(cur);
//            res = tmp;
//        }
//        return res;
        Collections.sort(intervals, (a,b) -> a.start - b.start);
        Interval tmp = null;
        List<Interval> res = new ArrayList<>();
        for(int i = 0; i< intervals.size(); i++) {
            if (tmp == null) {
                tmp = intervals.get(i);
                continue;
            } else {
                if (isOverlap(tmp, intervals.get(i))) {
                    tmp = merge(tmp, intervals.get(i));
                } else {
                    res.add(tmp);
                    tmp = intervals.get(i);
                }
            }
        }
        if (tmp!= null) {
            res.add(tmp);
        }
        return res;
    }

    private boolean isOverlap(Interval a, Interval b) {
        int left = Math.min(a.start, b.start);
        int right = Math.max(a.end, b.end);

        int length1 = a.end - a.start;
        int length2 = b.end - b.start;

        return (right - left) <= (length1 + length2);
    }

    private Interval merge(Interval a, Interval b) {
        int s = Math.min(a.start, b.start);
        int e = Math.max(a.end, b.end);
        return new Interval(s,e);
    }
}

class Solution57 {
    class Interval {
        int start;
        int end;
        Interval() { start = 0; end = 0; }
        Interval(int s, int e) { start = s; end = e; }
    }

    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        List<Interval> res = new ArrayList<>();
        for(Interval item : intervals) {
            if (isOverlap(newInterval, item)) {
                newInterval = merge(newInterval, item);
            } else {
                if (item.start > newInterval.end) {
                    res.add(newInterval);
                    newInterval = null;
                }
                res.add(item);
            }
        }
        if (newInterval != null) {
            res.add(newInterval);
        }
        return res;
    }

    private boolean isOverlap(Interval a, Interval b) {
        int left = Math.min(a.start, b.start);
        int right = Math.max(a.end, b.end);

        int length1 = a.end - a.start;
        int length2 = b.end - b.start;

        return (right - left) <= (length1 + length2);
    }

    private Interval merge(Interval a, Interval b) {
        int s = Math.min(a.start, b.start);
        int e = Math.max(a.end, b.end);
        return new Interval(s,e);
    }
}

// 12/9/17
class Solution68 {
    public List<String> fullJustify(String[] words, int maxWidth) {
        int i = 0;
        List<String> res = new ArrayList<>();
        List<String> tmp = new ArrayList<>();
        if (maxWidth <= 1) {
            for (String s : words) {
                res.add(s);
            }
            return res;
        }
        int length = 0;
        while(i < words.length) {
            int x = length + words[i].length();
            if (x + tmp.size() > maxWidth) {
                res.add(construct(tmp, maxWidth));
                tmp.clear();
                length = 0;
            }
            tmp.add(words[i]);
            length += words[i].length();
            i++;
        }
        if (tmp.size() > 0) {
            StringBuilder sb = new StringBuilder();
            for(String s : tmp) {
                if (sb.length() > 0) {
                    sb.append(" ");
                }
                sb.append(s);
            }
            while(sb.length() < maxWidth) {
                sb.append(" ");
            }
            res.add(sb.toString());
        }
        return res;
    }

    private String construct(List<String> tmp, int maxWidth) {
        int count = tmp.size();
        if (count == 0) {return null;}
        if (count == 1) {
            StringBuilder sb = new StringBuilder();
            sb.append(tmp.get(0));
            for (int i = 0; i < (maxWidth - tmp.get(0).length()); i++) {
                sb.append(" ");
            }
            return sb.toString();
        }

        int totalLength = 0;
        for (String s : tmp) {
            totalLength += s.length();
        }

        int diff = maxWidth - totalLength;
        int avg = diff / (count -1);
        int rem = diff % (count -1);

        StringBuilder sb = new StringBuilder();
        for(String s : tmp) {
            if (sb.length() > 0) {
                for (int i = 0; i< avg; i++) {
                    sb.append(" ");
                }
                if (rem > 0) {
                    sb.append(" ");
                    rem--;
                }
            }
            sb.append(s);
        }
        return sb.toString();
    }
}

class Solution72 {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int[][] dp = new int[m+1][n+1];

        dp[0][0] = 0;
        for (int i = 1; i<=m; i++) {
            dp[i][0] = i;
        }
        for (int j = 1; j <= n; j++) {
            dp[0][j] = j;
        }

        for(int i = 1; i<=m; i++) {
            for (int j = 1; j <=n; j++) {
                if (word1.charAt(i-1) == word2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1];
                } else {
                    int tmp = Math.min(dp[i-1][j], dp[i][j-1]);
                    tmp = Math.min(tmp, dp[i-1][j-1]);
                    dp[i][j] = tmp + 1;
                }
            }
        }
        return dp[m][n];
    }
}


class Solution76 {
    public String minWindow(String s, String t) {
        int[] map = new int[26];
        int[] tmp = new int[26];
        for(int i = 0; i< t.length();i++) {
            map[t.charAt(i) - 'A']++;
        }

        int res = Integer.MAX_VALUE;
        int left = -1;
        int right = -1;
        int r = 0;
        int l = 0;
        while(r < s.length()) {
            tmp[s.charAt(r) - 'A']++;

            while(l<=r && check(map, tmp)) {
                if (res> r-l+1) {
                    left = l;
                    right = r;
                    res = r-l+1;
                }
                tmp[s.charAt(l) - 'A']--;
                l++;
            }
            r++;
        }
        if(left == -1) {
            return "";
        }
        return s.substring(left, right+1);
    }

    private boolean check(int[] a, int b[]) {
        boolean res = true;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > b[i]) {
                return false;
            }
        }
        return true;
    }
}

//12/10/17
class Solution84 {
    public int largestRectangleArea(int[] heights) {
        int m = heights.length;
        if (m == 0) return 0;
        int res = Integer.MIN_VALUE;
        Stack<Integer> s = new Stack<>();
        s.push(-1);
        for(int i = 0; i< heights.length; i++) {
            while(s.peek() != -1 && heights[i] < heights[s.peek()]) {
                int index = s.pop();
                res = Math.max(res, heights[index] * (i - s.peek()-1));
            }
            s.push(i);
        }
        while(s.peek() != -1) {
            int index = s.pop();
            res = Math.max(res, heights[index] * (m-1-s.peek()));
        }
        return res;
    }
}


class Solution85 {
    public int maximalRectangle(char[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[] heighs = new int[n];
        int res = Integer.MIN_VALUE;
        Solution84 s84 = new Solution84();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j< n; j++) {
                if (matrix[i][j] == '0') {
                    heighs[j] = 0;
                } else {
                    heighs[j]++;
                }
            }
            res = Math.max(res, s84.largestRectangleArea(heighs));
        }
        return res;
    }
}

class Solution97 {
    int[][][] dp;
    public boolean isInterleave(String s1, String s2, String s3) {
        int m = s1.length();
        int n = s2.length();
        int k = s3.length();

        dp = new int[m][n][k];
        return dfs(s1, s2, s3);
    }

    private boolean dfs(String s1, String s2, String s3) {
        int m = s1.length();
        int n = s2.length();
        int k = s3.length();
        if (k == 0) {
            return m == 0 && n == 0;
        }

        if (s1.length() == 0) {
            return s2.equals(s3);
        } else if (s2.length() == 0) {
            return s1.equals(s3);
        } else {
            if (dp[m][n][k] != 0) {
                return dp[m][n][k] == 1 ? true : false;
            }
            boolean res =
                    (dfs(s1.substring(0, m-1), s2, s3.substring(0, k-1)) && s1.charAt(m-1) == s3.charAt(k-1)) ||
                    (dfs(s1, s2.substring(0, n-1), s3.substring(0,k-1)) && s2.charAt(n-1) == s3.charAt(k-1));
            dp[m][n][k] = res ? 1 : 2;
            return res;
        }
    }
}

class Solution97_DP {
    public boolean isInterleave(String s1, String s2, String s3) {
        int m = s1.length();
        int n = s2.length();
        if (s3.length() != m+n) return false;

        boolean[][] dp = new boolean[m+1][n+1];
        for(int i = 0; i< m; i++) {
            for(int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    dp[i][j] = true;
                } else if (i == 0) {
                    dp[i][j] = dp[i][j-1] && s2.charAt(j-1) == s3.charAt(j-1);
                } else if (j == 0) {
                    dp[i][j] = dp[i-1][j] && s1.charAt(i-1) == s3.charAt(i-1);
                } else {
                    dp[i][j] =
                            (dp[i-1][j] && s1.charAt(i-1) == s3.charAt(i+j+1)) ||
                            (dp[i][j-1] && s2.charAt(j-1) == s3.charAt(i+j+1));
                }
            }
        }
        return dp[m][n];
    }
}

class Solution87 {
    public boolean isScramble(String s1, String s2) {
        if (s1.equals(s2)) {return true;}
        if (s1.length() != s2.length()) { return false;}
        int[] t = new int[26];

        for (int i = 0; i< s1.length(); i++) {
            t[s1.charAt(i) - 'a']++;
            t[s2.charAt(i) - 'a']--;
        }
        for (int i = 0; i< 26; i++) {
            if (t[i] != 0) { return false;}
        }

        for (int i = 1; i< s1.length(); i++) {
            if (isScramble(s1.substring(0, i), s2.substring(0,i)) &&
                isScramble(s1.substring(i), s2.substring(i))) {
                return true;
            }
            if (isScramble(s1.substring(0,i), s2.substring(s2.length() - i)) &&
                isScramble(s1.substring(i), s2.substring(0, s2.length()-i))) {
                return true;
            }
        }
        return false;
    }
}


class Solution99 {

    TreeNode n1;
    TreeNode n2;
    TreeNode prev;
    public void recoverTree(TreeNode root) {
        dfs(root);
        if (n1 != null && n2 != null) {
            int tmp = n1.val;
            n1.val = n2.val;
            n2.val = tmp;
        }
    }

    private void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        dfs(root.left);
        if (prev != null && root.val < prev.val) {
            n2 = root;
            if (n1 == null) {
                n1 = prev;
            }

        }
        prev = root;
        dfs(root.right);
    }
}

class Solution124 {
    public int maxPathSum(TreeNode root) {
        int[] res = dfs(root);
        return Math.max(res[0], res[1]);
    }

    private int[] dfs(TreeNode root) {
        if (root == null) {
            return new int[]{Integer.MIN_VALUE, 0};
        }
        int[] left = dfs(root.left);
        int[] right = dfs(root.right);

        int cross = Math.max(left[0], right[0]);
        cross = Math.max(cross, left[1] + right[1] + root.val);

        int straight = Math.max(Math.max(left[1], right[1]), 0) + root.val;
        return new  int[] {Math.max(cross, straight), straight};
    }
}

class Solution132 {
    public int minCut(String s) {
        int[] dp = new int[s.length()+1];
        for (int i = 0; i <= s.length(); i++) {
            dp[i] = i-1;
        }
        for (int i = 0; i< s.length(); i++) {
            for(int j = 0; i-j>=0 && i+j< s.length() && s.charAt(i-j) == s.charAt(i+j); j++) {
                dp[i+j+1] = Math.min(dp[i+j+1], dp[i-j] + 1);
            }

            for (int j = 1;
                 i-j+1>=0 && (i+j) < s.length() && s.charAt(i-j+1) == s.charAt(i+j);
                 j++) {
                dp[i+j+1] = Math.min(dp[i+j+1], dp[i-j+1] + 1);
            }
        }
        return dp[s.length()];
    }
}

class Solution135 {
    public int candy(int[] ratings) {
        int m = ratings.length;
        int[] dp = new int[m];

        for(int i = 0; i< m; i++) {
            dp[i] =1;
        }
        for(int i = 1; i< m; i++) {
            if(ratings[i] > ratings[i-1]) {
                dp[i] = dp[i-1] + 1;
            }
        }
        for(int i = m -2; i>=0; i++) {
            if (ratings[i] > ratings[i+1]) {
                dp[i] = dp[i+1]+1;
            }
        }
        int res = 0;
        for(int val : dp) {
            res += val;
        }
        return res;
    }
}

// 12/11/17
class Permutation {
    public List<String> findPerumation(String s) {
        List<String> res = new ArrayList();
        StringBuilder sb = new StringBuilder();
        dfs(s, 0, sb, res);
        Collections.sort(res);
        return res;
    }

    private void dfs(String arr, int index, StringBuilder sb, List<String> res) {
        if (sb.length() != 0) {
            res.add(sb.toString());
        }
        for(int i = index; i< arr.length(); i++) {
            sb.append(arr.charAt(i));
            dfs(arr,i+1, sb, res);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}

class SubString {
    public String lastSub(String s) {
        if (s.length() == 0) return "";
        List<String> res = new ArrayList<>();
        for (int i = 0; i< s.length()-1; i++) {
            for (int j = i+1; j <=s.length(); j++) {
                res.add(s.substring(i,j));
            }
        }
        Collections.sort(res);
        return res.get(res.size()-1);
    }
}

class SolutionRoman {
    public int romanToInt(String s) {
        int nums[]=new int[s.length()];
        for(int i=0;i<s.length();i++){
            switch (s.charAt(i)){
                case 'M':
                    nums[i]=1000;
                    break;
                case 'D':
                    nums[i]=500;
                    break;
                case 'C':
                    nums[i]=100;
                    break;
                case 'L':
                    nums[i]=50;
                    break;
                case 'X' :
                    nums[i]=10;
                    break;
                case 'V':
                    nums[i]=5;
                    break;
                case 'I':
                    nums[i]=1;
                    break;
            }
        }
        int sum=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1])
                sum-=nums[i];
            else
                sum+=nums[i];
        }
        return sum+nums[nums.length-1];
    }
}


class RoyalName {
    List<String> sort(List<String> input) {
        Map<String, List<String>> res = new TreeMap<>(
                new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        return o1.compareTo(o2);
                    }
                }
        );
        for(String s : input) {
            String[] tmp = s.split(" ");
            List<String> val = res.getOrDefault(tmp[0], new ArrayList<>());
            val.add(tmp[1]);
            res.put(tmp[0], val);
        }

        List<String> x = new ArrayList<>();
        for(Map.Entry<String, List<String>> e : res.entrySet()) {
            List<String> tmp = e.getValue();
            Collections.sort(tmp, (a,b) ->romanToInt(a) - romanToInt(b));
            for(String s : tmp) {
                StringBuilder sb = new StringBuilder();
                sb.append(e.getKey());
                sb.append(" ");
                sb.append(s);
                x.add(sb.toString());
            }
        }
        return x;
    }

    public int romanToInt(String s) {
        int nums[]=new int[s.length()];
        for(int i=0;i<s.length();i++){
            switch (s.charAt(i)){
//                case 'M':
//                    nums[i]=1000;
//                    break;
//                case 'D':
//                    nums[i]=500;
//                    break;
//                case 'C':
//                    nums[i]=100;
//                    break;
                case 'L':
                    nums[i]=50;
                    break;
                case 'X' :
                    nums[i]=10;
                    break;
                case 'V':
                    nums[i]=5;
                    break;
                case 'I':
                    nums[i]=1;
                    break;
            }
        }
        int sum=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1])
                sum-=nums[i];
            else
                sum+=nums[i];
        }
        return sum+nums[nums.length-1];
    }
}

class Queens {
    int[] dy = new int[]{-1, -1, 1, 1};
    int[] dx = new int[]{-1, 1, 1, -1};
    public int countOfAttack(int[] input) {
        int n = input.length;
        int res = 0;
        for(int i = 0; i< input.length; i++) {
            int tmp = 0;
            for (int k = 0; k < 4; k++) {
                int x = i;
                int y = input[i]-1;
                int step = 1;
                while (x + step * dx[k] >=0 &&
                       x + step * dx[k] < n &&
                        y + step * dy[k] >= 0 &&
                        y + step * dy[k] < n) {
                    if (input[x + step * dx[k]] == y + step * dy[k] +1) {
                        tmp++;
                        break;
                    }
                    step++;
                }
            }
            res = Math.max(res, tmp);
        }
        return res;
    }
}

class S11 {
    public int numberOfInterestring(int l, int r) {
        int m = r-l+1;
        boolean[] track = new boolean[m];
        for(int i = l; i<=r; i++) {
            track[i-l] = isPal(i);
        }

        int res = 0;
        for(int i = 0; i< m; i++) {
            int count = 0;
            for (int j = i; j < m; j++) {
                if (track[j]) {
                    count++;
                    if (count%2 == 0) {
                        res++;
                    }
                }

            }
        }
        return res;
    }

    private boolean isPal(int i) {
        String tmp = String.valueOf(i);
        int n = tmp.length();
        int l = 0;
        int r = n-1;
        while(l <= r ) {
            if(tmp.charAt(l) != tmp.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}


class lines{
    public List<String> findLine(List<String> strings) {
        Collections.sort(strings, (a,b) -> b.length() - a.length());
        return strings;
    }
}

class count{
    public String countLine(String input) {
//        if (input.length() == 0) {return "";}
        String[] arr = input.split(" ");

        String cur = "";
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < arr.length; i++) {
            if (cur.equals("")) {
                count = 1;
                cur = arr[i];
            } else if (!arr[i].equals(cur)) {
                if (sb.length() > 0) {
                    sb.append(" ");
                }
                sb.append(String.valueOf(count));
                sb.append(" ");
                sb.append(cur);
                count = 1;
                cur = arr[i];
            } else {
                count++;
            }
            if (i == arr.length-1) {
                if (sb.length() > 0) {
                    sb.append(" ");
                }
                sb.append(String.valueOf(count));
                sb.append(" ");
                sb.append(cur);
            }
        }
        return sb.toString();
    }
}

// DP
// 12/12/17
class Kanpsack_x {
    public int max(int[] wt, int[] val, int total) {
        int m = wt.length;
        int[][] dp = new int[m][total+1];
        for(int j = 1;j<=total; j++) {
            if (j >= wt[0]) {
                dp[0][j] = val[0];
            }
        }

        for(int i = 1; i < m; i++) {
            for(int j = 1; j <= total; j++) {
                dp[i][j] = Math.max(
                    j >= wt[i] ? val[i] + dp[i-1][j-wt[i]] : 0,
                    i > 0 ? dp[i-1][j] : 0
                );
            }
        }
        return dp[m-1][total];
    }
}

class LongestCommonSubSequenc {
    public int find (String s, String t){
        int m = s.length();
        int n = t.length();
        int[][] dp = new int[m+1][n+1];
        for(int i = 1; i<=m; i++) {
            for (int j = 1; j<=n; j++) {
                if (s.charAt(i-1) == t.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }
}

class MatrixMultiple {
    public int find(int[] arr) {
        int m = arr.length;
        int[][] dp = new int[m][m];
        for(int l = 2; l < arr.length; l++) {
            for (int i = 0; i< arr.length -l; i++) {
                int j = i + l;
                dp[i][j] = Integer.MAX_VALUE;
                for(int k = i+1; k < j; k++) {
                    dp[i][j] = Math.min(dp[i][j],
                            dp[i][k] + dp[k][j] + arr[i]*arr[k]*arr[j]);
                }
            }
        }
        return dp[0][m-1];
    }
}

// 12/13/17
class OptimalBST{
    public int find(int[] freq, int[] val){
        return dfs(freq, 0, freq.length-1);
    }

    private int dfs(int freq[], int l, int r) {
        if (r < l) {
            return 0;
        } else if (r == l) {
            return freq[l];
        }

        int sum = sum(freq, l, r);

        int minCost = Integer.MAX_VALUE;

        for(int i = l; i<=r; i++) {
            minCost = Math.min(minCost,
                    (dfs(freq, l, i-1) + dfs(freq, i+1, r))
            );
        }
        return sum+minCost;
    }

    int sum(int[] freq, int l, int r) {
        int res = 0;
        for(int i = l; i<=r; i++) {
            res += freq[i];
        }
        return res;
    }

}

class OptimalBST_II {
    public int find(int[] freq) {
        int m = freq.length;
        int[][] dp = new int[m][m];

        for(int i = 0; i<m; i++) {
            dp[i][i] = freq[i];
        }

        for (int l = 2; l <= m; l++) {
            for(int i = 0; i <= m-l; i++) {
                int j = i+l-1;
                dp[i][j] = Integer.MAX_VALUE;
                int sum = sum(freq, i, j);
                for(int k = i; k <= j; k++) {
                    dp[i][j] =
                            Math.min(dp[i][j],
                            sum + ((k-1) < 0 ? 0 : dp[i][k-1]) + ((k+1) > j ? 0: dp[k+1][j]));
                }
            }
        }
        return dp[0][m-1];
    }

    int sum(int[] freq, int l, int r) {
        int res = 0;
        for(int i = l; i<=r; i++) {
            res += freq[i];
        }
        return res;
    }

}

// 12/14/17
class CoinChange {
    public int minCountOfCoins(int[] coins, int target) {
        int[] dp = new int[target+1];
        for (int i = 1; i <= target; i++) {
            dp[i] = Integer.MAX_VALUE;
        }

        for(int i = 1; i <= target; i++)
        {
            for(int j = 0; j< coins.length; j++) {
                if (i-coins[j] >=0 && dp[i-coins[j]] < Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], dp[i-coins[j]] + 1);
                }
            }
        }
        return dp[target];
    }
}

class LongestPalindromicSubSequence {
    public int find(String s) {
        return dfs(s, 0, s.length()-1);
    }

    private int dfs(String s, int l, int r) {
        if (l > r) {
            return 0;
        }
        if (l == r) {
            return 1;
        }
        if (s.charAt(l) == s.charAt(r)) {
            int res =  2 + dfs(s, l+1, r-1);
            return res;
        } else {
            int res = Integer.MIN_VALUE;
            for (int i = l; i < r; i++) {
                res = Math.max(res, Math.max(dfs(s, l, i), dfs(s, i+1, r)));
            }
            return res;
        }
    }
}

class LongestPalindromicSubSequence_II {
    public int find(String s) {
        int m = s.length();
        int[][] dp = new int[m][m];
        for(int i = 0; i< m; i++) {
            dp[i][i] = 1;
        }

        for(int l = 2; l <= m; l++) {
            for(int i = 0; i< m-l+1; i++) {
                int j = i+l-1;
                if (s.charAt(i) == s.charAt(i+l-1)) {
                    dp[i][j] = 2 + dp[i+1][j-1];
                } else  {
                    for(int k = i; k<j; k++) {
                        dp[i][j] = Math.max(dp[i][j],
                                Math.max((k>i? dp[i][k] : 0), (k <j ? dp[k+1][j] : 0)));
                    }
                }
            }
        }
        return dp[0][m-1];

    }
}

//12/15/17
class PalindromeSplit {
    public int find(String s) {
        int m = s.length();
        int[][] dp = new int[m][m];
        for (int l = 2; l <= m; l++) {
            for(int i = 0; i<= m-l; i++) {
                int r = i+l-1;
                if (s.charAt(i) == s.charAt(r)) {
                    if ((r-1 > i+1 && dp[i+1][r-1] == 0) ||r-1 < i+1) {
                        break;
                    }
                } else {
                    int res = Integer.MAX_VALUE;
                    for (int k = i; k < r; k++ ) {
                        res = Math.min(res, dp[i][k] + dp[k + 1][r] + 1);
                    }
                    dp[i][r] = res;
                }
            }
        }
        return dp[0][m-1];
    }
}

//12/17/17
class NoBST{
    public int find(int n) {
        int[][] dp = new int[n][n];
        for(int i = 0;i< n; i++) {
            dp[i][i] = 1;
        }
        for (int j = 2; j <=n; j++) {
            for (int i = 0; i < n-j+1; i++) {
                int r = i+j-1;
                int res = 0;
                for(int k = i; k <=r; k++) {
                    res+= (k-1<i ? 1 : dp[i][k-1]) * (k+1 > r ? 1 : dp[k+1][r]);
                }
                dp[i][r] = res;
            }
        }
        return dp[0][n-1];
    }

    public int findII(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i<=n; i++) {
            for(int j = 0; j < i; j++) {
                dp[i] += dp[j] * dp[i-j-1];
            }
        }
        return dp[n];
    }
}

class PostOrder {
    public List<Integer> traveral(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) {return res;}
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();
        s1.push(root);
        while(!s1.isEmpty()) {
            TreeNode tmp = s1.pop();
            if(tmp.right != null) {
                s1.push(tmp.right);
            }
            if(tmp.left != null) {
                s1.push(tmp.left);
            }
            s2.push(tmp);
        }
        while(!s2.isEmpty()) {
            res.add(s2.pop().val);
        }
        return res;
    }
}

class InOrder {
    public List<Integer> traversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) {return res;}
        Stack<TreeNode> s = new Stack<>();
        s.push(root);
        TreeNode prev = null;
        while(!s.isEmpty()) {
            TreeNode tmp = s.peek();
            if (tmp.left != null && prev == null) {
                s.push(tmp.left);
                prev = null;
                continue;
            }
            s.pop();
            res.add(tmp.val);
            prev = tmp;
            if (tmp.right != null) {
                s.push(tmp.right);
                prev = null;
            }

        }
        return res;
    }

}

// 12/20/17
class PhoneDirectory {

    private BitSet mBitset;
    private int mMaxNumber;

    /** Initialize your data structure here
     @param maxNumbers - The maximum numbers that can be stored in the phone directory. */
    public PhoneDirectory(int maxNumbers) {
        mBitset = new BitSet(maxNumbers);
        mMaxNumber = maxNumbers;
    }

    /** Provide a number which is not assigned to anyone.
     @return - Return an available number. Return -1 if none is available. */
    public int get() {
        int res = mBitset.nextClearBit(0);
        if (res > mMaxNumber) {
            return -1;
        }
        mBitset.set(res);
        return res;
    }

    /** Check if a number is available or not. */
    public boolean check(int number) {
        return !mBitset.get(number);
    }

    /** Recycle or release a number. */
    public void release(int number) {
        mBitset.set(number, false);
    }
}

class CanDrive {
    public static class Interval{
        int start;
        int end;
        public Interval(int a, int b) {
            start = a;
            end = b;
        }
    }

    public boolean canDrive(List<Interval> log, int now) {
        int drived = 0;
        int startDrivetime = now;
        int i = log.size()-1;
        while(i>=0) {
            if (drived >= 12) {
                return false;
            } else if (startDrivetime - log.get(i).end >= 8) {
                return true;
            } else {
                drived += (log.get(i).end - log.get(i).start);
            }
            startDrivetime = log.get(i).start;
            i--;
        }
        return true;
    }
}

//12/21/17
class printDiagnal{
    public List<List<Integer>> print(int[][] input) {
        // assume the matrix is square
        int m = input.length;
        List<List<Integer>> res = new ArrayList<>();
        for(int j = m-1; j>0; j--){
            List<Integer> l = new ArrayList<>();
            int k = 0;
            while(k<m && j+k<m) {
                l.add(input[k][j+k]);
                k++;
            }
            res.add(l);
        }
        List<Integer> l = new ArrayList<>();
        for(int i = 0; i< m; i++) {
            l.add(input[i][i]);
        }
        res.add(l);
        for(int i= 1; i<m; i++) {
            List<Integer> tmp = new ArrayList<>();
            int k = 0;
            while(k+i < m && k < m) {
                tmp.add(input[k + i][k]);
                k++;
            }
            res.add(tmp);
        }
        return res;
    }
}

//class LogEntry {
//    class log{
//        String data;
//        long time;
//    }
//    List<log> logs = new ArrayList<>();
//    public void Log(String logEntry) {
//        logs.add(new log());
//    }
//
//    public List<List<String>> query(long start, long end, int granularity) {
//        List<String> tmp;
//        for(int )
//        while(start < end) {
////            if ()
//
//
//        }
//    }
//
//    public int findStartIndex(long start) {
//        int r = logs.size();
//        int l = 0;
//        while(l<=r) {
//            int mid = l + (r-l)/2;
//            if (logs.get(mid).time < start) {
//                l = mid+1;
//            } else if(logs.get(mid).time >= start) {
//                r = mid-1;
//            }
//        }
//    }
//
//}

class Solution_X {
    public int findTheFirstLarg(int[] input, int target) {
        int l = 0;
        int r = input.length-1;
        while(l<r) {
            int mid = l + (r-l)/2;
            if (target <= input[mid]) {
                r = mid;
            } else if(target > input[mid]) {
                l = mid+1;
            }
        }
        if(input[l] > target) {
            return l;
        }
        return -1;
    }
}

// "(1+(4+5+2)-3)+(6+8)" = 23
class Solution224 {
    class Operator{
        char oper;
        int level;
        public Operator(char c, int l) {
            oper = c;
            level = l;
        }
    }
    public int calculate(String s) {
        Stack<Integer> numbers = new Stack<>();
        Stack<Operator> operator = new Stack<>();
        char[] arr = s.toCharArray();
        int level = 0;
        for (int i = 0; i< arr.length; i++) {
            if(arr[i] == '(') {
                level += 10;
            } else if (arr[i] == ')') {
                level -= 10;
            } else if (Character.isDigit(arr[i])) {
                numbers.push(arr[i] - '0');
            } else {
                int tmp = 0;
                if (arr[i] == '-' || arr[i] == '+') {
                    tmp = 1 + level;
                } else if(arr[i] == '*' || arr[i] == '/') {
                    tmp = 2 + level;
                }

                if (operator.isEmpty() || operator.peek().level < tmp) {
                    operator.push(new Operator(arr[i], tmp));
                } else {
                    while(!operator.isEmpty() && operator.peek().level >= tmp) {
                        int b = numbers.pop();
                        int a = numbers.pop();
                        char c = operator.pop().oper;
                        numbers.push(evaluate(a, b, c));
                    }
                    operator.push(new Operator(arr[i], tmp));
                }
            }
        }
        while(!operator.isEmpty()) {
            int b = numbers.pop();
            int a = numbers.pop();
            char c = operator.pop().oper;
            numbers.push(evaluate(a, b, c));
        }
        return numbers.pop();
    }

    private int evaluate(int a, int b, char c) {
        if (c == '+') {
            return (a+b);
        } else if (c == '-') {
            return (a-b);
        } else if (c == '*') {
            return (a*b);
        } else if (c == '/') {
            return (a/b);
        }
        return 0;
    }
}

// LRU if this need to be multi thread, I need to be very careful.
class Solution145 {
    class CacheNode{
        String Uri;
        boolean mDownloaded;
        CacheNode prev;
        CacheNode next;
    }

    CacheNode first = new CacheNode();
    CacheNode last = new CacheNode();

    ReentrantLock mapLock = new ReentrantLock();
    Map<String, CacheNode> map = new HashMap<>();

    private ExecutorService pool = Executors.newFixedThreadPool(5);

    public void work(String filePath) throws Exception{
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
            synchronized (mapLock) {
                if (map.containsKey(str)) {
                    // move the item to the first;
                    CacheNode tmp = map.get(str);
                    System.out.println(str + " IN CACHE");
                    tmp.prev.next = tmp.next;
                    tmp.next.prev = tmp.prev;
                    tmp.Uri = str;
                    tmp.next = first.next;
                    first.next = tmp;
                    tmp.prev = first;
                    tmp.next.prev = tmp;

                } else {
                    // insert a new item to the beginning
                    final CacheNode tmp = new CacheNode();
                    tmp.Uri = str;
                    tmp.next = first.next;
                    first.next = tmp;
                    tmp.prev = first;
                    tmp.next.prev = tmp;
                    map.put(str, tmp);
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
                        CacheNode x = last.prev;
                        x.prev.next = last;
                        last.prev = x.prev;
                        map.remove(x.Uri);
                        count--;
                    }
                }
            }
        }
    }

    private void download(String uri, CacheNode node){
        Thread.holdsLock(mapLock);
        try {
            URL url = new URL(uri);
            String fileName = uri.substring(uri.lastIndexOf('/') + 1, uri.length());
            Path targetPath = new File(fileName).toPath();
            Files.copy(url.openStream(), targetPath, StandardCopyOption.REPLACE_EXISTING);
            long x = targetPath.toFile().length();
            node.mDownloaded = true;
            System.out.println(uri + " DOWNLOADED " + String.valueOf(x));
        } catch (Exception ex) {
            System.out.println(uri + " DOWNLOADED Failed");
        }
    }
}

class LowerMedian {
    PriorityQueue<Integer> maxP = new PriorityQueue<>((a,b)->a-b);
    PriorityQueue<Integer> minP = new PriorityQueue<>((a,b)->b-a);
    public int find(int i) {
        if (maxP.size() == 0 || i < maxP.peek()) {
            minP.offer(i);
        } else if(minP.size() == 0  || i > minP.peek()){
            maxP.offer(i);
        }
        while(maxP.size() > minP.size()) {
            minP.offer(maxP.poll());
        }
        while(minP.size() - maxP.size() > 1) {
            maxP.offer(minP.poll());
        }
        return minP.peek();
    }
}

class DirectReport {
    class Employee {
        List<Employee> reports;
        int sales;
        String name;
        Employee manager;
    }

    public void process(String s) {

    }
}

class Solution301_x {
    public List<String> removeInvalidParentheses(String s) {
        int l = 0;
        int r = 0;

        StringBuilder sb = new StringBuilder(s);
        for(int i = 0; i < sb.length(); i++) {
            l += sb.charAt(i) == '(' ? 1 : 0;
            if (sb.charAt(i) == ')') {
                if (l == 0) {
                    r++;
                } else {
                    l--;
                }
            }
        }
        List<String> res = new ArrayList<>();
        dfs(sb, 0, l, r, res);
        return res;
    }

    private void dfs(StringBuilder sb, int start, int l, int r, List<String> res) {
        if (l == 0 && r == 0 && isValid(sb)) {
            res.add(sb.toString());
            return;
        }
        for(int i = start; i < sb.length(); i++) {
            if (i != start && sb.charAt(i) == sb.charAt(i-1)) {
                continue;
            }
            if(sb.charAt(i) == '(' || sb.charAt(i) == ')') {
                StringBuilder tmp = new StringBuilder(sb);
                tmp.deleteCharAt(i);
                if (sb.charAt(i) == '(' && l > 0) {
                    dfs(tmp, i, l-1, r, res);
                } else if (sb.charAt(i) == ')' || sb.charAt(i) == ')') {
                    dfs(tmp, i, l, r-1, res);
                }
            }
        }
    }

    private boolean isValid(StringBuilder sb) {
        int l = 0;
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == ')') {l--;}
            if (sb.charAt(i) == '(') {l++;}
            if (l < 0) return false;
        }
        return l == 0;
    }
}

class Solution439_X {
    public String parseTernary(String expression) {
        if (expression == null || expression.length() == 0) return "";
        Stack<Character> s = new Stack<>();

        int i = expression.length()-1;
        while(i>=0) {
            if (expression.charAt(i) == '?') {
                char a = s.pop();
                char b = s.pop();
                i --;
                if (expression.charAt(i) == 'T') {
                    s.push(a);
                } else {
                    s.push(b);
                }
            } else if (expression.charAt(i) != ':' &&
                    expression.charAt(i) != ')' &&
                    expression.charAt(i) != '(') {
                s.push(expression.charAt(i));
            }
            i--;
        }
        return s.pop().toString();
    }
}

// 12/26/17
class Solution269_II {
    public String alienOrder(String[] words) {
        Map<Character, Set<Character>> map = new HashMap<>();
        for(int i = 0; i< words.length-1; i++) {
            int m = Math.min(words[i].length(), words[i+1].length());
            for (int j = 0; j < m; j++) {
                if (words[i].charAt(j) != words[i+1].charAt(j)) {
                    Set<Character> tmp = map.getOrDefault(words[i].charAt(j), new HashSet<>());
                    tmp.add(words[i+1].charAt(j));
                    map.put(words[i].charAt(j), tmp);
                } else {
                    if (!map.containsKey(words[i].charAt(j))) {
                        map.put(words[i].charAt(j), new HashSet<>());
                    }
                }
            }
            String s = words[i];
            for(int k = 0; k< s.length()-1; k++) {
                Set<Character> tmp = map.getOrDefault(s.charAt(k), new HashSet<>());
                tmp.add(s.charAt(k+1));
                map.put(s.charAt(k), tmp);
            }
            s = words[i+1];
            for(int k = 0; k< s.length()-1; k++) {
                Set<Character> tmp = map.getOrDefault(s.charAt(k), new HashSet<>());
                tmp.add(s.charAt(k+1));
                map.put(s.charAt(k), tmp);
            }
        }
        StringBuilder sb = new StringBuilder();
        boolean[] visited = new boolean[26];
        boolean[] visiting = new boolean[26];
        for (Character c : map.keySet()) {
            if (!visited[c-'a']) {
                visiting[c-'a'] = true;
                if (!dfs(c, map, visited, visiting, sb)) {
                    return "";
                }
                visited[c-'a'] = true;
                visiting[c-'a'] = false;
                sb.append(c);
            }

        }
        return sb.reverse().toString();

    }

    private boolean dfs(Character c,
                        Map<Character, Set<Character>> dp,
                        boolean[] visited,
                        boolean[] visiting,
                        StringBuilder sb) {

        for(char x : dp.getOrDefault(c, new HashSet<>())) {
            if (visiting[x-'a']) {return false;}
            if (!visited[x-'a']) {
                visiting[x - 'a'] = true;
                if (!dfs(x, dp, visited, visiting, sb)) {
                    return false;
                }
                visiting[x - 'a'] = false;
                visited[x - 'a'] = true;
                sb.append(x);
            }
        }
        return true;
    }
}

class Solution238 {
    public int[] productExceptSelf(int[] nums) {
        int m = nums.length;
        int[] left = new int[m];

        left[0] = 1;
        for (int i = 1; i< m; i++) {
            left[i] = left[i-1]* nums[i-1];
        }
        int right = 1;
        for(int i = m-1; i>=0; i--) {
            left[i] = left[i] * right;
            right *= nums[i];
        }
        return left;
    }
}

// 12/27/17
class Solution34 {
    public int[] searchRange(int[] nums, int target) {
        int m = nums.length;
        if (m < 1) { return new int[]{-1,-1};}
        int l = 0;
        int r = m -1;
        int left = -1;

        while(l<=r) {
            int mid = l + (r-l)/2;
            if ((mid == 0 && nums[mid] == target) ||
                    (nums[mid] == target && nums[mid-1]< target)) {
                left = mid;
                break;
            } else if(nums[mid] < target) {
                l = mid+1;
            } else {
                r = mid-1;
            }
        }
//        if (left == -1) {left = l;}

        l = 0;
        r = nums.length-1;
        int right = -1;
        while(l<=r) {
            int mid = l + (r-l)/2;
            if ((mid == nums.length-1 && nums[mid] == target) ||
                    (nums[mid] == target && nums[mid+1] > target)) {
                right = mid;
                break;
            } else if(nums[mid] > target) {
                r = mid -1;
            } else {
                l = mid+1;
            }
        }
//        if (right == -1) { right = r; }
        return new int[]{left, right};
    }
}

class Solution198 {
    public int rob(int[] nums) {
        int m = nums.length;
        if (m == 0) return 0;
        if (m == 1) return nums[0];
        if (m == 2) return Math.max(nums[0], nums[1]);
        int i1 = nums[0];
        int i2 = nums[1];
        for(int i = 2; i < m; i++) {
            int tmp = Math.max(i1+ nums[i], i2);
            i1 = Math.max(i1, i2);
            i2 = tmp;
        }
        return Math.max(i1, i2);

    }

    public int robII(int[] nums) {
        int m = nums.length;
        if (m == 0) return 0;
        if (m == 1) return nums[0];
        if (m == 2) return Math.max(nums[0], nums[1]);

        int i1 = nums[0];
        int i2 = nums[1];
        for(int i = 2; i < m-1; i++) {
            int tmp = Math.max(i1+ nums[i], i2);
            i1 = Math.max(i1, i2);
            i2 = tmp;
        }
        int res =  Math.max(i1, i2);

        i1 = 0;
        i2 = nums[1];
        for(int i = 2; i < m; i++) {
            int tmp = Math.max(i1+ nums[i], i2);
            i1 = Math.max(i1, i2);
            i2 = tmp;
        }
        res = Math.max(res, Math.max(i1, i2));
        return res;
    }
}

class Solution212 {
    int[] dx = new int[]{-1,0,1,0};
    int[] dy = new int[]{0,-1,0,1};

    public List<String> findWords(char[][] board, String[] words) {
        int m = board.length;
        int n = board[0].length;
        boolean[][] visited = new boolean[m][n];
        Set<String> res = new HashSet<>();
        for(String s : words) {
            clear(visited);
            boolean found = false;
            for(int i = 0; i< m; i++) {
                if (found) {break;}
                for(int j = 0; j < n; j++) {
                    if (dfs(board, visited, i, j, s, 0)) {
                        res.add(s);
                        found = true;
                        break;
                    }
                }
            }
        }
        return new ArrayList<>(res);
    }

    private void clear(boolean[][] visited) {
        for(int i = 0; i< visited.length; i++) {
            for (int j = 0; j < visited[0].length; j++) {
                visited[i][j] = false;
            }
        }
    }

    private boolean dfs(char[][] board,
                        boolean[][] visisted,
                        int i,
                        int j,
                        String target,
                        int index) {
        if (index == target.length()) {
            return true;
        } else if (i < 0 ||
                    i >= board.length ||
                    j < 0 ||
                    j >= board[0].length ||
                    visisted[i][j]) {
            return false;
        } else if(target.charAt(index) != board[i][j]) {
            return false;
        } else {
            visisted[i][j] = true;
            for(int k = 0; k< 4; k++) {

                if (dfs(board, visisted, i+ dx[k], j+dy[k], target, index+1)) {
                    return true;
                }
            }
            visisted[i][j] = false;
            return false;
        }
    }
}

class Solution36 {
    public boolean isValidSudoku(char[][] board) {
        int[] track = new int[10];

        int m = board.length;
        int n = board[0].length;
        if (m != 9 || n != 9) return false;
        for(int i = 0; i< m; i++) {
            Arrays.fill(track, 0);
            for(int j = 0; j < n; j++) {
                char c = board[i][j];
                if (c == '.') { continue;}
                if (c-'0' >9) {
                    return false;
                }
                if (track[c-'0'] > 0) {
                    return false;
                }
                track[c-'0'] = 1;
            }
        }

        for(int j = 0; j< n; j++) {
            Arrays.fill(track, 0);
            for(int i = 0; i < n; i++) {
                char c = board[i][j];
                if (c == '.') { continue;}
                if (c-'0' >9) {
                    return false;
                }
                if (track[c-'0'] > 0) {
                    return false;
                }
                track[c-'0'] = 1;
            }
        }

        for(int i = 0; i < n ; i = i+3) {
            for (int j = 0; j < n; j = j+3) {
                Arrays.fill(track, 0);
                for(int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        char c = board[i+k][j+l];
                        if (c == '.') { continue;}
                        if (c-'0' >9) {
                            return false;
                        }
                        if (track[c-'0'] > 0) {
                            return false;
                        }
                        track[c-'0'] = 1;

                    }
                }
            }
        }
        return true;
    }
}

class LRUCache {
    int mCapacity;
    int mCount;
    LruNode first;
    LruNode last;

    Map<Integer, LruNode> map;

    class LruNode{
        int key;
        int value;
        LruNode prev;
        LruNode next;
    }

    public LRUCache(int capacity) {
        mCapacity = capacity;
        map = new HashMap<>();

        first = new LruNode();
        last = new LruNode();
        first.next = last;
        last.prev = first;

    }

    public int get(int key) {
        if (map.containsKey(key)) {
            LruNode tmp = map.get(key);
            moveToFront(tmp);
            return tmp.value;
        } else {
            return -1;
        }

    }

    public void put(int key, int value) {
        if (mCapacity == 0) {return;}
        if (map.containsKey(key)) {
            LruNode tmp = map.get(key);
            tmp.value = value;
            moveToFront(tmp);
        } else {
            if (mCount == mCapacity) {
                // remove the last
                LruNode x = last.prev;
                x.prev.next = x.next;
                last.prev = x.prev;
                map.remove(x.key);
                mCount--;
            }

            LruNode tmp = new LruNode();
            tmp.value = value;
            tmp.key = key;
            map.put(key, tmp);

            tmp.next = first.next;
            tmp.next.prev = tmp;
            tmp.prev = first;
            first.next = tmp;
            mCount++;
        }
    }

    private void moveToFront(LruNode node) {
        // take out
        node.prev.next = node.next;
        node.next.prev = node.prev;
        // put at front
        node.next = first.next;
        first.next.prev = node;
        node.prev = first;
        first.next = node;
    }
}

class Solution127 {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> visited = new HashSet<>();
        Set<String> dict = new HashSet<>(wordList);
        Queue<String> q = new LinkedList<>();
        q.add(beginWord);
        q.add(null);
        int steps = 1;
        while(!q.isEmpty()) {
            String s = q.poll();

            if (s == null) {
                if (!q.isEmpty()) {
                    steps++;
                    q.add(null);
                }
                continue;
            }
            if (s.equals(endWord)) {
                return steps;
            } if (visited.contains(s)) {
                continue;
            } else {
                StringBuilder sb = new StringBuilder(s);
                for (int i = 0; i< sb.length(); i++) {
                    for (int j = 0; j < 26; j++) {
                        if (s.charAt(i)-'a' == j ) { continue; }
                        sb.setCharAt(i, (char)('a' + j));
                        String tmp = sb.toString();
                        if (dict.contains(tmp) && !visited.contains(tmp)) {
                            q.add(tmp);
                        }
                    }
                    sb.setCharAt(i, s.charAt(i));
                }
                visited.add(s);
            }
        }
        return -1;
    }
}

class Solution_OneEditdistance {
    public boolean isOneEditDistance(String s, String t) {
        int m = s.length();
        int n = t.length();
        if (Math.abs(n-m)>1) {
            return false;
        }
        if (m == n) {
            int editCount = 0;
            for (int i = 0; i < m; i++) {
                if (s.charAt(i) != t.charAt(i)) {
                    editCount++;
                    if (editCount > 1) {
                        return false;
                    }
                }
            }
            return editCount == 1;
        }

        if (m != n) {
            String longS = m > n ? s : t;
            String shortS = m < n ? s : t;
            int editCount = 0;
            for (int i = 0; i < Math.max(m, n); i++) {
                if (i - editCount >= shortS.length()) {
                    editCount++;
                    continue;
                }
                if (shortS.charAt(i - editCount) != longS.charAt(i)) {
                    editCount ++;
                    if (editCount > 1) {
                        return false;
                    }
                }
            }
            return editCount == 1;
        }
        return true;
    }
}


class Solution96 {
    public int numTrees(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;

        for (int l = 2; l <= n; l++) {
            for (int i = 1; i <= l; i++ ) {
                dp[l] += dp[i-1] * dp[l-i];
            }
        }
        return dp[n];
    }

    int[] map;
    public int numTrees2(int n) {
        map = new int[n];
        Arrays.fill(map, -1);
        return dfs(1, n);
    }

    private int dfs(int start, int end) {
        if (end <=start) { return 1;}
        int res = 0;
        for(int i = start; i<=end; i++) {
            int left;
            if (map[i-1-start+1] < 0) {
                map[i-1-start+1] = dfs(start, i-1);
            }
            left = map[i-1-start+1];

            int right;
            if (map[end - (i+1) + 1] < 0) {
                map[end - (i+1) + 1] = dfs(i+1, end);
            }
            right = map[end -(i+1) + 1];

            res += left * right;
        }
        return res;
    }
}

class Solution377_I {

    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target+1];
        dp[0] = 1;
        for (int i = 1; i<=target; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i - nums[j] < 0) {continue;}
                dp[i]+= dp[i-nums[j]];
            }
        }
        return dp[target];
    }
}

class Solution206 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode reverseList(ListNode head) {
        ListNode newHead= null;
        ListNode tmp = null;
        while(head != null) {
            tmp = head;
            head = head.next;
            tmp.next = newHead;
            newHead = tmp;
        }
        return newHead;
    }
}

class Solution44_III {
    public boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();
        boolean[][] dp = new boolean[m+1][n+1];
        dp[0][0] = true;

        for (int j = 1; j<= p.length(); j++) {
            if (p.charAt(j-1) == '*') {
                dp[0][j] = dp[0][j-1];
            }
        }

        for(int i = 1; i <=s.length(); i++) {
            for (int j = 1; j <=p.length(); j++) {
                if (p.charAt(j-1) == '?' ||p.charAt(j-1) == s.charAt(i-1)) {
                    dp[i][j] = dp[i-1][j-1];
                } else if (p.charAt(j-1) == '*') {
                    dp[i][j] = dp[i-1][j] || dp[i][j-1];
                }
            }
        }
        return dp[m][n];
    }
}

class Solution10_III {
    public boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();
        boolean[][] dp = new boolean[m+1][n+1];
        dp[0][0] = true;
        for(int j = 1; j <= p.length(); j++) {
            if (p.charAt(j-1) == '*') {
                dp[0][j] = dp[0][j-2];
            }
        }

        for(int i = 1; i <= s.length(); i++) {
            for (int j = 1; j <= p.length(); j++) {
                if (equal(s.charAt(i-1), p.charAt(j-1))) {
                    dp[i][j] = dp[i-1][j-1];
                } else if (p.charAt(j-1) == '*') {
                    dp[i][j] = (dp[i-1][j] && equal(s.charAt(i-1), p.charAt(j-2))) ||
                            dp[i][j-2];
                }
            }
        }
        return dp[m][n];
    }

    private boolean equal(char s, char p) {
        return p == '.' || s== p;
    }
}

class MinStack {
    Stack<Integer> s;
    Stack<Integer> m;

    /** initialize your data structure here. */
    public MinStack() {
        s = new Stack<>();
        m = new Stack<>();
    }

    public void push(int x) {
        s.push(x);
        if (m.isEmpty() || x <= m.peek()) {
            m.push(x);
        }
    }

    public void pop() {
        if (s.isEmpty()) {
            return;
        }
        int tmp = s.pop();
        if (m.peek() == tmp) {
            m.pop();
        }
    }

    public int top() {
        if (s.isEmpty()) {
            return -1;
        } else {
            return s.peek();
        }
    }

    public int getMin() {
        if (m.isEmpty()) {
            return -1;
        } else {
            return m.peek();
        }
    }
}

class Solution151 {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder(s);
        int l = 0;
        int r = sb.length()-1;
        revert(sb, l, r);
        l = -1;
        for (int k = 0; k < sb.length(); k++) {
            if (sb.charAt(k) != ' ' && l < 0) {
                l = k;
                continue;
            }
            if (sb.charAt(k) == ' ' && l >=0){
                r = k -1;
                revert(sb, l, r);
                l = -1;
            }
        }
        if (l > 0) {
            revert(sb, l, sb.length()-1);
        }
        return sb.toString().trim();
    }

    private void revert(StringBuilder sb, int l , int r) {
        while(l < r) {
            char c = sb.charAt(l);
            sb.setCharAt(l, sb.charAt(r));
            sb.setCharAt(r, c);
            l++;
            r--;
        }
    }
}

class Solution40_X {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> tracker = new ArrayList<>();
        Arrays.sort(candidates);
        dfs(res, tracker, 0, 0, target, candidates);
        return res;
    }

    private void dfs(List<List<Integer>> res, List<Integer> tracker, int sum, int index, int target, int[] candidates) {
        if (sum == target) {
            res.add(new ArrayList<>(tracker));
            return;
        } else {
            for(int i = index; i < candidates.length; i++) {
                if (i > index && candidates[i] == candidates[i-1]) {
                    continue;
                }
                if (sum + candidates[i] > target) {
                    continue;
                }
                tracker.add(candidates[i]);
                dfs(res, tracker, sum + candidates[i], i+1, target, candidates);
                tracker.remove(tracker.size()-1);
            }
        }
    }
}

class Solution755 {
    public int reachNumber(int target) {
        Queue<Long> q = new LinkedList<>();
        int steps = 1;
        q.add(1l);
        q.add(null);
        while(!q.isEmpty()) {
            Long tmp = q.poll();
            if (tmp == null) {
                if (!q.isEmpty()) {
                    q.add(null);
                    steps++;
                }
                continue;
            }
            if (tmp == target) { return steps-1;}
            q.add(tmp - steps);
            q.add(tmp + steps);
        }
        return -1;
    }
}



class Solution126 {
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        List<List<String>> res = new ArrayList<>();
        List<String> ladder = new ArrayList<>();
        Set<String> visited = new HashSet<>();
        visited.add(beginWord);
        ladder.add(beginWord);
        dfs(beginWord, endWord, wordList, ladder, visited, res);
        int minLength = Integer.MAX_VALUE;
        for (int i = 0; i< res.size(); i++) {
            if (res.get(i).size() < minLength) {
                minLength = res.get(i).size();
            }
        }

        List<List<String>> tmp = new ArrayList<>();
        for(int i = 0; i < res.size(); i++) {
            if (res.get(i).size() == minLength) {
                tmp.add((res.get(i)));
            }
        }
        return tmp;
    }

    private void dfs(String s,
                     String endWord,
                     List<String> wordList,
                     List<String> ladder,
                     Set<String> visited,
                     List<List<String>> res) {
        if (s.equals(endWord)) {
            List<String> tmp = new ArrayList<>(ladder);
//            tmp.add(endWord);
            res.add(tmp);
            return;
        } else {
            for (int i = 0; i < wordList.size(); i++) {
                if (!visited.contains(wordList.get(i)) && isOneDiff(s, wordList.get(i))) {
                    visited.add(wordList.get(i));
                    ladder.add(wordList.get(i));
                    dfs(wordList.get(i), endWord, wordList, ladder, visited, res);
                    visited.remove(wordList.get(i));
                    ladder.remove(ladder.size()-1);
                }
            }
        }
    }

    private boolean isOneDiff(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int diff = 0;
        for (int i = 0; i< s.length(); i++) {
            if (s.charAt(i) != t.charAt(i)) {
                diff++;
            } else {
                continue;
            }
        }
        return diff == 1;
    }
}

class Solution735 {
    public int[] asteroidCollision(int[] asteroids) {
        int m = asteroids.length;
        Stack<Integer> right = new Stack<>();
        Stack<Integer> left = new Stack<>();

        for (int i = m-1; i >= 0; i--) {
            if (asteroids[i] < 0) {
                left.push(asteroids[i]);
            } else {
                int res = asteroids[i];
                while (!left.isEmpty()) {
                    res = collide(res, left.pop());
                    if (res < 0) {
                        left.push(res);
                        break;
                    } if (res == 0) {
                        break;
                    }
                }
                if (res > 0) {
                    right.add(res);
                }
            }
        }
        List<Integer> tmp = new ArrayList<>();

        while (!left.isEmpty()) {
            tmp.add(left.pop());
        }
        while(!right.isEmpty()) {
            tmp.add(right.pop());
        }

        int size = tmp.size();
        int[] res = new int[size];
        for(int i = 0; i < size; i++) {
            res[i] = tmp.get(i);
        }
        return res;
    }

    private int collide(int a, int b) {
        if (a > -b) {
            return a;
        } else if (a == -b) {
            return 0;
        } else {
            return b;
        }
    }
}


class Crawler {
    Object lock;
    List<Integer> x;
    public Crawler() {
        lock = new Object();
        x = new ArrayList<>();
        x.add(1);
        x.add(2);
        x.add(3);
        x.add(4);

    }

    public void craw() {
        ExecutorService es = Executors.newFixedThreadPool(3);
        while(true) {
            synchronized (lock) {
                if (!x.isEmpty()) {
                    int tmp = x.get(0);
                    x.remove(0);
                    es.execute(new Runner(tmp));
                }
            }
        }
    }


    class Runner implements Runnable {
        int uri;
        public Runner(int i) {
            uri = i;
        }

        @Override
        public  void run() {
            try {
                System.out.println("Enter thread " + String.valueOf(uri));
                Thread.sleep(3000);
                synchronized (lock) {
                    x.add(uri*10);
                }
                System.out.println("Leave thread " + String.valueOf(uri));
            } catch (Exception ex) {

            }
        }
    }
}

class SolutionTest {
    public int sumOfDiv(int n) {
        if (n < 1) return 0;
        int sum = 1;
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n%i == 0) {
                sum += i;
                if (n/i != i) {
                    sum+= n/i;
                }
            }
        }
        return sum;
    }
}

class Solution230 {
    public int kthSmallest(TreeNode root, int k) {
        TreeNode cur = root;
        Stack<TreeNode> s = new Stack<>();
        int count = 0;
        while(cur != null || !s.isEmpty()){
            while(cur!= null) {
                s.add(cur);
                cur = cur.left;
            }
            cur = s.pop();
            count++;
            if (count == k) {
                return cur.val;
            }
            cur = cur.right;
        }
        return 0;
    }
}

class Solution739 {
    public int[] dailyTemperatures(int[] temperatures) {
        Map<Integer, Integer> map = new HashMap<>();
        int m = temperatures.length;
        int max = 0;
        int[] res = new int[m];
        for (int i = m-1; i >=0; i--) {
            if (temperatures[i] < max) {
                int leftMost = m - 1;
                for (int k = temperatures[i] + 1; k <= max; k++) {
                    if (map.containsKey(k) && map.get(k) < leftMost) {
                        leftMost = map.get(k);
                    }
                }
                res[i] = leftMost - i;
            }
            max = Math.max(max, temperatures[i]);
            map.put(temperatures[i], i);
        }
        return res;
    }
}

class Solution144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();
        if (root == null) { return res;}
        s.add(root);
        while(!s.isEmpty()) {
            TreeNode tmp = s.pop();
            res.add(tmp.val);
            if (tmp.right != null) {
                s.push(tmp.right);
            }
            if (tmp.left!= null) {
                s.push(tmp.left);
            }
        }
        return res;
    }
}

class Solution94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();
        if (root == null) { return res;}
        TreeNode pre = root;
        while(pre != null || !s.isEmpty()) {
            while(pre != null) {
                s.push(pre);
                pre = pre.left;
            }
            TreeNode cur = s.pop();
            res.add(cur.val);
            pre = cur.right;
        }
        return res;
    }
}

class Solution_snap4 { //https://qiuzhihui.gitbooks.io/r-book/content/sc.html
    public int findMAX(int[] input) {
        int m = input.length;
        int[][] dp = new int[m][m];
        for (int i = 0; i < m; i++) {
            dp[i][i] = input[i];
        }
        for (int l = 2; l <= m; l++) {
            for (int i = 0; i <= m-l; i++) {
                for(int k = i; k < i+l-1; k++) {
                    System.out.println(String.format("i = %d", i));
                    System.out.println(String.format("k = %d", k));
                    System.out.println(String.format("j = %d", i+l-1));
                    System.out.println(String.format("dp[i][k] = %d", dp[i][k]));
                    System.out.println(String.format("dp[k+1][i+l-1] = %d", dp[k][i+l-1]));
                    dp[i][i + l - 1] = Math.max(dp[i][k]+ dp[k+1][i+l-1], dp[i][k] * dp[k+1][i+l-1]);
                }
            }
        }
        return dp[0][m-1];
    }
}

class Solution91 {
    public int numDecodings(String s) {
        int n = s.length();
        int[] dp = new int[n+1];
        dp[n] = 1;
        dp[n-1] = s.charAt(n-1) == '0' ? 0 : 1;
        for (int i = n-2; i>=0; i++) {
            if (s.charAt(i) == '0') continue;
            dp[i] = Integer.parseInt(s.substring(i, i+2)) <= 26 ? dp[i+1]+ dp[i+2] : dp[i+1];
        }
        return dp[0];
    }
}

class Solution22 {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        if (n == 0) return res;
        dfs(res, n, 0,0, "");
        return res;
    }

    private void dfs(List<String> res, int n, int left, int right, String s) {
        if (s.length() == n*2) {
            res.add(s);
            return;
        } else {
            if (left < n) {
                dfs(res, n, left+1, right, s+'(');
            }
            if (right < left) {
                dfs(res, n, left, right+1, s+')');
            }
        }
    }
}


//class TreeNode {
//    public int val;
//    public TreeNode left;
//    public TreeNode right;
//    public TreeNode(int input) {
//        val = input;
//    }
//}

class LeftIterator {
    private Stack<TreeNode> stack;
    private TreeNode pre;

    public LeftIterator(TreeNode root) {
        stack = new Stack();
        pre = root;
    }

    public boolean hasNext() {
        return pre != null || !stack.isEmpty();
    }

    public TreeNode getNext() {
        if (!hasNext()) return null;

        if (pre != null) {
            while (pre.left != null) {
                stack.push(pre);
                pre = pre.left;
            }
        }
        TreeNode res = stack.peek();
        stack.pop();
        pre = res.right;
        return res;
    }
}




//class Solution43 {
//    public String multiply(String num1, String num2) {
//
//    }
//
//    private List<Integer> multi(String num1, char c) {
//
//    }
//
//}
//
//class Solution230 {
//    public int kthSmallest(TreeNode root, int k) {
//
//    }
//}

// Hungarian algorithm

//class Crawler {
//    Object lock;
//    ConcurrentLinkedDeque<Integer> x;
//    public Crawler() {
//        lock = new Object();
////        List<Integer> t = new ArrayList<>();
////        x = Collections.synchronizedList(t);
//        x = new ConcurrentLinkedDeque();
//        x.add(1);
//        x.add(2);
//        x.add(3);
//        x.add(4);
//        x.add(5);
//        x.add(6);
//        x.add(7);
//        x.add(8);
//
//    }
//
//    public void craw() {
//        ExecutorService es = Executors.newFixedThreadPool(3);
//        while(true) {
////            synchronized (lock) {
//                if (!x.isEmpty()) {
//                    int tmp = x.pollFirst();
//                    x.remove(0);
//                    es.execute(new Runner(tmp));
//                }
////            }
//        }
//    }
//
//
//    class Runner implements Runnable {
//        int uri;
//        public Runner(int i) {
//            uri = i;
//        }
//
//        @Override
//        public  void run() {
//            try {
//                System.out.println("Enter thread " + String.valueOf(uri));
////                System.out.println(Thread.currentThread().toString());
//                Thread.sleep(3000);
////                synchronized (lock) {
//                    x.add(uri*10);
////                }
//                System.out.println("Leave thread " + String.valueOf(uri));
//            } catch (Exception ex) {
//                System.out.println("Exception in  thread " + String.valueOf(uri));
//            }
//        }
//    }
//}































