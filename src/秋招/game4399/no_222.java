package 秋招.game4399;

/**
 * @ClassName: no_222
 * @Description:
 * @Author: lww
 * @Date: 8/23/23 8:21 PM
 * @Version: V1
 **/
public class no_222 {
    public static int getMaxJewels(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return nums[0];
        }
        int[] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
        }
        return dp[n - 1];
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 2, 1, 3, 1};
        int maxJewels = getMaxJewels(nums);
        System.out.println("侠盗一晚能够盗取的最大珠宝数量为：" + maxJewels);
    }
}


