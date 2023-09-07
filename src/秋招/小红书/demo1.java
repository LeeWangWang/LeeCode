package 秋招.小红书;

/**
 * @ClassName: demo1
 * @Description:
 * @Author: lww
 * @Date: 9/2/23 1:56 PM
 * @Version: V1
 **/
public class demo1 {
    public static int countWays(int n) {
        if (n <= 1) {
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 2;
        int ways = countWays(n);
        System.out.println("总共有" + ways +"种方法走完" + n + "个台阶");
    }
}


