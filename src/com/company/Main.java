package com.company;

import apple.laf.JRSUIUtils;
import com.sun.tools.corba.se.idl.constExpr.Negative;

import javax.security.auth.callback.CallbackHandler;
import java.awt.*;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.*;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//	    Solution279 s279 = new Solution279();
//	    System.out.println(s279.numSquares(7168));
//        Solution250 s250 = new Solution250();
//        TreeNode root = new TreeNode(5);
//        TreeNode left = new TreeNode(1);
//        TreeNode right = new TreeNode(5);
//        TreeNode leftleft = new TreeNode(5);
//        TreeNode leftright = new TreeNode(5);
//        TreeNode rightright = new TreeNode(5);
//        root.left = left;
//        root.right = right;
//        left.left = leftleft;
//        left.right = leftright;
//        right.right = rightright;
//        System.out.println(s250.countUnivalSubtrees(root));
//        List<Integer> l1 = new ArrayList<Integer>(Arrays.asList(1,2));
//        List<Integer> l2 = new ArrayList<>(Arrays.asList(3));
//        List<Integer> l3 = new ArrayList<>(Arrays.asList(4,5,6));
//        List<List<Integer>> list = new ArrayList<>();
//        list.add(l1);
//        list.add(l2);
//        list.add(l3);
//        Vector2D v2d = new Vector2D(list);
//        while(v2d.hasNext()) {
//            System.out.println(v2d.next());
//        }
//        Solution254 s254 = new Solution254();
//        s254.getFactors(12);
//        Solution259 s259 =  new Solution259();
//        System.out.println(s259.threeSumSmaller(new int[] {3,1,0,-2},4 ));
//        Solution261 s261 = new Solution261();
//        int[][] edges = new int[][] {
//                {0,1},
//                {1,2},
//                {2,3},
//                {1,3},
//                {1,4}};
//        System.out.println(s261.validTree(5, edges));
//        Solution263 s263 = new Solution263();
//        System.out.println(s263.isUgly(6));
//        Solution264 s264 = new Solution264();
//        System.out.println(s264.nthUglyNumber(10));
//        Solution265 s265 = new Solution265();
//        int[][] input = new int[][]{{1,5,3},{2,9,4}};
//        System.out.println(s265.minCostII(input));
//        Solution267 s267 = new Solution267();
//        List<String> res = s267.generatePalindromes("aabb");

//        Solution268 s268 = new Solution268();
//        int res = s268.missingNumber(new int[] {0,1,3});

//        Solution269 s269 = new Solution269();
////        String[] input = new String[] {"wrt", "wrf", "er", "ett", "rftt"};
//        String[] input = new String[] {"z", "x"};
//        String res = s269.alienOrder(input);
//        Codec271 s271 = new Codec271();
//        String s = s271.encode(new ArrayList<String>(Arrays.asList("", "")));
//        List<String> res = s271.decode(s);
//        Solution274 s274 = new Solution274();
//        System.out.println(s274.hIndex(new int[] {3, 0, 6, 1, 5}));
//        Solution278 s278 = new Solution278();
//        System.out.println(s278.firstBadVersion(3));
//        Solution277 s277 = new Solution277();
//        System.out.println(s277.findCelebrity(2));
//        Solution282 s282 = new Solution282();
//        System.out.println(s282.addOperators("123", 6));
//        Solution286 s286 = new Solution286();
//        int[][] input = new int[][] {{0,234}, {234,234}};
//        s286.wallsAndGates(input);
//        ValidWordAbbr s288 = new ValidWordAbbr(new String[] {"deer","door","cake","card"});
//        System.out.println(s288.isUnique("dear"));
//        System.out.println(s288.isUnique("cart"));
//        System.out.println(s288.isUnique("cane"));
//        System.out.println(s288.isUnique("make"));
//        Solution289 s289 = new Solution289();
//        int[][] input = new int[][] {{1}};
//        s289.gameOfLife(input);
//        Solution294 s294 = new Solution294();
//        System.out.println(s294.canWin("++++"));
//        TreeNode root = new TreeNode(1);
//        TreeNode left = new TreeNode(2);
//        TreeNode leftleft = new TreeNode(4);
//        TreeNode leftright = new TreeNode(5);
//        TreeNode right = new TreeNode(3);
//        root.left = left;
//        root.right = right;
//        left.left = leftleft;
//        left.right = leftright;
//        Solution298 s298 = new Solution298();
//        System.out.println(s298.longestConsecutive(root));

//        MedianFinder s295 = new MedianFinder();
//        s295.addNum(6);
//        System.out.println(s295.findMedian());
//        s295.addNum(10);
//        System.out.println(s295.findMedian());
//        s295.addNum(2);
//        System.out.println(s295.findMedian());
//        s295.addNum(6);
//        System.out.println(s295.findMedian());
//        s295.addNum(5);
//        System.out.println(s295.findMedian());
//        s295.addNum(0);
//        System.out.println(s295.findMedian());
//        s295.addNum(6);
//        System.out.println(s295.findMedian());
//        s295.addNum(3);
//        System.out.println(s295.findMedian());
//        s295.addNum(1);
//        System.out.println(s295.findMedian());
//        s295.addNum(0);
//        System.out.println(s295.findMedian());
//        s295.addNum(0);
//        System.out.println(s295.findMedian());
//        Solution296 s296 = new Solution296();
//        int[][] input = new int[][]{{0,2,1},{1,0,2},{0,1,0}};
//        System.out.println(s296.minTotalDistance(input));
//        Solution291 s291 = new Solution291();
//        System.out.println(s291.wordPatternMatch("d", "e"));
//        int[][] input = new int[][] {
//                {3,0,1,4,2},
//                {5,6,3,2,1},
//                {1,2,0,1,5},
//                {4,1,0,1,7},
//                {1,0,3,0,5}
//        };
//
//        NumMatrix s304 = new NumMatrix(input);
//
//        System.out.println(s304.sumRegion(2,1,4,3));
//        Solution306 s306 = new Solution306();
//        System.out.println(s306.isAdditiveNumber("0235813"));
//        Graph g = new Graph(2);
//        int [] input = new int[]{0,9,5,7,3};
//        NumArray307 s307 = new NumArray307(input);
//        System.out.println(s307.sumRange(4,4));
////        s307.update(1,2);
//        System.out.println(s307.sumRange(2,4));
//        Solution309 s309 = new Solution309();
//        int[] input = new int[] {2,1,4};
//        System.out.println(s309.maxProfit(input));
//        Solution310 s310 = new Solution310();
//        int[][] edges = new int[][] {{0, 3}, {1, 3}, {2, 3}, {4, 3}, {5, 4}};
//        List<Integer> res = s310.findMinHeightTrees(6, edges);
//        Solution313 s313 = new Solution313();
//        System.out.println(s313.nthSuperUglyNumber(12, new int[]{2,7,13,19}));
//        Solution301 s301 = new Solution301();
//        List<String> res = s301.removeInvalidParentheses("()())()");
//        Solution334 s334 = new Solution334();
//        System.out.println(s334.increasingTriplet(new int[] {2,1,5,0,3}));
//        Solution305II s305 = new Solution305II();
//        List<Integer> res = s305.numIslands2(3,3, new int[][]{{0,1},{1,2},{2,1},{1,0},{0,2},{0,0},{1,1}});

//        int[][] input = new int[][] {
//                {3,0,1,4,2},
//                {5,6,3,2,1},
//                {1,2,0,1,5},
//                {4,1,0,1,7},
//                {1,0,3,0,5}
//        };

//        int[][] input = new int[][] {{1}};
//
//        NumMatrix308 s308 = new NumMatrix308(input);
//
//        System.out.println(s308.sumRegion(0,0,0,0));
//        s308.update(0, 0, -1);
//        System.out.println(s308.sumRegion(0,0,0,0));

//        Solution319 s319 = new Solution319();
//        System.out.println(s319.bulbSwitch(3));
//        Solution320 s320 = new Solution320();
//        List<String> res = s320.generateAbbreviations("word");

//        Solution315 s315 = new Solution315();
//        List<Integer> res = s315.countSmaller(new int[] {26,78,27,100,33,67,90,23,66,5,38,7,35,23,52,22,83,51,98,69,81,32,78,28,94,13,2,97,3,76,99,51,9,21,84,66,65,36,100,41});
//        Solution324 s324 = new Solution324();
//        int[] input = new int[] {1,3,2,2,3,1};
//        s324.wiggleSort(input);
//        Solution325 s325 = new Solution325();
//        System.out.println(s325.maxSubArrayLen(new int[] {1, -1,5,-2,3}, 3));
//        Solution331 s331 = new Solution331();
//        System.out.println(s331.isValidSerialization("9,3,4,#,#,1,#,#,#,2,#,6,#,#"));
//        Solution347 s347 = new Solution347();
//        List<Integer> res = s347.topKFrequent(new int[] {1}, 1);
//        x x1 = new x(1);
//        x x2 = new x(2);
//        List<NestedInteger> l1 = new ArrayList<NestedInteger>(Arrays.asList(x1, x2));
//        x x3 = new x(3);
//        x x4 = new x(4);
//        x x5 = new x(5);
//        List<NestedInteger> l2 = new ArrayList<>(Arrays.asList(x4, x5));
//        x ll1 = new x(l1);
//        x ll2 = new x(l2);
//
//        List<NestedInteger> input = new ArrayList<NestedInteger>(Arrays.asList(ll1, x3, ll2));
//
//        List<NestedInteger> input2 = new ArrayList<>();
//        List<NestedInteger> input3 = new ArrayList<NestedInteger>(Arrays.asList(new x(input2)));
//        NestedIterator s341 = new NestedIterator(input3);
//        System.out.println(s341.hasNext());
//        System.out.println(s341.next());
//        System.out.println(s341.next());
//        System.out.println(s341.next());
//        System.out.println(s341.next());
//        System.out.println(s341.next());
//        System.out.println(s341.next());

//        Solution367 s367 = new Solution367();
//        System.out.println(s367.isPerfectSquare(1));
//        SummaryRanges s352 = new SummaryRanges();
//        s352.addNum(1);
//        s352.addNum(3);
//        s352.addNum(7);
//        s352.addNum(2);
//        s352.addNum(6);
//        s352.addNum(7);
//        s352.addNum(6);
//
//
//        Solution375 s375 = new Solution375();
//        System.out.println(s375.getMoneyAmount(1));
//        SolutionBFS301 s301 = new SolutionBFS301();
//        List<String> res = s301.removeInvalidParentheses("()())()");
//        Solution394II s394 = new Solution394II();
//        System.out.println(s394.decodeString("2[abc]xyc3[z]"));

//        Solution393 s393 = new Solution393();
//        System.out.println(s393.validUtf8(new int[] {255}));
//        Solution395 s395 = new Solution395();
//        System.out.println(s395.longestSubstring("aaabb", 3));
//        Solution399 s399 = new Solution399();
//        double[] res = s399.calcEquation(
//                new String[][] {{"x1","x2"},{"x2","x3"},{"x3","x4"},{"x4","x5"}},
//                new double[] {3.0, 4.0, 5.0, 6.0},
//                new String[][] {{"x1","x5"},{"x5","x2"},{"x2","x4"},{"x2","x2"},{"x2","x9"},{"x9","x9"}}
//        );
//        Solution402 s402 = new Solution402();
//        System.out.println(s402.removeKdigits("1432219", 3));
//        Solution403 s403 = new Solution403();
//        System.out.println(s403.canCross(new int[] {0,1,2,3,4,8,9,11}));
//        Solution406 s406 = new Solution406();
//        System.out.println(s406.reconstructQueue(
//                new int[][] {{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}}));
//        Solution363 s363 = new Solution363();
//        System.out.println(s363.maxSumSubmatrix(
//                new int[][] {{1,0,1},{0,-2,3}},
//                2));
//        Solution410 s410 = new Solution410();
//        System.out.println(s410.splitArray(new int[]{7,2,5,10,8}, 2));
//        Solution413 s413 = new Solution413();
//        System.out.println(s413.numberOfArithmeticSlices(
//                new int[] {1,2,3,8,9,10}));
//        Solution416 s416 = new Solution416();
//        s416.canPartition(new int[]{3,3,3,4,5});
//        Solution418 s418 = new Solution418();
//        System.out.println(s418.wordsTyping(
//                new String[] {"a", "bcd", "e"},
//                3,
//                6
//        ));

//        Solution425 s425 = new Solution425();
//        List<List<String>> res =
//                s425.wordSquares(new String[] {"abat","baba","atan","atal"});
//        Solution424 s424 = new Solution424();
//        System.out.println(s424.characterReplacement("AABABBA", 1));
//        Solution439 s439 = new Solution439();
//        System.out.println(s439.parseTernary("F?1:T?4:5"));
//        Solution441 s441 = new Solution441();
//        System.out.println(s441.arrangeCoins(6));
//        Solution447 s447 = new Solution447();
//        System.out.println(s447.numberOfBoomerangs(
//                new int[][] {{0,0}, {1,0}, {2,0}}
//        ));

//        Solution459 s459 = new Solution459();
//        System.out.println(s459.repeatedSubstringPattern("abcabcabcabc"));
//        Solution464 s464 = new Solution464();
//        System.out.println(s464.canIWin(10, 11));
//        Solution468 s468 = new Solution468();
//        System.out.println(s468.validIPAddress("172.16.254.1."));
//        System.out.println(s468.validIPAddress("2001:0db8:85a3:0:0:8A2E:0370:7334:"));
//        System.out.println(s468.validIPAddress("256.256.256.256"));
//        Solution471 s471 = new Solution471();
//        System.out.println(s471.makesquare(new int[] {1,1,2,2,2}));
//        Solution474I s474 = new Solution474I();
//        System.out.println(s474.findMaxForm(
//                new String[] {"10", "0001", "111001", "1", "0"},
//                5,
//                3
//        ));
//        Solution475 s475 = new Solution475();
//        System.out.println(s475.findRadius(new int[]{1,1,1,1,1,1,999,999,999,999,999}, new int[]{499,500,501}));
//        Solution476 s476 = new Solution476();
//        System.out.println(s476.findComplement(5));
//        Solution477 s477 = new Solution477();
//        System.out.println(s477.totalHammingDistance(new int[]{4,14,2}));

//        Solution482 s482 = new Solution482();
//        System.out.println(s482.licenseKeyFormatting("2-4A0r7-4k", 3));
//        Solution484 s484 = new Solution484();
//        int[] res = s484.findPermutation("IDIIDD");
//        Solution486 s486 = new Solution486();
//        System.out.println(s486.PredictTheWinner(new int[]{1,1,1}));

//        Solution487 s487 = new Solution487();
//        System.out.println(s487.findMaxConsecutiveOnes(new int[]{1,0,1,1,0,1}));
//        Solution490 s490 = new Solution490();
//        int[][] maze = new int[][]{
//                {0,0,1,0,0},
//                {0,0,0,0,0},
//                {0,0,0,1,0},
//                {1,1,0,1,1},
//                {0,0,0,0,0}
//        };
//        int[] start = new int[]{0,4};
//        int[] end = new int[]{4,4};
//        System.out.println(s490.hasPath(maze, start, end));
//        Solution494 s494 = new Solution494();
//        System.out.println(s494.findTargetSumWays(new int[]{1,1,1,1,1}, 3));
//        Solution496 s496 = new Solution496();
//        int[] res = s496.nextGreaterElement(
//                new int[] {4,1,2},
//                new int[] {1,3,4,2}
//        );
//        Solution497 s497 = new Solution497();
//        int[] res = s497.findDiagonalOrder(new int[][] {{1,2,3},{4,5,6},{7,8,9}});
//        TreeNode root = new TreeNode(1);
//        TreeNode right = new TreeNode(2);
//        TreeNode rightLeft = new TreeNode(2);
//        root.right = right;
//        right.left = rightLeft;
//        Solution501 s501 = new Solution501();
//        System.out.println(s501.findMode(root));

//        Solution505 s505 = new Solution505();
//        int[][] maze = new int[][]{
//                {0,0,1,0,0},
//                {0,0,0,0,0},
//                {0,0,0,1,0},
//                {1,1,0,1,1},
//                {0,0,0,0,0}
//        };
//        int[] start = new int[]{0,4};
//        int[] end = new int[]{4,4};
//        System.out.println(s505.shortestDistance(maze, start, end));

//        Solution508 s508 = new Solution508();
//        TreeNode root = new TreeNode(5);
//        TreeNode left = new TreeNode(2);
//        TreeNode right = new TreeNode(-5);
//        root.left = left;
//        root.right = right;
//        int[] res = s508.findFrequentTreeSum(root);
//        Solution516 s516 = new Solution516();
//        System.out.println(s516.longestPalindromeSubseq("bbbab"));
//        Solution518I s518 = new Solution518I();
//        System.out.println(s518.change(5, new int[] {1,2,5}));
//        Solution520 s520 = new Solution520();
//        System.out.println(s520.detectCapitalUse("ggg"));
//
//        Solution523 s523 = new Solution523();
//        System.out.println(s523.checkSubarraySum(new int[]{23,2,4,6,7}, 6));
//        Solution536 s536 = new Solution536();
//        TreeNode res = s536.str2tree("4(2(3))(6(5))");
//        Codec535 s535 = new Codec535();
//        String url = "https://leetcode.com/problems/design-tinyurl";
//        String shortUrl = s535.encode(url);
//        String convertedUrl = s535.decode(shortUrl);
//        System.out.println(url.equals(convertedUrl));

//        Solution538 s538 = new Solution538();
//        TreeNode root = new TreeNode(5);
//        TreeNode left = new TreeNode(2);
//        TreeNode right = new TreeNode(13);
//        root.left = left;
//        root.right = right;
//        TreeNode res = s538.convertBST(root);
//        Solution545 s545 = new Solution545();
//        TreeNode root = new TreeNode(1);
//        TreeNode right = new TreeNode(2);
//        TreeNode rightleft = new TreeNode(3);
//        TreeNode rightright = new TreeNode(4);
//        root.left = right;
//        right.right = rightleft;
////        right.right = rightright;
//        List<Integer> res = s545.boundaryOfBinaryTree(root);

//        Solution548 s548 = new Solution548();
//        System.out.println(s548.splitArray(new int[]{1,2,1,2,1,2,1}));
//        Solution557 s557 = new Solution557();
//        System.out.println(s557.reverseWords("Let's take LeetCode contest"));
//        Solution560 s560 = new Solution560();
//        System.out.println(s560.subarraySum(new int[]{1,1,1}, 2));

//        Solution567 s567 = new Solution567();
//        System.out.println(s567.checkInclusion("ab", "eidbaooo"));
//        Solution576 s576 = new Solution576();
//        System.out.println(s576.findPaths(8,7,16,1,5));
//        Solution581 s581 = new Solution581();
//        System.out.println(s581.findUnsortedSubarray(new int[]{2,1}));
//        Solution621 s621 = new Solution621();
//        System.out.println(s621.leastInterval(new char[]{'A','A','A','B','B','B'}, 2));
//        Solution625 s625 = new Solution625();
//        System.out.println(s625.smallestFactorization(9765625));
//        Solution630 s630 = new Solution630();
//
//        System.out.println(s630.scheduleCourse(new int[][]{{5,5},{4,6},{2,6}}));
//        Solution632 s632 = new Solution632();
//        List<List<Integer>> input = new ArrayList<>();
//        input.add(new ArrayList<>(Arrays.asList(4,10,15,24,26)));
//        input.add(new ArrayList<>(Arrays.asList(0,9,12,20)));
//        input.add(new ArrayList<>(Arrays.asList(5,18,22,30)));
//
//        int[] res = s632.smallestRange(input);

//        LogSystem635 s635 = new LogSystem635();
//        s635.put(1, "2017:01:01:23:59:59");
//        s635.put(2, "2017:01:01:22:59:59");
//        s635.put(3, "2016:01:01:00:00:00");
//        List<Integer> res1 = s635.retrieve("2016:01:01:01:01:01","2017:01:01:23:00:00","Year");
//        List<Integer> res2 = s635.retrieve("2016:01:01:01:01:01","2017:01:01:23:00:00","Hour");
//        Solution636 s636 = new Solution636();
//        int[] arr = s636.exclusiveTime(2, Arrays.asList("0:start:0","0:start:2","0:end:5","1:start:6","1:end:6","0:end:7"));
//        Solution638 s638 = new Solution638();
//        List<Integer> price = Arrays.asList(2,5);
//        List<Integer> needs = Arrays.asList(3,2);
//        List<Integer> sep1 = Arrays.asList(3,0,5);
//        List<Integer> sep2 = Arrays.asList(1,2,10);
//        List<List<Integer>> specials = new ArrayList<>();
//        specials.add(sep1);
//        specials.add(sep2);
//        System.out.println(s638.shoppingOffers(price, specials, needs));
//        Solution640 s640 = new Solution640();
//        System.out.println(s640.solveEquation("-x=1"));
//        Solution653 s653 = new Solution653();
//        TreeNode root = new TreeNode(5);
//        TreeNode left = new TreeNode(3);
//        TreeNode right = new TreeNode(6);
//        TreeNode leftleft = new TreeNode(2);
//        TreeNode leftright = new TreeNode(4);
//        TreeNode rightright = new TreeNode(7);
//        root.left = left;
//        root.right = right;
//        left.left = leftleft;
//        left.right = leftright;
//        right.right = right;
//        System.out.println(s653.findTarget(root, 9));
//        Solution656 s656 = new Solution656();
//        List<Integer> res = s656.cheapestJump(new int[]{1,2,4,-1,2}, 2);
//        Solution658 s658 = new Solution658();
//        List<Integer> res = s658.findClosestElements(
//                new int[]{0,0,1,2,3,3,4,7,7,8},3,5
//        );
//        Solution660 s660 = new Solution660();
//        System.out.println(s660.newInteger(10));

//        TreeNode root = new TreeNode(5);
//        TreeNode left = new TreeNode(3);
//        TreeNode right = new TreeNode(6);
//        TreeNode leftleft = new TreeNode(2);
//        TreeNode leftright = new TreeNode(4);
//        TreeNode rightright = new TreeNode(7);
//        root.left = left;
//        root.right = right;
//        left.left = leftleft;
//        left.right = leftright;
//        right.right = rightright;
//        Solution662 s662 = new Solution662();
//        System.out.println(s662.widthOfBinaryTree(root));
//        TreeNode root = new TreeNode(0);
//        root.left = new TreeNode(-1);
//        root.right = new TreeNode(1);
//        Solution663 s663 = new Solution663();
//        System.out.println(s663.checkEqualTree(root));
//        Solution665 s665 = new Solution665();
//        System.out.println(s665.checkPossibility(new int[]{2,3,3,2,4}));

