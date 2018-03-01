package com.company;

import apple.laf.JRSUIUtils;
import com.sun.tools.corba.se.idl.InterfaceGen;
import com.sun.tools.javac.util.ListBuffer;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.MaxPQ;
import javafx.scene.layout.Priority;
import sun.jvm.hotspot.jdi.ArrayReferenceImpl;

import javax.management.StringValueExp;
import javax.security.auth.callback.CallbackHandler;
import java.lang.reflect.Array;
import java.util.*;

public class Nov {
}
// 11/1/17
class Solution518 {
    int res = 0;
    public int change(int amount, int[] coins) {
        List<Integer> list = new ArrayList<>();
        Set<List<Integer>> track = new HashSet<>();
        dfs(amount, 0, coins, list, track);
        return track.size();
    }
    private int dfs(int amount,
                    int sum,
                    int[] coins, List<Integer> list,
                    Set<List<Integer>> track) {
        if (sum == amount) {
            Collections.sort(list);
            track.add(new ArrayList<>(list));
            res++;
            return 1;
        }
        if (sum > amount) { return 0;}

        int total = 0;
        for (int i = 0; i< coins.length; i++) {
            list.add(coins[i]);
            total += dfs(amount, sum + coins[i], coins, list, track);
            list.remove(list.size()-1);
        }
        return total;
    }
}

class Solution518I {
    public int change(int amount, int[] coins) {
        int[][] dp = new int[coins.length+1][amount+1];

        dp[0][0] = 1;
        for (int i = 1; i <= coins.length; i++) {
            dp[i][0] = 1;
            for (int j = 1; j <= amount; j++) {
                dp[i][j] = dp[i-1][j] +
                        (j >= coins[i-1] ? dp[i][j-coins[i-1]] : 0);
            }
        }
        return dp[coins.length][amount];
    }
}

class Solution520 {
    public boolean detectCapitalUse(String word) {
        if (word.length() == 0) return true;
        boolean noUpper = false;
        boolean noLower = false;
        if (Character.isLowerCase(word.charAt(0))) {
            noUpper = true;
        } else if (word.length() > 1) {
            if (Character.isUpperCase(word.charAt(1))) {
                noLower = true;
            } else {
                noUpper = true;
            }
        }

        for (int i = 1; i< word.length(); i++) {
            if (noLower && Character.isLowerCase(word.charAt(i))) { return false;}
            if (noUpper && Character.isUpperCase(word.charAt(i))) { return false;}
        }
        return true;
    }
}

class Solution523 {
    public boolean checkSubarraySum(int[] nums, int k) {
        k = Math.abs(k);
        if (k == 0) {return check0(nums);}
        Map<Integer, Integer> track = new HashMap<>();

        track.put(0, -1);
        int sum = 0;
        int res = 0;
        for (int i = 0; i< nums.length; i++) {
            sum += nums[i];
            int mod = sum % k;
            if (track.getOrDefault(mod, -2) == -2) {
                track.put(mod, i);
            } else {
                res = Math.max(res, i - track.get(mod));
            }
            if (res >= 2) {return true;}
        }
        return false;
    }

    private boolean check0(int[] nums) {
        int m = nums.length;
        if (m == 0) return false;
        Map<Integer, Integer> track = new HashMap<>();
        track.put(0, -1);
        int sum = 0;
        for (int i = 0; i< nums.length; i++) {
            sum = sum + nums[i];
            if (track.getOrDefault(sum, -2) == -2) {
                track.put(sum, i);
            }
            if (i - track.get(sum) >=2) return true;
        }
        return false;
    }
}

// 11/2/17
class Solution524 {
    public String findLongestWord(String s, List<String> d) {
        Collections.sort(d,
                (String a, String b) -> (a.length() == b.length() ?
                        a.compareTo(b) : b.length() - a.length()));
        for (String tmp : d) {
            int j = 0;
            for (int i = 0; i< s.length(); i++) {
                if (j < tmp.length() && tmp.charAt(j) == s.charAt(i)) {j++;}
            }
            if (j == tmp.length()) {return tmp;}
        }
        return "";
    }
}

class Solution525 {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int countZero = 0;
        map.put(countZero, -1);
        int res = 0;
        for (int i = 0; i< nums.length; i++) {
            if (nums[i] == 0) {countZero++;}
            else {countZero--;}
            if (map.containsKey(countZero)) {
                res = Math.max(res, i - map.get(countZero));
            } else {
                map.put(countZero, i);
            }
        }
        return res;
    }
}

class Solution526 {
    int count = 0;

    public int countArrangement(int N) {
        if (N == 0) return 0;
        helper(N, 1, new int[N + 1]);
        return count;
    }

    private void helper(int N, int pos, int[] used) {
        if (pos > N) {
            count++;
            return;
        }

        for (int i = 1; i <= N; i++) {
            if (used[i] == 0 && (i % pos == 0 || pos % i == 0)) {
                used[i] = 1;
                helper(N, pos + 1, used);
                used[i] = 0;
            }
        }
    }
}

class Solution526I {
    int count = 0;

    public int countArrangement(int N) {
        if (N == 0) return 0;
        dfs(N, 1, new boolean[N + 1]);
        return count;
    }

    private void dfs(int n, int position, boolean[] visited) {
        if (position > n) {
            count++;
            return;
        }
        for (int i = 1; i<=n; i++) {
            if (!visited[i] && (position % i == 0 || i%position == 0)) {
                visited[i] = true;
                dfs(n, position + 1, visited);
                visited[i] = false;
            }
        }
    }
}

class Solution527 {
    public List<String> wordsAbbreviation(List<String> dict) {
        int len=dict.size();
        String[] ans=new String[len];
        int[] prefix=new int[len];
        for (int i=0;i<len;i++) {
            prefix[i]=1;
            ans[i]=makeAbbr(dict.get(i), 1); // make abbreviation for each string
        }
        for (int i=0;i<len;i++) {
            while (true) {
                HashSet<Integer> set=new HashSet<>();
                for (int j=i+1;j<len;j++) {
                    if (ans[j].equals(ans[i])) set.add(j); // check all strings with the same abbreviation
                }
                if (set.isEmpty()) break;
                set.add(i);
                for (int k: set)
                    ans[k]=makeAbbr(dict.get(k), ++prefix[k]); // increase the prefix
            }
        }
        return Arrays.asList(ans);
    }

    private String makeAbbr(String s, int k) {
        if (k>=s.length()-2) return s;
        StringBuilder builder=new StringBuilder();
        builder.append(s.substring(0, k));
        builder.append(s.length()-1-k);
        builder.append(s.charAt(s.length()-1));
        return builder.toString();
    }
}

// 11/3/17
class Solution529 {
    class Point{
        int i, j;
        public Point(int a, int b) {i = a; j = b;}
    }

    public char[][] updateBoard(char[][] board, int[] click) {
        int m = board.length;
        if (m == 0) {return board;}
        int n = board[0].length;
        Queue<Point> q = new LinkedList<>();
        if (board[click[0]][click[1]] == 'M') {
            board[click[0]][click[1]] = 'X';
            return board;
        }

        q.add(new Point(click[0], click[1]));
        while(!q.isEmpty()) {
            Point tmp = q.poll();
            int x = tmp.i;
            int y = tmp.j;
            int count = 0;
            for (int i = -1; i <=1; i++) {
                for (int j = -1; j <=1; j++) {
                    if ((i+x>=0 && i+x < m) && (j+y >= 0 && j+y <n)) {
                        if (i == 0 && j ==0) {continue;}
                        if (board[i+x][j+y] == 'M') {
                            count++;
                        }
                    }
                }
            }
            if (count == 0) {board[x][y] = 'B';}
            else {board[x][y] = (char)('0' + count); continue;}

            for (int i = -1; i <=1; i++) {
                for (int j = -1; j <= 1; j++) {
                    if ((i + x >= 0 && i + x < m) && (j + y >= 0 && j + y < n)) {
                        if (i == 0 && j ==0) {continue;}
                        if (board[i+x][j+y] == 'E') {
                            board[i+x][j+y] = 'U';
                            q.add(new Point(i+x, j+y));
                        }
                    }
                }
            }
        }
        return board;

    }
}

class Solution530 {
    int res = Integer.MAX_VALUE;
    class Point{
        int l, r;
        public Point(int a, int b) {l = a; r = b;}
    }

    public int getMinimumDifference(TreeNode root) {
        dfs(root);
        return res;
    }

    private Point dfs(TreeNode root) {
        int left = root.val;
        int right = root.val;
        if (root.left != null) {
            Point leftPoint = dfs(root.left);
            res = Math.min(res, Math.abs(root.val-leftPoint.r));
            left = leftPoint.l;
        }

        if (root.right != null) {
            Point rightPoint = dfs(root.right);
            res = Math.min(res, Math.abs(root.val-rightPoint.l));
            right = rightPoint.r;
        }

        return new Point(left, right);
    }
}

class Solution531 {
    public int findLonelyPixel(char[][] picture) {
        int m = picture.length;
        if (m == 0) return 0;
        int n = picture[0].length;
        boolean[] row = new boolean[m];
        for (int i = 0; i < m; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (picture[i][j] == 'B') {
                    count++;
                }
            }
            row[i] = (count == 1 ? true : false);
        }
        boolean[] column = new boolean[n];
        for (int j = 0; j< n; j++) {
            int count = 0;
            for (int i = 0; i < m; i++) {
                if (picture[i][j] == 'B') {
                    count++;
                }
            }
            column[j] = (count == 1 ? true : false);
        }

        int res = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (row[i] && column[j] && picture[i][j] == 'B') {
                    res++;
                }
            }
        }
        return res;
    }
}

class Solution532 {
    public int findPairs(int[] nums, int k) {
        if (k < 0) return 0;
        if (k == 0) return checkzero(nums);
        Set<Integer> set = new HashSet<>();
        int res = 0;
        for (int i = 0; i< nums.length; i++) {
            if (set.contains(nums[i])) {continue;}

            if (set.contains(nums[i] + k)) {
                res++;
            }
            if (set.contains(nums[i] - k)) {
                res++;
            }

            set.add(nums[i]);
        }
        return res;
    }

    private int checkzero(int[] nums) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> visited = new HashSet<>();
        int res= 0;
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                if (visited.contains(nums[i])) {
                    continue;
                } else {
                    res++;
                    visited.add(nums[i]);
                }
            } else {
                set.add(nums[i]);
            }
        }
        return res;
    }
}

// 11/4/17

class Solution536 {
    String mStr;
    public TreeNode str2tree(String s) {
        mStr = s;
        return dfs();
    }

