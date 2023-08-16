package 秋招.game4399;

import java.util.*;

/**
 * @ClassName: Main
 * @Description:
 * @Author: lww
 * @Date: 8/16/23 8:24 AM
 * @Version: V1
 **/
public class no_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] coinsStr = scanner.nextLine().split(" ");
        int[] coins = new int[coinsStr.length];
        for (int i = 0; i < coinsStr.length; i++) {
            coins[i] = Integer.parseInt(coinsStr[i]);
        }
        String[] countsStr = scanner.nextLine().split(" ");
        int[] counts = new int[countsStr.length];
        for (int i = 0; i < countsStr.length; i++) {
            counts[i] = Integer.parseInt(countsStr[i]);
        }
        int amount = scanner.nextInt();
        scanner.close();
        System.out.println(coinChange(coins, counts, amount));
    }

    public static int coinChange(int[] coins, int[] counts, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int i = 0; i < coins.length; i++) {
            for (int j = amount; j >= coins[i]; j--) {
                for (int k = 1; k <= counts[i]; k++) {
                    if (j >= k * coins[i]) {
                        dp[j] = Math.min(dp[j], dp[j - k * coins[i]] + k);
                    }
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }
}