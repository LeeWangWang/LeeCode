package 秋招.尉来;

import java.util.*;

/**
 * @ClassName: demo1
 * @Description:
 * @Author: lww
 * @Date: 8/25/23 9:13 AM
 * @Version: V1
 **/
public class demo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int aim = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int result = minCoins(arr, aim);
        System.out.println(result);
    }
    public static int minCoins(int[] arr, int aim) {
        int[] dp = new int[aim + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int i = 1; i <= aim; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i >= arr[j] && dp[i - arr[j]] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], dp[i - arr[j]] + 1);
                }
            }
        }
        return dp[aim] == Integer.MAX_VALUE ? -1 : dp[aim];
    }
}