    private TreeNode dfs() {
        if (mStr.length() == 0) return null;
        if (mStr.startsWith(")")) {
            return null;
        }
        int start = 0;
        if (mStr.startsWith("(")) {
            start = 1;
        }
        int i = start;
        while(i < mStr.length() && !(mStr.charAt(i) == '(' || mStr.charAt(i) == ')')) {
            i++;
        }
        int val = Integer.parseInt(mStr.substring(start, i));
        TreeNode root = new TreeNode(val);
        mStr = mStr.substring(i);
        if (mStr.length() != 0 && mStr.charAt(0) == ')') {
            mStr = mStr.substring(1);
            return root;
        }
        root.left = dfs();
        root.right = dfs();
        if (mStr.length() != 0 && mStr.charAt(0) == ')') {
            mStr = mStr.substring(1);
        }
        return root;
    }
}

class Codec535 {
    Map<String, Integer> map = new HashMap<>();
    Map<Integer, String> reverseMap = new HashMap<>();
    int startIndex = 0;
    String prefix = "http://tinyurl.com/";

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        if (!map.containsKey(longUrl)) {
            reverseMap.put(startIndex, longUrl);
            map.put(longUrl, startIndex++);
        }
        return prefix + String.valueOf(map.get(longUrl));
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        String val = shortUrl.substring(prefix.length());
        int id = Integer.parseInt(val);
        return reverseMap.get(id);
    }
}

class Solution538 {
    public TreeNode convertBST(TreeNode root) {
//        if (root == null) return root;
//        return convertBST(root, 0);
        dfs(root);
        return root;
    }

    public TreeNode convertBST(TreeNode root, int rightParentVal) {
        if (root.right == null && root.left == null) {
            root.val += rightParentVal;
            return root;
        }
        if (root.right != null) {
            root.right = convertBST(root.right, rightParentVal);
            root.val += root.right.val;
        } else {
            root.val+= rightParentVal;
        }
        if (root.left != null) {
            root.left = convertBST(root.left, root.val);
        }
        return root;
    }
    int sum = 0;
    private void dfs(TreeNode root) {
        if (root == null) return;
        dfs(root.right);
        sum += root.val;
        root.val = sum;
        dfs(root.left);

    }
}

class Solution539 {
    public int findMinDifference(List<String> timePoints) {
        int m = timePoints.size();
        int[] times = new int[m];
        for (int i = 0; i< m;i++) {
            times[i] = convert(timePoints.get(i));
        }
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < m; i++) {
            for(int j = i+1; j < m; j++) {
                res = Math.min(res, compare(times[i], times[j]));
            }
        }
        return res;
    }

    private int compare(int a, int b){
        if (a > b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        int res = b -a;
        res = Math.min(res, a + (24*60) -b);
        return res;
    }

    private int convert(String timePoints) {
        String[] tmp = timePoints.split(":");
        return Integer.parseInt(tmp[0]) * 60 + Integer.parseInt(tmp[1]);
    }
}

class Solution540 {
    public int singleNonDuplicate(int[] nums) {
        int m = nums.length;
        if (m ==0) return 0;
        if (m == 1) return nums[0];
        for(int i = 0; i< nums.length; i++) {
            if (i == 0 && nums[0] != nums[1]) {return nums[0];}
            if (i == nums.length -1 && nums[nums.length-2] != nums[nums.length-1]) {
                return nums[nums.length-1];
            }
            if (i >1 && i < nums.length-1 && nums[i-1] != nums[i] && nums[i]!= nums[i+1]) {return nums[i];}
        }
        return 0;
    }
}

class Solution540I {
    public int singleNonDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (set.contains(i)) {
                set.remove(i);
            } else {
                set.add(i);
            }
        }
        return (int)set.toArray()[0];
    }
}

class Solution541 {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        for (int i = 0; i< arr.length; i = i+2*k) {
            reverse(arr, i, k);
        }
        return new String(arr);
    }

    private void reverse(char[] arr, int startIndex, int k) {
        int l = startIndex;
        int r = Math.min(l+k-1, arr.length-1);
        while(l < r) {
            char tmp = arr[l];
            arr[l] = arr[r];
            arr[r] = tmp;
            l++;
            r--;
        }
    }
}

class Solution542 {
    public int[][] updateMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean[][] track = new boolean[m][n];
        Queue<int[]> q = new LinkedList<>();
        int[] xd = {0,0,-1,1};
        int[] yd = {-1,1,0,0};
        for(int i = 0; i< m; i++) {
            for (int j = 0; j < n; j++) {
                if (track[i][j]) {continue;}
                if (matrix[i][j] == 1) {
                    for (int k = 0; k < 4; k++) {
                        int x = i + xd[k];
                        int y = j + yd[k];
                        if (x <0 || x >=m || y < 0 || y >=n) {continue;}
                        if (matrix[x][y] == 0) {
                            q.add(new int[] {i,j});
                            track[i][j] = true;
                            break;
                        }
                    }
                }
            }
        }

        while(!q.isEmpty()) {
            int[] tmp = q.poll();
            for (int k = 0; k < 4; k++) {
                int x = tmp[0] + xd[k];
                int y = tmp[1] + yd[k];
                if (x <0 || x >=m || y < 0 || y >=n) {continue;}
                if (matrix[x][y] != 0 && !track[x][y]) {
                    q.add(new int[]{x,y});
                    matrix[x][y] = matrix[tmp[0]][tmp[1]] + 1;
                    track[x][y]= true;
                }
            }
        }
        return matrix;
    }
}

class Solution543 {
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        int[] res = dfs(root);
        return Math.max(res[0]-1, res[1]);
    }

    private int[] dfs(TreeNode root) {
        if (root == null) {return new int[]{0, 0};}
        int[] left = dfs(root.left);
        int[] right = dfs(root.right);
        int first = Math.max(left[0], right[0]);
        first = Math.max(left[1]+ right[1]+1, first);
        int second = Math.max(left[1], right[1]) + 1;
        return new int[] {first, second};
    }
}

class Solution544 {
    public String findContestMatch(int n) {
        List<String> list = new ArrayList<>();
        for (int i = 1; i<=n; i++) {
            list.add(String.valueOf(i));
        }

        while(list.size() > 1) {
            List<String> res = new ArrayList<>();
            for (int i = 0; i < list.size() / 2; i++) {
                res.add("(" + list.get(i) + "," + list.get(list.size() - 1 - i) + ")");
            }
            list = res;
        }
        return list.get(0);
    }
}

// 11/5/17

class Solution545 {
    public List<Integer> boundaryOfBinaryTree(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;
        List<TreeNode> left = findLeft(root);
        List<TreeNode> bottom = findBottomI(root);
        List<TreeNode> right = findRight(root);
        if (left.get(left.size()-1) == bottom.get(0)) {
            left.remove(left.size()-1);
        }
        if (bottom.size() > 0 &&
                right.size() > 0 &&
                bottom.get(bottom.size()-1) == right.get(0)) {
            bottom.remove(bottom.size()-1);
        }
        if (right.size() > 0) {
            right.remove(right.size() - 1);
        }
        for(TreeNode t : left) {
            res.add(t.val);
        }
        for (TreeNode t : bottom) {
            res.add(t.val);
        }
        for (TreeNode t : right) {
            res.add(t.val);
        }
        return res;
    }

    private List<TreeNode> findLeft(TreeNode root) {
        List<TreeNode> left = new ArrayList<>();
        while(root != null) {
            left.add(root);
//            if (root.left != null) {
                root = root.left;
//            } else {
//                root = root.right;
//            }
        }
        return left;
    }

    private List<TreeNode> findBottomI(TreeNode root) {
        List<TreeNode> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()) {
            TreeNode tmp = stack.pop();
            if (tmp.left == null && tmp.right == null) {
                res.add(tmp);
                continue;
            }
            if (tmp.right != null) {stack.push(tmp.right);}
            if (tmp.left != null) {stack.push(tmp.left);}
        }
        return res;
    }

    private List<TreeNode> findBottom(TreeNode root) {
        List<TreeNode> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()) {
            TreeNode tmp = q.poll();
            if (tmp.left == null && tmp.right == null) {
                res.add(tmp);
                continue;
            }
            if (tmp.left != null) q.add(tmp.left);
            if (tmp.right != null) q.add(tmp.right);
        }
        return res;
    }

    private List<TreeNode> findRight(TreeNode root) {
//        List<TreeNode> res = new ArrayList<>();
//        dfs(root, res);
        findrightI(root);
        return nodes;
    }

    private void dfs(TreeNode root, List<TreeNode> res) {
        if(root == null || (root.right == null && root.left == null)) return;
        if (root.right != null) {
            dfs(root.right, res);
        } // else {
//            dfs(root.left, res);
//        }
        res.add(root);
    }

    List<TreeNode> nodes = new ArrayList<>(1000);
    public void findrightI(TreeNode root) {
        if(root == null || (root.right == null && root.left == null)) return;
        if(root.right == null) findrightI(root.left);
        else findrightI(root.right);
        nodes.add(root); // add after child visit(reverse)

    }
}

class Solution545I {
    public List<Integer> boundaryOfBinaryTree(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        if (root == null) return res;
        res.add(root.val);
        findLeft(root.left, res);
        findLeaf(root.left, res);
        findLeaf(root.right, res);
        findRight(root.right, res);
        return res;
    }

    private void findLeft(TreeNode root, List<Integer> res) {
        if (root == null || (root.left == null && root.right == null)) {
            return;
        }
        res.add(root.val);
        if (root.left == null) {
            findLeft(root.right, res);
        } else {
            findLeft(root.left, res);
        }
    }

    private void findLeaf(TreeNode root, List<Integer> res) {
        if (root == null) {return;}
        if (root.left == null && root.right == null) { res.add(root.val); return;}
        findLeaf(root.left, res);
        findLeaf(root.right, res);
    }

    private void findRight(TreeNode root, List<Integer> res) {
        if (root == null || root.left == null && root.right == null) {return;}
        if (root.right == null) {
            findRight(root.left, res);
        } else {
            findRight(root.right, res);
        }
        res.add(root.val);
    }
}

class Solution547 {
    public int findCircleNum(int[][] M) {
        int m = M.length;
        int[] circle = new int[m];
        int number = 0;
        for (int i = 0; i< m; i++) {
            if (circle[i] == 0) {
                number++;
                circle[i] = number;
                dfs(i, circle, M, number);
            }
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i< m; i++) {
            set.add(circle[i]);
        }
        return set.size();
    }

    private void dfs(int person, int[] circle, int[][] matrix, int id) {
        for (int j = 0; j < matrix[0].length; j++) {
            if (matrix[person][j] == 1 && circle[j] == 0) {
                circle[j] = id;
                dfs(j, circle, matrix, id);
            }
        }
    }
}

