package 秋招.美团2;

import java.util.Scanner;

/**
 * @ClassName: no_2
 * @Description:
 * @Author: lww
 * @Date: 8/19/23 7:20 PM
 * @Version: V1
 **/
public class no_4 {
    public static void main(String[] args) {
        int mod = 1000000007;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
            sum += array[i];
        }
        if (sum % 2 != 0) {
            System.out.println(0);
            return;
        }
        int result = sum / 2;
        int[][] dp = new int[n+1][result+1];
        dp[0][0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= result; j++) {
                if (j < array[i-1])
                    dp[i][j] = dp[i-1][j];
                else
                    dp[i][j] = (dp[i-1][j] + dp[i-1][j-array[i-1]]) % mod;
            }
        }
        System.out.println(dp[n][result]+1);
    }
}