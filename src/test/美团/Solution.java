package test.美团;
import java.util.*;

/**
 * @ClassName: Solution
 * @Description: TODO
 * @Author: lww
 * @Date: 2023/4/23 14:49
 * @Version: V1
 **/

public class Solution {
    public static void main(String[] args) {
        String s = "ababc";
        System.out.println(longestPalindrome(s));
    }
    public static int longestPalindrome(String s) {
        if (s == null || s.length() < 2) {
            return s.length();
        }
        int strLen = s.length();
        int maxStart = 0;  //最长回文串的起点
        int maxEnd = 0;    //最长回文串的终点
        int maxLen = 1;  //最长回文串的长度
        boolean[][] dp = new boolean[strLen][strLen];
        for (int r = 1; r < strLen; r++) {
            for (int l = 0; l < r; l++) {
                if (s.charAt(l) == s.charAt(r) && (r - l <= 2 || dp[l + 1][r - 1])) {
                    dp[l][r] = true;
                    if (r - l + 1 > maxLen) {
                        maxLen = r - l + 1;
                        maxStart = l;
                        maxEnd = r;
                    }
                }
            }
        }
        int len = s.substring(maxStart, maxEnd + 1).length();
        return len;
    }
}