class Solution548 {
    public boolean splitArray(int[] nums) {
        int m = nums.length;
        int[] sum = new int[m];
        sum[0] = nums[0];
        for (int i = 1; i < m; i++) {
            sum[i] = sum[i-1] + nums[i];
        }
        return dfs(sum, new int[]{0,0,0}, 0, 0);
    }

    private boolean dfs(int[] sum, int[] sep, int steps, int s) {
        if (steps == 3) {
            return check(sum, sep, 3);
        }
        for (int i = s+1; i< sum.length; i++) {
            sep[steps] = i;
            if (check(sum, sep, steps)) {
                if (dfs(sum, sep, steps+1, i)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean check(int[] sum, int[] sep, int steps) {
        if (steps < 2) return true;
        int a1 = sum[sep[0]-1];
        int a2 = sum[sep[1]-1] - sum[sep[0]];
        if (steps == 1) { return a1 == a2;}
        int a3 = sum[sep[2]-1] - sum[sep[1]];
        if (steps == 2) { return a1 == a2 && a2 == a3;}
        int a4 = sum[sum.length-1] - sum[sep[2]];
        return a1 == a2 && a2 == a3 && a3 == a4;
    }

    public boolean splitArrayI(int[] nums) {
        if (nums.length < 7)
            return false;
        int[] sum = new int[nums.length];
        sum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum[i] = sum[i - 1] + nums[i];
        }
        for (int j = 3; j < nums.length - 3; j++) {
            HashSet < Integer > set = new HashSet < > ();
            for (int i = 1; i < j - 1; i++) {
                if (sum[i - 1] == sum[j - 1] - sum[i])
                    set.add(sum[i - 1]);
            }
            for (int k = j + 2; k < nums.length - 1; k++) {
                if (sum[nums.length - 1] - sum[k] == sum[k - 1] - sum[j] && set.contains(sum[k - 1] - sum[j]))
                    return true;
            }
        }
        return false;
    }

}

class Solution549 {
    int res = Integer.MIN_VALUE;
    public int longestConsecutive(TreeNode root) {
        if (root == null) return 0;
        pathLength(root);
        return res;
    }

    private int[] pathLength(TreeNode root) {
        if(root == null) return new int[]{0,0};
        int[] l = pathLength(root.left);
        int[] r = pathLength(root.right);

//        if (root.left != null && root.right != null) {
//            if (root.val == root.left.val + 1 && root.val == root.right.val - 1) {
//                res = Math.max(res, l[0] + r[1] + 1);
//            } else if (root.val == root.left.val - 1 && root.val == root.right.val + 1) {
//                res = Math.max(res, l[1] + r[0] + 1);
//            }
//        }

        int incr = 1;
        if (root.left != null && root.val == root.left.val + 1) {
            incr = l[0] + 1;
        }
        if (root.right != null && root.val - root.right.val == 1) {
            incr = Math.max(incr, r[0] + 1);
        }

        int decr = 1;
        if (root.left != null && root.left.val - 1  == root.val) {
            decr = l[1] +1;
        }
        if (root.right != null && root.right.val - 1 == root.val) {
            decr = Math.max(decr,r[1] + 1);
        }

//        res = Math.max(increaseVal, res);
//        res = Math.max(decreaseVal, res);
        res = Math.max(incr+ decr -1, res);
        return new int[] {incr, decr};
    }
}

class Solution551 {
    public boolean checkRecord(String s) {
        int a = 0;
        int lll = 0;
        for (int i = 0; i< s.length(); i++) {
            if (s.charAt(i) == 'A') {
                a++;
            }
            if (i < s.length()-2 &&
                    s.charAt(i) == 'L' &&
                    s.charAt(i+1) == 'L' &&
                    s.charAt(i+2) == 'L') {
                lll++;
            }
            if (a>1 || lll >0) {
                return false;
            }
        }
        return true;
    }
}

class Solution553 {
    public String optimalDivision(int[] nums) {
        if (nums.length == 0) return "";
        if (nums.length == 1) return String.valueOf(nums[0]);
        if (nums.length == 2) return String.valueOf(nums[0]) + "/" + String.valueOf(nums[1]);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i< nums.length; i++) {
            if (i == 1) {sb.append("(");}
            sb.append(String.valueOf(nums[i]));
            sb.append("/");
            if (i == nums.length-1) {
                sb.deleteCharAt(sb.length()-1);
                sb.append(")");
            }
        }
        return sb.toString();
    }
}

// 11/6/17
class Solution554 {
    public int leastBricks(List<List<Integer>> wall) {
        Map<Integer, Integer> map = new HashMap<>();
        int m = wall.size();
        if (m == 0) return 0;
        for(int i = 0; i< wall.size();i++) {
            int edge = 0;
            for(int j = 0; j< wall.get(i).size()-1; j++) {
                edge += wall.get(i).get(j);
                map.put(edge, map.getOrDefault(edge,0) + 1);
            }
        }
        int maxG = 0;
        for (int i : map.keySet()) {
            if (maxG != m) {
                maxG = Math.max(maxG, map.get(i));
            }
        }
        return m-maxG;
    }
}

class Solution557 {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int i = 0, j = 0;
        while(i < arr.length) {
            while(i<arr.length && arr[i] == ' ') {
                i++;
            }
            j = i;
            while(j < arr.length && arr[j] != ' ') {
                j++;
            }
            rev(arr, i, j-1);
            i = j;
        }
        return new String(arr);
    }

    private void rev(char[] arr, int i, int j) {
        while(i<j) {
            char tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
            i++;
            j--;
        }
    }
}

class Solution560 {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int res = 0;
        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            res += map.getOrDefault(sum-k, 0);
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        return res;
    }
}

class Solution562 { // should use dp.
    public int longestLine(int[][] M) {
        int m = M.length;
        if (m == 0) return 0;
        int n = M[0].length;
        int[][][] t = new int[m][n][4];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (M[i][j] == 1 && t[i][j][0] == 0) {
                    process(M, t, i, j);
                }
            }
        }

        int res = 0;
        for(int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (M[i][j] == 0) {continue;}
                for (int k = 0; k < 4; k++) {
                    res = Math.max(res, t[i][j][k]);
                }
            }
        }
        return res;
    }

    private void process(int[][] M, int[][][] track, int i, int j) {
        int m = M.length;
        int n = M[0].length;

        // horizontal
        int l = j, r = j;
        while(l >=0 && M[i][l] == 1) {
            l--;
        }
        while(r < n && M[i][r] == 1) {
            r++;
        }
        for (int k = l+1; k <r; k++) {
            track[i][k][0] = r - l - 1;
        }

        // vertical
        int t = i, b = i;
        while(t >=0 && M[t][j] == 1) {
            t--;
        }
        while(b < m && M[b][j] == 1) {
            b++;
        }
        for (int k = t+1; k < b; k++) {
            track[k][j][1] = b-t-1;
        }

        // diagonal
        l =0;
        r = 0;
        while(i-l >= 0 && j-l >= 0 && M[i-l][j-l] == 1) {
            l++;
        }
        while(i+r < m && j+r <n && M[i+r][j+r] == 1) {
            r++;
        }
        for (int k = -l +1; k <r; k++) {
            track[i+k][j+k][2] = r+l-1;
        }

        // anti-diagonal
        l = 0;
        r = 0;
        while(i+l < m && j-l >=0 && M[i+l][j-l] == 1) {
            l++;
        }
        while(i-r >=0 && j+r <n && M[i-r][j+r] == 1) {
            r++;
        }
        for(int k = l -1; l >=0; l --) {
            track[i+k][j-k][3] = r+l -1;
        }
        for(int k = 0; k < r; k++) {
            track[i-k][j+k][3] = r+l-1;
        }
    }
}

class Solution563 {
    int res = 0;
    public int findTilt(TreeNode root) {
        tilt(root);
        return res;
    }

    private int tilt(TreeNode root) {
        if (root == null) {return 0;}
        int leftSum = tilt(root.left);
        int rightSum = tilt(root.right);
        res += Math.abs(leftSum - rightSum);
        return root.val+leftSum+rightSum;
    }
}

class Solution566 {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int m = nums.length;
        int n = nums[0].length;
        if (m*n != r*c) {return nums;}

        int[][] res = new int[r][c];
        int index = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int k = index % r;
                int l = index / r;
                res[l][k] = nums[i][j];
                index++;
            }
        }
        return res;
    }
}

class Solution567 {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length())  return false;

        int[] s1arr = new int[26];
        int[] s2arr = new int[26];
        for (int i = 0; i< s1.length(); i++) {
            s1arr[s1.charAt(i)-'a']++;
            s2arr[s2.charAt(i)-'a']++;
        }

        int l = 0, r = s1.length() -1;
        while(true) {
            if(check(s1arr, s2arr)) {
                return true;
            }
            l++;
            r++;
            if (r < s2.length()) {
                s2arr[s2.charAt(l-1)-'a']--;
                s2arr[s2.charAt(r)-'a']++;
            } else {
                break;
            }
        }
        return false;
    }

    private boolean check(int[] arr1, int[] arr2) {
        boolean match = true;
        for (int i = 0; i < 26; i++) {
            if (arr1[i] != arr2[i]) {
                match = false;
                break;
            }
        }
        return match;
    }
}

class Solution573 {
    public int minDistance(int height, int width, int[] tree, int[] squirrel, int[][] nuts) {
        int sum = 0, maxDiff = Integer.MIN_VALUE;
        for (int[] nut : nuts) {
            int dist = Math.abs(tree[0] - nut[0]) + Math.abs(tree[1] - nut[1]);
            sum += 2*dist;
            maxDiff = Math.max(maxDiff, dist - Math.abs(squirrel[0] - nut[0]) - Math.abs(squirrel[1] - nut[1]));
        }
        return sum - maxDiff;
    }
}

class Solution575 {
    public int distributeCandies(int[] candies) {
        Set<Integer> set = new HashSet<>();
        for (int i : candies) {set.add(i);};
        return set.size() > candies.length /2 ? candies.length /2 : set.size();

    }
}

class Solution576 {
    int res = 0;
    public int findPaths(int m, int n, int N, int i, int j) {
        if (m ==0  || n == 0 || N ==0) return 0;
        boolean[][] track = new boolean[m][n];
        dfs(m, n, track, i,j, N);
        return res;
    }

    private void dfs(int m, int n, boolean[][] track, int i, int j, int N) {
        if (N == 0) return;
        int[] xd = new int[]{0,0,-1,1};
        int[] yd = new int[]{-1,1,0,0};
        for (int a = 0; a< 4; a++) {
            int l = i + xd[a];
            int k = j + yd[a];
            if (l < 0 || l >= m || k < 0 || k >= n) {
                res = (res+1) % ((int)Math.pow(10, 9) + 7);
                continue;
            }
            dfs(m,n, track, l, k, N-1);
        }

    }
}