//        TreeNode root = new TreeNode(2);
//        TreeNode left = new TreeNode(2);
//        TreeNode right = new TreeNode(5);
//        root.left = left;
//        root.right = right;
//        Solution671 s671 = new Solution671();
//        System.out.println(s671.findSecondMinimumValue(root));
//        Solution673 s673 = new Solution673();
//        System.out.println(s673.findNumberOfLIS(new int[]{1,2,4,3,5,4,7,2}));
//        MyCalendarTwo c2 = new MyCalendarTwo();
//        System.out.println(c2.book(10,20));
//        System.out.println(c2.book(50,60));
//        System.out.println(c2.book(10,40));
//        System.out.println(c2.book(5,15));
//        Solution726 s726 = new Solution726();
//        System.out.println(s726.countOfAtoms("K4(ON(SO3)2)2"));
//        Solution699 s699 = new Solution699();
//        int input[][] = { {1,2}, {2,3}, {6,1}};
//        List<Integer> res = s699.fallingSquares(input);
//        Solution719 s719 = new Solution719();
//        int[] input = new int[] {1,6,1};
//        System.out.println(s719.smallestDistancePair(input, 1));
//        MapSum mapSum = new MapSum();
//        mapSum.insert("aa", 3);
//        mapSum.sum("a");
//        mapSum.insert("aa", 2);
//        System.out.println(mapSum.sum("aa"));
//        Solution680 s680 = new Solution680();
//        System.out.println(s680.validPalindrome("abc"));
//        Solution681 s681 = new Solution681();
//        System.out.println(s681.nextClosestTime("19:34"));
//        Solution685 s685 = new Solution685();
//        int input[][] = {{2,1},{3,1},{4,2},{1,4}};
//        int[] res = s685.findRedundantDirectedConnection(input);
//        Solution688 s688 = new Solution688();
//        System.out.println(s688.knightProbability(3,2,0,0));
//        Solution001 s001 = new Solution001();
//        int[] res = s001.twoSum(new int[]{3,2,4}, 6);
//        Solution689 s689 = new Solution689();
//        int[] res = s689.maxSumOfThreeSubarrays(new int[]{1,2,1,2,6,7,5,1}, 2);
//        Solution692 s692 = new Solution692();
//        List<String> res = s692.topKFrequent(new String[]{"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"}, 4);
//        Solution696 s696 = new Solution696();
//        System.out.println(s696.countBinarySubstrings("00110"));
//        Solution697 s697 = new Solution697();
//        System.out.println(s697.findShortestSubArray(new int[] {1,2,2,3,1}));
//        Solutionfinddup s = new Solutionfinddup();
//        try {
//            s.groupFiles("");
//        } catch (Exception ex) {
//
//        }
//        Solution291_I s291 = new Solution291_I();
//        System.out.println(s291.wordPatternMatch("d", "ef"));
//        Solution_Merge sm = new Solution_Merge();
//        ArrayList<Solution_Merge.Interval> a = new ArrayList<>();
//        ArrayList<Solution_Merge.Interval> b = new ArrayList<>();
//        a.add(new Solution_Merge.Interval(0,2));
//        a.add(new Solution_Merge.Interval(5,10));
//        a.add(new Solution_Merge.Interval(16,20));
//        a.add(new Solution_Merge.Interval(25,26));
//        a.add(new Solution_Merge.Interval(28,30));
//        b.add(new Solution_Merge.Interval(1,5));
//        b.add(new Solution_Merge.Interval(11,12));
//        b.add(new Solution_Merge.Interval(14,18));
//        b.add(new Solution_Merge.Interval(20,23));
//        List<Solution_Merge.Interval> res = sm.and(a,b);

//        Solution140 s140 = new Solution140();
//        List<String> dict = Arrays.asList("cat", "cats", "and", "sand", "dog");
//        List<String> res = s140.wordBreak("catsanddog", dict);
//        Solution10 s10 = new Solution10();
//        System.out.println(s10.isMatch("ab", ".*d"));
//        Solution30 s30 = new Solution30();
//        List<Integer> res = s30.findSubstring("wordgoodgoodgoodbestword",
//                new String[]{"word","good","best","good"});

//        Solution31 s31 = new Solution31();
//        int[] input = new int[]{3,2,1};
//        s31.nextPermutation(input);

//        Solution32 s32 = new Solution32();
//        int res = s32.longestValidParentheses(")()())");
//        Solution41 s41 = new Solution41();
//        System.out.println(s41.firstMissingPositive(new int[] {-1,4,2,1,9,10}));
//        Solution68 s68 = new Solution68();
//        List<String> res = s68.fullJustify(new String[]{"a"}, 2);
//        Solution76 s76 = new Solution76();
//        System.out.println(s76.minWindow("a", "a"));

//        Solution84 s84 = new Solution84();
//        System.out.println(s84.largestRectangleArea(new int[] {2,1,5,6,2,3}));
//        Solution87 s87 = new Solution87();
//        System.out.println(s87.isScramble("ab", "ba"));
//        Solution132 s132 = new Solution132();
//        System.out.println(s132.minCut("aab"));
//
//        Permutation p = new Permutation();
//        List<String> l = p.findPerumation("banana");
//        SubString sub = new SubString();
//        System.out.println(sub.lastSub("banana"));
//        RoyalName rn = new RoyalName();
//        List<String> res = rn.sort(Arrays.asList("Louis IX", "John II", "Louis VIII", "John V"));

//        Queens q = new Queens();
//        System.out.println(q.countOfAttack(new int[] {4,5,1,3,7,8,2,6}));
//        S11 s11 = new S11();
//        System.out.println(s11.numberOfInterestring(87,88));
//
//        lines l = new lines();
//        List<String> input = new ArrayList<>();
//        input.add("Hello World");
//        input.add("CodeEval");
//        input.add("Quick Fox");
//        input.add("A");
//        input.add("San Francisco");
//        List<String> res = l.findLine(input);

//        count c = new count();
////        System.out.println(c.countLine("40 40 40 40 29 29 29 29 29 29 29 29 57 57 92 92 92 92 92 86 86 86 86 86 86 86 86 86 86"));
//        System.out.println(c.countLine("7"));
//        Kanpsack_x k = new Kanpsack_x();
//        int[] w = new int[]{1,3,4,5};
//        int[] v = new int[]{1,4,5,7};
//        System.out.println(k.max(w,v,7));
//        LongestCommonSubSequenc l = new LongestCommonSubSequenc();
//        System.out.println(l.find("abcdef", "acbcf"));
//        MatrixMultiple mm = new MatrixMultiple();
//        System.out.println(mm.find(new int[]{2,3,6,4,5}));

//        OptimalBST_II ob = new OptimalBST_II();
//        System.out.println(ob.find(new int[]{34,30,50,5}));//, new int[]{34,30,50,5}));

//        CoinChange cc = new CoinChange();
//        System.out.println(cc.minCountOfCoins(new int[]{7,2,3,6}, 13));
//        LongestPalindromicSubSequence_II lps = new LongestPalindromicSubSequence_II();
//        System.out.println(lps.find("agbdba"));
//        PalindromeSplit ps = new PalindromeSplit();
//        System.out.println(ps.find("abcbm"));

//        NoBST nb = new NoBST();
//        System.out.println(nb.find(2));
////        System.out.println(nb.findII(2));
//        InOrder io = new InOrder();
//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        root.left.right = new TreeNode(3);
//        List<Integer> list = io.traversal(root);

//        PhoneDirectory pd = new PhoneDirectory(3);
//        System.out.println(pd.get());
//        System.out.println(pd.get());
//        System.out.println(pd.check(2));
//        CanDrive cd = new CanDrive();
//        CanDrive.Interval i1 = new CanDrive.Interval(0,4);
//        CanDrive.Interval i2 = new CanDrive.Interval(5,9);
//        CanDrive.Interval i3 = new CanDrive.Interval(10,14);
//        CanDrive.Interval i4 = new CanDrive.Interval(15,19);
//        CanDrive.Interval i5 = new CanDrive.Interval(20,24);
//        List<CanDrive.Interval> log = new ArrayList<>();
//        log.add(i1);
//        log.add(i2);
//        log.add(i3);
//        log.add(i4);
//        log.add(i5);
//
////        CanDrive.Interval i1 = new CanDrive.Interval(0,12);
////        CanDrive.Interval i2 = new CanDrive.Interval(13,19);
////        List<CanDrive.Interval> log = new ArrayList<>();
////        log.add(i1);
////        log.add(i2);
//        System.out.println(cd.canDrive(log, 24));

//        printDiagnal pd = new printDiagnal();
//        int[][] input = new int[][]{{1,2,3}, {4,5,6}, {7,8,9}};
//        List<List<Integer>> res = pd.print(input);

//        Solution_X x = new Solution_X();
//        System.out.println(x.findTheFirstLarg(new int[] {1,3}, 2));
//        Solution224 s224 = new Solution224();
//        System.out.println(s224.calculate("(1+(4+5+2)-3)+(6+8)"));
//        Solution22 s22 = new Solution22();
//        try {
//            s22.work("/Users/davidduan/Untitled.txt");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        LowerMedian lm = new LowerMedian();
//        System.out.println(lm.find(10));
//        System.out.println(lm.find(6));
//        System.out.println(lm.find(12));
//        System.out.println(lm.find(8));

//        Solution301_x s301 = new Solution301_x();
//        List<String> res = s301.removeInvalidParentheses("()())()");
//        Solution439_X s439 = new Solution439_X();
//        System.out.println(s439.parseTernary("(T?(T?F:5):3)"));
//        Solution269_II s269 = new Solution269_II();
//        String res = s269.alienOrder(new String[]{"ab", "adc"});
//        Solution34 s34 = new Solution34();
//        int[] res = s34.searchRange(new int[]{1}, 18);

//        LRUCache lru = new LRUCache(2);
//        lru.put(1,1);
//        lru.put(2,2);
//        System.out.println(lru.get(1));
//        Solution127 s127 = new Solution127();
//        List<String> input = Arrays.asList("hot","dot","dog","lot","log","cog");
//        System.out.println(s127.ladderLength("hit", "cog", input));
//        Solution10_III s10 = new Solution10_III();
//        System.out.println(s10.isMatch("aa", "aa"));
//        Solution40 s40 = new Solution40();
//        List<List<Integer>> res = s40.combinationSum2(new int[]{10,1,2,7,6,1,5}, 8);
//        Solution755 s755 = new Solution755();
//        System.out.println(s755.reachNumber(3));

//        Solution126 s126 = new Solution126();
//        List<List<String>> res = s126.findLadders("hit", "cog", Arrays.asList("hot","dot","dog","lot","log","cog"));
//        try {
//            PrintWriter writer = new PrintWriter("/Users/davidduan/the-file-name.txt", "UTF-8");
//            writer.println("The first line");
//            writer.println("The second line");
//            writer.close();
//        } catch (Exception ex) {
//
//        }
//        Solution735 s735 = new Solution735();
//        int[] res = s735.asteroidCollision(new int[]{10,2,-5});

//        Crawler crawler = new Crawler();
//        crawler.craw();
//        SolutionTest st = new SolutionTest();
//        System.out.println(st.sumOfDiv(10));
//        Solution230 s230 = new Solution230();
//        TreeNode root = new TreeNode(2);
//        TreeNode left = new TreeNode(1);
//        root.left = left;
//        System.out.println(s230.kthSmallest(root, 1));
//        Solution739 s739 = new Solution739();
//        int[] res = s739.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73});
//        Solution315_II s315 = new Solution315_II();
//        List<Integer> res = s315.countSmaller(new int[]{5,2,6,1});
//        Solution_snap4 snap4 = new Solution_snap4();
//        System.out.println(snap4.findMAX(new int[]{1,2,3,4}));

//            TreeNode root = new TreeNode(2);
//            TreeNode left = new TreeNode(1);
//            TreeNode right = new TreeNode(4);
//            TreeNode rightleft = new TreeNode(3);
//            root.left = left;
//            root.right = right;
//            right.left = rightleft;
//            LeftIterator it = new LeftIterator(root);
//            while(it.hasNext()) {
//                System.out.println(it.getNext().val);
//            }
//        p1_AmicableNuber p1 = new p1_AmicableNuber();
////        Set<List<Integer>>res = p1.findAll(new int[] {220, 284});
//        Set<int[]> res = p1.find(1000);
//        p3 s = new p3();
//        System.out.println(s.find(new int[] {1,2,5,8}));

//        p4 s = new p4();
//        System.out.println(s.findMax(new int[] {1,2,3,4}));

//        p8_html_parser s = new p8_html_parser();
//        String[][] input = new String[][] {
//                {"html","open"},
//                {"user","open"},
//                {"id","open"},
//                {"aa","text"},
//                {"id","close"},
//                {"meta","open"},
//                {"bb","text"},
//                {"meta","close"},
//                {"user","close"},
//                {"html","close"}};
//        p8_html_parser.TreeNode res = s.buildTree(input);

//        p12_UglyNumber s = new p12_UglyNumber();
//        System.out.println(s.findnthII(7));

//        p29_332 s = new p29_332();
//        List<String> res = s.findItinerary(new String[][]{{"MUC","LHR"},{"JFK","MUC"},{"SFO","SJC"},{"LHR","SFO"}});

//        p7_hungarianAlgorithm s = new p7_hungarianAlgorithm();
//        System.out.println(s.findCost(new int[][]{{40,60,15}, {25,30,45},{55,30,25}}));

//        px_rotationArray s = new px_rotationArray();
//        System.out.println(s.searchII(new int[]{1,3}, 3));
//        px_WordLadderII s = new px_WordLadderII();
//        List<String> input = new ArrayList<>();
//        input.add("hot");
//        input.add("dot");
//        input.add("dog");
//        input.add("lot");
//        input.add("log");
//        input.add("cog");
//        List<List<String>> res = s.findLadders("hit", "cog", input);
//        p17_Solution s = new p17_Solution();
//        TreeNode res = s.buildTree(new int[]{1,2}, new int[]{2,1});
//        p6_Solution s = new p6_Solution();
//        s.takeIPRange(new String[] {"7.0.0.0/8", "10.3.0.0/16", "6.7.8.134/32"});
//        System.out.println(s.isBadIp("7.3.4.5"));
//        System.out.println(s.isBadIp("6.7.8.0"));
//        System.out.println(s.isBadIp("6.7.8.134"));
//        InMemeoryDB inDb = new InMemeoryDB();
//        try {
//            inDb.process();
//            System.out.println(inDb.getNumOfValue(1));
//            System.out.println(inDb.getNumOfValue(11));
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }
//        Solution_FindRange s = new Solution_FindRange();
//        int[] res = s.find(new int[] {1,2,5,8,9,16,19}, 2, 20);

//        Solution297_ub_hard_3 s = new Solution297_ub_hard_3();
//        TreeNode res = s.deserialize("1,2,3,null,null,4,5");
//        Solution_516_ub_11 s = new Solution_516_ub_11();
//        System.out.println(s.longestPalindromeSubseq("bbbb"));
//
//        Solution_207_ub21 s = new Solution_207_ub21();
//        System.out.println(s.canFinish(2, new int[][]{{0,1}, {1,0}}));

//        Solution139 s = new Solution139();
//        System.out.println(s.wordBreak("leetcode", Arrays.asList("leet", "code")));

//        Solution_33 s = new Solution_33();
//        System.out.println(s.search(new int[]{1,3,5},1));

//        Solution114 s = new Solution114();
//        TreeNode root = new TreeNode(5);
//        TreeNode left = new TreeNode(3);
//        TreeNode right = new TreeNode(6);
//        TreeNode leftleft = new TreeNode(2);
//        TreeNode leftright = new TreeNode(4);
//        TreeNode rightright = new TreeNode(7);
//        root.left = left;
//        root.right = right;
//        left.left = leftleft;
//        left.right = leftright;
//        right.right = rightright;
//        s.flatten(root);
//        Solution779 s = new Solution779();
//        System.out.println(s.kthGrammar(3,4));
//        Solution_781 s = new Solution_781();
//        System.out.println(s.numRabbits(new int[]{1,0,1,0,0}));
//        Solution780 s = new Solution780();
//        System.out.println(s.reachingPoints(9,10,9,19));
//        Solution777 s = new Solution777();
//        s.canTransform("X", "L");

//        Solution785 s = new Solution785();
//        int[][] input = new int[][]{{1,2,3}, {0,2}, {0,1,3}, {0,2}};
//        System.out.println(s.isBipartite(input));
//        Solution784 s = new Solution784();
//        List<String> res = s.letterCasePermutation("a1b2");
//        Pasico p = new Pasico();
//        p.print(6);
//        Solution788 s = new Solution788();
//        System.out.println(s.rotatedDigits(10));
        Solution787 s = new Solution787();
        int[][] flights = new int[][]{{0, 1, 100}, {1, 2, 100}, {0, 2, 500}};

        int cheapestPrice = s.findCheapestPrice(3, flights, 0, 2, 1);
    }
}

class Solution001_X {
    public int[] twoSum(int[] nums, int target) {
        Arrays.sort(nums);
        int l = 0;
        int r = nums.length-1;
        while(l < r) {
            int res = nums[l] + nums[r];
            if (res == target) {
                return new int[] {l,r};
            }
            if (res > target) {
                r--;
            } else {
                l++;
            }
        }
        return new int[]{l,r};
    }
}


// 10/6/17

class Solution279 {
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for(int j = 1; j<=n ; j++) {
            int min = Integer.MAX_VALUE;
            int k = 1;
            while(j - k*k >= 0) {
                min = Math.min(min, dp[j-k*k] + 1);
                k++;
            }
            dp[j] = min;
        }
        return dp[n];
    }
}

class Solution246 {
    public boolean isStrobogrammatic(String num) {
        Map<Character, Character> map = new HashMap<>();
        map.put('6', '9');
        map.put('9', '6');
        map.put('8', '8');
        map.put('1', '1');
        map.put('0', '0');

        for (int i = 0; i < num.length(); i++) {
            if (!map.keySet().contains(num.charAt(i)) ||
                num.charAt(num.length()-1-i) != map.get(num.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }

class Solution250 {
    public int countUnivalSubtrees(TreeNode root) {
        if (root == null) return 0;
        int[] res = dfs(root);
        return res[0];
    }

    private int[] dfs(TreeNode root) {
        if (root.left == null && root.right == null) {
            return new int[] {1, 1};
        }

        if (root.left != null && root.right == null) {
            int[] leftRe = dfs(root.left);
            if (root.left.val == root.val && leftRe[1] == 1) {
                return new int[] { leftRe[0]+1, 1};
            } else {
                return new int[] {leftRe[0], 0};
            }
        } else if (root.right != null && root.left == null) {
            int[] rightRe = dfs(root.right);
            if (root.right.val == root.val && rightRe[1] == 1) {
                return new int[] {rightRe[0]+1, 1};
            } else {
                return new int[] {rightRe[0], 0};
            }
        } else {
            int[] leftRe = dfs(root.left);
            int[] rightRe = dfs(root.right);
            if (root.left.val == root.val && root.right.val == root.val) {
                return new int[] {leftRe[0] + rightRe[0] + 1, 1};
            } else {
                return new int[] {leftRe[0] + rightRe[0], 0};
            }
        }
    }
}

//251
class Vector2D implements Iterator<Integer> {
    List<List<Integer>> mVec2d;
    int i = 0;
    int j = 0;
    public Vector2D(List<List<Integer>> vec2d) {
        mVec2d = vec2d;
    }

    @Override
    public Integer next() {
        if (hasNext()) {
            Integer res = mVec2d.get(i).get(j);
            j++;
            return res;
        }
        return Integer.MAX_VALUE;
    }

    @Override
    public boolean hasNext() {
        while(i != mVec2d.size() && j == mVec2d.get(i).size()) {
            if (j == mVec2d.get(i).size()) {
                i++;
                j= 0;
            }
        }
        return i != mVec2d.size();
    }
}

class Solution252 {
    class Interval {
        int start;
        int end;
        Interval() { start = 0; end = 0; }
        Interval(int s, int e) { start = s; end = e; }
    }
    public boolean canAttendMeetings(Interval[] intervals) {
        Comparator<Interval> cmp = new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start - o2.start;
            }
        };
        List<Interval> list = Arrays.asList(intervals);
        Collections.sort(list, cmp);
        for (int i = 1; i< list.size(); i++) {
            if (list.get(i).start >= list.get(i-1).start &&
                    list.get(i).start < list.get(i).end) {
                return false;
            }
        }
        return true;
    }
}

class Solution253 {
    class Point {
        public int time;
        public int start;
        Point(int t, int s) {
            time = t;
            start = s;
        }
    }
    public int minMeetingRooms(Solution252.Interval[] intervals) {
        List<Point> p = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            p.add(new Point(intervals[i].start, 1));
            p.add(new Point(intervals[i].end, -1));
        }

        Comparator<Point> cmp = new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                if (o1.time == o2.time) {
                    return o1.start - o2.start;
                }
                return o1.time - o2.time;
            }
        };

        Collections.sort(p, cmp);
        int count = 0;
        int res = 0;
        for (int i = 0; i< p.size(); i++) {
            if (p.get(i).start < 0) {
                count --;
            } else {
                count ++;
            }
            res = Math.max(count, res);
        }
        return res;
    }
}

class Solution254 {
    public List<List<Integer>> getFactors(int n) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        dfs(res, new ArrayList<>(), n, 2);
        return res;
    }

    private void dfs(List<List<Integer>> res, List<Integer> item, int n, int start) {
        if (n <=1) {
            if (item.size() > 1) {
                res.add(new ArrayList<>(item));
            }
        }
        for (int i = start; i<= n; i++) {
            if (n%i == 0) {
                item.add(i);
                dfs(res, item, n/i, i);
                item.remove(item.size()-1);
            }
        }
    }
}

class Solution255 {
    public boolean verifyPreorder(int[] preorder) {
        if (preorder.length == 0) return true;
        Stack<Integer> s = new Stack<>();
        int low = Integer.MIN_VALUE;
        for (int p : preorder) {
            if (p < low) {
                return false;
            }
            while(!s.empty() && p > s.peek()) {
                low = s.pop();
            }
            s.push(p);
        }
        return true;
    }
}

//10/7/17
class Solution256 {
    public int minCost(int[][] costs) {
        int m = costs.length;
        if (m == 0) return 0;
        int n = costs[0].length;
        if (n == 0) return 0;

        int[][] res = new int[m][n];
        res[0][0] = costs[0][0];
        res[0][1] = costs[0][1];
        res[0][2] = costs[0][2];
        for (int i = 1; i< m; i++) {
            res[i][0] = Math.min(res[i-1][1], res[i-1][2]) + costs[i][0];
            res[i][1] = Math.min(res[i-1][0], res[i-1][2]) + costs[i][1];
            res[i][2] = Math.min(res[i-1][0], res[i-1][1]) + costs[i][2];
        }
        return Math.min(Math.min(res[m-1][0], res[m-1][1]), res[m-1][2]);
    }
}

class Solution257 {
    public List<String> binaryTreePaths(TreeNode root) {
        Stack<TreeNode> s = new Stack<>();
        List<String> res = new ArrayList<>();
        if (root == null) return res;

        s.push(root);
        TreeNode pre = null;

        while(!s.isEmpty()) {
            TreeNode tmp = s.peek();
            if((tmp.left != pre && tmp.left !=null) &&
                    tmp.right == null || tmp.right != pre) {
                s.push(tmp.left);
                pre = null;
            } else if (tmp.right != pre && tmp.right !=null) {
                s.push(tmp.right);
                pre = null;
            } else {
                if (s.peek().left == null && s.peek().right == null) {
                    helper(res, s);
                }
                s.pop();
                pre = tmp;
            }
        }
        return res;
    }

    private void helper(List<String> res, Stack<TreeNode> s) {
        Stack<TreeNode> tmp = new Stack<>();
        while(!s.isEmpty()) {
            tmp.push(s.pop());
        }
        StringBuilder sb = new StringBuilder();
        while(!tmp.isEmpty()) {
            TreeNode top = tmp.pop();
            sb.append(String.valueOf(top.val));
            if (!tmp.isEmpty()) {
                sb.append("->");
            }
            s.push(top);
        }
        res.add(sb.toString());
        return;
    }
}

class Solution257_II {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        List<TreeNode> track = new ArrayList<>();
        if (root == null) {return res;}
        help(res, track, root);
        return res;
    }

    private void help(List<String> res, List<TreeNode> track, TreeNode root) {
        if (root.left == null && root.right == null) {
            StringBuilder sb = new StringBuilder();
            for (TreeNode n : track) {
                sb.append(String.valueOf(n.val));
                sb.append("->");
            }
            sb.append(root.val);
            res.add(sb.toString());
            return;
        }
        track.add(root);
        if (root.left != null) {
            help(res, track, root.left);
        }
        if (root.right != null) {
            help(res, track, root.right);
        }
        track.remove(track.size()-1);
    }
}

class Solution258 {
    public int addDigits(int num) {
        while(num > 9) {
            int res = 0;
            while(num>0){
                res += num%10;
                num =num/10;
            }
            num = res;
        }
        return num;
    }
}

class Solution259 {
    public int threeSumSmaller(int[] nums, int target) {
        int res = 0;
        Arrays.sort(nums);
        for (int i = 0; i< nums.length-2; i++) {
            int j = i+1;
            int k = nums.length-1;
            while(j<k) {
                if (nums[i] + nums[j] + nums[k] < target) {
                    res += k -j;
                    j++;
                } else {
                    k--;
                }
            }
        }
        return res;
    }
}

