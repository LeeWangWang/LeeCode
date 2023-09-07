package 秋招.字节;

import java.util.*;

/**
 * @ClassName: demo1111111
 * @Description:
 * @Author: lww
 * @Date: 8/27/23 11:09 AM
 * @Version: V1
 **/
public class demo1111111 {
    static int findMinimumDeletion(int m, int n, int dp[][], String s) {

        if (m > n) {
            return 0;
        }
        if (m == n) {
            return 1;
        }
        if (dp[m][n] != -1) {
            return dp[m][n];
        }

        // 删除一个单独的字符
        int res = 1 + findMinimumDeletion(m + 1, n, dp, s);

        // 删除一组连续字符时，如果其中任何字符匹配
        for (int i = m + 1; i <= n; ++i) {

            // 当两个字符相同时，删除它们之间的字母
            if (s.charAt(m) == s.charAt(i)) {
                res = Math.min(res, findMinimumDeletion(m + 1, i - 1, dp, s) + findMinimumDeletion(i, n, dp, s));
            }
        }

        // 记忆化存储
        return dp[m][n] = res;
    }

    public static void main(String[] args) {
        String s = "abcddcba";
        int length = s.length();
        int dp[][] = new int[length][length];
        for (int i = 0; i < length; i++) {
            Arrays.fill(dp[i], -1);
        }
        for (int len = 1; len <= length; len++) {
            for (int start = 0; start <= length - len; start++) {
                int end = start + len - 1;

                if (start == end) {
                    dp[start][end] = 1;
                } else if (s.charAt(start) == s.charAt(end)) {
                    dp[start][end] = dp[start + 1][end - 1] + 2;
                } else {
                    dp[start][end] = Math.max(dp[start + 1][end], dp[start][end - 1]);
                }
            }
        }

        System.out.println(length - dp[0][length - 1]);
    }
}

