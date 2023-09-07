package 秋招.字节;

import java.util.*;

/**
 * @ClassName: demo_1111
 * @Description:
 * @Author: lww
 * @Date: 8/27/23 10:16 AM
 * @Version: V1
 **/
public class demo_1111 {
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
        String s = "0100110";
        int length = s.length();
        int dp[][] = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(findMinimumDeletion(0, length - 1, dp, s));
    }
}