class Solution260 {
    public int[] singleNumber(int[] nums) {
        int[] res = new int[2];
        if (nums.length < 2) {return res;}
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            if (set.contains(n)) {
                set.remove(n);
            } else {
                set.add(n);
            }
        }
        Object[] tmp = set.toArray();
        res[0] = (int)tmp[0];
        res[1] = (int)tmp[1];
        return res;
    }
}

class Solution261 {
    public boolean validTree(int n, int[][] edges) {
        Map<Integer, List<Integer>> g = new HashMap<>();
        for (int i = 0; i < n; i++) {
            g.put(i, new ArrayList<>());
            for (int j = 0; j < edges.length; j++) {
                if (edges[j][0] == i) {
                    g.get(i).add(edges[j][1]);
                } else if (edges[j][1] == i) {
                    g.get(i).add(edges[j][0]);
                }
            }
        }
        List<Integer> track = new ArrayList<>();
        Set<Integer> visited = new HashSet<>();
        track.add(0);
        visited.add(0);
        if (!gfs(g, track, visited, -1, 0)) {
            return false;
        }
        track.remove(0);
        if (visited.size() != n) {
            return  false;
        }
        return true;
    }

    private boolean gfs(Map<Integer, List<Integer>> g,
                     List<Integer> track,
                     Set<Integer> visited,
                     int parent,
                     int node) {
        for(int k : g.get(node)) {
            if (k!= parent) {
                if (track.contains(k)) {
                    return false;
                }
                track.add(k);
                visited.add(k);
                if (!gfs(g, track, visited, node, k)) {
                    return false;
                }
                track.remove(track.size()-1);
            }
        }
        return true;
    }
}

class Solution261_I {
    public boolean validTree(int n, int[][] edges) {
        int[] track = new int[n];
        Arrays.fill(track, -1);

        for (int i = 0; i < edges.length; i++) {
            int x = find(track, edges[i][0]);
            int y = find(track, edges[i][1]);

            if (x == y) return false;

            track[x] = y;
        }

        return edges.length == n-1;
    }

    private int find(int[] tracker, int i) {
        if (tracker[i] == -1) {
            return i;
        }
        return find(tracker, tracker[i]);
    }
}

class Solution263 {
    public boolean isUgly(int num) {
        if (num <= 0) return false;
        while(num%2 == 0) {
            num /=2;
        }

        while(num%3 == 0) {
            num /= 3;
        }

        while(num%5 == 0) {
            num /= 5;
        }
        return num == 1;
    }
}

class Solution264 {
    public int nthUglyNumber(int n) {
        int[] res = new int[n];
        res[0] = 1;
        int i2 = 0;
        int i3 = 0;
        int i5 = 0;
        for (int i = 1; i < n; i++) {
            int m2 = res[i2] * 2;
            int m3 = res[i3] * 3;
            int m5 = res[i5] * 5;
            int mn = Math.min(m2, Math.min(m3, m5));
            if (mn == m2) i2++;
            if (mn == m3) i3++;
            if (mn == m5) i5++;
            res[i] = mn;
        }
        return res[n-1];
    }
}

class Solution265 {
    public int minCostII(int[][] costs) {
        int m = costs.length;
        if (m == 0) return 0;
        int n = costs[0].length;
        if (n ==0) return 0;
        int res[][] = new int[m][n];
        for (int j = 0;j< n; j++) {
            res[0][j] =costs[0][j];
        }

        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n ; j++) {
                int count = Integer.MAX_VALUE;
                for (int k = 0; k < n ;k ++) {
                    if (j != k) {
                        count = Math.min(count, res[i-1][k]+costs[i][j]);
                    }
                }
                res[i][j] = count;
            }
        }

        int resVal = Integer.MAX_VALUE;
        for (int j = 0; j< n; j++) {
            resVal = Math.min(resVal, res[m-1][j]);
        }
        return resVal;
    }
}

class Solution266 {
    public boolean canPermutePalindrome(String s) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i< s.length(); i++) {
            char c = s.charAt(i);
            if (set.contains(c)) {
                set.remove(c);
            } else {
                set.add(c);
            }
        }
        return set.size() <= 1;
    }
}

class Solution267 {
    public List<String> generatePalindromes(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i< s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c)+1);
            } else {
                map.put(c, 1);
            }
        }

        List<Character> list = new ArrayList<>();
        String mid = "";
        int countOfOdd = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()){

            for (int i = 0;i< entry.getValue()/2; i++) {
                list.add(entry.getKey());
            }
            if (entry.getValue()%2 != 0) {
                mid += entry.getKey();
                countOfOdd++;
            }
        }
        List<String> res = new ArrayList<>();
        if (countOfOdd > 1) {
            return res;
        }
        boolean[] visisted = new  boolean[list.size()];
        helper(res, list, visisted, mid, new StringBuilder());
        return res;
    }

    private void helper(
            List<String> res,
            List<Character> list,
            boolean[] visited,
            String mid,
            StringBuilder sb) {
        if (sb.length() == list.size()) {
            res.add(sb.toString() + mid + sb.reverse().toString());
            sb.reverse();
            return;
        }

        for (int i = 0; i < list.size(); i++) {
            if (i>0 && list.get(i) == list.get(i-1) && !visited[i-1]) {
                continue;
            }

            if (!visited[i]) {
                visited[i] = true;
                sb.append(list.get(i));
                helper(res, list, visited, mid, sb);
                visited[i] = false;
                sb.deleteCharAt(sb.length()-1);
            }
        }
    }
}

class Solution268 {
    public int missingNumber(int[] nums) {
        long sum = 0;
        for (int i : nums) {
            sum += i;
        }
        long target = (nums.length + 0)* (nums.length+1) / 2;
        return (int)(target - sum);
    }
}

class Solution269 {
    public String alienOrder(String[] words) {
        List<Set<Character>> order = new ArrayList<Set<Character>>(26);
        for (int i = 0;i< 26; i++) {
            order.add(null);
        }
        for (int i = 0; i < words.length-1; i++) {
            int min = Math.min(words[i].length(), words[i+1].length());
            for (int j = 0; j < min; j++) {
                if (order.get(words[i+1].charAt(j)-'a') == null) {
                    order.set(words[i+1].charAt(j)-'a', new HashSet<>());
                }
                if (words[i].charAt(j) != words[i+1].charAt(j)) {
                    order.get(words[i+1].charAt(j) - 'a').add(words[i].charAt(j));
                }
            }
        }
        boolean[] visited = new boolean[26];
        boolean[] visiting = new boolean[26];
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (order.get(i) != null) {
                if (!dfs(res, order, visited, visiting, i)) {
                    return "";
                }
            }
        }
        return res.toString();
    }

    private boolean dfs(StringBuilder res,
                     List<Set<Character>> order,
                     boolean[] visited,
                     boolean[] visiting,
                     int start) {
        if (visited[start]) { return true;}
        if (visiting[start])  {return false;}

        visiting[start] = true;
        if (order.get(start) != null) {
            for (char c : order.get(start)) {
                if (!dfs(res, order, visited, visiting, c - 'a')) {
                    return false;
                }
            }
        }
        visiting[start] = false;
        visited[start] = true;
        res.append((char)('a' + start));
        return true;
    }
}

class Solution270 {
    public int closestValue(TreeNode root, double target) {
        return (int)closestValueL(root, target);
    }

    public long closestValueL(TreeNode root, double target) {
        if (root == null) {
            return Long.MAX_VALUE;
        }
        long left = closestValueL(root.left, target);
        long right = closestValueL(root.right, target);
        long res = 0;
        if (Math.abs(left - target) < Math.abs(right - target)) {
            res = left;
        } else {
            res = right;
        }
        if (Math.abs(res-target) > Math.abs(root.val - target)) {
            res = root.val;
        }
        return res;
    }
}

class Codec271 {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        if (strs == null || strs.size() == 0) return null;
        StringBuilder sb = new StringBuilder();
        for (String s: strs) {
            sb.append(s.length()).append("/").append(s);
        }
        return sb.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        List<String> res = new ArrayList<>();
        int i = 0;
        while(i < s.length()) {
            int j = s.indexOf('/', i);
            int length = Integer.parseInt(s.substring(i, j));
            res.add(s.substring(j+1, j+1+length));
            i = j+length+ 1;
        }
        return res;
    }
}

class Solution272 {
    public List<Integer> closestKValues(TreeNode root, double target, int k) {
        Comparator<Integer> cmp = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (Math.abs((long) o1 - target) - Math.abs((long) o2 - target) < 0) {
                    return -1;
                } else {
                    return 1;
                }
            }
        };
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        closestValueL(root, pq, k, target);

        List<Integer> res = new ArrayList<>();
        for(Integer i : pq) {
            res.add(i);
        }
        return res;
    }

    public void closestValueL(TreeNode root,
                              PriorityQueue<Integer> pq,
                              int k,
                              double target) {
        if (root == null) {
            return;
        }

        if (pq.size() < k) {
            pq.add(root.val);
        } else {
            int pqval = pq.peek();
            if (Math.abs(root.val - target) < Math.abs(pqval - target)){
                pq.remove();
                pq.add(root.val);
            }
        }

        closestValueL(root.left, pq, k, target);
        closestValueL(root.right, pq, k, target);

    }
}

class Solution273 {

    private final String[] belowTen = new String[] {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    private final String[] belowTwenty = new String[] {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private final String[] belowHundred = new String[] {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    public String numberToWords(int num) {
        if (num == 0) {
            return "Zero";
        }
        return parse2dig(num);
    }

    private String parse2dig(int input) {
        String res = new String();
        if (input < 10) {res = belowTen[input];}
        else if (input < 20) {res = belowTwenty[input];}
        else if (input < 100) {res = belowHundred[input/10] + " " + belowTen[input%10];}
        else if (input < 1000) { res = belowTen[input/100] + " Hundred " + parse2dig(input%100);}
        else if (input < 1000000) {
            res = parse2dig(input/1000) + " Thousand " + parse2dig(input %1000);
        }
        else if (input < 1000000000) {
            res = parse2dig(input/1000000) + " Million " + parse2dig(input %1000000);
        } else  {
            res = parse2dig(input / 1000000000) + " Billion " + parse2dig(input % 1000000000);
        }
        return res.trim();
    }
}

class Solution274_275 {
    public int hIndex(int[] citations) {
        int m = citations.length;
        Arrays.sort(citations);
        int citation = 0;
        for (int i = 0; i < m; i++) {
            if (citations[m-1-i] >= i+1) {
                citation = i+1;
            } else {
                break;
            }
        }
        return citation;
    }
}

class Solution276 {
    public int numWays(int n, int k) {
        if (n == 1) return k;
        int same = k;
        int diff = k * (k-1);
        int i = 1;
        while(i< n) {
            int tmp = diff;
            diff = (same+ diff) * (k-1);
            same = tmp;
        }
        return same+diff;
    }
}

class Solution278 { //extends VersionControl {
    public int firstBadVersion(int n) {
        int l = 1;
        int r =n;
        while(l<r) {
            int mid = l + (r-l)/2;
            if (isBadVersion(mid)) {
                r = mid - 1;
            } else {
                l = mid;
            }
        }
        return l;
    }

    private boolean isBadVersion(int n) {
        return n>=2;
    }
}

//10/8/17
class Solution280 {
    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        for (int i = 2; i < nums.length-1; i = i+2) {
            int tmp = nums[i];
            nums[i] = nums[i+1];
            nums[i+1] = tmp;

        }
    }
}

class Solution277 {//extends Relation {
    public int findCelebrity(int n) {
        int a = 0;
        for (int i = 0; i < n; i++) {
            if (a != i && knows(a, i)) {
                a = i;
            }
        }
        for (int i = 0; i< n; i++) {
            if (i != a && (knows(a,i) || !knows(i,a))) return -1;
        }
        return a;
    }

    boolean knows(int a, int b) {
        if (a == 0 && b ==1) return true;
        if (a == 1 && b ==0) return false;
        return false;
    }
}

class ZigzagIterator { //281
    int i = 0;
    int indexes[];
    List<List<Integer>> t;
    int m;
    public ZigzagIterator(List<Integer> v1, List<Integer> v2) {
        t = new ArrayList<>();
        t.add(v1);
        t.add(v2);
        m = t.size();
        indexes = new int[m];
    }

    public int next() {
        if (hasNext()) {
            int res = t.get(i).get(indexes[i]);
            indexes[i]++;
            i = (i+1) %m;
            return res;
        }
        return -1;
    }

    public boolean hasNext() {
        int count = 0;
        while(indexes[i] >= t.get(i).size()) {
            if (count >= m) { return false;}
            i = (i+1)%m;
            count ++;
        }
        return true;
    }
}

class Solution282 {
    public List<String> addOperators(String num, int target) {
        List<String> res = new ArrayList<>();
        if (num == null || num.length() == 0) return res;
        dfs(res, "", num, target, 0,0,0);
        return res;
    }

    private void dfs(List<String> res,
                     String path,
                     String num,
                     int target,
                     int pos,
                     long eval,
                     long multed) {
        if (pos == num.length()) {
            if (target == eval) {
                res.add(path);
            }
        }
        for(int i = pos; i < num.length(); i++) {
            if (i != pos && num.charAt(pos) == '0') break;
            long cur = Long.parseLong(num.substring(pos, i+1));
            if (pos == 0) {
                dfs(res, path + cur, num, target, i+1, cur, cur);
            } else {
                dfs(res, path + "+" + cur, num, target, i+1, eval+cur, cur);
                dfs(res, path + "-" + cur, num, target, i+1, eval-cur, -cur);
                dfs(res, path + "*" + cur, num, target, i+1, eval- multed + multed * cur, multed * cur);
            }

        }
    }
}

class Solution284 {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int j = 0;
        while(i< nums.length && nums[i] != 0) {
            i++;j++;
        }
        while (j < nums.length) {
            while(j< nums.length && nums[j] == 0) {j++;}
            if (j<nums.length) {
                nums[i++]= nums[j];
                nums[j] = 0;
                j++;
            }
        }
    }
}

class PeekingIterator implements Iterator<Integer> {
    private Integer next;
    private Iterator<Integer> mIterator;

    public PeekingIterator(Iterator<Integer> iterator) {
        mIterator = iterator;
        next = null;
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        if (next == null) {
            if (hasNext()) {
                next = mIterator.next();
            }
        }
        return next;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        Integer res = peek();
        next = null;
        return res;
    }

    @Override
    public boolean hasNext() {
        if (next != null) {
            return true;
        }
        return mIterator.hasNext();
    }
}

class Solution285 {
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        if (root == null || p == null) return null;
        TreeNode next = null;
        if (p.right != null) {
            next = p.right;
            while(next.left != null) {
                next = next.left;
            }
            return next;
        }

        while(root != null && root != p) {
            if (root.val > p.val) {
                next = root;
                root = root.left;
            } else {
                root = root.right;
            }
        }
        if (root == null) return null;
        return next;
    }
}

class Solution286 {
    class Point{
        int x,y;
        public Point(int a, int b) { x = a; y = b; }
    }

    public void wallsAndGates(int[][] rooms) {
        int m = rooms.length;
        if (m == 0) return;
        int n = rooms[0].length;
        if (n == 0) return;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (rooms[i][j] == 0) {
                    bfs(rooms, i, j);
                }
            }
        }
    }

    private void bfs(int[][] rooms, int i, int j) {
        Queue<Point> p = new LinkedList<>();
        int m = rooms.length;
        int n = rooms[0].length;
        p.add(new Point(i,j));
        p.add(null);
        int dist = 0;
        while(!p.isEmpty()) {
            Point tmp = p.poll();
            if (tmp == null) {
                if (!p.isEmpty()) {
                    p.add(null);
                }
                dist++;
                continue;
            }
            int x = tmp.x;
            int y = tmp.y;
            if (rooms[x][y] > dist) {
                rooms[x][y] = dist;
            }
            if (x-1>=0 && rooms[x-1][y] > dist+1) {
                p.add(new Point(x-1, y));
            }
            if (x+1<m && rooms[x+1][y] > dist+1) {
                p.add(new Point(x+1, y));
            }
            if (y-1>=0 && rooms[x][y-1] > dist+1) {
                p.add(new Point(x, y-1));
            }
            if (y+1<n && rooms[x][y+1] > dist+1) {
                p.add(new Point(x, y+1));
            }
        }
    }
}

class Solution287 { // this question need redo... still not quite under stand the logic
    public int findDuplicate(int[] nums) {
        if (nums.length > 1)
        {
            int slow = nums[0];
            int fast = nums[nums[0]];
            while (slow != fast)
            {
                slow = nums[slow];
                fast = nums[nums[fast]];
            }

            fast = 0;
            while (fast != slow)
            {
                fast = nums[fast];
                slow = nums[slow];
            }
            return slow;
        }
        return -1;
    }
}

class ValidWordAbbr { //288

    Map<String, Integer> map = new HashMap<>();
    Set<String> dict = new HashSet<>();

    public ValidWordAbbr(String[] dictionary) {
        for (String s : dictionary) {
            if(!dict.contains(s)) {
                String abb = abb(s);
                map.put(abb, map.getOrDefault(abb, 0) + 1);
                dict.add(s);
            }
        }
    }

    public boolean isUnique(String word) {
        String abb = abb(word);
        if (dict.contains(word)) {
            return map.getOrDefault(abb, 0) == 1;
        }
        return map.getOrDefault(abb, 0) == 0;
    }

    private String abb(String s) {
        if (s.length() <=2) return s;
        StringBuilder sb = new StringBuilder();
        int length = s.length()-2;
        sb.append(s.charAt(0));
        if (length > 0) {
            sb.append(String.valueOf(length));
        }
        sb.append(s.charAt(s.length()-1));
        return sb.toString();
    }
}

class Solution289 {
    public void gameOfLife(int[][] board) {
        int m = board.length;
        if (m == 0) return;
        int n = board[0].length;
        if (n == 0) return;
        int[][] nextgen = new int[m][n];
        for (int i = 0; i< m; i++) {
            for (int j = 0; j < n ; j++) {
                int neib = findNeighbor(board, i, j);
                if (neib < 2) {nextgen[i][j] = 0;}
                else if (neib == 2) {nextgen[i][j] = board[i][j];}
                else if (neib == 3) {nextgen[i][j] = 1;}
                else {nextgen[i][j] = 0;}
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j< n; j++) {
                board[i][j] = nextgen[i][j];
            }
        }
    }

    private int findNeighbor(int[][] board, int i, int j) {
        int m = board.length;
        int n = board[0].length;
        int res = 0;
        for (int x = i-1; x<=i+1; x++) {
            for (int y = j-1; y<=j+1; y++ ) {
                if (x >=0 && x < m && y>=0 && y < n && !(x ==i && y == j)) {
                    res += board[x][y] == 1 ? 1 : 0;
                }
            }
        }
        return res;
    }
}

class Solution290 {
    public boolean wordPattern(String pattern, String str) {
        if (pattern.length() == 0) return false;
        String[] tokens = str.split(" ");
        if (tokens.length != pattern.length()) {return false;}
        Map<Character, String> map = new HashMap<>();
        for (int i= 0; i<pattern.length(); i++) {
            if (!map.containsKey(pattern.charAt(i))) {
                map.put(pattern.charAt(i), tokens[i]);
            } else {
                if (!map.get(pattern.charAt(i)).equals(tokens[i])) {
                    return false;
                }
            }
        }

        Map<String, Character> m2 = new HashMap<>();
        for (int i = 0; i < pattern.length();i++) {
            if(!m2.containsKey(tokens[i])) {
                m2.put(tokens[i], pattern.charAt(i));
            } else {
                if (!m2.get(tokens[i]).equals(pattern.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }
}

class Solution292 {
    public boolean canWinNim(int n) {
        if (n<4) return true;
        return n%4 != 0;
    }
}

class Solution293 {
    public List<String> generatePossibleNextMoves(String s) {
        List<String> res = new ArrayList<>();
        if (s.length() == 0) return res;
        char[] chars = s.toCharArray();
        for (int i = 0; i< chars.length -1; i = i+2) {
            if (chars[i] == '+' && chars[i+1] == '+'){
                chars[i] = '-';
                chars[i + 1] = '-';
                res.add(String.valueOf(chars));
                chars[i] = '+';
                chars[i + 1] = '+';
            }
        }
        return res;
    }
}

class Solution294 {
    public boolean canWin(String s) {
        for (int i= 0; i< s.length()-1; i++) {
             if (s.charAt(i) == '+' && s.charAt(i+1) == '+') {
                 if (!canWin(s.substring(0,i) +"--" + s.substring(i+2))) {
                     return  true;
                 }
             }
        }
        return false;
    }
}

class Solution299 {
    public String getHint(String secret, String guess) {
        Map<Character, Integer> gMap = new HashMap<>();
        int bull = 0;
        for (int i = 0;i< secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                bull++;
                continue;
            }

            int gl = 0;
            if (gMap.containsKey(guess.charAt(i))) {
                gl = gMap.get(guess.charAt(i));
            }
            gl++;
            gMap.put(guess.charAt(i), gl);
        }
        int cow = 0;
        for (int i = 0; i< secret.length(); i++) {
            if(secret.charAt(i) == guess.charAt(i)) {
                continue;
            }
            int gl = gMap.getOrDefault(secret.charAt(i), 0);
            if (gl == 0) {continue;};
            if (gl > 0) {
                cow ++;
                gl--;
                gMap.put(secret.charAt(i), gl);
            }
        }
        StringBuilder res = new StringBuilder();
        res.append(String.valueOf(bull));
        res.append("A");
        res.append(String.valueOf(cow));
        res.append("B");
        return res.toString();
    }
}

class Solution300 {
    public int lengthOfLIS(int[] nums) {
        int m = nums.length;
        if (m == 0) return 0;
        int[] dp = new int[m];
        dp[0] = 1;
        for (int i = 1; i< nums.length;i++) {
            int tmp = 1;
            for (int j = 0; j< i;j++) {
                if (nums[i] > nums[j]) {
                    tmp = Math.max(dp[j]+1, tmp);
                }
            }
            dp[i] = tmp;
        }
        int res = 0;
        for (int i = 0;i<dp.length;i++) {
            res = Math.max(res, dp[i]);
        }
        return res;
    }
}

class Solution298 {
    public int longestConsecutive(TreeNode root) {
        if (root == null) return 0;
        List<Integer> t = new ArrayList<>();
        return longest(root, t);
    }

    public int longest(TreeNode root, List<Integer> tracker) {
        if (root == null) {
            return calculate(tracker);
        }
        tracker.add(root.val);
        int left = longest(root.left, tracker);
        int right = longest(root.right, tracker);
        tracker.remove(tracker.size()-1);
        return Math.max(left, right);
    }

    private int calculate(List<Integer> t)
    {
        int res = 0;
        int tmp = 1;
        for (int i = 1;i< t.size();i++) {
            if (t.get(i)-t.get(i-1) ==1) {
                tmp++;
            } else {
                tmp = 1;
            }
            res = Math.max(res, tmp);
        }
        res = Math.max(res, tmp);
        return res;
    }
}

// 10/9/17
class MedianFinder { // 295
    PriorityQueue<Integer> maxHeap;
    PriorityQueue<Integer> minHeap;

    /** initialize your data structure here. */
    public MedianFinder() {
        Comparator<Integer> minCmp = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        };
        Comparator<Integer> maxCamp = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        };
        minHeap = new PriorityQueue<>(minCmp);
        maxHeap = new PriorityQueue<>(maxCamp);
    }

    public void addNum(int num) {
        int minSize = minHeap.size();
        int maxSize = maxHeap.size();

        if (minSize == 0 && maxSize == 0) {
            minHeap.add(num);
            return;
        }

        if (maxSize == 0) {
            if (num < minHeap.peek()) {
                maxHeap.add(num);
            } else {
                maxHeap.add(minHeap.poll());
                minHeap.add(num);
            }
            return;
        }

        int minHeapValue = minHeap.peek();
        int maxHeapValue = maxHeap.peek();

        if (num >= maxHeapValue) {
            minHeap.add(num);
            minSize++;
        } else if (num <= minHeapValue) {
            maxHeap.add(num);
            maxSize++;
        }

        if (minSize - maxSize > 1) {
            maxHeap.add(minHeap.poll());
        } else if (maxSize - minSize > 1) {
            minHeap.add(maxHeap.poll());
        }
    }

    public double findMedian() {
        int minSize = minHeap.size();
        int maxSize = maxHeap.size();

        if (minSize == 0 && maxSize == 0) {
            return 0;
        }
        if (minSize == 0 && maxSize != 0) {
            return maxHeap.peek();
        }
        if (maxSize == 0 && minSize != 0) {
            return minHeap.peek();
        }

        if (minSize > maxSize) {
            return minHeap.peek();
        } else if (maxSize > minSize) {
            return maxHeap.peek();
        } else {
            int a = minHeap.peek();
            int b = maxHeap.peek();
            return ((double)a + (double)b)/2.0;
        }
    }
}

class Solution296 {
    public int minTotalDistance(int[][] grid) {
        int m = grid.length;
        if (m == 0) return 0;
        int n = grid[0].length;
        if (n == 0) return 0;

        boolean[][] home = new boolean[m][n];
        for (int i = 0; i< m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    grid[i][j] = -1;
                } else if (grid[i][j] == 2) {
                    grid[i][j] = -2;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j< n; j++) {
                if (grid[i][j] != -1) {
                    continue;
                }
                clearHome(home);
                Queue<int[]> q = new LinkedList<>();
                q.add(new int[]{i,j});
                q.add(null);
                int dist = 0;
                while(!q.isEmpty()) {
                    int[] tmp = q.poll();
                    if (tmp == null) {
                        if (!q.isEmpty()) {
                            q.add(null);
                        } else {
                            if (dist == 0) return -1;
                        }
                        dist++;
                        continue;
                    }
                    int x = tmp[0];
                    int y = tmp[1];
                    grid[x][y] += dist;

                    if (x-1>=0 && !home[x-1][y] && grid[x-1][y] >= 0) {
                        q.add(new int[]{x-1, y});
                        home[x-1][y] = true;
                    }
                    if (x+1<m && !home[x+1][y] && grid[x+1][y] >= 0) {
                        q.add(new int[]{x+1, y});
                        home[x+1][y] = true;
                    }
                    if (y-1>=0 && !home[x][y-1] && grid[x][y-1] >= 0) {
                        q.add(new int[] {x, y-1});
                        home[x][y-1] = true;
                    }
                    if (y+1<n && !home[x][y+1] && grid[x][y+1] >= 0) {
                        q.add(new int[] {x, y+1});
                        home[x][y+1] = true;
                    }
                }
                if (dist == 0) return -1;
            }
        }