// 11/7/17
class Solution581 {
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int l = n-1;
        int r = 0;
        for (int i = 0; i< n-1; i++) {
            if (nums[i] > nums[i+1]) {
                l = i;
                break;
            }
        }
        for (int i = n-1; i >= 1; i--) {
            if (nums[i-1] > nums[i]) {
                r = i;
                break;
            }
        }
        if (r <= l)  return 0;
        for(int k = l; k <= r; k++) {
            max = Math.max(max, nums[k]);
            min = Math.min(min, nums[k]);
        }
        while(l >= 0 && nums[l] > min) {l--;}
        while(r < n && nums[r] < max) {r++;}
        return r-l-1;
    }
}

class Solution582 {
    public List<Integer> killProcess(List<Integer> pid, List<Integer> ppid, int kill) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i = 0; i< ppid.size(); i++) {
            List<Integer> list = map.getOrDefault(ppid.get(i), new ArrayList<>());
            list.add(pid.get(i));
            map.put(ppid.get(i), list);
        }

        Queue<Integer> q = new LinkedList<>();
        List<Integer> res = new ArrayList<>();
        q.add(kill);
        while(!q.isEmpty()){
            Integer tmp = q.poll();
            res.add(tmp);
            if (map.containsKey(tmp)) {
                List<Integer> l = map.get(tmp);
                for(Integer i : l) {
                    q.add(i);
                }
            }
        }
        return res;
    }
}

class Solution583 {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        if (m == 0) return n;
        if (n == 0) return m;
        if (m == 0 || n == 0) return 0;
        int[][] dp = new int[m+1][n+1];
        dp[0][0] = 0;
        for(int i = 1; i<=m; i++) {
            dp[i][0] = i;
        }
        for (int j = 1; j <= n; j++) {
            dp[0][j] = j;
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <=n; j++) {
                if (word1.charAt(i-1) == word2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1];
                } else {
                    dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1])+1;
                }
            }
        }
        return dp[m][n];
    }
}

class Solution593 {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        Set<Long> set = new HashSet<>();
        set.add(dist(p1,p2));
        set.add(dist(p1,p3));
        set.add(dist(p1,p4));
        set.add(dist(p2,p3));
        set.add(dist(p2,p4));
        set.add(dist(p3,p4));

        if (set.size() != 2) return false;
        Object[] l = set.toArray();
        if ((long)l[0] != (long)l[1]/2 && (long)l[1] != (long)l[0]/2) { return false;}
        return true;
    }

    private long dist(int[] p1, int[] p2) {
        return (p1[0] - p2[0]) * (p1[0] - p2[0]) + (p1[1] - p2[1]) * (p1[1] - p2[1]);
    }
}

class Solution594 {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int res = 0;
        for (int i : map.keySet()) {
            if (map.containsKey(i+1)) {
                res = Math.max(res, map.get(i) + map.get(i+1));
            }
            if (map.containsKey(i-1)) {
                res = Math.max(res, map.get(i) + map.get(i-1));
            }
        }
        return res;
    }
}

class Solution598 {
    public int maxCount(int m, int n, int[][] ops) {
        int x = ops.length;
        if (x ==0) return m*n;

        int i = Integer.MAX_VALUE;
        int j = Integer.MAX_VALUE;
        for (int l = 0; l < x; l++) {
            i = Math.min(ops[l][0], i);
            j = Math.min(ops[l][1], j);
        }
        return i*j;
    }
}

class Solution599 {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }
        int sum = Integer.MAX_VALUE;
        List<String> res = new ArrayList<>();
        for (int i = 0; i< list2.length; i++) {
            int index = map.getOrDefault(list2[i], list1.length);
            if (index + i < sum) {
                sum = index + i;
                res.clear();
                res.add(list2[i]);
            } else if (index + i == sum) {
                res.add(list2[i]);
            }
        }
        return res.toArray(new String[0]);
    }
}

// 11/8/17

class StringIterator604 {
    class Pair {
        char mChar;
        int mCount;
        public Pair(char a, int c) {mChar = a; mCount = c;}
    }
    List<Pair> list;
    int index;
    int offset;

    public StringIterator604(String compressedString) {
        index = 0;
        offset = 0;
        list = new ArrayList<>();
        if (compressedString.length() == 0) return;
        int i = 0;
        while( i < compressedString.length()) {
            char c = compressedString.charAt(i++);
            int count = 0;
            while(i < compressedString.length() &&
                    Character.isDigit(compressedString.charAt(i))) {
                count = 10 * count + (compressedString.charAt(i) - '0');
                i++;
            }
            list.add(new Pair(c, count));
        }
    }

    public char next() {
        if (hasNext()) {
            char res = list.get(index).mChar;
            offset++;
            return res;
        }
        return ' ';
    }

    public boolean hasNext() {
        if (index >= list.size()) { return false;}
        if (offset >= list.get(index).mCount) {
            index ++;
            offset = 0;
        }
        return index < list.size();
    }
}

class Solution605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length;i++) {
            if (n == 0) return true;
            if ((i == 0 || flowerbed[i-1] == 0) &&
                    (i == flowerbed.length-1 || flowerbed[i+1] == 0) &&
                    flowerbed[i] == 0) {
                flowerbed[i] =1;
                n--;
            }

        }
        return false;
    }
}

class Solution606 {
    public String tree2str(TreeNode t) {
        StringBuilder sb = str(t);
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.charAt(sb.length()-1));
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }

    public StringBuilder str(TreeNode t) {
        if (t == null) return new StringBuilder();
        StringBuilder sb = new StringBuilder();
        if (t.right != null) {
            sb.append(str(t.right));
        }
        if (t.left != null) {
            sb.insert(0, str(t.left));
        } else {
            if (sb.length() > 0) {
                sb.insert(0, "()");
            }
        }
        sb.insert(0, String.valueOf(t.val));
        sb.insert(0, "(");
        sb.append(")");
        return sb;
    }
}

class Solution607 {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        for (int i = nums.length-1; i >=2; i--) {
            int l = 0;
            int r = i-1;
            while(l < r) {
                if (nums[l] + nums[r] > nums[i]) {
                    res += r-l;
                    r--;
                }
                else {l++;}
            }
        }
        return res;
    }
}

// 11/9/17

class Solution616 {
    public String addBoldTag(String s, String[] dict) {
        int m = s.length();
        boolean[] t = new boolean[m];
        for (int i = 0; i< s.length(); i++) {
            for (String d : dict) {
                if (s.startsWith(d, i)) {
                    for (int k = i; k < i+d.length(); k++) {
                        t[k] = true;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i< s.length(); i++) {
            if (t[i] == true && (i == 0 || t[i-1] == false)) {
                sb.append("<b>");
            }
            if (t[i] == false && i > 0 && t[i-1] == true) {
                sb.append("</b>");
            }
            sb.append(s.charAt(i));
        }
        if (t[m-1] == true) {
            sb.append("</b>");
        }
        return sb.toString();
    }
}

class Solution617 {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) return null;
        if (t1 == null) {return t2;}
        else if (t2 == null) { return t1;}
        else {
            TreeNode left = mergeTrees(t1.left, t2.left);
            TreeNode right = mergeTrees(t1.right, t2.right);
            TreeNode root = new TreeNode(t1.val + t2.val);
            root.left = left;
            root.right = right;
            return root;
        }
    }
}

// 11/10/17
class Solution621 {
    public int leastInterval(char[] tasks, int n) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : tasks) {
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        PriorityQueue<Map.Entry<Character, Integer>> q = new PriorityQueue<>(
                (a, b) -> a.getValue() == b.getValue() ?
                        a.getKey() - b.getValue() :
                        b.getValue() - a.getValue());
        q.addAll(map.entrySet());
        int count = 0;
        while(!q.isEmpty()) {
            List<Map.Entry<Character, Integer>> list = new ArrayList<>();
            int k = n + 1;
            while (k>0 && !q.isEmpty()) {
                Map.Entry<Character, Integer> entry = q.poll();
                entry.setValue(entry.getValue()-1);
                if (entry.getValue() >0 ) {
                    list.add(entry);
                }
                count++;
                k--;
            }
            q.addAll(list);
            if (q.isEmpty()) break;
            count += k;
        }
        return count;
    }
}

// 11/11/17

class Solution623 {
    public TreeNode addOneRow(TreeNode root, int v, int d) {
        if (d == 1) {
            TreeNode tmp = new TreeNode(v);
            tmp.left = root;
            return tmp;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        d--;
        while(!q.isEmpty()) {
            TreeNode tmp = q.poll();
            if (tmp == null) {
                if (!q.isEmpty()) {
                    q.add(null);
                    d--;
                }
                continue;
            }
            if (d == 1) {
                TreeNode left = new TreeNode(v);
                TreeNode right = new TreeNode(v);
                left.left = tmp.left;
                tmp.left = left;
                right.right = tmp.right;
                tmp.right = right;
                continue;
            }
            if (tmp.left != null) q.add(tmp.left);
            if (tmp.right != null) q.add(tmp.right);
        }
        return root;
    }
}

// 11/13/17
class Solution624 {
    public int maxDistance(List<List<Integer>> arrays) {
        PriorityQueue<int[]> smallest = new PriorityQueue<>(
                (a,b) -> a[0]-b[0]
        );
        PriorityQueue<int[]> largest = new PriorityQueue<>(
                (a,b) -> b[0]-a[0]
        );
        for (int i = 0; i < arrays.size(); i++) {
            List<Integer> cur = arrays.get(i);
            smallest.add(new int[]{cur.get(0), i});
            largest.add(new int[]{cur.get(cur.size()-1), i});
        }
        int[] first = smallest.poll();
        int[] second = smallest.poll();
        int[] last = largest.poll();
        int[] secondLast = largest.poll();

        if (first[1] != last[1]) {return last[0]-first[0];}
        else {
            return Math.max(last[0] - second[0], secondLast[0] - first[0]);
        }
    }
}

class Solution625 {
    public int smallestFactorization(int a) {
        int[] t = new int[10];
        if (a < 10) return a;

        for (int i = 9; i > 1; i--) {
            if (a == 1) break;
            while (a % i == 0 && a != 1) {
                t[i]++;
                a = a/i;
            }
        }

        if (a != 1) {return 0;}
        long res = 0;
        for (int i = 1; i < 10; i++) {
            while(t[i] != 0) {
                res = res * 10 + i;
                t[i]--;
            }
        }
        if (res > Integer.MAX_VALUE) return 0;
        return (int)res;
    }
}

class Solution626 {
    public int maximumProduct(int[] nums) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE, min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int n : nums) {
            if (n > max1) {
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else if (n > max2) {
                max3 = max2;
                max2 = n;
            } else if (n > max3) {
                max3 = n;
            }

            if (n < min1) {
                min2 = min1;
                min1 = n;
            } else if (n < min2) {
                min2 = n;
            }
        }
        return Math.max(max1*max2*max3, max1*min1*min2);
    }
}

