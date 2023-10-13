package Hot100;

import java.util.Arrays;

/**
 * @ClassName: LCR零钱兑换
 * @Description: 动态规划
 * @Author: lww
 * @Date: 10/11/23 8:38 PM
 * @Version: V1
 **/
public class LCR零钱兑换 {
    public static int coinChange(int[] coins, int amount) {
        int max = amount + 1;
        int[] dp = new int[amount + 1];
        // 将数组初始化为最大值
        Arrays.fill(dp, max);
        // 设定初始值，表示总金额为 0 时，最小硬币数为 0
        dp[0] = 0;

        // 遍历每个金额从 1 到目标金额
        for (int i = 0; i <= amount; i++) {

            // 第二层是 conins 找钱方式数组的下标
            for (int j = 0; j < coins.length; j++) {
                // 遍历每种硬币
                if (coins[j] <= i) {
                    // 如果硬币面值小于或等于当前金额 i，则计算最小硬币数
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }
        }
        // 如果目标金额的最小硬币数大于初始设置的最大值，则无法组合，返回 -1；否则返回最小硬币数
        return dp[amount] > amount ? -1 : dp[amount];
    }
}