        int mindis = Integer.MAX_VALUE;
        for (int i = 0; i< m; i++) {
            for (int j = 0; j< n; j++) {
                if (grid[i][j] <= 0 ) {
                    continue;
                }
                mindis = Math.min(mindis, grid[i][j]);
            }
        }
        return mindis == Integer.MAX_VALUE ? -1 : mindis;
    }

    private void clearHome(boolean[][] home) {
        int m = home.length;
        int n = home[0].length;
        for (int i = 0; i< m; i++) {
            for (int j = 0; j< n; j++) {
                home[i][j] = false;
            }
        }
    }
}

//10/10/17
class Codec { //297

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        build(sb, root);
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();

    }
    private void build(StringBuilder sb, TreeNode root) {
        if (root == null) {
            sb.append("null");
            sb.append(",");
            return;
        }
        sb.append(String.valueOf(root.val));
        sb.append(",");
        build(sb, root.left);;
        build(sb, root.right);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Deque<String> d = new LinkedList<>(Arrays.asList(data.split(",")));
        return create(d);
    }

    private TreeNode create(Deque<String> d) {
        String s = d.pollFirst();
        if (s.equals("null")) {
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(s));
        root.left = create(d);
        root.right = create(d);
        return root;

    }
}

class Solution291 {
    Map<Character, String> map = new HashMap<>();
    Set<String> set = new HashSet<>();

    public boolean wordPatternMatch(String pattern, String str) {
        if (pattern.isEmpty()) return str.isEmpty();
        if (map.containsKey(pattern.charAt(0))) {
            String value = map.get(pattern.charAt(0));
            if (str.length() < value.length() ||
                    !str.substring(0, value.length()).equals(value)){
                return false;
            }
            if (wordPatternMatch(pattern.substring(1), str.substring(value.length()))) {
                return true;
            }
        } else {
            for (int i = 1; i<= str.length(); i++) {
                if (set.contains(str.substring(0, i))) {
                    continue;
                }
                map.put(pattern.charAt(0), str.substring(0, i));
                set.add(str.substring(0, i));
                if (wordPatternMatch(pattern.substring(1), str.substring(i))) {
                    return true;
                }
                set.remove(str.substring(0,i));
                map.remove(pattern.charAt(0));
            }
        }
        return false;
    }
}

class Solution302 {
    class Point {
        int x, y;
        public Point(int a, int b) {x = a; y = b;}
    }

    public int minArea(char[][] image, int x, int y) {
        int m = image.length;
        if (m == 0) return 0;
        int n = image[0].length;
        if (n == 0) return 0;
        int left = Integer.MAX_VALUE;
        int right = Integer.MIN_VALUE;
        int top = Integer.MAX_VALUE;
        int bottom = Integer.MIN_VALUE;
        Queue<Point> q = new LinkedList<>();
        q.add(new Point(x,y));
        image[x][y] = '0';
        while(!q.isEmpty()) {
            Point cur = q.poll();
            int i = cur.x;
            int j = cur.y;
            left = Math.min(left, i);
            right = Math.max(right, i);
            top = Math.min(j, top);
            bottom = Math.max(j, bottom);

            if (i-1 >= 0  && image[i-1][j] == '1') {
                q.add(new Point(i-1, j));
                image[i-1][j] = '0';
            }
            if (i+1 < m && image[i+1][j] == '1') {
                q.add(new Point(i+1, j));
                image[i+1][j] = '0';
            }
            if (j-1 >= 0 && image[i][j-1] == '1') {
                q.add(new Point(i, j-1));
                image[i][j-1] = '0';
            }
            if (j+1 < n && image[i][j+1] == '1') {
                q.add(new Point(i, j+1));
                image[i][j+1] = '0';
            }
        }
        return (right-left+1) * (bottom - top+1);
    }
}

class NumArray { //303
    int[] sum;
    public NumArray(int[] nums) {
        int m = nums.length;
        if (m == 0) return;
        sum = new int[m];
        sum[0] = nums[0];
        for (int i = 1; i< m; i++) {
            sum[i] = nums[i] + sum[i-1];
        }
    }

    public int sumRange(int i, int j) {
        if (i == 0) {
            return sum[j];
        } else {
            return sum[j] - sum[i-1];
        }
    }
}

class NumMatrix { //304
    int[][] sum;
    public NumMatrix(int[][] matrix) {
        int m = matrix.length;
        if (m == 0) {return;}
        int n = matrix[0].length;
        if (n == 0) {return;}
        sum = new int[m][n];
        sum[0] = matrix[0];
        for (int i = 1; i< m ; i++) {
            sum[i][0] = sum[i-1][0] + matrix[i][0];
        }
        for (int j = 1; j < n; j++) {
            sum[0][j] = sum[0][j-1] + matrix[0][j];
        }

        for(int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                sum[i][j] = sum[i-1][j] + sum[i][j-1] - sum[i-1][j-1] + matrix[i][j];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int left = col1 == 0 ? 0 : sum[row2][col1-1];
        int top  = row1 == 0 ? 0 : sum[row1-1][col2];
        int topleft = (col1 == 0 || row1 == 0) ? 0 : sum[row1-1][col1-1];
        return sum[row2][col2] - left - top + topleft;

    }
}

class Solution306 {
    public boolean isAdditiveNumber(String num) {
        if (num.length() == 0) return false;
        for(int i = 1; i < num.length()-1; i++) {
            if (i > 1 && num.charAt(0) == '0') continue;
            if (isAdditive(-1, -1, Long.parseLong(num.substring(0, i)), num, i)) {
                return true;
            }
        }
        return false;
    }

    private boolean isAdditive(long num0, long num1, long num2, String num, int index) {
        if (index == num.length()) {
            if (num0 + num1 == num2) {
                return true;
            }
            return false;
        }

        for (int i = index + 1; i<= num.length();i++) {
            if (i - index > 1 && num.charAt(i) == '0') return false;
            long tmp = Long.parseLong(num.substring(index, i));
            if (num1 != -1 && ((num1 + num2 )!= tmp)) {
                continue;
            }
            if (isAdditive(num1, num2, tmp, num, i)) {
                return true;
            }
        }
        return false;
    }
}

// 10/11/17
class NumArray307 {
    class SegSumTreeNode{
        public int l, r, sum;
        public SegSumTreeNode left, right;
        public SegSumTreeNode(int a, int b, int s) {
            l = a; r = b; sum = s;
        }
    }

    private SegSumTreeNode root;

    public NumArray307(int[] nums) {
        root = buildTree(nums, 0, nums.length - 1);
    }

    private SegSumTreeNode buildTree(int nums[], int l, int r) {
        if (l > r) {
            return null;
        }
        if (l == r) {
            SegSumTreeNode root = new SegSumTreeNode(l, r, nums[l]);
            return root;
        }
        int mid = l + (r-l) / 2;
        SegSumTreeNode left = buildTree(nums, l, mid);
        SegSumTreeNode right = buildTree(nums, mid+1, r);
        SegSumTreeNode root = new SegSumTreeNode(l, r, left.sum + right.sum);
        root.left = left;
        root.right = right;
        return root;
    }

    public void update(int i, int val) {
        update(root, i, val);
    }

    private void update(SegSumTreeNode tmp, int i, int val) {
        if (tmp.l == tmp.r && tmp.l == i) {
            tmp.sum = val;
            return;
        }

        if (tmp.left != null && (tmp.left.l <= i && tmp.left.r >= i)) {
            update(tmp.left, i, val);
        } else if (tmp.right != null && (tmp.right.l <= i && tmp.right.r >= i)) {
            update(tmp.right, i, val);
        }

        tmp.sum = tmp.left.sum + tmp.right.sum;
    }
    // assum i and j are always validate
    public int sumRange(int i, int j) {
        return findSum(root, i, j);
    }

    private int findSum(SegSumTreeNode root, int i, int j) {
        if (root.l == i && root.r == j) {
            return root.sum;
        }

        if (root.left != null && j <= root.left.r) {
            return findSum(root.left, i, j);
        }

        if (root.right != null && i >= root.right.l) {
            return findSum(root.right, i, j);
        }

        int leftSum = 0;
        if (root.left != null && i <= root.left.r) {
            leftSum = findSum(root.left, i, root.left.r);
        }
        int rightSum = 0;
        if (root.right != null && j >= root.right.l) {
            rightSum = findSum(root.right, root.right.l, j);
        }
        return leftSum + rightSum;
    }
}

class Solution309 {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[] out = new int[n];
        int[] in = new int[n];
        int[] coolDown = new int[n];

        coolDown[0] = Integer.MIN_VALUE;
        out[0] = 0;
        in[0] = - prices[0];

        for (int i = 1; i < n; i++) {
            in[i] = Math.max(in[i-1], out[i-1] - prices[i]);
            out[i] = Math.max(out[i-1], coolDown[i-1]);
            coolDown[i] = in[i-1] + prices[i];
        }

        int res = 0;
        for (int i = 0; i< n ;i ++) {
            res = Math.max(in[i], res);
        }
        res = Math.max(in[n-1] + prices[n-1], res);
        res = Math.max(res, out[n-1]);
        res = Math.max(res, coolDown[n-1]);
        return res;
    }
}

class Solution310 {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        Map<Integer, Integer> map = new HashMap<>();
        Queue<Integer> q = new LinkedList<>();
        Set<Integer> s = new HashSet<>();
        int[] h = new int[n];
        for (int i = 0; i< n; i++) {
            q.clear();
            s.clear();
            q.add(i);
            q.add(null);
            s.add(i);
            int height = 0;
            while(!q.isEmpty()) {
                Integer tmp = q.poll();
                if (tmp == null) {
                    if (!q.isEmpty()) {
                        q.add(null);
                    }
                    height++;
                    continue;
                }

                for(int[] edge : edges) {
                    int node = getOtherNode(edge, tmp);
                    if (node != -1 && !s.contains(node)) {
                        q.add(node);
                        s.add(node);
                    }
                }
            }
            h[i] = height;
        }

        int minh = Integer.MAX_VALUE;
        for (int i : h) {
            minh = Math.min(i, minh);
        }

        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (h[i] == minh) {
                l.add(i);
            }
        }
        return l;
    }

    private int getOtherNode(int[] edge, int i) {
        if (edge[0] == i) {
            return edge[1];
        } else if (edge[1] == i) {
            return edge[0];
        } else {
            return -1;
        }
    }

}

class Solution313 {

    public int nthSuperUglyNumber(int n, int[] primes) {
        int[] res = new int[n];
        res[0] = 1;
        int m = primes.length;
        int[] dp = new int[m];

        for (int i = 0;i< m; i++) {
            dp[i] = 0;
        }

        for (int i = 1; i<n; i++) {
            int tmp = Integer.MAX_VALUE;
            for(int j = 0; j< m; j++) {
                tmp = Math.min(tmp, res[dp[j]] * primes[j]);
            }
            res[i] = tmp;
            for (int j = 0;j< m; j++) {
                if (res[dp[j]] * primes[j] == tmp) {
                    dp[j]++;
                }
            }
        }
        return res[n-1];
    }
}

class Solution314 {
    public List<List<Integer>> verticalOrder(TreeNode root) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        visit(root, 0, map);
        List<Integer> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys);

        List<List<Integer>> res = new ArrayList<>();
        for(Integer i : keys) {
            res.add(map.get(i));
        }
        return res;
    }

    private void visit(TreeNode root, int index, Map<Integer, List<Integer>> map) {
        if(root == null) return;
        List<Integer> res = new ArrayList<>();
        if (map.keySet().contains(index)) {
            res = map.get(index);
        }
        res.add(root.val);
        map.put(index, res);
        visit(root.left, index-1, map);
        visit(root.right, index+1, map);
    }
}

// 10/12/17

class Solution301 {
    public List<String> removeInvalidParentheses(String s) {
        List<String> ans = new ArrayList<>();
        remove(s, ans, 0, 0, new char[]{'(', ')'});
        return ans;
    }

    public void remove(String s, List<String> ans, int last_i, int last_j,  char[] par) {
        for (int stack = 0, i = last_i; i < s.length(); ++i) {
            if (s.charAt(i) == par[0]) stack++;
            if (s.charAt(i) == par[1]) stack--;
            if (stack >= 0) continue;
            for (int j = last_j; j <= i; ++j)
                if (s.charAt(j) == par[1] && (j == last_j || s.charAt(j - 1) != par[1]))
                    remove(s.substring(0, j) + s.substring(j + 1, s.length()), ans, i, j, par);
            return;
        }

        String reversed = new StringBuilder(s).reverse().toString();
        if (par[0] == '(') // finished left to right
            remove(reversed, ans, 0, 0, new char[]{')', '('});
        else // finished right to left
            ans.add(reversed);
    }
}

// 10/13/17
class Solution334 {
    public boolean increasingTriplet(int[] nums) {
        int s = Integer.MAX_VALUE;
        int m = Integer.MAX_VALUE;

        for(int i = 0; i< nums.length; i++) {
            if (nums[i] < s) {
//                m = s;
                s =nums[i];
            } else if (nums[i] < m) {
                m = nums[i];
            } else {
                return true;
            }
        }
        return false;
    }
}

class Solution305 {
    public List<Integer> numIslands2(int m, int n, int[][] positions) {
        int[] t = new int[m*n];
        for (int i = 0; i < m*n; i++) {
            t[i] = -1;
        }

        List<Integer> res = new ArrayList<>();
        int k = positions.length;
        for (int i = 0; i < k; i++) {
            int x = positions[i][0];
            int y = positions[i][1];

            int top = x == 0 ? -1 : t[(x-1)*n + y];
            int left = y == 0 ? -1 : t[x*n + y - 1];
            int bottom = x == m -1 ? -1 : t[(x+1)*n + y];
            int right = y == n - 1 ? -1 : t[x*n + y + 1];

            int target = Math.max(top, left);
            target = Math.max(bottom, target);
            target = Math.max(right, target);

            if (target != -1) {
                for (int j = 0; j < m*n; j++) {
                    if (top != -1 && t[j] == top) { t[j] = target;}
                    if (left != -1 && t[j] == left) { t[j] = target;}
                    if (right != -1 && t[j] == right) { t[j] = target;}
                    if (bottom != -1 && t[j] == bottom) { t[j] = target;}
                }
                t[x*n + y] = target;
            } else {
                t[x*n + y] = i;
            }

            Set<Integer> s = new HashSet<>();
            for (int l = 0; l <= m*n; l++) {
                if (t[l] > -1) { s.add(t[l]); }
            }
            res.add(s.size());
        }
        return res;
    }
}

class Solution305II {
    public List<Integer> numIslands2(int m, int n, int[][] positions) {
        int[] t = new int[m*n];
        for (int i = 0; i < m*n; i++) {
            t[i] = -1;
        }

        List<Integer> res = new ArrayList<>();
        int k = positions.length;
        int count = 0;
        for (int i = 0; i < k; i++) {
            int x = positions[i][0];
            int y = positions[i][1];

            int top = x == 0 ? -1 : find(t, (x-1)*n + y);
            int left = y == 0 ? -1 : find(t, x*n + y - 1);
            int bottom = x == m -1 ? -1 : find(t, (x+1)*n + y);
            int right = y == n - 1 ? -1 : find(t, x*n + y + 1);
            Set<Integer> p = new HashSet<>();
            p.add(top);
            p.add(left);
            p.add(bottom);
            p.add(right);
            List<Integer> l = new ArrayList<>(p);
            Collections.sort(l);;
            Collections.reverse(l);

            int target = Integer.MIN_VALUE;
            for (int index : l) {
                target = Math.max(target, index);
            }

            if (target != -1) {
                for (int index : l) {
                    if (index != -1 && index != target) {
                        t[index] = target;
                        count --;
                    }
                }
                t[x*n + y] = target;
            } else {
                t[x*n + y] = x*n +y;
                count++;
            }

            res.add(count);
        }
        return res;
    }

    int find(int[] t, int i)
    {
        if (t[i] == -1) {
            return -1;
        }
        while(t[i] != i) {
            i = t[i];
        }
        return i;
    }

    void join(int[] t, int i, int j) {
        t[j] = t[i];
    }
}

class NumMatrix308 {
    int[][] sum;
    int[][] original;
    public NumMatrix308(int[][] matrix) {
        int m = matrix.length;
        if (m == 0) {return;}
        int n = matrix[0].length;
        if (n == 0) {return;}
        sum = new int[m][n];
        original = new int[m][n];
        for (int i = 0; i< m; i++) {
            for (int j = 0; j < n; j++) {
                original[i][j] =matrix[i][j];
            }
        }
        sum[0] = matrix[0];
        for (int i = 1; i< m ; i++) {
            sum[i][0] = sum[i-1][0] + matrix[i][0];
        }
        for (int j = 1; j < n; j++) {
            sum[0][j] = sum[0][j-1] + matrix[0][j];
        }

        for(int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                sum[i][j] = sum[i-1][j] + sum[i][j-1] - sum[i-1][j-1] + matrix[i][j];
            }
        }
    }

    public void update(int row, int col, int val) {
        int m = original.length;
        int n = original[0].length;

        int originalVal = original[row][col];
        int delta = val - originalVal;
        original[row][col] = val;

        for (int i = row; i< m; i++) {
            for (int j = col; j< n; j++) {
                sum[i][j] += delta;
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int left = col1 == 0 ? 0 : sum[row2][col1-1];
        int top  = row1 == 0 ? 0 : sum[row1-1][col2];
        int topleft = (col1 == 0 || row1 == 0) ? 0 : sum[row1-1][col1-1];
        return sum[row2][col2] - left - top + topleft;
    }
}

class Solution318 {
    public int maxProduct(String[] words) {
        Map<String, int[]> map = new HashMap<>();
        for (String s : words) {
            map.put(s, new int[] {mask(s), s.length()});
        }

        int res = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j <words.length; j++) {
                int[] val1 = map.get(words[i]);
                int[] val2 = map.get(words[j]);
                if ((val1[0] & val2[0]) == 0) {
                    res = Math.max(res, val1[1] * val2[1]);
                }
            }
        }
        return res;
    }

    private int mask(String s) {
        int mask = 0;
        for (int i = 0; i < s.length(); i++) {
            mask = mask | (1 << (s.charAt(i) - 'a'));
        }
        return mask;
    }
}

class Solution319 {
    public int bulbSwitch(int n) {
        boolean[] t = new boolean[n];
        for (int i = 1; i<=n; i++) {
            for (int j = 0; j<n; j++) {
                if ((j+1)%i ==0) {
                    t[j] = !t[j];
                }
            }
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            res += t[i]? 1 : 0;
        }
        return res;
    }
}

class Solution320 {
    public List<String> generateAbbreviations(String word) {
        List<String> res = new ArrayList<>();

        gen(res, word, 0, "", 0);
        return res;
    }

    private void gen(List<String> ret, String word, int pos, String cur, int count){
        if(pos==word.length()){
            if(count > 0) cur += count;
            ret.add(cur);
        }
        else{
            gen(ret, word, pos + 1, cur, count + 1);
            gen(ret, word, pos+1, cur + (count>0 ? count : "") + word.charAt(pos), 0);
        }
    }
}

class Solution315 { // this is still over time.
    class SegmentTreeNode{
        int l, r, count;
        SegmentTreeNode left, right;
        public SegmentTreeNode(int a, int b) {l = a; r = b;}
    }
    public List<Integer> countSmaller(int[] nums) {
        int m = nums.length;
        List<Integer> res = new ArrayList<>();
        if (m == 0) return res;
        int s = Integer.MAX_VALUE;
        int l = Integer.MIN_VALUE;
        for (int i : nums) {
            s = Math.min(s, i);
            l = Math.max(l, i);
        }
        SegmentTreeNode root = build(s, l);
        for (int i = m-1; i>=0; i--) {
            res.add(query(root, s, nums[i]-1));
            update(root, nums[i]);
        }
        Collections.reverse(res);
        return res;

    }

    private SegmentTreeNode build(int l, int r) {
        if (l > r) return null;
        if (l == r) {
            return new SegmentTreeNode(l,r);
        }
        int mid = l + (r-l)/2;
        SegmentTreeNode left = build(l, mid);
        SegmentTreeNode right = build(mid+1, r);
        SegmentTreeNode root = new SegmentTreeNode(l, r);
        root.left = left;
        root.right = right;
        return root;
    }

    private void update(SegmentTreeNode root, int t) {
        if (root.l == root.r && root.l == t) {
            root.count++;
            return;
        }

        if (root.left != null && t<= root.left.r) {
            update(root.left, t);
        } else if (root.right != null && t >= root.right.l) {
            update(root.right, t);
        }

        root.count = (root.left == null ? 0 : root.left.count) +
                (root.right == null ? 0 : root.right.count);
    }

    private int query(SegmentTreeNode root, int s, int l) {
        if (root == null) return 0;
        if (l < s) return 0;
        if (s == l && root.l == root.r && s == root.l) {
            return root.count;
        }

        int count1 = 0;
        if (root.left != null) {
            if (l <= root.left.r) {
                count1 = query(root.left, s, l);
            } else {
                count1 = query(root.left, s, root.left.r);
            }
        }

        int count2 = 0;
        if (root.right != null) {
            if (s >= root.right.l) {
                count2 = query(root.right, s, l);
            } else {
                count2 = query(root.right, root.right.l, l);
            }
        }

        return count1 + count2;
    }
}

