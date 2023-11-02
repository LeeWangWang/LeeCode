package 秋招.亚信安全;

/**
 * @ClassName: Demo2
 * @Description:
 * @Author: lww
 * @Date: 10/15/23 7:02 PM
 * @Version: V1
 **/
public class Demo2 {
    public int maxProducts (int[] prices, int target) {
        // write code here
        int maxItems = 0;
        int currentTotal = 0;
        int start = 0;
        int end = 0;
        while (end < prices.length) {
            if (currentTotal + prices[end] <= target) {
                currentTotal += prices[end];
                end++;
                maxItems = Math.max(maxItems, end - start);
            } else if (start == end) {
                start++;
                end++;
            } else {
                currentTotal -= prices[start];
                start++;
            }
        }
        return maxItems;
    }
}