class Solution630 {
    public int scheduleCourse(int[][] courses) {
        Arrays.sort(courses, (a,b) -> a[1]-b[1]);
        PriorityQueue<Integer> q = new PriorityQueue<>(
                (a,b) -> b-a
        );
        int totalTime = 0;
        for(int[] c : courses) {
            totalTime += c[0];
            q.add(c[0]);
            if (totalTime > c[1]) { totalTime -= q.poll();}
        }
        return q.size();
    }
}

class Solution632 {
    public int[] smallestRange(List<List<Integer>> nums) {
        PriorityQueue<int[]> s = new PriorityQueue<>(
                (a,b) -> a[0]-b[0]
        );
        PriorityQueue<int[]> l = new PriorityQueue<>(
                (a,b) -> b[0]-a[0]
        );
        for(int i = 0; i < nums.size(); i++) {
            int[] tmp = new int[]{nums.get(i).get(0), i, 0};
            s.add(tmp);
            l.add(tmp);
        }
        int[] res = null;
        int range = Integer.MAX_VALUE;
        while(true) {
            int[] top = l.peek();
            int[] bot = s.peek();
            if (top[0] - bot[0] < range) {
                range = top[0] - bot[0];
                res = new int[]{bot[0], top[0]};
            }

            s.poll();
            l.remove(bot);

            int index = ++bot[2];
            if (index >= nums.get(bot[1]).size()) {
                break;
            }
            int[] tmp = new int[]{nums.get(bot[1]).get(index), bot[1], index};
            s.add(tmp);
            l.add(tmp);
        }
        return res;
    }
}

class Solution633 {
    public boolean judgeSquareSum(int c) {
        for (int i = 1; i <= c/2; i++) {
            int j = c -i;
            if ((int)Math.sqrt(i) * (int)Math.sqrt(i) == i &&
                    (int)Math.sqrt(j) * (int)Math.sqrt(j) == j) {
                return true;
            }
        }
        return false;
    }
}

// 11/14/17
class Solution634  {
    int res = 0;
    int mod = 1000000007;
    private static final int M = 1000000007;
    public int findDerangement(int n) {
//        boolean[] selected = new boolean[n];
//        dfs(selected, 0, n-1);
//        return res;
        long ans = 1;
        for (int i = 1; i <= n; i++)
            ans = (i * ans % M + (i % 2 == 0 ? 1 : -1)) % M;
        return (int) ans;
    }

    private void dfs(boolean[] selected, int index, int n) {
        if (index == n) {
            res ++;
            res = res % mod;
        }
        for (int i = 0; i< n; i++) {
            if (selected[i]) {continue;}
            if (i == index) {continue;}
            selected[i] = true;
            dfs(selected, index+1, n);
            selected[i] = false;
        }
    }
}

class LogSystem635 {
    Map<int[], Integer> map;
    Map<String, Integer> granularity;
    public LogSystem635() {
        map = new HashMap<>();
        granularity = new HashMap<>();
        granularity.put("Year", 0);
        granularity.put("Month", 1);
        granularity.put("Day", 2);
        granularity.put("Hour", 3);
        granularity.put("Minute", 4);
        granularity.put("Second", 5);

    }

    public void put(int id, String timestamp) {
        String[] tmp = timestamp.split(":");
        int[] res = new int[tmp.length];
        for (int i= 0; i< res.length; i++) {
            res[i] = Integer.parseInt(tmp[i]);
        }
        map.put(res, id);
    }

    public List<Integer> retrieve(String s, String e, String gra) {
        String[] startStr = s.split(":");
        String[] endStr = e.split(":");
        int[] start = new int[startStr.length];
        int[] end = new int[endStr.length];
        for (int i = 0; i <= granularity.get(gra); i++) {
            start[i] = Integer.parseInt(startStr[i]);
            end[i] = Integer.parseInt(endStr[i]);
        }
        List<Integer> res = new ArrayList<>();
        for(int[] tmp : map.keySet()) {
            if (large(tmp, start, granularity.get(gra)) && large(end, tmp, granularity.get(gra))) {
                res.add(map.get(tmp));
            }
        }
        return res;
    }

    private boolean large(int[] a, int[] b, int index) {
        for (int i = 0; i<= index; i++) {
            if (a[i] > b[i]) {return true;}
            if (a[i] < b[i]) {return false;}
        }
        return true;
    }
}

class Solution636 {
    public int[] exclusiveTime(int n, List<String> logs) {
        int[] res = new int[n];
        Stack<Integer> s = new Stack<>();
        int previousTime = 0;
        for (String str: logs) {
            String[] tmp = str.split(":");
            int id = Integer.parseInt(tmp[0]);
            int time = Integer.parseInt(tmp[2]);
            if (!s.isEmpty()) {
                res[s.peek()] += time-previousTime;
            }
            previousTime = time;
            if (str.contains("start")) {s.push(id);}
            else {
                res[s.pop()]++;
                previousTime++;
            }

        }
        return res;
    }
}

class Solution637 {
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<Double> res = new ArrayList<>();
        if (root == null) return res;
        q.add(root);
        q.add(null);
        long total = 0;
        int count = 0;
        while(!q.isEmpty()) {
            TreeNode tmp = q.poll();
            if (tmp == null) {
                if (!q.isEmpty()) {
                    q.add(null);
                }
                res.add((double)total/(double)count);
                total = 0;
                count = 0;
                continue;
            }
            total += tmp.val;
            count++;
            if (tmp.left != null) {q.add(tmp.left);}
            if (tmp.right != null) {q.add(tmp.right);}
        }
        return res;
    }
}

// 11/15/17
class Solution638 {
    int res = Integer.MAX_VALUE;
    public int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
        for(int i = 0; i < price.size(); i++) {
            List<Integer> tmp = new ArrayList<>();
            for(int j = 0; j < needs.size();j ++) {
                if (j == i) { tmp.add(1);}
                else {tmp.add(0);}
            }
            tmp.add(price.get(i));
            special.add(tmp);
        }
        List<Integer> has = new ArrayList<>();
        for(int i = 0; i < needs.size(); i++) {
            has.add(0);
        }
        dfs(special, has, 0, needs);
        return res;
    }

    private void dfs(List<List<Integer>> special, List<Integer> has, Integer cost, List<Integer> needs) {
        for(int i = 0; i< has.size(); i++) {
            if (has.get(i) > needs.get(i)) {
                return;
            }
        }
        boolean found = true;
        for (int i = 0; i< has.size(); i++) {
            if (has.get(i) < needs.get(i)) {
                found = false;
                break;
            }
        }
        if (found) {
            res = Math.min(res, cost);
            return;
        }
        for (int i = 0; i < special.size(); i++) {
            for (int j = 0; j < has.size(); j++) {
                has.set(j, has.get(j) + special.get(i).get(j));
            }
            dfs(special, has, cost + special.get(i).get(special.get(i).size()-1), needs);
            for (int j = 0; j < has.size(); j++) {
                has.set(j, has.get(j) - special.get(i).get(j));
            }
        }
    }
}

// 11/17/17
class Solution639 {
    public int numDecodings(String s) {
        long mod = 1000000000+7;
        long e0 = 1, e1 = 0, e2 = 0;
        long f0= 0, f1= 0, f2= 0;
        char[] arr = s.toCharArray();
        for (char c : arr) {
            if (c == '*') {
                f0 = 9*e0 + 9*e1 + 6*e2;
                f1 = e0;
                f2 = e0;
            } else {
                f0 = (c > '0' ? e0 : 0) + e1 + (c <= '6'? e2 : 0);
                f1 = (c == '1' ? e0 : 0);
                f2 = (c == '2' ? e0 : 0);
            }
            e0 = f0%mod;
            e1 = f1;
            e2 = f2;
        }
        return (int)e0;
    }
}

// 11/18/17

class Solution640 {
    public String solveEquation(String equation) {
        int coef = 0;
        int value = 0;
        int side = 1;
        int sign = 1;
        int i = 0;
        while(i < equation.length()) {
            char c = equation.charAt(i);
            if (c == '=') {
                side = -1;
                sign = 1;
            } else if ( c == '+') {
                sign = 1;
            } else if (c == '-') {
                sign = -1;
            } else if (c == 'x') {
                coef += side*sign;
                sign = 1;
            } else if (Character.isDigit(c)) {
                int tmp = 0;
                int j = i;
                while (j < equation.length() && Character.isDigit(equation.charAt(j))) {
                    tmp = tmp * 10 + (equation.charAt(j) - '0');
                    j++;
                }
                if (j >= equation.length()) {
                    value += sign * side * tmp;
                } else if (equation.charAt(j) == 'x') {
                    coef += sign * side * tmp;
                    j++;
                } else {
                    value += sign * side * tmp;
                }
                i = j;
                sign = 1;
                continue;
            }
            i++;
        }
        if (coef == 0 && value != 0) {
            return "No solution";
        }
        if (coef == 0 && value == 0) {
            return "Infinite solutions";
        }
        return "x="+String.valueOf(-value/coef);
    }
}


class AutocompleteSystem { //642
    class Record{
        public String sentence;
        public int count;
        public Record(String s, int c) {
            sentence = s;
            count = c;
        }
    }

    class AutocomleteTreeNode{
        List<Record> list;
        AutocomleteTreeNode[] children;
        public AutocomleteTreeNode() {
            list = new ArrayList<>();
            children = new AutocomleteTreeNode[26];
        }
    }

    public AutocompleteSystem(String[] sentences, int[] times) {

    }

    public List<String> input(char c) {
        return null;
    }
}

class Solution643 {
    public double findMaxAverage(int[] nums, int k) {
        int res= 0;
        int sum=0;
        int i = 0;
        int j = 0;
        while(j < k) {
            sum += nums[j];
            j++;
        }
        res = sum;
        while(j < nums.length) {

            sum -= nums[i++];
            sum += nums[j++];
            res = Math.max(res, sum);
        }
        return (double)res/(double)k;
    }
}

