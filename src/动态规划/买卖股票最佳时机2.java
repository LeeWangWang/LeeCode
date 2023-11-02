package 动态规划;

/**
 * @ClassName: 买卖股票最佳时机2
 * @Description:
 * @Author: lww
 * @Date: 10/13/23 9:01 PM
 * @Version: V1
 **/
public class 买卖股票最佳时机2 {
    public static void main(String[] args) {
        int [] num = {7,1,5,3,6,4};
        System.out.println(maxProfit(num));
    }
    public static int maxProfit(int[] prices) {
        int max = 0; // 最大利润
        int flag = 0; // 是否持有股票
        int cur = 0; // 当天的利润
        for (int i = 1; i < prices.length; i++) {
            cur = prices[i] - prices[i-1];
            if (cur > 0) {
                flag = 1;
                max += cur;
            }
            if (cur < 0 && flag == 0) {
                flag = 0;
            }
        }
        return max;
    }
}