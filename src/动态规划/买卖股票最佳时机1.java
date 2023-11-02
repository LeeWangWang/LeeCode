package 动态规划;

/**
 * @ClassName: 买卖股票最佳时机一
 * @Description:
 * @Author: lww
 * @Date: 10/13/23 8:51 PM
 * @Version: V1
 **/
public class 买卖股票最佳时机1 {
    public static void main(String[] args) {
        int [] num = {7,1,5,3,6,4};
        System.out.println(maxProfit(num));
    }
    public static int maxProfit(int[] prices) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                // 记录最低点
                min = prices[i];
            } else if (prices[i] - min > max) {
                // 记录当天卖出能赚多少钱
                max = prices[i] - min;
            }
        }
        return max;
    }
}