class Solution315_II {
    class TreeNode_X {
        int val;
        int sum;
        int dup;
        TreeNode_X left;
        TreeNode_X right;
        public TreeNode_X(int v) {
            val = v;
            dup = 1;
        }
    }
    public List<Integer> countSmaller(int[] nums) {
        int m = nums.length;
        Integer[] res = new Integer[m];
        TreeNode_X root = null;
        for (int i = m-1; i >= 0; i--) {
            root = build(nums[i], res, root, i, 0);
        }
        return Arrays.asList(res);
    }

    private TreeNode_X build(int num, Integer[] res, TreeNode_X root, int index, int preSum) {
        if (root == null) {
            res[index] = preSum;
            return new TreeNode_X(num);
        } else if (root.val == num) {
            root.dup++;
            res[index] = preSum + root.sum;
            return root;
        } else if (num < root.val) {
            root.sum++;
            root.left = build(num, res, root.left, index, preSum);
            return root;
        } else {
            root.right = build(num, res, root.right, index, preSum + root.sum + root.dup);
            return root;
        }
    }
}

class Solution322 {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            int minCount = Integer.MAX_VALUE;
            for (int j = 0; j < coins.length; j++) {
                if (i - coins[j] >= 0) {
                    minCount = Math.min(minCount, dp[i - coins[j]] + 1);
                }
                if (minCount != Integer.MAX_VALUE) {
                    dp[i] = minCount;
                }
            }
        }
        return dp[amount];
    }
}

class Solution323 {
    public int countComponents(int n, int[][] edges) {
        boolean[] visited = new boolean[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                count ++;
                dfs(visited, i, edges);
            }
        }
        return count;
    }

    private void dfs(boolean[] visited, int node, int[][] edges) {
        for (int i = 0; i< edges.length; i++) {
            int otherNode = otherNode(edges[i], node);
            if (otherNode != -1 && !visited[otherNode]) {
                visited[otherNode] = true;
                dfs(visited, otherNode, edges);
            }
        }
    }

    private int otherNode(int[] edge, int node) {
        if (edge[0] == node) {
            return edge[1];
        } else if (edge[1] == node) {
            return edge[0];
        }
        return -1;
    }
}

class Solution324 {
    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        int i = 1;
        int j = i +2;
        while(i +1 < nums.length && j < nums.length) {
            while(j < nums.length && nums[j] <= nums[i+1]) {
                if (i+1 == j) { break;}
                j++;
            }
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
            j++;
            i = i+2;
        }
    }
}

class Solution325 {
    public int maxSubArrayLen(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        int sum = 0;
        int res = 0;
        for (int i = 0; i< nums.length; i++) {
            sum += nums[i];
            if (map.getOrDefault(sum, null) == null) {
                map.put(sum, i);
            }

            Integer pre = map.getOrDefault(sum-k, null);
            if (pre != null) {
                res = Math.max(i - pre, res);
            }

        }
        return res;

    }
}

class Solution {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode oddEvenList(ListNode head) {
        if (head == null) return null;
        ListNode dummy1 = new ListNode(0);
        ListNode dummy2 = new ListNode(0);

        dummy1.next = head;
        dummy2.next = head.next;

        ListNode run1 = head;
        ListNode run2 = head.next;

        while(run1 != null && run2 != null) {
            if (run1.next != null) {
                run1.next = run1.next.next;
                run1 = run1.next;
            }

            if (run2.next != null) {
                run2.next = run2.next.next;
                run2 = run2.next;
            }
        }

        run1 = dummy1;
        while(run1.next != null) {
            run1 = run1.next;
        }
        run1.next = dummy2.next;
        return dummy1.next;
    }
}

class Solution331 {
    class StackNode{
        String s;
        int count;
        public StackNode(String a, int b) {
            s = a;
            count = b;
        }
    }

    public boolean isValidSerialization(String preorder) {
        String[] tokens = preorder.split(",");
        if (tokens.length == 1 && tokens[0].equals("#")) return true;
        Stack<StackNode> dp = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            String s  = tokens[i];
            if (!s.equals("#")) {
                dp.push(new StackNode(s, 1));
            } else {
                if (dp.isEmpty()) {
                    return false;
                }
                while(!dp.isEmpty()  && dp.peek().count == 2) {
                    dp.pop();
                }
                if (!dp.isEmpty()) {
                    dp.peek().count++;
                } else {
                    if (i != tokens.length-1) {
                        return false;
                    }
                }
            }
        }
        return dp.isEmpty();
    }
}

//10/14/17
class Solution347 {
    public List<Integer> topKFrequent(int[] nums, int k) {
        int m = nums.length;
        List<Integer> res = new ArrayList<>();
        if (m == 0 || k ==0) return res;
        List<Integer>[] buckets = new List[m+1];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i< m;i ++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) +1);
        }

        for (Integer i : map.keySet()) {
            Integer val = map.get(i);
            if (buckets[val] == null) {
                buckets[val]= new ArrayList<>();
            }
            buckets[val].add(i);
        }

        for (int i = m; i>=0; i--) {
            if (res.size() >= k ) {break;}
            if (buckets[i] == null) {continue;}
            if (k - res.size() >= buckets[i].size()) {
                res.addAll(buckets[i]);
            } else {
                int count = k - res.size();
                for (int j = 0; j <= count; j++) {
                    res.add(buckets[i].get(j));
                }
            }
        }
        return res;
    }
}

// need redo this one.
class Solution336 {
    public List<List<Integer>> palindromePairs(String[] words) {
        Map<String, Integer> map = new HashMap<>();
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            map.put(words[i], i);
        }

        for (int i = 0; i < words.length; i++) {
            StringBuilder sb = new StringBuilder(words[i]);
            sb.reverse();
            String tmp = sb.toString();
            if (map.keySet().contains(tmp)) {
                res.add(new ArrayList<>(Arrays.asList(i, map.get(tmp))));
            }

//            if (map.keySet()) {
//                res.add(new ArrayList<>(Arrays.asList(i, map.get(tmp.substring(1)))));
//            }
        }
        return res;
    }
}

class Solution337 {
    Map<TreeNode, Integer> map = new HashMap<>();

    public int rob(TreeNode root) {
        if (root == null) return 0;
        if (map.containsKey(root)) { return map.get(root); }
        int result1 = root.val +
                (root.left == null ? 0 : rob(root.left.left) + rob(root.left.right)) +
                (root.right == null ? 0 : rob(root.right.left) + rob(root.right.right));
        int result2 = rob(root.left) + rob(root.right);
        int res = Math.max(result1, result2);
        map.put(root, res);
        return res;
    }
}

class Solution338 {
    public int[] countBits(int num) {
        int[] t = new int[num+1];
        t[0] = 0;
        for (int i = 1; i<= num; i++) {
            t[i] = t[i/2] + i%2;
        }
        return t;
    }
}

interface NestedInteger {

    // @return true if this NestedInteger holds a single integer, rather than a nested list.
    public boolean isInteger();

    // @return the single integer that this NestedInteger holds, if it holds a single integer
    // Return null if this NestedInteger holds a nested list
    public Integer getInteger();

    // @return the nested list that this NestedInteger holds, if it holds a nested list
    // Return null if this NestedInteger holds a single integer
    public List<NestedInteger> getList();
}

class Solution339 {
    public int depthSum(List<NestedInteger> nestedList) {
        int res = 0;
        for (NestedInteger n : nestedList){
            res += cal(1, n);
        }
        return res;
    }

    private int cal(int level, NestedInteger nint) {
        if(nint.isInteger()) {
            return level * nint.getInteger();
        } else {
            int res = 0;
            List<NestedInteger> list = nint.getList();
            for (NestedInteger n : list){
                res += cal(level+1, n);
            }
            return res;
        }
    }
}

class x implements NestedInteger {

    Integer val;
    List<NestedInteger> list;

    public x(int v) {
        val = v;
    }

    public x(List<NestedInteger> l) {
        list = l;
    }

    @Override
    public boolean isInteger() {
        return val != null;
    }

    @Override
    public Integer getInteger() {
        return val;
    }

    @Override
    public List<NestedInteger> getList() {
        return list;
    }
}

class NestedIterator implements Iterator<Integer> { //341
    Stack<NestedInteger> s;
    public NestedIterator(List<NestedInteger> nestedList) {
        s = new Stack<>();
        for (int i = nestedList.size() -1; i >=0; i--) {
            s.push(nestedList.get(i));
        }
    }

    @Override
    public Integer next() {
        if (hasNext()) {
            return s.pop().getInteger();
        }
        return null;
    }

    @Override
    public boolean hasNext() {
        if (s.isEmpty()) return false;
        if (s.peek().isInteger()) return true;

        while(!s.isEmpty() && !s.peek().isInteger()) {
            List<NestedInteger> list = s.pop().getList();
            for (int i = list.size() - 1; i >= 0; i--) {
                s.push(list.get(i));
            }
        }
        return !s.isEmpty();
    }
}

class Solution344 {
    public String reverseString(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return sb.toString();
    }
}

class Solution345 {
    public String reverseVowels(String s) {
        char[] ch = s.toCharArray();
        int l = 0;
        int r = ch.length-1;
        while(l < r) {
            while(l < ch.length && !isVowel(ch[l])) l++;
            while(r >= 0 && !isVowel(ch[r])) r--;
            if (l < r) {
                char tmp = ch[r];
                ch[r] = ch[l];
                ch[l] = tmp;
                l++;
                r--;
            }

        }
        return String.valueOf(ch);
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'A' ||
                c == 'e' || c == 'E' ||
                c == 'i' || c == 'I' ||
                c == 'o' || c == 'O' ||
                c == 'u' || c == 'U';
    }
}

class MovingAverage346 {

    /** Initialize your data structure here. */
    int msize;
    Queue<Integer> q;
    long total = 0;
    public MovingAverage346(int size) {
        msize = size;
        q = new LinkedList<>();
        total = 0;
    }

    public double next(int val) {
        if (q.size() == msize) {
            total -= q.poll();
        }
        q.add(val);
        total += val;
        return (double)total / q.size();
    }
}

class MovingAverage346II {
    /** Initialize your data structure here. */
    int[] t;
    int count;
    long total = 0;
    int index = 0;
    public MovingAverage346II(int size) {
        t = new int[size];
        count = 0;
        total = 0;

    }

    public double next(int val) {
        if (count < t.length) count++;
        total -= t[index];
        total += val;
        t[index] = val;
        index = (index+1)%t.length;

        return (double) total/count;
    }
}

class HitCounter { //362

    int[] hits;
    int[] timeStamp;
    /** Initialize your data structure here. */
    public HitCounter() {
        hits = new int[300];
        timeStamp = new int[300];
    }

    /** Record a hit.
     @param timestamp - The current timestamp (in seconds granularity). */
    public void hit(int timestamp) {
        int index = timestamp % 300;
        if (timeStamp[index] != timestamp) {
            timeStamp[index] = timestamp;
            hits[index] = 1;
        } else  {
            hits[index]++;
        }

    }

    /** Return the number of hits in the past 5 minutes.
     @param timestamp - The current timestamp (in seconds granularity). */
    public int getHits(int timestamp) {
        int total = 0;
        for (int i = 0; i < 300; i++) {
            if (timestamp - timeStamp[(timestamp+i)%300] < 300) {
                total += hits[(timestamp+i)%300];
            }
        }
        return total;
    }
}

class Solution349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s = new HashSet<>();
        for (int a : nums1) {
            s.add(a);
        }
        Set<Integer> res = new HashSet<>();
        for (int a : nums2) {
            if (s.contains(a)) {
                res.add(a);
            }
        }
        int[] b = new int[res.size()];
        int i = 0;
        for (Integer x : res) {
            b[i++] = x;
        }
        return b;
    }
}

class Solution350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums2) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        List<Integer> res = new ArrayList<>();
        for (int i : nums1) {
            int count = map.getOrDefault(i, 0);
            if (count > 0) {
                res.add(i);
                map.put(i, count-1);
            }
        }
        int[] b = new int[res.size()];
        int i = 0;
        for (Integer x : res) {
            b[i++] = x;
        }
        return b;
    }
}

class Solution367 {
    public boolean isPerfectSquare(int num) {
        int i = 0;
        int j = num;
        while(i <= j) {
            int mid = i + (j-i) /2;
            if (mid * mid == num)
            {
                return true;
            } else  if (mid* mid > num) {
                j = mid-1;
            } else {
                i = mid+1;
            }
        }
        return false;
    }
}

class Solution376 {
    public int wiggleMaxLength(int[] nums) {
        int m = nums.length;
        int[] up = new int[m];
        int[] down = new int[m];
        up[0] = 1;
        down[0] = 1;
        for (int i = 1 ; i < m; i++) {
            int uplength = 0;
            int downlength = 0;
            for (int j = i-1; j>=0; j++) {
                if (nums[i] > nums[j]) {
                    uplength = Math.max(uplength, down[j] + 1);
                } else if (nums[i] < nums[j]) {
                    downlength = Math.max(downlength, up[j] + 1);
                }
            }
            up[i] = uplength;
            down[i] = downlength;
        }

        int res = Integer.MIN_VALUE;
        for (int i = 0; i< m; i++) {
            res = Math.max(res, up[i]);
            res = Math.max(res, down[i]);
        }
        return res;
    }
}

//352
class SummaryRanges {
    class Interval {
        int start;
        int end;
        Interval() { start = 0; end = 0; }
        Interval(int s, int e) { start = s; end = e; }
    }

    List<Interval> intervals;
    Map<Integer, Interval> starts;
    Map<Integer, Interval> ends;

    /** Initialize your data structure here. */
    public SummaryRanges() {
        intervals = new ArrayList<>();
        starts = new HashMap<>();
        ends = new HashMap<>();
    }

    public void addNum(int val) {
        Interval pre = ends.getOrDefault(val-1, null);
        Interval after = starts.getOrDefault(val+1, null);
        Interval replacement = null;
        if (pre != null && after != null) {
            intervals.remove(pre);
            intervals.remove(after);
            ends.remove(after.end);
            ends.remove(pre.end);
            starts.remove(pre.start);
            starts.remove(after.end);
            replacement = new Interval(pre.start, after.end);
        } else if (pre != null) {
            intervals.remove(pre);
            ends.remove(pre.end);
            starts.remove(pre.start);
            replacement = new Interval(pre.start, val);
        } else if (after != null) {
            intervals.remove(after);
            ends.remove(after.end);
            starts.remove(after.start);
            replacement = new Interval(val, after.end);
        } else if (ends.keySet().contains(val) || starts.keySet().contains(val)) {
            return;
        } else {
            replacement = new Interval(val, val);
            merge(getIntervals(), replacement);
            return;
        }

        intervals.add(replacement);
        ends.put(replacement.end, replacement);
        starts.put(replacement.start, replacement);
    }

    private void merge(List<Interval> intervals, Interval a) {

        for (int i = 0; i < intervals.size(); i++) {
            Interval tmp = intervals.get(i);
            if (tmp.start < a.start && a.end < tmp.end) {
                return;
            }
        }
        ends.put(a.end , a);
        starts.put(a.start, a);
        intervals.add(a);
    }

    public List<Interval> getIntervals() {
        Collections.sort(intervals, (Interval i1, Interval i2) -> i1.start - i2.start);
        return intervals;
    }
}

// 10/15/17
class SummaryRangesII {
    class Interval {
        int start;
        int end;
        Interval() { start = 0; end = 0; }
        Interval(int s, int e) { start = s; end = e; }
    }
    TreeMap<Integer, Interval> map;
    /** Initialize your data structure here. */
    public SummaryRangesII() {
        map = new TreeMap<>();
    }

    public void addNum(int val) {
        if (map.containsKey(val)) return;
        Integer lower =  map.lowerKey(val);
        Integer higher = map.higherKey(val);

        if (lower != null && higher != null &&
                map.get(lower).end + 1 == val && map.get(higher).start == val +1) {
                map.get(lower).end = map.get(higher).end;
                map.remove(higher);

        } else if (lower != null && map.get(lower).end + 1 >= val) {
            map.get(lower).end = Math.max(val, map.get(lower).end);
        } else if (higher != null && map.get(higher).start -1 == val) {
            map.put(val, new Interval(val, map.get(higher).end));
            map.remove(higher);
        } else {
            map.put(val, new Interval(val, val));
        }
    }

    public List<Interval> getIntervals() {
        return new ArrayList<>(map.values());
    }
}

class Solution354 {
    public int maxEnvelopes(int[][] envelopes) {
        Comparator<int[]> cmp = new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]) {
                    return o1[1] - o2[1];
                }
                return o1[0] - o2[0];
            }
        };

        Arrays.sort(envelopes, cmp);
        int m = envelopes.length;
        int[] dp = new int[m];
        Arrays.fill(dp, 1);
        for (int i = 1; i< m; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (envelopes[i][0] > envelopes[j][0] && envelopes[i][1] > envelopes[j][1]) {
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
        }

        int res = 0;
        for (int i = 0; i< m; i++) {
            res = Math.max(res, dp[i]);
        }
        return res;
    }
}

class Solution375 {
    public int getMoneyAmount(int n) {
        int[][] dp = new int[n][n];
        int res = get(dp, 0, n-1);
        return res;
    }

    private int get(int[][] dp, int i, int j) {
        if (i >= j) return 0;
        if (dp[i][j] != 0) return dp[i][j];

        if (i == j-1) {
            dp[i][j] = i+1;
            return dp[i][j];
        }
        if (i == j -2) {
            dp[i][j] = (i+1+ j+1)/2;
            return dp[i][j];
        }

        int res = Integer.MAX_VALUE;
        for (int k = i; k <= j; k++) {
            res = Math.min(res, Math.max(get(dp, i, k-1),get(dp, k+1, j)) + k + 1);
        }
        dp[i][j] = res;
        return res;
    }
}

class Solution377 {
    public int combinationSum4(int[] nums, int target) {
        Map<Integer, Integer> dp = new HashMap<>();
        List<Integer> tr = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        dfs(nums, res, tr, 0, target);
        return res.size();
    }

    private void dfs(int[] nums,
                     List<List<Integer>> res,
                     List<Integer> tr,
                     int sum,
                     int target) {
        if (sum > target) { return;}
        if (sum == target) {
            res.add(new ArrayList<>(tr));
            return;
        }
        for (int i = 0; i< nums.length; i++) {
            tr.add(nums[i]);
            dfs(nums, res, tr, sum+nums[i], target);
            tr.remove(tr.size()-1);
        }
    }
}

class Solution377II {
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target+1];
        Arrays.fill(dp, -1);
        dp[0] = 1;
        dfs(nums, dp, target);
        return dp[target-1];
    }

    private int dfs(int[] nums, int[] dp, int target) {
        if (dp[target] != -1) {
            return dp[target];
        }
        int res = 0;
        for (int i = 0; i< nums.length; i++) {
            if (target >= nums[i]) {
                res += dfs(nums, dp, target-nums[i]);
            }
        }
        dp[target] = res;
        return res;
    }
}

class Solution378 {
    public int kthSmallest(int[][] matrix, int k) {
        Comparator<int[]> cmp = new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        };
        PriorityQueue<int[]> pq = new PriorityQueue<>(cmp);

        int m = matrix.length;
        if (m == 0) return 0;
        int n = matrix.length;
        if (n == 0) return 0;

        for (int i = 0; i< n; i++) {
            pq.add(new int[] {matrix[0][i], 0, i});
        }

        for (int i = 0; i< k-1; i++) {
            int[] tmp = pq.poll();
            if (tmp != null && tmp[1] < m-1) {
                pq.add(new int[] {matrix[tmp[1] + 1][tmp[2]], tmp[1]+1, tmp[2]});
            }
        }
        return pq.peek()[0];
    }
}

class Solution373 {
    public List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k) {

        PriorityQueue<int[]> pq = new PriorityQueue<>(
                (a,b) -> (a[0] + a[1]) - (b[0] + b[1]));
        List<int[]> res = new ArrayList<>();
        if (nums1.length == 0 ||
                nums2.length == 0 ||
                k == 0) {
            return res;
        }

        for (int i = 0; i< nums1.length && i < k; i++) {
            pq.add(new int[] {nums1[i], nums2[0], 0});
        }

        while(k-- > 0 && !pq.isEmpty()) {
            int[] tmp = pq.poll();
            res.add(new int[] {tmp[0], tmp[1]});
            if (tmp[2]+1 < nums2.length) {
                pq.add(new int[]{tmp[0], nums2[tmp[2] + 1], tmp[2] + 1});
            }
        }

        return res;
    }
}

class RandomizedSet { // 380

    Map<Integer, Integer> map;
    List<Integer> list;

    /** Initialize your data structure here. */
    public RandomizedSet() {
        map = new HashMap<>();
        list = new ArrayList<>();
    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if (map.keySet().contains(val)) {return false;}
        list.add(val);
        map.put(val, list.size()-1);
        return true;
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        int index = map.getOrDefault(val, -1);
        if (index == -1) return false;

        if (index == list.size()-1) {
            map.remove(val);
            list.remove(list.size()-1);
        } else {
            list.set(index, list.get(list.size()-1));
            map.put(list.get(index), index);
            list.remove(list.size()-1);
        }
        return true;
    }

    /** Get a random element from the set. */
    public int getRandom() {
        int index = (int)(Math.random() * (list.size()-1));
        return list.get(index);
    }
}

class Solution382 {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    ListNode mhead;
    Random random;
    /** @param head The linked list's head.
    Note that the head is guaranteed to be not null, so it contains at least one node. */
    public Solution382(ListNode head) {
        mhead = head;
        random = new Random();

    }

    /** Returns a random node's value. */
    public int getRandom() {
        int res = 0;
        ListNode tmp = mhead;
        int i = 0;
        while(tmp != null) {
            int ran = random.nextInt(i+1);
            if (i == ran) {
                res = tmp.val;
            }
            i++;
            tmp = tmp.next;
        }
        return res;
    }
}

class Solution383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> mag = new HashMap<>();
        Map<Character, Integer> note = new HashMap<>();
        for (int i = 0; i< magazine.length(); i++) {
            mag.put(magazine.charAt(i), mag.getOrDefault(magazine.charAt(i), 0) + 1);
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            note.put(ransomNote.charAt(i), note.getOrDefault(ransomNote.charAt(i), 0) + 1);
        }

        for (char c : note.keySet()) {
            if (note.getOrDefault(c, 0) > mag.getOrDefault(c, 0)){
                return false;
            }
        }
        return true;
    }
}

// 10/16/17
class SolutionBFS301 {
    public List<String> removeInvalidParentheses(String s) {
        List<String> res = new ArrayList<>();
        Set<String> set = new HashSet<>();
        Queue<String> q = new LinkedList<>();
        q.add(s);
        boolean found = false;
        while (!q.isEmpty()) {
            String tmp = q.poll();
            if (isValid(tmp)) {
                res.add(tmp);
                found = true;
                continue;
            }
            if (found) continue;
            for (int i = 0; i < tmp.length(); i++) {
                if (tmp.charAt(i) != '(' && tmp.charAt(i) != ')') continue;
                String cur = tmp.substring(0, i) + tmp.substring(i+1, tmp.length());
                if (set.contains(cur)) { continue;}
                q.add(cur);
                set.add(cur);
            }
        }
        return res;
    }

    private boolean isValid(String s) {
        int count = 0;
        for (int i = 0; i< s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                count++;
            } else if (c == ')') {
                count --;
                if(count < 0) {
                    return false;
                }
            }
        }
        return count == 0;
    }
}

class Solution384 {

    int[] tmp;
    int[] copy;
    public Solution384(int[] nums) {
        int m = nums.length;
        tmp = new int[m];
        for (int i = 0; i< m; i++) {
            tmp[i] = nums[i];
        }
        copy = nums;
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        for (int i = 0; i< tmp.length; i++) {
            tmp[i] = copy[i];
        }
        return copy;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        Random random = new Random();
        for (int i = 0; i < tmp.length; i++) {
            int j = random.nextInt(i+1);
            int t = tmp[j];
            tmp[j] = tmp[i];
            tmp[i] = t;
        }
        return tmp;
    }
}

