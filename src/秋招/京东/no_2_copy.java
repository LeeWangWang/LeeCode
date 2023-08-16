package 秋招.京东;

import java.util.*;

/**
 * @ClassName: no_2_copy
 * @Description:
 * @Author: lww
 * @Date: 8/12/23 8:18 PM
 * @Version: V1
 **/
public class no_2_copy {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        in.nextLine();
        String str = in.nextLine();
        int[][] dp = new int[n][n];
        // 考虑边界情况
        for (int i = 0; i < n; i++) {
            dp[i][i] = 0;
        }
        // 遍历不同的子字符串长度
        for (int len = 2; len <= n; len++) {
            // 遍历给定长度下所有可能的起始索引
            for (int i = 0; i < n - len + 1; i++) {
                int j = i + len - 1; // 计算子字符串的结束索引
                // 检查当前索引处的字符是否相同
                if (str.charAt(i) == str.charAt(j)) {
                    dp[i][j] = dp[i+1][j-1];
                } else {
                    //dp[i][j] = 1 + Math.min(dp[i+1][j], dp[i][j-1]);
                    dp[i][j] = Math.min( Math.min(dp[i+1][j], dp[i][j-1]), dp[i+1][j-1] ) + 1;
                }
                dp[i][j] = Math.min(dp[i][j], 1 + dp[i][j-1]);
            }
        }
        System.out.println(dp[0][n-1]);
    }
}
