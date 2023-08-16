package 秋招.快手;

/**
 * @ClassName: test
 * @Description:
 * @Author: lww
 * @Date: 8/14/23 11:47 AM
 * @Version: V1
 **/
public class test {
    public static void main(String[] args) {

        int[] prices1 = {7, 1, 5, 3, 6, 4};
        int maxProfit1 = maxProfit(prices1);
        System.out.println("示例1的最大利润为：" + maxProfit1);

        int[] prices2 = {7, 6, 4, 3, 1};
        int maxProfit2 = maxProfit(prices2);
        System.out.println("示例2的最大利润为：" + maxProfit2);
    }

    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE; // 初始化最低点为整型最大值
        int maxProfit = 0; // 初始化最大利润为0

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i]; // 更新最低点
            } else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice; // 更新最大利润
            }
        }

        return maxProfit;
    }
}
