package com.company;



import edu.princeton.cs.algs4.In;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class Feb {
}

class Solution779 {
    public int kthGrammar(int N, int K) {
        boolean res = dfs(K-1, 0, (int)Math.pow(2, N-1)-1, true);
        return res ? 0 : 1;
    }

    private boolean dfs(int offset, int start, int end, boolean root) {
        if (start >= end) {
            return root;
        }

        int mid = (start+end)/2;

        if (offset <= mid) {
            return dfs(offset, start, mid, root);
        } else {
            return dfs(offset-mid-1, start, mid, !root);
        }
    }
}


class Solution783 {
    public int minDiffInBST(TreeNode root) {
        int res = Integer.MAX_VALUE;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode prev = root;
        TreeNode lastVisited = null;
        while(prev != null || !stack.isEmpty()) {
            while(prev != null) {
                stack.push(prev);
                prev = prev.left;
            }
            TreeNode cur = stack.pop();
            if (lastVisited != null) {
                res = Math.min(res, Math.abs(lastVisited.val - cur.val));
            }
            lastVisited = cur;
            prev = cur.right;
        }
        return res;
    }
}

class Solution_781 {
    public int numRabbits(int[] answers) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < answers.length; i++) {
            map.put(answers[i], map.getOrDefault(answers[i], 0)+1);
        }
        int res = 0;
        for (Integer key : map.keySet()) {
            int cur = map.get(key);
            int rem = cur % (key+1);
            int val = cur / (key+1);
            res += val * (key+1);
            res += rem == 0 ? 0 : (key+1);
        }
        return res;
    }
}

class Solution780 {
    public boolean reachingPoints(int sx, int sy, int tx, int ty) {
        while(tx >=sx && ty >= sy) {
            if (tx >= ty) {
                if(sy == ty) {
                    return (tx - sx) % ty == 0;
                } else {
                    tx = tx%ty;
                }

            } else {
                if(sx == tx) {
                    return (ty - sy) % tx == 0;
                } else {
                    ty = ty%tx;
                }
            }
            if (tx == sx && ty == sy){
                return true;
            }
        }
        return false;
    }
}

class Solution777 {
    public boolean canTransform(String start, String end) {
        if (start.length() != start.length()) {
            return false;
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < start.length(); i++) {
            if (start.charAt(i) != 'X') {
                sb.append(start.charAt(i));
            }
        }

        String startShort = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < end.length(); i++) {
            if (end.charAt(i) != 'X') {
                sb2.append(end.charAt(i));
            }
        }
        String endShort = sb2.toString();
        if (!startShort.equals(endShort)) {
            return false;
        }

        int p1 = 0;
        int p2 = 0;

        while(p1 < start.length() && p2 < end.length()) {
            while(p1 < start.length() && start.charAt(p1) == 'X') {
                p1++;
            }

            while(p2 < end.length() && end.charAt(p2) == 'X') {
                p2++;
            }

            if (p1 == start.length() && p2 == end.length()) {
                return true;
            }

            if (p1 == start.length() || p2 == end.length()) {
                return true;
            }

            if (start.charAt(p1) != end.charAt(p2)) {
                return false;
            }

            if (start.charAt(p1) == 'L') {
                if (p2 > p1) {
                    return false;
                }
            }

            if (end.charAt(p2) == 'R') {
                if (p2 < p1) {
                    return false;
                }
            }
            p1++;
            p2++;
        }
        return true;
    }
}

class Solution638_I {
    public int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
        return dfs(price, special, needs);
    }

    public int dfs(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {

        int res = buyOne(price, needs);
        for(List<Integer> s : special) {
            if(works(s, needs)) {
                buy(s, needs);
                res = Math.min(res, s.get(s.size()-1) + dfs(price, special, needs));
                returned(s, needs);
            }
        }
        return res;
    }

    private int buyOne(List<Integer> price, List<Integer> needs) {
        int res = 0;
        for(int i = 0; i< price.size(); i++) {
            res += price.get(i) * needs.get(i);
        }
        return res;
    }

    private boolean works(List<Integer> special, List<Integer> need) {
        for(int i = 0; i< need.size(); i++) {
            if (special.get(i) > need.get(i)) {
                return false;
            }
        }
        return true;
    }

    private void buy(List<Integer> special, List<Integer> need) {
        for(int i = 0; i< need.size(); i++) {
            need.set(i, need.get(i) - special.get(i));
        }
        return;
    }

    private void returned(List<Integer> special, List<Integer> need) {
        for(int i = 0; i < need.size(); i++) {
            need.set(i, need.get(i) + special.get(i));
        }
        return;
    }
}

class Solution785 {
    public boolean isBipartite(int[][] graph) {

        Map<Integer, Integer> colorMap = new HashMap<>();
        for(int i = 0; i< graph.length; i++) {
            if (!colorMap.containsKey(i) && !travel(i, 0, colorMap, graph))
                return false;
        }
        return true;
    }

    private boolean travel(
            int i,
            int color,
            Map<Integer, Integer> colorMap,
            int[][] graphMap) {
        if (colorMap.containsKey(i) && colorMap.get(i) != color) {
            return false;
        }
        if (colorMap.containsKey(i)) {
            return true;
        }
        colorMap.put(i, color);

        int newColor = (color+1)%2;
        for(int start : graphMap[i]) {
            if (!travel(start, newColor, colorMap, graphMap)) {
                return false;
            }
        }
        return true;
    }
}

