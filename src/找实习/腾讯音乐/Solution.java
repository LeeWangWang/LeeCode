package 找实习.腾讯音乐;

import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param str string字符串
     * @return int整型
     */
    public static int getCnt (String str) {
        // write code here
        int length = str.length();
        int count = 0;
        for (int i = 0; i < str.length()-1; i++) {
            char c1 = Character.toLowerCase(str.charAt(i));

            char c2 = Character.toLowerCase(str.charAt(i+1));
            if (c1 == c2) {
                count += 1;
            }
        }
        return count;
    }


    public static int getMaxValue (String str, int k) {
        // write code here
        int start = 1;
        int length = str.length();
        while (start < length) {
            int mid = start + (length - 1) / 2;
            if (splitStr(str, k, mid)) {
            }
        }
        return 1;
    }
    public static boolean splitStr(String s, int k, int mid) {
        int[] characters = new int[26];
        int distance = 0;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            if (i >= mid) {
                int flag = characters[s.charAt(i-mid) - 'a'];
                if (flag == 0) {
                    distance -= 1;
                }
            }
            int flag = characters[s.charAt(i-mid) - 'a'];
            if (flag == 1);
        }
        return true;
    }

    public static TreeNode buildTree(int n) {
        if (n == 0) {
            return null;
        }
        TreeNode tree = new TreeNode(0);
        if (n == 1) {
            tree.val = 1;
            return tree;
        }
        tree.left = buildTree((n-1)/2);
        tree.right = buildTree((n/2));
        int num1 = 0;
        int num2 = 0;
        if (tree.left != null) {
            if (tree.left.val % 2 == 1) {
                num1 = tree.left.val;
            } else {
                num1 = 0;
            }
            if (tree.left.val % 2 == 0) {
                num2 = tree.left.val;
            } else {
                num2 = 0;
            }
        }

        if (tree.right != null) {
            if (tree.right.val % 2 == 1) {
                num1 = tree.right.val;
            } else {
                num1 = 0;
            }
            if (tree.right.val % 2 == 0) {
                num2 = tree.right.val;
            } else {
                num2 = 0;
            }
        }
        HashMap hashMap = new HashMap();
        if (Math.abs(num1 - num2) <= 1) {
            for (int i = 1; i < n+1; i++) {
                if (!hashMap.containsKey(i)) {
                    tree.val = i;
                    hashMap.put(i,i);
                    break;
                }
            }
        } else {
            tree.val = -1;
        }
        return tree;
    }


    public static void main(String[] args) {
        String s1 = "abacb";
        int k = 2;
    }
}

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }
}