class Solution645 {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        boolean[] t = new boolean[n];
        int dup = -1;
        int mis = -1;
        for (int i = 0; i< n; i++) {
            if (t[nums[i] - 1]) {
                dup = nums[i];
            }
            t[nums[i]-1] = true;
        }
        for (int i = 0; i < n; i++) {
            if (!t[i]) {
                mis = i+1;
            }
        }
        return new int[]{dup, mis};
    }
}

class Solution646 {
    public int findLongestChain(int[][] pairs) {
        int n = pairs.length;
        Arrays.sort(pairs, (a,b) -> a[0] - b[0]);
        int[] dp = new int[n];
        dp[0] = 1;
        for (int i = 1; i < n; i++) {
            int longest = 0;
            for (int j = i -1; j >=0; j--) {
                if (pairs[i][0] > pairs[j][1]) {
                    longest = Math.max(longest, dp[j]);
                }
            }
            dp[i] = longest+1;
        }
        return dp[n-1];
    }
}

class Solution649 {
    public int countSubstrings(String s) {
        int res = 0;
        for (int i = 0; i< s.length(); i++) {
            res += count(s, i);
            res += count2(s, i);
        }
        return res;
    }

    private int count(String s, int i) {
        int res = 0;
        int l = 0;
        while(i-l >=0 && i+l < s.length()) {
            if (s.charAt(i-l) == s.charAt(i+l)) {
                res++;
                l++;
            } else {
                break;
            }
        }
        return res;
    }

    private int count2(String s, int i) {
        int res = 0;
        int l = i;
        int r = i+1;
        while(l >= 0 && r < s.length()) {
            if (s.charAt(l) == s.charAt(r)) {
                res++;
                l--;
                r++;
            } else {
                break;
            }
        }
        return res;
    }
}

class Solution648 {
    public String replaceWords(List<String> dict, String sentence) {
        String[] sen = sentence.split(" ");
        Collections.sort(dict, (a, b) -> a.length() - b.length());
        for (int i = 0; i< sen.length; i++) {
            for (String sr : dict) {
                if (sen[i].startsWith(sr)) {
                    sen[i] = sr;
                    break;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String str : sen) {
            sb.append(str);
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}

class Solution650 {
    public int minSteps(int n) {
        if (n == 1) return 0;
        if (n <= 4) return n;
        for (int i = 2; i<= n/2; i++) {
            if (n % i == 0) {
                return i + minSteps(n/i);
            }
        }
        return -1;
    }
}


// 11/20/17
class Solution652 {
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> res = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        postOrder(root, res, map);
        return res;
    }

    private String postOrder(TreeNode root, List<TreeNode> res, Map<String, Integer> map) {
        if (root == null) {return "#";}
        String tmp = String.valueOf(root.val) +
                "," +
                postOrder(root.left, res, map) +
                "," +
                postOrder(root.right, res, map);

        if (map.getOrDefault(tmp, 0 ) == 1) {
            res.add(root);
        }
        map.put(tmp, map.getOrDefault(tmp, 0) + 1);
        return tmp;
    }
}

class Solution653 {
    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> set = new HashSet<>();
        if (dfs(root, set, k))
        {
            return true;
        }
        return false;
    }

    private boolean dfs(TreeNode root, Set<Integer> set, int k) {
        if (root == null) return false;
        if (dfs(root.left, set, k)) {
            return true;
        }
        if (set.contains(k- root.val)) { return true;}
        set.add(root.val);
        if (dfs(root.right, set, k)) {
            return true;
        }
        return false;
    }
}

class Solution654 {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return recur(nums, 0, nums.length-1);
    }

    private TreeNode recur(int[]nums, int l, int r) {
        if (l > r) {
            return null;
        }
        int maxIndex = l;
        for (int i = l+1; i <= r; i++) {
            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }
        TreeNode root = new TreeNode(nums[maxIndex]);
        root.left = recur(nums, l , maxIndex-1);
        root.right = recur(nums, maxIndex+1, r);
        return root;
    }
}

// 11/21/17
class Solution655 {
    public List<List<String>> printTree(TreeNode root) {
        int height = height(root);
        int width = getWidth(root);
        List<List<String>> result = new ArrayList<>();
        for (int i = 0; i < height; i++) {
            List<String> list = new ArrayList<>();
            for (int j = 0; j < width; j++) {
                list.add("");
            }
            result.add(list);
        }
        print(result, root, 0, 0, width-1);
        return result;
    }

    private int height(TreeNode root) {
        if (root == null) {return 0;}
        int left = height(root.left);
        int right = height(root.right);
        return Math.max(left, right) + 1;
    }

    private int getWidth(TreeNode root) {
        if (root == null) {return 0;}
        int left = getWidth(root.left);
        int right = getWidth(root.right);
        return Math.max(left, right) * 2 + 1;
    }

    private void print(List<List<String>> res, TreeNode root, int row, int left, int right) {
        if (root == null) return ;
        int mid = left + (right-left)/2;
        res.get(row).set(mid, String.valueOf(root.val));
        print(res, root.left, row+1, left, mid-1);
        print(res, root.right, row+1, mid+1, right);
    }
}


class Solution656 {
    class Pair{
        List<Integer> list;
        int cost;
        public Pair(List<Integer> l , int c) {list = l; cost = c;}
    }

    public List<Integer> cheapestJump(int[] A, int B) {
        int n = A.length;
        if (n == 0) {
            return new ArrayList<>();
        }
        Pair[] dp = new Pair[n];
        List<Integer> l = new ArrayList<>();
        l.add(0);
        Pair p = new Pair(l, A[0]);
        dp[0] = p;
        for (int i = 1; i < n; i++){
            int cost = Integer.MAX_VALUE;
            if (A[i] < 0) {
                dp[i] = new Pair(null, cost);
                continue;
            }
            int index = -1;
            for (int j = 1; j <=B; j++) {
                if (i-j <0 ) break;
                if (dp[i-j].cost < cost) {
                    index = i-j;
                    cost = dp[i-j].cost;
                }
            }
            if (index < 0) {
                return new ArrayList<Integer>();
            }
            List<Integer> tmp = new ArrayList<>(dp[index].list);
            tmp.add(i);
            dp[i] = new Pair(tmp, cost+ A[i]);
        }
        List<Integer> res = new ArrayList<>();
        if (dp[n-1].list == null) {return res;}
        for(int i : dp[n-1].list) {
            res.add(i+1);
        }
        return res;
    }
}

class Solution657 {
    public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        for (int i = 0; i< moves.length(); i++) {
            char c = moves.charAt(i);
            switch (c) {
                case 'U':
                    x++;
                    break;
                case 'D':
                    x--;
                    break;
                case 'L':
                    y--;
                    break;
                case 'R':
                    y++;
                    break;
            }
        }
        return x == 0 && y == 0;
    }
}

class Solution658 {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> res = new ArrayList<>();
        if (arr.length < k) {return res;}
        PriorityQueue<Integer> q = new PriorityQueue<>(
                (b,a) -> Math.abs(arr[a] - x) - Math.abs(arr[b] -x)
        );
        for (int i = 0; i< k; i++){
            q.add(i);
        }
        for (int i = k; i< arr.length;i++){
            if (Math.abs(arr[i] - x) < Math.abs(arr[q.peek()] -x)) {
                q.poll();
                q.add(i);
            }
        }
        while(!q.isEmpty()) {
            res.add(arr[q.poll()]);
        }
        res.sort((a,b) -> a-b);
        return res;
    }
}

// 11/22/17
class Solution659 {
    public boolean isPossible(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> appendMap = new HashMap<>();
        for (int i: nums) {
            map.put(i, map.getOrDefault(i, 0) +1);
        }
        for (int i : nums) {
            if (map.getOrDefault(i, 0) == 0) { continue;}
            else if (appendMap.getOrDefault(i, 0) > 0) {
                appendMap.put(i, appendMap.get(i) - 1);
                appendMap.put(i+1, appendMap.getOrDefault(i+1, 0) + 1);
            } else if (map.getOrDefault(i+1, 0) > 0 && map.getOrDefault(i+2,0) > 0) {
                map.put(i+1, map.get(i+1)-1);
                map.put(i+2, map.get(i+2)-1);
                appendMap.put(i+3, appendMap.getOrDefault(i+3, 0) + 1);
            } else {
                return false;
            }
            map.put(i, map.getOrDefault(i,0)-1);
        }
        return true;
    }
}

class Solution660 {
    public int newInteger(int n) {
        int res = 0;
        int base = 1;
        while(n >0) {
            res += (n % 9) * base;
            n /= 9;
            base *= 10;
        }
        return res;
    }
}

class Solution662 {
    class Pair{
        TreeNode node;
        int x;
        public Pair(TreeNode n, int a) {
            node = n;
            x = a;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));
        q.add(null);
        int left = Integer.MIN_VALUE;
        int maxLevelWidth = 0;
        while(!q.isEmpty()) {
            Pair tmp = q.poll();
            if (tmp == null) {
                left = Integer.MIN_VALUE;
                if (!q.isEmpty()) {
                    q.add(null);
                }
                continue;
            } else {
                if (left == Integer.MIN_VALUE) {
                    left = tmp.x;
                } else {
                    maxLevelWidth = Math.max(maxLevelWidth, tmp.x - left + 1);
                }
                if (tmp.node.left != null) {
                    q.add(new Pair(tmp.node.left, 2 * tmp.x));
                }
                if (tmp.node.right != null) {
                    q.add(new Pair(tmp.node.right, 2 * tmp.x + 1));
                }
            }
        }
        return maxLevelWidth;
    }
}

class Solution663 {
    int countOfZero = 0;
    public boolean checkEqualTree(TreeNode root) {
        Set<Integer> set = new HashSet<>();
        int total = dfs(root, set);
        if (total == 0 ) {
            return countOfZero > 1;
        } else if (total % 2 == 0 && set.contains(total/2)) {
            return true;
        }
        return false;
    }

    private int dfs(TreeNode root, Set<Integer> set) {
        if (root == null) {return 0;}
        int left = dfs(root.left, set);
        int right = dfs(root.right, set);
        int total = left+ right + root.val;
        if (total == 0) { countOfZero++;}
        set.add(total);
        return total;
    }
}

class Solution665 {
    public boolean checkPossibility(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] > nums[i]) {
                count++;
                if(i-2<0 || nums[i-2] <= nums[i])
                {
                    nums[i-1] = nums[i];
                    //modify nums[i-1] of a priority
                }
                else nums[i] = nums[i-1];
            }
            if (count > 1) { return false;}
        }
        return true;
    }
}

class Solution669 {
    public TreeNode trimBST(TreeNode root, int L, int R) {
        if (root == null) return null;
        if (R < root.val) {
            return trimBST(root.left, L, R);
        } else if (L > root.val) {
            return trimBST(root.right, L, R);
        } else {
            TreeNode left = trimBST(root.left, L, root.val);
            TreeNode right = trimBST(root.right, root.val, R);
            root.left = left;
            root.right = right;
            return root;
        }
    }
}