class Solution386 {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> res = new ArrayList<>();
        for (int i = 1; i<=9; i++) {
            DFS(res, i, n);
        }
        return res;
    }

    private void DFS(List<Integer> res, int i, int n) {
        if (i > n) { return;}
        res.add(i);
        for(int j = 0; j <10;j++) {
            DFS(res, i*10 + j, n);
        }
    }
}

class Solution387 {
    public int firstUniqChar(String s) {
        int[] map = new int[26];
        Arrays.fill(map, -1);
        for (int i = 0; i< s.length(); i++) {
            if (map[s.charAt(i) - 'a'] == -1 && map[s.charAt(i) - 'a'] != Integer.MAX_VALUE) {
                map[s.charAt(i) - 'a'] = i;
            } else {
                map[s.charAt(i) - 'a'] = Integer.MAX_VALUE;
            }
        }

        int res = Integer.MAX_VALUE;
        for (int i = 0; i< map.length; i++) {
            if (map[i] != -1) {
                res = Math.min(res, map[i]);
            }
        }
        return res == Integer.MAX_VALUE ? -1 : res;
    }
}

class Solution389 {
    public char findTheDifference(String s, String t) {
        int[] maps = new int[26];
        int[] mapt = new int[26];

        for (int i = 0 ; i< s.length(); i++) {
            maps[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i< t.length(); i++) {
            mapt[t.charAt(i) - 'a']++;
        }

        for (int i = 0 ;i< 26; i++) {
            if (mapt[i] - maps[i] == 1) {
                return (char)('a' + i);
            }
        }
        return 'a';
    }
}

// 10/17/17
class Solution394 {
    public String decodeString(String s) {
        return dfs(s);
    }

    private String dfs(String s) {
        if (s.indexOf('[') == -1) {
            return s;
        }
        StringBuilder sb = new StringBuilder();

        int pre = 0;

        int i = pre;

        while(i != s.length()) {
            int startIndex = s.indexOf('[', i);
            if (startIndex == -1) {
                sb.append(s.substring(pre, s.length()));
                break;
            }

            int l;
            for (l = pre; l < s.length(); l ++) {
                if (Character.isDigit(s.charAt(l))) {
                    break;
                }
            }
            sb.append(s.substring(pre, l));
            pre = l;


            int count = 1;
            i = startIndex + 1;
            int num = Integer.parseInt(s.substring(pre, startIndex));
            while (i != s.length() && count != 0) {
                if (s.charAt(i) == '[') count++;
                else if (s.charAt(i) == ']') count--;
                i++;
            }
            String tmp = dfs(s.substring(startIndex+1, i-1));
            for (int k = 0; k < num; k++) {
                sb.append(tmp);
            }
            pre = i;
        }
        return sb.toString();
    }
}

class Solution394II {
    public String decodeString(String s) {
        return dfs(s, 0).tmp;
    }

    class Val {
        int index;
        String tmp;
        public Val(int a, String b) {
            index = a;
            tmp = b;
        }
    }

    private Val dfs(String s, Integer i) {

        StringBuilder sb = new StringBuilder();
        int n = 0;
        while(i < s.length() && s.charAt(i) != ']') {
            if (!Character.isDigit(s.charAt(i))) {
                sb.append(s.charAt(i++));
            } else if (Character.isDigit(s.charAt(i))) {
                n = 0;
                while(Character.isDigit(s.charAt(i))) {
                    n = n * 10 + (s.charAt(i++) - '0');
                }
                i++;
                Val val = dfs(s, i);
                String tmp = val.tmp;
                i = val.index;
                i++;
                while(n-- >0) {
                    sb.append(tmp);
                }
            }
        }
        return new Val(i, sb.toString());
    }
}

class Solution395 {
    public int longestSubstring(String s, int k) {

        if (s.length() < k) return 0;
        int[] freq = new int[26];
        for(int i = 0; i< s.length(); i++) {
            freq[s.charAt(i)-'a'] ++;
        }
        int minFreq = Integer.MAX_VALUE;
        char c= 'a';
        for (int i = 0; i< 26; i++) {
            if (freq[i] != 0 && freq[i] < minFreq) {
                minFreq = freq[i];
                c = (char)('a'+ i);
            }
        }
        if (minFreq >= k) { return s.length();}
        int res = Integer.MIN_VALUE;
        String[] subs = s.split(String.valueOf(c));
        for (int i = 0; i< subs.length; i++) {
            res = Math.max(res, longestSubstring(subs[i], k));
        }
        return res;
    }
}

class Solution351 {
    boolean[] visied = new boolean[9];

    public int numberOfPatterns(int m, int n) {
        int res = 0;
        for (int k = m ; k < n; k++) {
            Arrays.fill(visied, false);
            res += cal(-1, k);
        }
        return res;
    }

    public int cal(int from, int len) {
        if (len == 0) {
            return 1;
        }
        int sum = 0;
        for (int i = 0; i< 9; i++) {
            if (isValid(from, i)) {
                visied[i] = true;
                sum += cal(i, len-1);
                visied[i] = false;
            }
        }
        return sum;
    }

    private boolean isValid(int from, int to) {
        if (visied[to]) return false;
        if (from == -1) return true;
        if ((from+to)%2 == 1) return true;
        int mid = (from + to)/2;
        if (mid == 4) {
            return visied[mid];
        }
        // not same line and same column.
        if (from % 3 != to % 3 && from / 3 != to / 3) {
            return true;
        }
        return visied[mid];
    }
}

class Solution393 {
    public boolean validUtf8(int[] data) {
        int threeCount = 30; // 11110
        int twoCount = 14; // 1110
        int oneCount = 6; // 110;
        int nocount = 2; // 10
        int zero = 0;

        int expect = 0;
        for(int i = 0; i< data.length; i++) {
            int tmp = data[i];
            if (tmp >> 3 == threeCount) {
                if (expect != 0) { return false;}
                expect = 3;
                continue;
            }
            if (tmp >> 4 == twoCount) {
                if (expect != 0) { return false;}
                expect = 2;
                continue;
            }
            if (tmp >> 5 == oneCount) {
                if (expect != 0) { return false;}
                expect = 1;
                continue;
            }
            if (tmp >> 6 == nocount) {
                if (expect == 0) {return false;}
                expect--;
                continue;
            }
            if (tmp >> 7 == zero) {
                if (expect != 0) {return false;}
                continue;
            }
            return false;
        }
        return expect == 0;
    }
}

class Solution397 {
    public int integerReplacement(int n) {
        int steps = 0;
        while (n != 1) {
            if(n%2 == 0) {
                n = n / 2;
            } else if (n == 3 || ((n >>> 1) & 1) == 0) {
                // if n is end with 'xxxxxx01' we should just -1, other wise should +1
                // to reduce the count of 1 in the n.
                n = n -1;
            } else {
                n = n + 1;
            }
            steps++;
        }
        return steps;
    }
}

class Solution399 { // this is actual a graph problem
    class edge {
        String key;
        double ratio;
        public edge(String a, double d) {
            key = a; ratio = d;
        }
    }
    public double[] calcEquation(String[][] equations, double[] values, String[][] queries) {
        int m = values.length;
        if (equations.length != m) { return new double[0];}
        Map<String, List<edge>> map = new HashMap<>();
        for (int i = 0; i< m; i++) {
            edge p = new edge(equations[i][1], values[i]);
            List<edge> lp = map.getOrDefault(equations[i][0], new ArrayList<edge>());
            lp.add(p);
            map.put(equations[i][0], lp);

            p = new edge(equations[i][0], 1.0 / values[i]);
            lp = map.getOrDefault(equations[i][1], new ArrayList<edge>());
            lp.add(p);
            map.put(equations[i][1], lp);

        }
        int n = queries.length;
        double[] res = new double[n];
        Set<String> visited = new HashSet<>();
        for (int i = 0; i< n; i++) {
            visited.clear();
            visited.add(queries[i][0]);
            res[i] = solve(map, visited, queries[i][0], queries[i][1]);
            visited.remove(queries[i][0]);
        }
        return res;
    }

    private double solve(Map<String, List<edge>> map, Set<String> visited, String a, String b) {
        if (map.keySet().contains(a) && a.equals(b)) return 1.0;
        List<edge> list = map.getOrDefault(a, null);

        if (list == null) {return -1.0d;}
        for (edge p : list) {
            if (p.key.equals(b)) { return p.ratio; }
            if (visited.contains(p.key)) { continue;}
            visited.add(p.key);
            double res = solve(map, visited, p.key, b);
            if (res != -1.0) {
                return p.ratio * res;
            }
            visited.remove(p.key);
        }
        return -1.0;
    }
}

// 10/18/17
class SnakeGame {
    class BoardPoint {
        int x, y;
        public BoardPoint(int a, int b) {x = a; y = b;}

        @Override
        public boolean equals(Object b) {
            if (b == this) {return true;}
            if (!(b instanceof BoardPoint)) {return false;}
            if(this.x == ((BoardPoint)b).x &&
                    this.y == ((BoardPoint)b).y) {return true;}
            return false;
        }
    }
    private LinkedList<BoardPoint> snakeBody;
    private Set<BoardPoint> foods;
    private int h;
    private int w;
    private int score = 0;
    /** Initialize your data structure here.
     @param width - screen width
     @param height - screen height
     @param food - A list of food positions
     E.g food = [[1,1], [1,0]] means the first food is positioned at [1,1], the second is at [1,0]. */
    public SnakeGame(int width, int height, int[][] food) {
        snakeBody = new LinkedList<>();
        snakeBody.add(new BoardPoint(0,0));

        h = height;
        w = width;
        foods = new HashSet<>();
        for (int i = 0; i < food.length; i++) {
            foods.add(new BoardPoint(food[i][0], food[i][1]));
        }
        score = 0;
    }

    /** Moves the snake.
     @param direction - 'U' = Up, 'L' = Left, 'R' = Right, 'D' = Down
     @return The game's score after the move. Return -1 if game over.
     Game over when snake crosses the screen boundary or bites its body. */
    public int move(String direction) {
        BoardPoint head = snakeBody.getFirst();
        BoardPoint nextPoint = null;
        if (direction.equals("U")) {
            nextPoint = new BoardPoint(head.x - 1, head.y);
            if (nextPoint.x < 0) return -1;
        } else if (direction.equals("L")) {
            nextPoint = new BoardPoint(head.x, head.y -1);
            if (nextPoint.y < 0) return -1;
        } else if (direction.equals("D")) {
            nextPoint = new BoardPoint(head.x+1, head.y);
            if (nextPoint.x >= h) return -1;
        } else if (direction.equals("R")) {
            nextPoint = new BoardPoint(head.x, head.y + 1);
            if (nextPoint.y >= w) return -1;
        }

        if (nextPoint == null) {return -1;}


        for (int i = 0; i< snakeBody.size()-1; i++) {
            BoardPoint p = snakeBody.get(i);
            if (nextPoint.x == p.x && nextPoint.y == p.y) {
                return -1;
            }
        }

        if (foods.contains(nextPoint)){
            score ++;
            foods.remove(nextPoint);
            snakeBody.addFirst(nextPoint);
        } else {
            snakeBody.addFirst(nextPoint);
            snakeBody.removeLast();
        }
        return score;
    }
}

class Solution385 {
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
        if (s.isEmpty()) {
            return null;
        }
        if (s.charAt(0) != '[') {
            return new NestedInteger(Integer.valueOf(s));
        }

        Stack<NestedInteger> stack = new Stack<>();
        NestedInteger curr = null;

        int l = 0;
        int r = 0;
        while(r < s.length()) {
            char ch = s.charAt(r);
            if (ch == '[') {
                if (curr != null) {
                    stack.push(curr);
                }
                curr = new NestedInteger();
                l = r + 1;
            } else if (ch == ']') {
                String num = s.substring(l,r);
                if (!num.isEmpty()) {
                    curr.add(new NestedInteger(Integer.valueOf(num)));
                }
                if (!stack.isEmpty()) {
                    NestedInteger pop = stack.pop();
                    pop.add(curr);
                    curr = pop;
                }
                l = r + 1;
            } else if (ch == ',') {
                if (s.charAt(r-1) != ']') {
                    String num = s.substring(l, r);
                    curr.add(new NestedInteger(Integer.valueOf(num)));
                }
                l = r + 1;
            }
            r++;
        }
        return curr;
    }
}

class Solution398 {
    int[] num;
    Random rand;
    public Solution398(int[] nums) {
        num = nums;
        rand = new Random();
    }

    public int pick(int target) {
        int count= 0;
        int res = -1;
        for (int i = 0; i< num.length; i++) {
            if (num[i] == target) {
                count++;
                if (rand.nextInt(count) == 0) {
                    res = i;
                }
            }
        }
        return res;
    }
}

class Solution402 {
    public String removeKdigits(String num, int k) {
        if (num.length() == 0) {
            return "0";
        }

        Stack<Character> stack = new Stack<>();
        int i = 0;
        while(i < num.length()) {
            while(k>0 && !stack.isEmpty() && stack.peek() > num.charAt(i)) {
                stack.pop();
                k--;
            }
            stack.push(num.charAt(i));
            i++;
        }

        while(k >0 && !stack.isEmpty()){
            stack.pop();
            k--;
        }

        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        sb.reverse();
        while(sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }
}

class Solution403 {
    public boolean canCross(int[] stones) {
        int m = stones.length;
        if (m < 1) return true;
        Set<Integer>[] jumps = new Set[m];
        for (int i = 0; i < m; i++) {
            jumps[i] = new HashSet<>();
        }
        if (stones[1] == 1) {
            jumps[1].add(1);
        }
        for(int i = 1; i< m; i++) {
            Set<Integer> steps = jumps[i];
            for (Integer h : steps) {
                for (int j = i+ 1; j< m; j++) {
                    if ( (stones[j] - stones[i]) == h) {
                        jumps[j].add(h);
                    } else if ((stones[j] - stones[i]) == (h -1)) {
                        jumps[j].add(h-1);
                    } else if ((stones[j] - stones[i]) == (h+1)) {
                        jumps[j].add(h+1);
                    }
                }
            }
        }
        return jumps[m-1].size() > 0;
    }
}

class Solution404 {
    public int sumOfLeftLeaves(TreeNode root) {
        return rec(root, false);
    }

    private int rec(TreeNode root, boolean isLeft) {
        if (root == null) return 0;
        int leftVal = rec(root.left, true);
        int rightVal = rec(root.right, false);
        int rootVal = (root.left == null && root.right == null && isLeft) ? root.val : 0;
        return leftVal + rightVal + rootVal;
    }
}

class Solution405 {
    public String toHex(int num) {
        char[] map = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        if (num == 0) return "0";
        StringBuilder sb = new StringBuilder();
        while(num > 0) {
            sb.append(map[num & 15]);
            num = num >>> 4;
        }
        return sb.reverse().toString();
    }
}

class Solution406 {
    public int[][] reconstructQueue(int[][] people) {
        TreeMap<Integer, List<Integer>> map = new TreeMap<>();
        int m = people.length;
        for(int i = 0; i< m; i++) {
            int h = people[i][0];
            int location = people[i][1];
            List<Integer> locations = map.getOrDefault(h, new ArrayList<>());
            locations.add(location);
            map.put(h, locations);
        }
        for (Integer key : map.keySet()) {
            List<Integer> locations = map.get(key);
            Collections.sort(locations);
            map.put(key, locations);
        }

        int[][] res = new int[m][];
        boolean[] taken = new boolean[m];
        int height = map.firstKey();
        while(!map.isEmpty()) {
            List<Integer> locations = map.get(height);
            for (int i = 0; i< locations.size(); i++) {
                int l = locations.get(i);
                int index = findNthNoneTaken(taken, l-i);
                res[index] = new int[] {height, l};
                taken[index] = true;
            }
            map.remove(height);
            if (map.isEmpty()) {break;}
            height = map.higherKey(height);
        }
        return res;
    }

    private int findNthNoneTaken(boolean[] taken, int n) {
        for(int i = 0; i< taken.length; i++) {
            if (n == 0) {
                while(taken[i]) {
                    i++;
                }
                return i;
            }
            if (!taken[i]) {n--;}

        }
        return 0;
    }
}

// 10/19/17
class Solution407 {
    class Cell {
        int x, y, h;
        public Cell(int a, int b, int c) {x = a; y = b; h = c;}
    }
    public int trapRainWater(int[][] heightMap) {
        if (heightMap == null || heightMap.length == 0 || heightMap[0].length == 0) {
            return 0;
        }

        PriorityQueue<Cell> q = new PriorityQueue<>(new Comparator<Cell>() {
            @Override
            public int compare(Cell o1, Cell o2) {
                return o1.h - o2.h;
            }
        });

        int m = heightMap.length;
        int n = heightMap[0].length;
        boolean[][] visited = new boolean[m][n];

        // first and last row;
        for (int i = 0; i < m ; i++) {
            q.add(new Cell(i, 0, heightMap[i][0]));
            q.add(new Cell(i, n-1, heightMap[i][n-1]));
            visited[i][0] = true;
            visited[i][n-1] = true;
        }

        // first and last col
        for (int j = 1; j < n-1; j++) {
            q.add(new Cell(0, j, heightMap[0][j]));
            q.add(new Cell(m-1, j, heightMap[m-1][j]));
            visited[0][j] = true;
            visited[m-1][j] = true;
        }

        int[] xd = new int[] {0, 0, -1, 1};
        int[] yd = new int[] {-1, 1, 0, 0};

        int res = 0;
        while(!q.isEmpty()) {
            Cell cur = q.poll();
            for (int i = 0; i < 4; i++) {
                int x = cur.x + xd[i];
                int y = cur.y + yd[i];
                if (x >=0 && x < m && y >=0 && y < n && !visited[x][y]) {
                    res += Math.max(0, cur.h - heightMap[x][y]);
                    visited[x][y] = true;
                    q.add(new Cell(x, y, Math.max(cur.h, heightMap[x][y])));
                }
            }
        }
        return res;
    }
}

class Solution408 {
    public boolean validWordAbbreviation(String word, String abbr) {
        int i = 0;
        int j = 0;
        while(i<word.length() && j < abbr.length()) {
            if (abbr.charAt(j) == '0') return false;
            if(Character.isDigit(abbr.charAt(j))) {
                int len = 0;
                while(j < abbr.length() && Character.isDigit(abbr.charAt(j))) {
                    len = len * 10 + (abbr.charAt(j) - '0');
                    j++;
                }
                i += len;
            }
            if (i >= word.length() || j >= abbr.length()) {break;}
            if (word.charAt(i) != abbr.charAt(j)) {return false;}
        }
        return i == word.length() && j == abbr.length();
    }
}

class Solution363 {
    public int maxSumSubmatrix(int[][] matrix, int k) {
        if (matrix.length == 0) return 0;
        int m = matrix.length;
        int n = matrix[0].length;
        int res = Integer.MIN_VALUE;

        for(int left = 0; left < n; left ++) {
            int[] sums = new int[m];
            for (int right = left; right < n; right++) {
                for (int i = 0; i< m; i++) {
                    sums[i] += matrix[i][right];
                }
            }

            // TreeSet
            TreeSet<Integer> set = new TreeSet<>();
            set.add(0);
            int currSum = 0;
            for (int sum: sums) {
                currSum += sum;
                Integer num = set.ceiling(currSum-k);
                if (num != null) {res = Math.max(res, currSum- num);}
                set.add(currSum);
            }
        }
        return res;

    }

    class Res {
        int start, end, sum;
        public Res(int a, int b, int c) {start = a; end = b; sum = c;}
    }
    private Res Kadane(int[] nums) {
        int m = nums.length;
        int maxSum = 0;
        int maxLeft = 0;
        int maxRight = 0;
        int j = 0;
        int sum = 0;
        int i = 0;
        while(j< m) {
            sum += nums[j];
            if (sum > maxSum) {
                maxLeft = i;
                maxRight = j;
                maxSum = sum;
            } else if (sum < 0) {
                i = j +1;
                sum = 0;
            }
            j++;
        }
        if (maxSum > 0) {
            return new Res(maxLeft, maxRight, maxSum);
        } else {
            return null;
        }
    }
}

// 10/20/17
class Solution410 {
    public int splitArray(int[] nums, int m) {
        int max = 0; long sum = 0;
        for (int num : nums) {
            max = Math.max(num, max);
            sum += num;
        }
        if (m == 1) return (int)sum;
        //binary search
        long l = max; long r = sum;
        while (l <= r) {
            long mid = (l + r)/ 2;
            if (valid(nums, mid, m)) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return (int)l;
    }

    public boolean valid(int[] nums, long target, int m) {
        int count = 1;
        long total = 0;
        for (int num : nums) {
            total += num;
            if (total > target) {
                total = num;
                count++;
                if (count > m) {
                    return false;
                }
            }
        }
        return true;
    }
}

class Solution413 {
    public int numberOfArithmeticSlices(int[] A) {
        int diff = Integer.MAX_VALUE;
        int count = 0;
        int m = A.length;
        int res = 0;
        if (m < 3) return 0;

        for (int i = 1; i < m ; i++) {
            if (diff == Integer.MAX_VALUE) {
                count = 2;
                diff = A[i] - A[i-1];
            } else if (A[i] - A[i-1] == diff) {
                count++;
                continue;
            } else {
                for (int j = 3; j <= count; j++) {
                    res += (count - j + 1);
                }
                count = 2;
                diff = A[i] - A[i-1];
            }
        }
        for (int j = 3; j <= count; j++) {
            res += (count - j + 1);
        }
        return res;
    }
}

class Solution414 {
    public int thirdMax(int[] nums) {
        if (nums.length == 0) return 0;
        long[] maxArray = new long[3];
        Arrays.fill(maxArray, Long.MIN_VALUE);
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > maxArray[2]) {
                maxArray[0] = maxArray[1];
                maxArray[1] = maxArray[2];
                maxArray[2] = nums[i];
            } else if (nums[i] > maxArray[1]) {
                if (nums[i] == maxArray[2]) continue;
                maxArray[0] = maxArray[1];
                maxArray[1] = nums[i];
            } else if (nums[i] > maxArray[0]) {
                if (nums[i] == maxArray[1]) continue;
                maxArray[0] = nums[i];
            }
        }
        if (maxArray[0] != Long.MIN_VALUE) {
            return (int)maxArray[0];
        } else {
            return (int)maxArray[2];
        }
    }
}

class Solution415 {
    public String addStrings(String num1, String num2) {
        int carry = 0;
        List<Integer> res = new ArrayList<>();
        int m = num1.length()-1;
        int n = num2.length()-1;

        while(m>=0 && n>=0) {
            int a = num1.charAt(m) - '0';
            int b = num2.charAt(n) - '0';
            res.add((a+b+carry)%10);
            carry = (a+b+carry)/10;
            m--;
            n--;
        }
        while(m>=0) {
            int a = num1.charAt(m) - '0';
            res.add((a+carry)%10);
            carry = (a+carry) /10;
            m--;
        }
        while(n>=0) {
            int b = num2.charAt(n) - '0';
            res.add((b+carry)%10);
            carry = (b+carry) /10;
            n--;
        }
        if (carry>0) { res.add(carry); }
        StringBuilder sb = new StringBuilder();
        for (int i : res) {
            sb.append(String.valueOf(i));
        }
        return sb.reverse().toString();
    }
}

class Solution416 {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i : nums) {
            sum += i;
        }
        if (sum%2 != 0) {
            return false;
        }
        return knapsack(nums, sum/2);
    }

    private boolean knapsack(int[]nums, int target) {
        int m = nums.length;
        int[][] dp = new int[m][target+1];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j<=target; j++) {
                if (j - nums[i] >=0) {
                    dp [i][j] = Math.max(
                        nums[i] + (((i-1) >=0 && target-nums[i]>=0) ? dp[i-1][j-nums[i]] : 0),
                        (i-1) >= 0 ? dp[i-1][j] : 0);
                } else {
                    dp[i][j] = (i > 0) ? dp[i-1][j] : 0;
                }
            }
        }
        return dp[m-1][target] == target;
    }
}

