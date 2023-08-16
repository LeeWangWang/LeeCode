package 找实习.快手;

/**
 * @ClassName: no_01
 * @Description:
 * @Author: lww
 * @Date: 8/10/23 2:49 PM
 * @Version: V1
 **/
public class no_01 {
    public int maxProfit(int[] prices) {
        // 获取股票价格数组的长度
        int n = prices.length;

        // 创建一个二维数组 dp，dp[i][j] 表示第 i 天结束时，状态为 j 时的最大利润
        // 这里 j=0 表示不持有股票，j=1 表示持有股票
        int[][] dp = new int[n][2];

        // 初始化第 0 天的状态
        dp[0][0] = 0;          // 第 0 天不持有股票的利润为 0
        dp[0][1] = -prices[0]; // 第 0 天持有股票的利润为 -prices[0]（买入股票）

        // 从第 1 天开始遍历数组，计算每一天的状态
        for (int i = 1; i < n; ++i) {
            // 对于第 i 天不持有股票的状态，可以选择继续不持有或者卖出前一天的股票
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);

            // 对于第 i 天持有股票的状态，可以选择继续持有或者买入当天的股票（注意是买入，不是卖出）
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i]);
        }

        // 返回最后一天不持有股票时的最大利润，即为问题的解
        return dp[n - 1][0];
    }
}