class Solution784 {
    public List<String> letterCasePermutation(String S) {
        List<String> res = new ArrayList<>();
        if(S.length() == 0) {
            return res;
        }
        if (S.charAt(0) >= '0' && S.charAt(0) <= '9') {
            res.add(String.valueOf(S.charAt(0)));
        } else {
            res.add(String.valueOf(S.charAt(0)).toLowerCase());
            res.add(String.valueOf(S.charAt(0)).toUpperCase());
        }

        for(int i = 1; i< S.length(); i++) {
            List<String> tmp = new ArrayList<>();
            for(String s : res) {
                if (S.charAt(i) >= '0' && S.charAt(i) <= '9') {
                    tmp.add(s + String.valueOf(S.charAt(i)));
                } else {
                    tmp.add(s + String.valueOf(S.charAt(i)).toLowerCase());
                    tmp.add(s+ String.valueOf(S.charAt(i)).toUpperCase());
                }
            }
            res = tmp;
        }
        return res;
    }
}

class Pasico {
    public void print(int n) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(Arrays.asList(1));
        for(int i = 1; i< n; i++) {
            List<Integer> last = res.get(res.size()-1);
            List<Integer> tmp = new ArrayList<>();
            tmp.add(1);
            for (int k = 0; k < last.size()-1; k++) {
                tmp.add(last.get(k) + last.get(k+1));
            }
            tmp.add(1);
            res.add(tmp);
        }
        for(int i = 0; i< res.size();i++) {
            for(Integer k : res.get(i)) {
                System.out.print(k);
                System.out.print(" ");
            }
            System.out.println('\n');
        }
    }
}

class Solution788 {
    public int rotatedDigits(int N) {
        Set<Integer> good = new HashSet<>();
        good.add(2);
        good.add(5);
        good.add(6);
        good.add(9);

        Set<Integer> work = new HashSet<>();
        work.add(2);
        work.add(5);
        work.add(6);
        work.add(9);
        work.add(1);
        work.add(8);
        work.add(0);

        int count = 0;
        for (int i = 1; i <= N; i++) {
            if (isRotatedDigits(i, work, good)) {
                count++;
            }
        }
        return count;
    }

    private boolean isRotatedDigits(int n, Set<Integer> work, Set<Integer> good) {
        boolean isGood = false;
        while(n > 0) {
            int digit = n%10;
            if (!work.contains(digit)) {
                return false;
            }
            if (good.contains(digit)) {
                isGood = true;
            }
            n = n / 10;
        }
        return isGood;
    }
}

class Solution786 {
    public int[] kthSmallestPrimeFraction(int[] A, int K) {
        int n = A.length;
        Comparator<int[]> comp = new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                int res1 = A[o1[0]] * A[o2[1]];
                int res2 = A[o2[0]] * A[o1[1]];
                if (res1 < res2) {
                    return -1;
                } else {
                    return 1;
                }
            }
        };
        PriorityQueue<int[]> q = new PriorityQueue<>(comp);

        for(int i = 0; i < n-1; i++) {
            q.add(new int[]{i, n-1});
        }

        for (int i = 0; i < K-1; i++) {
            int[] pop = q.remove();
            int ni = pop[0];
            int di = pop[1];
            if(pop[1]-1>pop[0]) {
                pop[1]--;
                q.add(pop);
            }
        }

        int[] peek = q.peek();
        return new int[] {A[peek[0]], A[peek[1]]};
    }

}

// this will time out
class Solution787 {
    int res = Integer.MAX_VALUE;

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
        Map<Integer, List<int[]>> graph = new HashMap<>();
        for(int i = 0; i < flights.length; i++) {
            List<int[]> tmp = graph.getOrDefault(flights[i][0], new ArrayList<>());
            tmp.add(new int[] {flights[i][1], flights[i][2]});
            graph.put(flights[i][0], tmp);
        }
        dfs(0, 0, graph, K, src, dst);
        return res == Integer.MAX_VALUE ? -1: res;
    }

    public void dfs(int steps, int cost, Map<Integer, List<int[]>> graph, int K, int from, int dst) {
        if (steps > K+1) {
            return;
        }
        if(from == dst) {
            res = Math.min(res, cost);
            return;
        }
        List<int[]> list = graph.getOrDefault(from, new ArrayList<>());
        for (int[] arr : list){
            dfs(steps+1, cost+arr[1], graph, K, arr[0], dst);
        }
    }
}

class Solution787_BellmanFord {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
        int[] res = new int[n];
        for (int i = 0; i< n; i++) {
            res[i] = 100000000;
        }
        res[src] = 0;

        for (int s = 0; s <= K; s++) {
            int[] tmp = copy(res);
            for(int i = 0; i< flights.length; i++) {
                tmp[flights[i][1]] = Math.min((res[flights[i][0]] + flights[i][2]), tmp[flights[i][1]]);
            }
            res = tmp;
        }

        return res[dst] == 100000000 ? -1 : res[dst];
    }

    private int[] copy(int[] input) {
        int[] res = new int[input.length];
        for(int i = 0; i< input.length; i++) {
            res[i] = input[i];
        }
        return res;
    }
}