class Solution670 {
    public int maximumSwap(int num) {
        char[] arr = String.valueOf(num).toCharArray();
        int[] bucket = new int[10];
        for (int i = 0; i< arr.length; i++) {
            bucket[arr[i]-'0'] = i;
        }
        for (int i = 0;i< arr.length; i++) {
            for (int j = 9; j>=0; j--) {
                if (j > (arr[i]-'0') && bucket[j] > i) {
                    char tmp = arr[bucket[j]];
                    arr[bucket[j]] = arr[i];
                    arr[i] = tmp;
                    String s = new String(arr);
                    return Integer.parseInt(s);
                }
            }
        }
        return num;
    }
}

// 11/23/17
class Solution671 {
    int first= Integer.MAX_VALUE, second = Integer.MAX_VALUE;
    public int findSecondMinimumValue(TreeNode root) {
        dfs(root);
        return second == Integer.MAX_VALUE ? -1 : second;
    }

    private void dfs(TreeNode root) {
        if (root == null) {return;}
        check(root.val);
        dfs(root.left);
        dfs(root.right);
    }

    private void check(int val) {
        if (val == first) {
            return;
        }
        if (val < first) {
            second = first;
            first = val;
        } else if (val < second) {
            second = val;
        }
    }
}

class Solution673 {
    public int findNumberOfLIS(int[] nums) {
        int m = nums.length;
        if(m== 0) return 0;
        List<Integer>[] dp = new List[m];
        dp[0] = new ArrayList<>(Arrays.asList(1,1));

        for (int i = 1; i < m; i++) {
            Map<Integer, Integer> map = new HashMap<>();
            map.put(1,1);
            int max =1;

            for (int j = i-1; j >= 0; j--) {
                if(nums[i] > nums[j]) {
                    int tmp = dp[j].get(0);
                    map.put(tmp+1, map.getOrDefault(tmp+1, 0) + dp[j].get(1));
                    max = Math.max(max, tmp+1);
                }
            }
            dp[i] = new ArrayList<>(Arrays.asList(max, map.get(max)));
        }

        Map<Integer,Integer> map = new HashMap();
        int max = -1;
        for (int i = 0; i < m; i++) {
            map.put(dp[i].get(0), map.getOrDefault(dp[i].get(0),0) + dp[i].get(1));
            max = Math.max(max, dp[i].get(0));
        }
        return map.get(max);
    }
}

class Solution674 {
    public int findLengthOfLCIS(int[] nums) {
        int m = nums.length;
        if (m == 0) {return 0;}
        int tmp = 1;
        int max = 1;
        for(int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i-1]) {
                tmp++;
                max = Math.max(max, tmp);
            } else {
                tmp = 1;
            }
        }
        return max;
    }
}

class Solution678 {
    public boolean checkValidString(String s) {
        return dfs(0, 0, s);
    }

    private boolean dfs(int index, int val, String s) {
        if (val < 0) {return false;}
        if (index >= s.length()) { return val == 0;}
        if (s.charAt(index) == '(') {
            return dfs(index+1, val+1, s);
        } else if (s.charAt(index) == ')') {
            return dfs(index+1, val-1, s);
        } else {
            return dfs(index+1, val+1, s) || dfs(index+1, val-1, s) || dfs(index+1, val, s);
        }
    }
}

class MyCalendar { //729
    class Interval {
        int start;
        int end;
        Interval() { start = 0; end = 0; }
        Interval(int s, int e) { start = s; end = e; }
    }
    List<Interval> meeetings;

    public MyCalendar() {
        meeetings = new ArrayList<>();
    }

    public boolean book(int start, int end) {
        boolean canBook = true;
        for(Interval meet : meeetings) {
            if ((start >= meet.start && start < meet.end) ||
                    (meet.start >= start && meet.start < end)) {
                canBook = false;
                break;
            }

        }
        if (canBook) {
            meeetings.add(new Interval(start, end));
        }
        return canBook;
    }
}

class MyCalendarTwo { //731
    class Interval {
        int start;
        int end;
        Interval() { start = 0; end = 0; }
        Interval(int s, int e) { start = s; end = e; }
    }
    List<Interval> meeetings;
    public MyCalendarTwo() {
        meeetings = new ArrayList<>();
    }

    public boolean book(int start, int end) {
        boolean canInsert = true;
        int tl = start;
        int te = end;
        List<Interval> tmp = new ArrayList<>();
        for(Interval meeting : meeetings) {
//            List<Interval> tmp = new ArrayList<>();
            if ((start >= meeting.start && start < meeting.end) ||
                    (meeting.start >= start && meeting.start < end)) {

                tl = Math.max(start, meeting.start);
                te = Math.min(end, meeting.end);

                for(Interval overlap : tmp) {
                    if ((tl >=overlap.start && tl < overlap.end) ||
                            (overlap.start >= tl && overlap.start < te)) {
                        canInsert = false;
                        break;
                    }
                }
                tmp.add(new Interval(tl, te));
            }
            if (canInsert == false) {
                break;
            }
        }
        if (canInsert) {
            meeetings.add( new Interval(start, end));
        }
        return canInsert;
    }
}

class Solution728 {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (isSelfDividing(i)) {
                res.add(i);
            }
        }
        return res;
    }

    private boolean isSelfDividing(int n) {
        char[] arr = String.valueOf(n).toCharArray();
        for (char c: arr) {
            if (c == '0') { return false; }
            if (n % (c - '0') != 0) { return false;}
        }
        return true;
    }
}

class Solution683 {
    public int kEmptySlots(int[] flowers, int k) {
        int m = flowers.length;
        if (m == 0 || k > m) return -1;
        TreeSet<Integer> set = new TreeSet<>();
        for(int i = 0; i< flowers.length; i++) {
            int x = flowers[i];
            set.add(x);
            Integer higher = set.higher(x);
            Integer lower = set.lower(x);

            if (higher != null && higher - x == k+1) {
                return i+1;
            }
            if (lower != null && x - lower == k+1) {
                return i+1;
            }
        }
        return -1;
    }
}

//11/24/17
class Solution726 {
    private int i = 0;
    public String countOfAtoms(String formula) {
        char[] s = formula.toCharArray();
        Map<String, Integer> map = dfs(s);
        StringBuilder res = new StringBuilder();
        for(String key : map.keySet()) {
            res.append(key);
            if (map.get(key) > 1) {
                res.append(String.valueOf(map.get(key)));
            }
        }
        return res.toString();
    }

    private Map<String, Integer> dfs(char[] s) {
        Map<String, Integer> res = new TreeMap<>();

        while(i < s.length) {
            if (s[i] == '(') {
                i++;
                Map<String, Integer> tmp = dfs(s);
                for(String key : tmp.keySet()) {
                    res.put(key,
                            tmp.get(key) + res.getOrDefault(key, 0));
                }
            } else if (s[i] == ')') {
                i++;
                int count = getCount(s);
                for (String key : res.keySet()) {
                    res.put(key, res.get(key) * count);
                }
                return res;
            } else {
                String name = getName(s);
                int count = getCount(s);
                res.put(name, res.getOrDefault(name, 0) + count);
            }
        }
        return res;
    }

    private String getName(char[] s) {
        StringBuilder name = new StringBuilder();
        while(i < s.length && ((Character.isUpperCase(s[i]) && name.length() == 0) ||
                (name.length() > 0 && Character.isLowerCase(s[i])))) {
            name.append(s[i++]);
        }
        return name.toString();
    }

    private int getCount(char[] s) {
        StringBuilder count = new StringBuilder();
        while(i < s.length && Character.isDigit(s[i])) {
            count.append(s[i++]);
        }
        return count.length() == 0 ? 1 : Integer.parseInt(count.toString());
    }
}

//11/25/17
class Solution699 {
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
            int end = start + positions[i][1];
            for (int j = 0; j < existing.size(); j++) {
                if ((start >= existing.get(j).start && start < existing.get(j).end) ||
                        (existing.get(j).start >= start && existing.get(j).start < end)) {
                    maxHeight = Math.max(maxHeight, existing.get(j).height + positions[i][1]);
                }
            }
            existing.add(new Interval(start, end, maxHeight));
            tmp = Math.max(tmp, maxHeight);
            res.add(tmp);
        }
        return res;
    }
}

class Solution719 {
    public int smallestDistancePair(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>(
                (a,b) -> b-a
        );
        int m = nums.length;
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = i+1; j < m; j++) {
                int tmp = Math.abs(nums[i] - nums[j]);
                if (q.size() == k) {
                    if (tmp < q.peek()) {
                        q.poll();
                    } else {
                        continue;
                    }
                }
                q.add(tmp);

            }
        }
        return q.peek();
    }
}

class MapSum { //677
    class TrieNode {
        int count;
        TrieNode[] children;
        public TrieNode(int n) {
            count = n;
            children = new TrieNode[26];
        }
    }
    private TrieNode root;
    private Set<String> set;
    /** Initialize your data structure here. */
    public MapSum() {
        root = new TrieNode(0);
        set = new HashSet<>();
    }

    public void insert(String key, int val) {
        TrieNode tmp = root;
        boolean replace = set.contains(key);
        for(int i = 0;i < key.length(); i++) {
            char c = key.charAt(i);
            if (tmp.children[c - 'a'] == null) {
                tmp.children[c-'a'] = new TrieNode(val);
            } else {
                tmp.children[c-'a'].count += val;
                if (replace) {
                    tmp.children[c-'a'].count = val;
                }
            }
            tmp = tmp.children[c-'a'];
        }
        set.add(key);
    }

    public int sum(String prefix) {
        int res = 0;
        TrieNode tmp = root;
        for(int i = 0; i < prefix.length(); i++) {
            char c = prefix.charAt(i);
            if (tmp.children[c - 'a'] != null) {
                res = tmp.children[c-'a'].count;
            } else {
                return 0;
            }
            tmp = tmp.children[c-'a'];
        }
        return res;
    }
}

// 11/26/17
class Solution680 {
    public boolean validPalindrome(String s) {
        return dfs(s,0, s.length()-1, 0);
    }

    private boolean dfs(String s, int i, int j, int count) {
        if (count > 1) {return false;}
        if (i >= j) {return true;}

        if (s.charAt(i) == s.charAt(j)) {
            return dfs(s, i+1, j-1, count);
        } else {
            return dfs(s, i, j-1, count+1) || dfs(s, i+1, j, count+1);
        }
    }

}