class Solution417 {
    public List<int[]> pacificAtlantic(int[][] matrix) {
        List<int[]> res = new ArrayList<>();
        int m = matrix.length;
        if (m == 0) return res;
        int n = matrix[0].length;
        if (n == 0) return res;
        for(int i = 0; i< m; i++) {
            for (int j = 0; j<n; j++) {
                if (BFS(i,j, matrix)) {
                    res.add(new int[]{i,j});
                }
            }
        }
        return res;
    }

    public boolean BFS(int i, int j, int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        boolean[][] visited = new boolean[m][n];
        Arrays.fill(visited, false);
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{i,j});
        visited[i][j] = true;
        int[] xd = new int[]{0,0,-1,1};
        int[] yd = new int[]{-1,1,0,0};
        boolean touched[] = new boolean[4];
        boolean touchedP =false;
        boolean touchedA = false;
        while(!q.isEmpty()) {
            int[] tmp = q.poll();
            if(tmp[0] == 0) {touched[0] = true;}
            if(tmp[0] == m-1) {touched[1] = true;}
            if(tmp[1] == 0) {touched[2] = true;}
            if(tmp[1] == n-1) {touched[3] = true;}
            for(int k = 0; k < 4; k++) {
                int x = xd[k]+tmp[0];
                int y = yd[k]+tmp[1];
                if (x>=0 && x<m && y>=0 && y<n && matrix[x][y] <= matrix[tmp[0]][tmp[1]] && !visited[x][y]) {
                    q.add(new int[]{x,y});
                    visited[x][y] = true;
                }
            }
            touchedP = touched[0] || touched[2] || touchedP;
            touchedA = touched[1] || touched[3] || touchedA;
            if (touchedP && touchedA) return true;
        }
        return false;
    }
}

// 10/21/17
class Solution418 {
    public int wordsTyping(String[] sentence, int rows, int cols) {
        int res = 0;
        int index = 0;
        int m = sentence.length;
        if (m == 0) return res;
        for (int i = 0 ; i< rows ; i++) {
            if (res != 0 && m == 0) {
                res = res * (m /i);
                return res;
            }
            int l = 0;
            boolean firstword = true;
            StringBuilder sb = new StringBuilder();
            while ((l + sentence[index].length() + (firstword ? 0: 1)) <= cols) {
                sb.append(' ');
                sb.append(sentence[index]);
                l += sentence[index].length()  + (firstword ? 0: 1);
                index++;
                firstword = false;
                if (index == m) {
                    index = 0;
                    res++;
                }
            }
        }
        return res;
    }
}

class Solution419 {
    public int countBattleships(char[][] board) {
        int m = board.length;
        if (m == 0) return 0;
        int n = board[0].length;
        int res = 0;
        for (int i = 0; i< m; i++) {
            for (int j = 0; j<n; j++) {
                if (board[i][j] == '.') continue;
                if (i-1>=0 && board[i-1][j] == 'X') continue;
                if (j-1>=0 && board[i][j-1] == 'X') continue;
                res ++;
            }

        }
        return res;
    }
}

class Solution422 {
    public boolean validWordSquare(List<String> words) {
        if (words.size() != words.get(0).length()) return false;

        for (int i = 0; i< words.size(); i++) {
            for (int j = 0; j < words.get(i).length(); j++) {
                if (j >= words.size()) return false;
                if (words.get(j).length() < i+1) {return false;}
                if (words.get(i).charAt(j) != words.get(j).charAt(i)){
                    return false;
                }
            }
        }
        return true;
    }

}

class Solution425 {
    public List<List<String>> wordSquares(String[] words) {
        List<List<String>> res = new ArrayList<>();
        List<String> tmp = new ArrayList<>();
        find(words, res, tmp);
        return res;
    }

    private void find(String[] words, List<List<String>> res, List<String> input) {
        if (input.size() > 0 && input.size() == input.get(0).length()) {
            if ( verify(input)) {res.add(new ArrayList<>(input));}
            return;
        } else {
            for (int i = 0; i < words.length; i++) {
//                if (!input.contains(words[i])) {
                    input.add(words[i]);
                    find(words, res, input);
                    input.remove(input.size() - 1);
//                }
            }
        }
    }

    private boolean verify(List<String> words) {
        for (int i = 0; i< words.size(); i++) {
            for (int j = 0; j < words.get(i).length(); j++) {
                if (j >= words.size()) return false;
                if (words.get(j).length() < i+1) {return false;}
                if (words.get(i).charAt(j) != words.get(j).charAt(i)){
                    return false;
                }
            }
        }
        return true;
    }
}

class Solution424 {
    public int characterReplacement(String s, int k) {
        int l = 0;
        int maxCount = 0;
        int[] count = new int[26];
        int res = 0;
        for (int i = 0; i< s.length(); i++) {
            maxCount = Math.max(maxCount, ++count[s.charAt(i) - 'A']);
            while(i - l - maxCount + 1 > k) {
                count[l]--;
                l++;
            }
            res = Math.max(i - l + 1, res);
        }
        return res;
    }
}

//10/22/17
class AllOne {
    class Bucket{
        int val;
        Set<String> strSet;
        Bucket prev;
        Bucket next;
        public Bucket(int a) {val = a; strSet = new HashSet<>();}
    }

    private Map<String, Bucket> strMap;
//    private Map<Integer, Bucket> intMap;
    private Bucket minHead, maxHead;

    /** Initialize your data structure here. */
    public AllOne() {
        minHead = new Bucket(-1);
        maxHead = new Bucket(-1);
        minHead.next = maxHead;
        maxHead.prev = minHead;
    }

    /** Inserts a new key <Key> with value 1. Or increments an existing key by 1. */
    public void inc(String key) {
        Bucket b = strMap.getOrDefault(key, null);
        if (b == null) {
            if (minHead.next.val != 1) {
                createdBucket(minHead, minHead.next, 1);
            }
            minHead.next.strSet.add(key);
            strMap.put(key, minHead.next);
        } else {
            int originalCount = b.val;
            if (b.next.val != originalCount+1) {
                createdBucket(b, b.next, originalCount+1);
            }
            b.strSet.remove(key);
            b.next.strSet.add(key);
            strMap.put(key, b.next);
        }
    }

    private Bucket createdBucket(Bucket prev, Bucket next, int newVal) {
        Bucket tmp = new Bucket(newVal);
        tmp.next = prev.next;
        tmp.prev = next.prev;
        prev.next = tmp;
        next.prev = tmp;
        return tmp;
    }

    private void removeBucket(Bucket b) {
        if (b == null) return;
        b.prev.next = b.next;
        b.next.prev = b.prev;
    }

    /** Decrements an existing key by 1. If Key's value is 1, remove it from the data structure. */
    public void dec(String key) {
        Bucket b = strMap.getOrDefault(key, null);
        if (b == null) {return;} // key was never exist
        int originalCount = b.val;
        if (originalCount == 1) {
            b.strSet.remove(key);
            strMap.remove(key);
        }

        if (b.prev.val != originalCount -1) {
            createdBucket(b.prev, b, originalCount-1);
        }
        b.strSet.remove(key);
        b.prev.strSet.add(key);
        strMap.put(key, b.prev);
        if (b.strSet.isEmpty()) {
            removeBucket(b);
        }
    }

    /** Returns one of the keys with maximal value. */
    public String getMaxKey() {
        if (maxHead.prev.val == -1) return "";
        return maxHead.prev.strSet.toArray()[0].toString();
    }

    /** Returns one of the keys with Minimal value. */
    public String getMinKey() {
        if (minHead.next.val == -1) return "";
        return minHead.next.strSet.toArray()[0].toString();
    }
}

class Solution433 {
    public int minMutation(String start, String end, String[] bank) {
        int m = bank.length;
        boolean[] visited = new boolean[m];

        Queue<String> s = new LinkedList<>();
        s.add(start);
        s.add(null);
        int steps = 0;
        while(!s.isEmpty()) {
            String tmp = s.poll();
            if (tmp == null) {
                if (!s.isEmpty()) {
                    s.add(null);
                }
                steps++;
                continue;
            }
            if (end.equals(tmp)) {return steps;}

            for (int i = 0; i< bank.length; i++) {

                if (!visited[i] && onDistance(tmp, bank[i])) {
                    visited[i] = true;
                    s.add(bank[i]);
                }
            }
        }
        return -1;
    }

    private boolean onDistance(String s1, String s2){
        if (Math.abs(s1.length() - s2.length()) > 1) return false;

        int diff = 0;
        for (int i = 0; i< s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                diff ++;
            }
            if (diff > 1) return false;
        }
        return true;
    }
}

class Solution434 {
    public int countSegments(String s) {
        int k = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ' && (i == 0 || s.charAt(i-1) == ' ')) k++;
        }
        return k;

    }
}

class Solution435 {
    public int eraseOverlapIntervals(
            Solution252.Interval[] intervals) {

        int m = intervals.length;
        if (m < 1) return 0;
        Arrays.sort(intervals, new Comparator<Solution252.Interval>() {
            @Override
            public int compare(Solution252.Interval o1, Solution252.Interval o2) {
                return o1.end - o2.end;
            }
        });

        int res = 0;
        Solution252.Interval end = intervals[0];
        for (int i = 1; i < m; i++) {
            if (intervals[i].start < end.end) {
                res++;
            } else {
                end = intervals[i];
            }
        }
        return res;
    }
}

class Solution436 {
    public int[] findRightInterval(Solution252.Interval[] intervals) {
        TreeMap<Solution252.Interval, Integer> map = new TreeMap<>(
            new Comparator<Solution252.Interval>() {
                @Override
                public int compare(Solution252.Interval o1, Solution252.Interval o2) {
                    return o1.start - o2.start;
            }
        });

        int m = intervals.length;
        int[] right = new int[m];
        for (int i = 0; i<m; i++) {
            map.put(intervals[i], i);
        }

        for (int i = 0; i < m; i++) {
            Solution252.Interval rightKey = map.ceilingKey(intervals[i]);
            while(rightKey != null && rightKey.start < intervals[i].end) {
                rightKey = map.higherKey(rightKey);
            }
            if (rightKey != null) {
                right[i] = map.get(rightKey);
            } else {
                right[i] = -1;
            }
        }
        return right;
    }
}

class Solution437 {
    int totalCount = 0;
    public int pathSum(TreeNode root, int sum) {
        List<Integer> res = new ArrayList<>();
        pathCount(res, root, sum);
        return totalCount;
    }

    private void pathCount(List<Integer> res, TreeNode root, int sum) {
        if (root == null) return;
        else {
            res.add(
                    res.size() ==0 ?
                            root.val :
                            res.get(res.size()-1) + root.val);
            if (res.get(res.size()-1) == sum) totalCount++;
            for (int i = 0;i < res.size()-1; i++) {
                if (res.get(res.size()-1) - res.get(i) == sum) {
                    totalCount ++;
                }
            }
            pathCount(res, root.left, sum);
            pathCount(res, root.right, sum);
            res.remove(res.size()-1);
        }
    }
}

class Solution438 {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        int[] key = new int[26];
        int[] window = new int[26];
        for (int i = 0; i<p.length(); i++) {
            key[p.charAt(i)-'a']++;
        }
        int l = 0;
        int r = 0;


        while (r < s.length()) {
            while(r-l+1 <= p.length() && r < s.length()) {
                window[s.charAt(r) - 'a']++;
                r++;
            }
            if (sameAnagram(key, window)) {
                res.add(l);
            }
            window[s.charAt(l) - 'a']--;
            l++;
        }
        return res;
    }

    boolean sameAnagram(int[] a, int[] b) {
        for (int i = 0; i< 26; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }
}

class Solution439 {
    public String parseTernary(String expression) {
        if (expression == null || expression.length() == 0) return "";

        Stack<Character> stack = new Stack<>();
        int i = expression.length()-1;
        while(i>=0) {
            if (expression.charAt(i) == '?') {
                char a = stack.pop();
                char b = stack.pop();

                if (expression.charAt(i-1) == 'T') {
                    stack.push(a);
                } else {
                    stack.push(b);
                }
                i --;
            } else if (expression.charAt(i) != ':') {
                stack.push(expression.charAt(i));
            }
            i --;
        }
        return stack.pop().toString();
    }

}

class Solution441 {
    public int arrangeCoins(int n) {
        int i = 0;
        while(n-i >=0) {
            n = n -i;
            i++;
        }
        return i-1;
    }
}

class Solution445 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> l1Stack = new Stack<>();
        Stack<Integer> l2Stack = new Stack<>();
        while(l1 != null) {
            l1Stack.push(l1.val);
            l1 = l1.next;
        }
        while(l2 != null) {
            l2Stack.push(l2.val);
            l2 = l2.next;
        }
        ListNode tmp = null;
        int carry = 0;
        while(!l1Stack.isEmpty() && !l2Stack.isEmpty()) {
            int a = l1Stack.pop();
            int b = l2Stack.pop();

            int val = (a+b+carry)%10;
            carry = (a+b+carry)/10;
            ListNode cur = new ListNode(val);
            cur.next = tmp;
            tmp = cur;
        }

        if (!l2Stack.isEmpty()) {
            l1Stack = l2Stack;
        }

        while(!l1Stack.isEmpty()) {
            int a = l1Stack.pop();
            int val = (a + carry) % 10;
            carry = (a + carry) / 10;
            ListNode cur = new ListNode(val);
            cur.next = tmp;
            tmp = cur;
        }
        if (carry != 0) {
            ListNode cur = new ListNode(carry);
            cur.next = tmp;
            tmp = cur;
        }
        return tmp;

    }
}

class Solution446 {
    public int numberOfArithmeticSlices(int[] A) {
        int diff = Integer.MAX_VALUE;
        int count = 0;
        int m = A.length;
        int res = 0;
        if (m < 3) return 0;

        for (int i = 1; i < m ; i++) {
            if (diff == Integer.MAX_VALUE) {
                count = 2;
                diff = A[i] - A[i-1];
            } else if (A[i] - A[i-1] == diff) {
                count++;
                continue;
            } else {
                for (int k = 3; k <=count; k = k+2) {
                    for (int j = k; j <= count; j++) {
                        res += (count - j + 1);
                    }
                }
                count = 2;
                diff = A[i] - A[i-1];
            }
        }
        for (int k = 3; k <=count; k = k+2) {
            for (int j = k; j <= count; j++) {
                res += (count - j + 1);
            }
        }
        return res;
    }
}

class Solution447 {
    public int numberOfBoomerangs(int[][] points) {
        int m = points.length;
        if (m < 3) return 0;
        Map<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for(int i = 0; i < m; i++) {
            map.clear();
            for (int j = 0; j < m; j++) {
                if (i == j) continue;

                int dist = findDistance(points[i], points[j]);
                int count = map.getOrDefault(dist, 0) + 1;
                map.put(dist, count);
            }

            for (int val : map.values()) {
                res += (val * (val -1));
            }
        }
        return res;
    }

    private int findDistance(int[] a, int[] b) {
        int xd = a[0] - b[0];
        int yd = a[1] - b[1];
        return xd*xd + yd*yd;
    }
}

// 10/23/17
class Solution448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for(int i = 0; i< nums.length; i++) {
            if (nums[nums[i]-1] > 0 ) {
                nums[nums[i] -1] = -nums[nums[i] -1];
            }
        }
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i< nums.length; i++) {
            if (nums[i] > 0) {
                res.add(i+1);
            }
        }
        return res;
    }
}

class Codec449 {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        serializeRec(root, sb);
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }

    private void serializeRec(TreeNode root, StringBuilder sb) {
        if (root == null) {sb.append('#'); sb.append(','); return;}
        sb.append(String.valueOf(root.val));
        sb.append(",");
        serializeRec(root.left, sb);
        serializeRec(root.right, sb);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Queue<String> d = new LinkedList<>(Arrays.asList(data.split(",")));
        return create(d);
    }

    private TreeNode create(Queue<String> d) {
        String s = d.poll();
        if (s.equals("#")) return null;
        TreeNode root = new TreeNode(Integer.parseInt(s));
        root.left = create(d);
        root.right = create(d);
        return root;
    }
}

class Solution450 {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;
        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        } else {
            if (root.left == null) {return root.right;}
            if (root.right == null) {return root.left;}

            TreeNode min = findMin(root.right);
            root.val = min.val;
            root.right = deleteNode(root.right, root.val);
        }
        return root;
    }

    private TreeNode findMin(TreeNode root) {
        while(root.left != null) {
            root = root.left;
        }
        return root;
    }
}

class Solution451 {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        TreeMap<Integer, List<Character>> reverseMap = new TreeMap<>();
        for(Character c : map.keySet()) {
            List<Character> list = reverseMap.getOrDefault(map.get(c), new ArrayList<>());
            list.add(c);
            reverseMap.put(map.get(c), list);
        }
        Integer largest = reverseMap.lastKey();
        StringBuilder sb = new StringBuilder();
        while(largest != null) {
            List<Character> list = reverseMap.get(largest);
            for(Character c: list) {
                for (int i = 0; i< largest; i++) {
                    sb.append(c);
                }
            }
            largest = reverseMap.lowerKey(largest);
        }
        return sb.toString();
    }
}

// 10/24/17
class Solution452 {
    public int findMinArrowShots(int[][] points) {
        int m = points.length;
        if (m == 0) return 0;
        Comparator<int[]> cmp = new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        };
        Arrays.sort(points, cmp);

        int res = 0;
        int i = 0;
        while (i<m) {
            res ++;
            int j = i+1;
            while(j < m  && points[j][0] < points[i][1]) {
                j++;
            }
            i = j;
        }
        return res;
    }
}

class Solution453 {
    public int minMoves(int[] nums) {
        int m = nums.length;
        if (m == 0) return 0;
        int minVal = nums[0];
        for (int i = 1; i < m; i++) {
            minVal = Math.min(minVal, nums[i]);
        }
        int res = 0;
        for (int i = 0; i < m; i++) {
            res += (nums[i] - minVal);
        }
        return res;
    }
}

class Solution454 {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer, Integer> map = new HashMap<>();
        int m = C.length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                int sum = C[i] + D[j];
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }

        int res = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                int sum = A[i] + B[j];
                res += map.getOrDefault(-sum, 0);
            }
        }
        return res;
    }
}

class Solution455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = s.length - 1;
        int j = g.length - 1;
        while(i > 0 && j > 0) {
            if (s[i] >= g[j]) {
                i--;
                j--;
            } else {
                j++;
            }
        }
        return i;
    }
}

class Solution458 {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int res = 0;
        int base = minutesToTest/minutesToDie + 1;
        while(Math.pow(base, res) < buckets) {
            res++;
        }
        return res;
    }
}

class Solution459 {
    public boolean repeatedSubstringPattern(String s) {
        int l = s.length();
        for (l = s.length()/2; l >0; l--) {
            int tmp = 0;
            boolean found = true;
            while((tmp + l) <= s.length()) {
                if (!s.substring(0, l).equals(s.substring(tmp, tmp+l))) {
                    found = false;
                    break;
                }
                tmp+=l;
            }
            if (found && tmp == s.length()) return true;
        }
        return false;
    }
}

class Solution461 {
    public int hammingDistance(int x, int y) {
        int res = 0;
        int xor = x^y;
        for (int i = 0; i< 32; i++) {
            if(((xor>>i) & 1) == 1) {
                res++;
            }
        }
        return res;
    }
}

// 10/26/17
class Solution462 {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int i = 0, j = nums.length-1;
        int res = 0;
        while(i<j) {
            res = nums[j--] - nums[i++];
        }
        return res;
    }
}

class Solution463 {
    public int islandPerimeter(int[][] grid) {
        int m = grid.length;
        if (m == 0) return 0;
        int n = grid[0].length;

        int[] xd = new int[]{0, 0, -1, 1};
        int[] yd = new int[]{-1,1, 0, 0};
        int res = 0;
        for (int i = 0; i< m ;i ++) {
            for (int j = 0; j< n; j++) {
                if (grid[i][j] == 0) {continue;}
                for (int l = 0; l < 4; l++) {
                    if ((i + xd[l]) < m && (i+ xd[l]) >=0 &&
                            (j + yd[l]) < n && (j + yd[l]) >=0) {
                        if (grid[i+xd[l]][j+yd[l]] == 0) {
                            res++;
                        }
                    } else {
                        res ++;
                    }
                }
            }
        }
        return res;
    }
}

// 10/271/7
class Solution464 {
    Map<Integer, Boolean> map;

    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        int total =  (maxChoosableInteger + 1) * maxChoosableInteger /2;
        if (total < desiredTotal) return false;
        boolean[] picked = new boolean[maxChoosableInteger+1];
        map = new HashMap<>();
        return dfs(picked, desiredTotal);
    }

    public boolean dfs(boolean[] picked, int desiredTotal) {
        if (desiredTotal <=0) return false;
        int key = convert(picked);
        if (!map.containsKey(key)) {
            for (int i = 1; i < picked.length; i++) {
                if (picked[i]) continue;
                picked[i] = true;
                if (!dfs(picked, desiredTotal - i)) {
                    map.put(key, true);
                    picked[i] = false;
                    return true;
                }
                picked[i] = false;
            }
            map.put(key, false);
        }
        return map.get(key);
    }

    private int convert (boolean[] picked) {
        if (picked.length > 32) return 0;
        int res = 0;
        for (int i = 0; i< picked.length; i++) {
            res <<=1;
            if(picked[i]) res |= 1;
        }
        return res;
    }
}

//10/28/17
class Solution468 {
    public String validIPAddress(String IP) {
        if (IP.indexOf('.') > 0) {
            return checkIP4(IP) ? "IPv4" : "Neither";
        } else if (IP.indexOf(':') > 0) {
            return checkIP6(IP) ? "IPv6" : "Neither";
        } else {
            return "Neither";
        }
    }

    boolean checkIP4(String s) {
        String[] tokens = s.split("\\.");
        if (tokens.length != 4) return false;
        if (s.startsWith(".") || s.endsWith(".")) return false;
        for (int i = 0 ; i< 4; i++) {
            try {
                int k = Integer.parseInt(tokens[i]);
                if (k < 0 || k >=256) return false;
                if (k == 0 && tokens[i].length() >1) return false;
                if (k > 0 && tokens[i].startsWith("0")) return false;
                if (tokens[i].startsWith("+") || tokens[i].startsWith("-")) {
                    return false;
                }
            } catch (NumberFormatException ex) {
                return false;
            }
        }
        return true;
    }

    boolean checkIP6(String s) {
        String[] tokens = s.split(":");
        if (tokens.length != 8) return false;
        if (s.startsWith(":") || s.endsWith(":")) return false;
        for (int i = 0; i < 8; i++) {
            if (tokens[i].length() > 4) return false;
            try {
                int k = Integer.parseInt(tokens[i], 16);
                if (tokens[i].startsWith("+") || tokens[i].startsWith("-")) {
                    return false;
                }
            } catch(NumberFormatException ex) {
                return false;
            }
        }
        return true;
    }
}

class Solution469 {
    public boolean isConvex(List<List<Integer>> points) {
        boolean negative = false;
        boolean postive = false;
        for (int i = 0; i < points.size(); i++) {
            List<Integer> a = points.get(i);
            List<Integer> b = points.get((i+1)%points.size());
            List<Integer> c = points.get((i+2)%points.size());
            int crossProduct = crossProduct(
                    a.get(0), a.get(1),
                    b.get(0), b.get(1),
                    c.get(0), c.get(1)
            );
            if (crossProduct < 0) {negative = true;}
            if (crossProduct > 0) {postive = true;}

            if (negative & postive) return false;
        }
        return true;

    }

    private int crossProduct(int Ax, int Ay, int Bx, int By, int Cx, int Cy) {
        int ABx = Ax - Bx;
        int ABy = Ay - By;
        int CBx = Cx - Bx;
        int CBy = Cy - By;

        return ABx * CBy - CBx * ABy;
    }
}

class Solution471 {
    public boolean makesquare(int[] nums) {
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        if (sum%4 != 0) return false;
        int[] seperator = new int[3];
        Arrays.fill(seperator, -1);
        boolean[] selected = new boolean[nums.length];
        return dfs(nums, selected, 0, 0, sum/4);
    }

