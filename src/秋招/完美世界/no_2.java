package 秋招.完美世界;

/**
 * @ClassName: no_2
 * @Description:
 * @Author: lww
 * @Date: 8/26/23 6:38 PM
 * @Version: V1
 **/
public class no_2 {
    /**
     * 返回硬币组合的数量
     * @param coins int整型一维数组 硬币的面值
     * @param limits int整型一维数组 硬币数量的限制
     * @param amount int整型 要凑成的目标金额
     * @return int整型
     */
    public int coinChangeWithLimits (int[] coins, int[] limits, int amount) {
        int[] dp = new int[amount+1];
        dp[0] = 1;
        for (int i = 0; i < coins.length; i++) {
            for (int j = amount; j >= 0; j--) {
                for (int k = 1; k <= limits[i] && j-k*coins[i] >= 0; k++) {
                    dp[j] += dp[j-k*coins[i]];
                }
            }
        }
        return dp[amount];
    }
}