class Solution681 {
    int minute;
    int minDiff = Integer.MAX_VALUE;
    Character[] res;
    public String nextClosestTime(String time) {
        String[] arr = time.split(":");
        int hr = Integer.parseInt(arr[0]);
        int min = Integer.parseInt(arr[1]);
        minute = hr * 60 + min;
        Set<Character> set = new HashSet<>();
        set.add(arr[0].charAt(0));
        set.add(arr[0].charAt(1));
        set.add(arr[1].charAt(0));
        set.add(arr[1].charAt(1));

        Character[] s = new Character[4];
        res = new Character[4];
        Character[] chars = set.toArray(new Character[set.size()]);
        dfs(s, chars, 0);
        return ""+res[0]+res[1]+":"+res[2]+res[3];
    }

    private void dfs(Character[] s, Character[] chars, int index) {
        if (s.length == index) {
            int tmp = findDiff(s);
            if (tmp < minDiff) {
                minDiff = tmp;
                for (int i = 0; i< s.length; i++) {
                    res[i] = s[i];
                }
            }
        } else {
            for (int i = 0; i < chars.length; i++) {
                s[index] = chars[i];
                if (index >= 1) {
                    int hr = Integer.parseInt(""+s[0]+s[1]);
                    if (hr >= 24) {
                        return;
                    }
                }
                if (index == s.length-1) {
                    int min = Integer.parseInt(""+s[2]+s[3]);
                    if (min >= 60) {
                        return;
                    }
                }

                dfs(s, chars, index + 1);
            }
        }
    }

    private int findDiff(Character[] s) {
        String hr = ""+s[0]+s[1];
        String min = ""+s[2]+s[3];
        int h = Integer.parseInt(hr);

        int m = Integer.parseInt(min);

        int cur = h* 60 + m;
        if (cur <= minute) {
            cur += 24 * 60;
        }
        return cur - minute;
    }
}


class Solution682 {
    public int calPoints(String[] ops) {
        Stack<Integer> t = new Stack<>();
        for(int i = 0; i < ops.length; i++) {
            if (ops[i].equals("C")) {
                t.pop();
            } else if (ops[i].equals("D")) {
                t.push(t.peek()*2);
            } else if (ops[i].equals("+")) {
                int tmp = t.peek();
                t.pop();
                int res = tmp + t.peek();
                t.push(tmp);
                t.push(res);
            } else {
                t.push(Integer.parseInt(ops[i]));
            }
        }
        int res = 0;
        while(!t.empty()) {
            res += t.pop();
        }
        return res;
    }
}

class Solution684 {
    public int[] findRedundantConnection(int[][] edges) {
        int m = edges.length;
        int[] t = new int[m];
        for (int i = 0; i < m; i++) {
            t[i] = i;
        }
        for (int i = 0; i < edges.length; i++) {
            int r1 = findRoot(edges[i][0], t);
            int r2 = findRoot(edges[i][1], t);
            if (r1 == r2) { return edges[i]; }

            if (r1 < r2) {
                t[edges[i][1]-1] = r1;
                t[r2] = r1;
            } else {
                t[edges[i][0]-1] = r2;
                t[r1] = r2;
            }
        }
        return null;
    }

    private int findRoot(int i, int[] t) {
        int root = i-1;
        while(t[root] != root) {
            root = t[root];
        }
        return root;
    }
}

class Solution685 {
    public int[] findRedundantDirectedConnection(int[][] edges) {
        int m = edges.length;
        int[] t = new int[m];
        for (int i = 0; i < m; i++) {
            t[i] = i;
        }
        int[][] ans = new int[2][];
        for (int i = 0; i < edges.length; i++) {
            if (t[edges[i][1]-1] != edges[i][1]-1) {
                ans[0] = new int[] {t[edges[i][1]-1]+1 , edges[i][1]};
                ans[1] = edges[i];
            }
        }
        for (int i = 0; i < edges.length; i++) {
            int r1 = findRoot(edges[i][0], t);
            int r2 = findRoot(edges[i][1], t);
            if (r1 == r2) { return ans[0]; }

            t[edges[i][1]-1] = edges[i][0]-1;
        }
        return ans[1];
    }

    private int findRoot(int i, int[] t) {
        int root = i-1;
        while(t[root] != root) {
            root = t[root];
        }
        return root;
    }
}

class Solution686 {
    public int repeatedStringMatch(String A, String B) {
        int i = 0;
        String tmp = A;
        while(tmp.length() < B.length() || !tmp.contains(B)) {
            if (tmp.length() - B.length() > A.length()) {
                return -1;
            }
            tmp = tmp+A;
            i++;
        }
        return i+1;
    }
}

class Solution679_1 {
    float eps = 0.01f;
    boolean canform24 = false;
    public boolean judgePoint24(int[] nums) {
        List<Float> f = new ArrayList<>();
        for (int i = 0; i< nums.length; i++) {
            f.add((float)nums[i]);
        }
        dfs(f);
        return canform24;
    }

    private void dfs(List<Float> res) {
        if (res.size() == 1) {
            if (Math.abs(res.get(0) - 24.0) < eps) {
                canform24 = true;
                return;
            }
        }
        for (int i = 0; i < res.size(); i++) {
            for(int j = 0; j < i; j++) {
                float p1 = res.get(i);
                float p2 = res.get(j);
                List<Float> next = new ArrayList<>();
                next.addAll(Arrays.asList(p1+p2, p1-p2, p2-p1, p1*p2));
                if (p1 > eps) {next.add(p2/p1);}
                if (p2 > eps) {next.add(p1/p2);}
                res.remove(i);
                res.remove(j);
                for (float f : next) {
                    res.add(f);
                    dfs(res);
                    res.remove(res.size()-1);
                }
                res.add(j, p2);
                res.add(i, p1);
            }
        }
    }
}

class Solution121 {
    public int maxProfit(int[] prices) {
        int res = 0;
        int cur = 0;
        int i = 0;
        while(i < prices.length-1) {
            cur += (prices[i+1] - prices[i]);
            if(cur < 0) { cur = 0;}
            res = Math.max(res, cur);
            i++;
        }
        return res;
    }
}

class Solution123 {
    public int maxProfit(int[] prices) {
        int in1 = Integer.MIN_VALUE;
        int in2 = Integer.MIN_VALUE;
        int out1 = 0;
        int out2 = 0;
        for(int price : prices) {
            out2 = Math.max(out2, in2+price);
            in2 = Math.max(in2, out1-price);
            out1 = Math.max(out1, in1+price);
            in1 = Math.max(in1, -price);
        }
        return out2;
    }
}

// 11/27/17
class Solution687 {
    public int longestUnivaluePath(TreeNode root) {
        int[] res = new int[1];
        res[0] = 0;
        if (root != null) {
            dfs(root, res);
        }
        return res[0];
    }

    private int dfs(TreeNode root, int[] res) {
        int l = root.left == null ? 0 : dfs(root.left, res);
        int r = root.right == null ? 0 : dfs(root.right, res);
        l = root.left != null && root.val == root.left.val ? l+1 : 0;
        r = root.right != null && root.val == root.right.val ? r+1 : 0;
        res[0] = Math.max(res[0], l+r);
        return Math.max(l, r);
    }
}

// 11/28/17
class Solution688 {
    public double knightProbability(int N, int K, int r, int c) {
        if (r < 0 || c < 0) return 0;
        int[] dx = {-2,-1,1,2,2,1,-1,-2};
        int[] dy = {1,2,2,1,-1,-2,-2,-1};
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{r,c});
        q.add(null);
        double res = 1.0d;
        int outCount = 0;
        int inCount = 0;
        int step = 0;
        while(!q.isEmpty() && step < K) {
            int[] tmp = q.poll();
            if (tmp == null) {
                if (inCount == 0) { return 0;}
                res = res * (double)(inCount) /(double)(inCount+outCount);
                inCount = 0;
                outCount = 0;
                if (!q.isEmpty()) {
                    q.add(null);
                }
                step++;
                continue;
            } else {
                for (int i = 0; i < 8; i++) {
                    int x = tmp[0] + dx[i];
                    int y = tmp[1] + dy[i];
                    if (x >= 0 && x < N && y >= 0 & y < N) {
                        q.add(new int[]{tmp[0] + dx[i], tmp[1] + dy[i]});
                        inCount++;
                    } else {
                        outCount++;
                    }
                }
            }
        }
        return res;
    }
}

class Solution001 {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i< nums.length; i++) {
            if (map.keySet().contains(target-nums[i])) {
                return new int[]{i, map.get(target-nums[i])};
            } else {
                map.put(nums[i], i);
            }
        }
        return null;
    }
}

// 11/29/17
class Solution689 {
    public int[] maxSumOfThreeSubarrays(int[] nums, int k) {
        int m = nums.length;
        int[] sum = new int[m];
        int[] left = new int[m];
        int[] right = new int[m];
        int[] res = new int[3];
        sum[0] = nums[0];
        for (int i = 1; i< m; i++) {
            sum[i] = nums[i] + sum[i-1];
        }

        for (int i = k, total = sum[k-1]; i< m; i++) {
            int tmp = sum[i] - sum[i-k];
            if (tmp > total) {
                left[i] = i-k+1;
                total = tmp;
            } else {
                left[i] = left[i-1];
            }
        }

        for (int i = m-k, total = Integer.MIN_VALUE; i >= 0; i--) {
            int tmp = sum[i+k-1] - sum[i];
            if (tmp >= total) {
                right[i] = i;
                total = tmp;
            } else {
                right[i] = right[i+1];
            }
        }

        int maxSum = 0;
        for (int i = k; i <= m - 2*k; i++) {
            int l = left[i-1];
            int r = right[i+k];
            int tmp = (sum[i+k-1] - sum[i]) + (sum[l+k-1] - sum[l]) + (sum[r+k-1] - sum[r]);
            if (tmp >maxSum) {
                res[0] = l;
                res[1] = i;
                res[2] = r;
                maxSum = tmp;
            }
        }
        return res;
    }
}

class Solution690 {
    class Employee {
        // It's the unique id of each node;
        // unique id of this employee
        public int id;
        // the importance value of this employee
        public int importance;
        // the id of direct subordinates
        public List<Integer> subordinates;
    }
    public int getImportance(List<Employee> employees, int id) {
        int res = 0;
        for (int i = 0; i< employees.size(); i++) {
            if (employees.get(i).id == id) {
                res += employees.get(i).importance;
                for (int k : employees.get(i).subordinates) {
//                    for (int j = 0; j< employees.size(); j++) {
//                        if (employees.get(j).id == k) {
//                            res += employees.get(j).importance;
//                        }
//                    }
                    res += getImportance(employees, k);
                }

            }
        }
        return res;
    }
}



















