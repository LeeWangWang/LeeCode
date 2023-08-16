package 找实习.小红书;

import java.util.Scanner;

/**
 * @ClassName: no_03
 * @Description:
 * @Author: lww
 * @Date: 8/6/23 7:27 PM
 * @Version: V1
 **/
public class no_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int T = scanner.nextInt();
        int H = scanner.nextInt();

        int[] t = new int[n];
        int[] h = new int[n];
        long[] a = new long[n];

        for (int i = 0; i < n; i++) {
            t[i] = scanner.nextInt();
            h[i] = scanner.nextInt();
            a[i] = scanner.nextLong();
        }

        long[][][] dp = new long[n+1][T+1][H+1];

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= T; j++) {
                for (int k = 0; k <= H; k++) {
                    dp[i][j][k] = dp[i-1][j][k]; // 不选第i个事件
                    if (j >= t[i-1] && k >= h[i-1]) {
                        dp[i][j][k] = Math.max(dp[i][j][k], dp[i-1][j-t[i-1]][k-h[i-1]] + a[i-1]);
                    }
                }
            }
        }
        System.out.println(dp[n][T][H]);
    }
}