    private boolean dfs(int[] nums, boolean[] selected, int count, int sum, int target) {
        if (sum > target) return false;
        if (sum == target) {
            if (count == 2) {
                return true;
            } else {
                count++;
                sum = 0;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (selected[i]) continue;;
            selected[i] = true;
            if (dfs(nums, selected, count, sum+nums[i], target))
            {
                selected[i] = false;
                return true;
            }
            selected[i] = false;
        }
        return false;
    }
}

class Solution474 {
    public int findMaxForm(String[] strs, int m, int n) {
        int k = strs.length;
        int[][] tracker = new int[k][];
        for (int i = 0; i< k; i++) {
            tracker[i] = countBits(strs[i]);
        }
        boolean[] picked = new boolean[k];
        return dfs(tracker, picked, m, n, 0);
    }

    private int dfs(int[][] tracker, boolean[] picked, int m, int n, int total) {
        if (total == picked.length && m >=0 && n >=0) return total;
        if (m < 0 || n < 0) {
            return total - 1;
        }

        int res = 0;
        for (int i = 0 ;i < tracker.length; i++) {
            if (picked[i]) {continue;}
            picked[i] = true;
            res = Math.max(res, dfs(tracker, picked, m - tracker[i][0], n - tracker[i][1], total + 1));
            picked[i] = false;
        }
        return res;
    }

    private int[] countBits(String s) {
        int[] res = new int[2];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                res[0]++;
            } else {
                res[1]++;
            }
        }
        return res;
    }
}

class Solution474I {
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] dp = new int[m+1][n+1];
        int k = strs.length;
        int[][] tracker = new int[k][];
        for (int i = 0; i< k; i++) {
            tracker[i] = countBits(strs[i]);
        }

        for (int l = 0; l < k; l++) {
            for(int i = m; i >= tracker[l][0]; i--) {
                for (int j = n; j >= tracker[l][1]; j--) {
                    dp[i][j] = Math.max(dp[i][j], dp[i- tracker[l][0]][ j -tracker[l][1]] + 1);
                }
            }
        }
        return dp[m][n];
    }

    private int[] countBits(String s) {
        int[] res = new int[2];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                res[0]++;
            } else {
                res[1]++;
            }
        }
        return res;
    }
}

class Solution475 {
    public int findRadius(int[] houses, int[] heaters) {
        int radius = 0;
        int hindex = 0;
        if (houses.length == 0) return 0;
        if (heaters.length == 0) return 0;
        Arrays.sort(houses);
        Arrays.sort(heaters);
        for (int i = 0; i< houses.length; i++) {
            if (hindex + 1 < heaters.length) {
                while(hindex +1 < heaters.length &&
                        Math.abs(houses[i] - heaters[hindex]) > Math.abs(houses[i] - heaters[hindex+1])) {
                    hindex = hindex + 1;
                }
            }
            radius = Math.max(radius, Math.abs(houses[i] - heaters[hindex]));
        }
        return radius;
    }
}

class Solution476 {
    public int findComplement(int num) {
        boolean[] b = new boolean[32];
        for (int i = 0; i < 32; i++) {
            b[i] = (num & 1) == 1 ? true : false;
            num >>= 1;
        }
        boolean start = false;
        int res = 0;
        for (int i = 31; i >=0; i--) {
            if (!start && !b[i]) continue;
            res <<= 1;
            start = true;
            if (!b[i]) { res |= 1;}

        }
        return res;
    }
}

class Solution477 {
    public int totalHammingDistance(int[] nums) {
        int n = nums.length;
        int[] t = new int[32];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < 32; j++) {
                if ((nums[i] & 1) == 1) {
                    t[j]++;
                }
                nums[i] >>= 1;
            }
        }
        int res = 0;
        for (int j = 0; j < 32; j++) {
            res += (n-t[j]) * t[j];
        }
        return res;
    }
}

class Solution482 {
    public String licenseKeyFormatting(String S, int K) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i< S.length(); i++) {
            if (S.charAt(i) != '-') {
                sb.append(Character.toUpperCase(S.charAt(i)));
            }
        }

        int i = sb.length();
        StringBuilder res = new StringBuilder();
        while(i-K >=0) {
            res.insert(0, sb.substring(i-K, i));
            res.insert(0, "-");
            i = i - K;
        }
        res.insert(0,sb.subSequence(0,i));
        return res.toString();
    }
}

class Solution484 {
    public int[] findPermutation(String s) {
        int[] res = new int[s.length()+1];
        for (int i = 0; i< res.length; i++) {
            res[i] = i+1;
        }

        for (int r = 0; r < s.length(); r++) {
            if (s.charAt(r) == 'D') {
                int l = r;
                while (r < s.length() && s.charAt(r) == 'D') {
                    r++;
                }
                reverse(res, l, r);
            }
        }
        return res;
    }

    private void reverse(int[] arr, int l, int r) {
        while (l < r) {
            int tmp = arr[r];
            arr[r] = arr[l];
            arr[l] = tmp;
            l++;
            r--;
        }
    }
}

class Solution485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res = 0;
        int count = 0;
        for (int i = 0; i< nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                res = Math.max(res, count);
            } else {
                count=0;
            }
        }
        return res;
    }
}

class Solution486 {
    public boolean PredictTheWinner(int[] nums) {
        return dfs(nums, 0, nums.length-1, 0, 0, true);
    }

    private boolean dfs(int[] nums, int l, int r, int score1, int score2, boolean start1) {
        if (l > r) {return score1 > score2;}
        if (start1) {
            if (dfs(nums, l+1, r, score1+nums[l], score2, false) ||
                    dfs(nums, l, r-1, score1+nums[r], score2, false)) {
                return true;
            }
        } else {
            if (dfs(nums, l+1, r, score1, score2+nums[l], true) &&
                    dfs(nums, l, r-1, score1, score2+ nums[r], true)) {
                return true;
            }
        }
        return false;
    }
}

// 10/29/17
class Solution487 {
    class Interval {
        int start;
        int end;
        Interval() { start = 0; end = 0; }
        Interval(int s, int e) { start = s; end = e; }
    }

    public int findMaxConsecutiveOnes(int[] nums) {
        List<Interval> intervals = new ArrayList<>();
        int l = -1;
        for (int i = 0; i< nums.length; i++) {
            if (nums[i] == 1 && l == -1) {l = i; continue;}
            if (nums[i] == 0 && l != -1) {
                Interval tmp = new Interval(l, i-1);
                intervals.add(tmp);
                l = -1;
            }
        }
        if (l != -1) {
            intervals.add(new Interval(l, nums.length -1));
        }

        int res = 0;
        for (int i = 0; i< intervals.size(); i++) {
            res = Math.max(res, (intervals.get(i).end - intervals.get(i).start + 2));
            if ((i + 1) < intervals.size()) {
                if (intervals.get(i+1).start - intervals.get(i).end == 2) {
                    int l1 = intervals.get(i).end - intervals.get(i).start + 1;
                    int l2 = intervals.get(i+1).end - intervals.get(i+1).start + 1;
                    res = Math.max(res, l1 + l2 + 1);
                }
            }
        }
        return res;
    }
}

class Solution487I {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res = 0;
        int zero = 0;
        for (int l = 0, r = 0; r < nums.length; r++) {
            if (nums[r] == 0) {zero++;}
            while(zero > 1) {
                if (nums[l++] == 0) {
                    zero--;
                }
            }
            res = Math.max(res, r -l +1);
        }
        return res;
    }
}

class Solution490 {
    class Point{
        int x, y;
        public Point(int a, int b) {x = a; y = b;}

        @Override
        public boolean equals(Object o) {
            if (!(o instanceof Point)) {return false;}
            return x == ((Point)o).x && y == ((Point)o).y;
        }
    }

    public boolean hasPath(int[][] maze, int[] start, int[] destination) {
        int m = maze.length;
        int n = maze[0].length;
        boolean[][] visited = new boolean[m][n];
        return findPath(maze, visited, new Point(start[0] , start[1]), destination);
    }

    private boolean findPath(int[][] maze, boolean[][] visited, Point cur, int[] destination) {
        Point up = moveUp(maze, cur);
        if (!visited[up.x][up.y]) {
            visited[up.x][up.y] = true;
            if (up.x == destination[0] && up.y == destination[1]) return true;
            else {
                if (findPath(maze, visited, up, destination)) return true;
            }
        }
        Point left = moveLeft(maze, cur);
        if (!visited[left.x][left.y]) {
            visited[left.x][left.y] = true;
            if (left.x == destination[0] && left.y == destination[1]) return true;
            else {
                if (findPath(maze, visited, left, destination)) return true;
            }
        }
        Point down = moveDown(maze, cur);
        if (!visited[down.x][down.y]) {
            visited[down.x][down.y] = true;
            if (down.x == destination[0] && down.y == destination[1]) return true;
            else {
                if (findPath(maze, visited, down, destination)) return true;
            }
        }
        Point right = moveRight(maze, cur);
        if (!visited[right.x][right.y]) {
            visited[right.x][right.y] = true;
            if (right.x == destination[0] && right.y == destination[1]) return true;
            else {
                if (findPath(maze, visited, right, destination)) return true;
            }
        }
        return false;
    }

    private Point moveUp(int[][] maze, Point cur) {
        int tmp = cur.x;
        while(tmp-1 >= 0 && maze[tmp-1][cur.y] == 0) {
            tmp--;
        }
        return new Point(tmp, cur.y);
    }

    private Point moveDown(int[][] maze, Point cur) {
        int x = cur.x;
        while((x+1) <maze.length && maze[x+1][cur.y] == 0) {
            x++;
        }
        return new Point(x, cur.y);
    }

    private Point moveLeft(int[][] maze, Point cur) {
        int y = cur.y;
        while(y-1 >= 0 && maze[cur.x][y-1] == 0) {
            y--;
        }
        return new Point(cur.x, y);
    }

    private Point moveRight(int[][] maze, Point cur) {
        int y = cur.y;
        while(y+1<maze[0].length && maze[cur.x][y+1] == 0) {
            y++;
        }
        return new Point(cur.x, y);
    }
}

class Solution491 {
    public List<List<Integer>> findSubsequences(int[] nums) {
        int m = nums.length;
        Set<List<Integer>> res = new HashSet<>();
        for (int i = 0; i < m; i++) {
            List<Integer> tmp = new ArrayList<>();
            tmp.add(nums[i]);
            dfs(nums, i, tmp, res);
        }
        return new ArrayList<>(res);
    }

    private void dfs(int[] nums, int index, List<Integer> track, Set<List<Integer>> res) {
        if (track.size() > 1 && !res.contains(track)) {
            res.add(new ArrayList<>(track));
        }
        for (int i = index + 1; i < nums.length; i++) {
            if (nums[i] >= track.get(track.size()-1)) {
                track.add(nums[i]);
                dfs(nums, i, track, res);
                track.remove(track.size()-1);
            }
        }
    }
}

class Solution492 {
    public int[] constructRectangle(int area) {
        int root = (int)Math.sqrt(area);
        while(root > 1) {
            if (area % root == 0) {
                return new int[] {area/root, root};
            }
            root--;
        }
        return new int[]{area, 1};
    }
}

class Solution494 {
    public int findTargetSumWays(int[] nums, int S) {
        return dfs(nums, 0, S, 0);
    }

    private int dfs(int[] nums, int index, int target, int sum) {
        if (index >= nums.length){
            if (sum == target) { return 1;}
            else {return 0;}
        }

        int plusCount = dfs(nums, index+1, target, sum+nums[index]);
        int minusCount = dfs(nums, index+1, target, sum-nums[index]);
        return plusCount + minusCount;
    }
}

class Solution496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i< nums2.length; i++) {
            while (!s.isEmpty() && nums2[i] > s.peek()) {
                map.put(s.pop(), nums2[i]);
            }
            s.push(nums2[i]);
        }
        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            res[i] = map.getOrDefault(nums1[i], -1);
        }
        return res;
    }
}

class Solution497 {
    public int[] findDiagonalOrder(int[][] matrix) {
        int direction = 1;
        int i = 0, j = 0;
        int m = matrix.length;
        if (m == 0) {return new int[0];}
        int n = matrix[0].length;

        List<Integer> res = new ArrayList<>();
        while(i != m && j != n) {
            res.add(matrix[i][j]);
            if (direction == 1 && (i == 0 || j == n-1)){
                direction = -1;
                if (j + 1 < n) {j++;}
                else {i++;}
                continue;
            }
            if (direction == -1 && (j == 0 || i == m -1)) {
                direction = 1;
                if (i+1 < m) {i ++;}
                else {j++;}
                continue;
            }
            i = i - direction;
            j = j + direction;
        }
        int[] arr = new int[m*n];
        for(int k = 0; k< m*n; k++) {
            arr[k] = res.get(k);
        }
        return arr;
    }
}

class Solution499 {
    // this question need dijkstry method.
    // 1, build a graphy of which point can go to which point and weight of the edge
    // 2.
    class Point implements Comparable<Point> {
        int x,y,l;
        String s;
        public Point(int _x, int _y) {x=_x;y=_y;l=Integer.MAX_VALUE;s="";}
        public Point(int _x, int _y, int _l,String _s) {x=_x;y=_y;l=_l;s=_s;}
        public int compareTo(Point p) {return l==p.l?s.compareTo(p.s):l-p.l;}
    }
    public String findShortestWay(int[][] maze, int[] ball, int[] hole) {
        int m=maze.length, n=maze[0].length;
        Point[][] points=new Point[m][n];
        for (int i=0;i<m*n;i++) points[i/n][i%n]=new Point(i/n, i%n);
        int[][] dir=new int[][] {{-1,0},{0,1},{1,0},{0,-1}};
        String[] ds=new String[] {"u","r","d","l"};
        PriorityQueue<Point> list=new PriorityQueue<>(); // using priority queue
        list.offer(new Point(ball[0], ball[1], 0, ""));
        while (!list.isEmpty()) {
            Point p=list.poll();
            if (points[p.x][p.y].compareTo(p)<=0) continue; // if we have already found a route shorter
            points[p.x][p.y]=p;
            for (int i=0;i<4;i++) {
                int xx=p.x, yy=p.y, l=p.l;
                while (xx>=0 && xx<m && yy>=0 && yy<n && maze[xx][yy]==0 && (xx!=hole[0] || yy!=hole[1])) {
                    xx+=dir[i][0];
                    yy+=dir[i][1];
                    l++;
                }
                if (xx!=hole[0] || yy!=hole[1]) { // check the hole
                    xx-=dir[i][0];
                    yy-=dir[i][1];
                    l--;
                }
                list.offer(new Point(xx, yy, l, p.s+ds[i]));
            }
        }
        return points[hole[0]][hole[1]].l==Integer.MAX_VALUE?"impossible":points[hole[0]][hole[1]].s;
    }
}

class Solution500 {
    public String[] findWords(String[] words) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('a', 1);
        map.put('b', 2);
        map.put('c', 2);
        map.put('d', 1);
        map.put('e', 0);
        map.put('f', 1);
        map.put('g', 1);
        map.put('h', 1);
        map.put('i', 0);
        map.put('j', 1);
        map.put('k', 1);
        map.put('l', 1);
        map.put('m', 2);
        map.put('n', 2);
        map.put('o', 0);
        map.put('p', 0);
        map.put('q', 0);
        map.put('r', 0);
        map.put('s', 1);
        map.put('t', 0);
        map.put('u', 0);
        map.put('v', 2);
        map.put('w', 0);
        map.put('x', 2);
        map.put('y', 0);
        map.put('z', 2);

        List<String> res = new ArrayList<>();
        for (int i = 0; i< words.length; i++) {
            int row = map.get(Character.toLowerCase(words[i].charAt(0)));
            boolean add = true;
            for (int k = 1; k < words[i].length(); k++) {
                if (map.get(Character.toLowerCase(words[i].charAt(k))) != row) {
                    add = false;
                    break;
                }
            }
            if (add) {
                res.add(words[i]);
            }
        }

        String[] arr = new String[res.size()];
        for (int i = 0; i< res.size(); i++) {
            arr[i] = res.get(i);
        }
        return arr;
    }
}

// 10/30/17
class Solution501 {
    public int[] findMode(TreeNode root) {
        Map<Integer, Integer> map = new HashMap<>();
        dfs(root, map);
        List<Integer> list = new ArrayList<>();
        int maxCount = 0;
        for(Integer i : map.keySet()) {
            if (map.get(i) == maxCount) {
                list.add(i);
            } else if (map.get(i) > maxCount) {
                list.clear();
                list.add(i);
                maxCount = map.get(i);
            }
        }
        int m = list.size();
        int[] arr = new int[m];
        for (int i = 0;i < m; i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }

    private void dfs(TreeNode root, Map<Integer, Integer> map) {
        if (root == null) {return;}

        dfs(root.left, map);
        dfs(root.right, map);
        map.put(root.val, map.getOrDefault(root.val, 0)+1);
    }
}

class Solution502 {
    class Project{
        int capital, profit;
        public Project(int a, int b) {capital = a; profit = b;}
    }
    public int findMaximizedCapital(int k, int W, int[] Profits, int[] Capital) {
        PriorityQueue<Project> capQueue = new PriorityQueue<>(
                (Project a, Project b) -> (a.capital - b.capital));
        PriorityQueue<Project> proQueue = new PriorityQueue<>(
                (Project a, Project b) -> -(a.profit - b.profit));

        int m = Profits.length;
        for (int i = 0; i< m; i++) {
            capQueue.add(new Project(Capital[i], Profits[i]));
        }

        for (int i = 0; i< k; i++) {
            while(!capQueue.isEmpty() && W >= capQueue.peek().capital) {
                proQueue.add(capQueue.poll());
            }
            if (proQueue.isEmpty()) { break;}
            W += proQueue.peek().profit;
            proQueue.poll();
        }
        return W;
    }
}

class Solution503 {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Arrays.fill(res, -1);
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i< n*2; i++) {
            while (!s.isEmpty() && nums[i % n] > nums[s.peek()]) {
                if (s.peek() >=n) { break;}
                res[s.pop()] = nums[i%n];
            }
            s.push(i%n);
        }

        return res;
    }
}

class Solution504 {
    public String convertToBase7(int num) {
        if (num == 0) return "0";
        boolean isNegative = num < 0;
        num = Math.abs(num);
        StringBuilder sb = new StringBuilder();
        while(num >0) {
            sb.append(String.valueOf(num%7));
            num = num/7;
        }
        if (isNegative) {
            sb.append("-");
        }
        return sb.reverse().toString();
    }
}

class Solution505 {
    class Point {
        int x,y,l;
        public Point(int _x, int _y, int _l) {x=_x;y=_y;l=_l;}
    }
    public int shortestDistance(int[][] maze, int[] start, int[] destination) {
        int m=maze.length, n=maze[0].length;

        int[][] length=new int[m][n]; // record length
        for (int i=0;i<m*n;i++) length[i/n][i%n]=Integer.MAX_VALUE;
        int[][] dir=new int[][] {{-1,0},{0,1},{1,0},{0,-1}};
        PriorityQueue<Point> list=new PriorityQueue<>((o1,o2)->o1.l-o2.l); // using priority queue
        list.offer(new Point(start[0], start[1], 0));
        while (!list.isEmpty()) {
            Point p=list.poll();
            if (length[p.x][p.y]<=p.l) continue; // if we have already found a route shorter
            length[p.x][p.y]=p.l;
            for (int i=0;i<4;i++) {
                int xx=p.x, yy=p.y, l=p.l;
                while (xx>=0 && xx<m && yy>=0 && yy<n && maze[xx][yy]==0) {
                    xx+=dir[i][0];
                    yy+=dir[i][1];
                    l++;
                }
                xx-=dir[i][0];
                yy-=dir[i][1];
                l--;
                list.offer(new Point(xx, yy, l));
            }
        }
        return length[destination[0]][destination[1]]==Integer.MAX_VALUE?-1:length[destination[0]][destination[1]];
    }
}

// 10/31/17
class Solution506 {
    class Rank {
        int val, index;
        public Rank(int a, int b) {val = a; index = b;}
    }

    public String[] findRelativeRanks(int[] nums) {
        PriorityQueue<Rank> priorityQueue = new PriorityQueue<>((Rank a, Rank b) -> b.val - a.val);
        int m = nums.length;
        String[] res = new String[m];
        for (int i = 0; i < m; i++) {
            priorityQueue.add(new Rank(nums[i], i));
        }

        for (int i = 0; i< m; i++) {
            Rank tmp = priorityQueue.poll();
            if (i == 0) {
                res[tmp.index] = "Gold Medal";
            } else if (i == 1) {
                res[tmp.index] = "Silver Medal";
            } else if (i == 2) {
                res[tmp.index] = "Bronze Medal";
            } else {
                res[tmp.index] = String.valueOf(i+1);
            }
        }
        return res;
    }
}

class Solution507 {
    public boolean checkPerfectNumber(int num) {
        int sum = 0;
        int tmp = (int)Math.sqrt(num);
        while(tmp > 1) {
            if (num % tmp == 0) {
                sum += tmp;
                sum += num/tmp;
            }
            tmp --;
        }
        sum++;
        return sum == num;
    }
}

class Solution508 {
    public int[] findFrequentTreeSum(TreeNode root) {
        Map<Integer, Integer> map = new HashMap<>();
        dfs(root, map);
        int maxCount = Integer.MIN_VALUE;
        for (int i : map.keySet()) {
            maxCount = Math.max(maxCount, map.get(i));
        }
        List<Integer> res = new ArrayList<>();
        for (int i : map.keySet()) {
            if (map.get(i) == maxCount) {
                res.add(i);
            }
        }
        int[] arr = new int[res.size()];
        for (int i = 0; i< res.size(); i++) {
            arr[i] = res.get(i);
        }
        return arr;
    }

    private int dfs(TreeNode root, Map<Integer,Integer> map) {
        if (root == null) { return 0;}
        int leftVal = dfs(root.left, map);
        int rightVal = dfs(root.right, map);
        int res = leftVal+ rightVal + root.val;
        map.put(res, map.getOrDefault(res, 0)+1);
        return res;
    }
}

class Solution512_1 {
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        if (root == null) return 0;
        int res = 0;
        q.add(root);
        q.add(null);
        boolean isFirst = true;
        while(!q.isEmpty()) {
            TreeNode tmp = q.poll();
            if (tmp == null) {
                if (!q.isEmpty()) {
                    q.add(null);
                    isFirst = true;
                    res = 0;
                }
                continue;
            }
            if (isFirst) {
                res = tmp.val;
                isFirst = false;
            }
            if (tmp.left != null) {q.add(tmp.left);}
            if (tmp.right != null) { q.add(tmp.right);}
        }
        return res;
    }
}

class Solution515 {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        int rowMax = Integer.MIN_VALUE;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()) {
            TreeNode tmp = q.poll();
            if (tmp == null) {
                res.add(rowMax);
                rowMax = Integer.MIN_VALUE;
                if (!q.isEmpty()) {
                    q.add(null);
                }
                continue;
            }
            rowMax = Math.max(rowMax, tmp.val);
            if (tmp.left != null) {q.add(tmp.left);}
            if (tmp.right != null) {q.add(tmp.right);}
        }
        return res;
    }
}

class Solution516 {
    public int longestPalindromeSubseq(String s) {
        int m = s.length();
        if (m == 0) return 0;
        int[][] dp = new int[m][m];
        for (int i = 0; i< m; i++) {
            dp[i][i] = 1;
            if (i+1<m) {
                if (s.charAt(i) == s.charAt(i+1)) {
                    dp[i][i+1] = 2;
                } else {
                    dp[i][i+1] = 1;
                }
            }
        }
        for (int l = 2; l< m; l++) {
            for (int i = 0; i < m; i++) {
                if (i+l < m) {
                    if (s.charAt(i) == s.charAt(i + l)) {
                        dp[i][i + l] = 2 + dp[i + 1][i + l - 1];
                    } else {
                        dp[i][i+l] = Math.max(dp[i+1][i+l], dp[i][i+l-1]);
                    }
                }
            }
        }
        return dp[0][m-1];
    }
}


































