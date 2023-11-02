package 动态规划;

/**
 * @ClassName: 爬楼梯
 * @Description:
 * @Author: lww
 * @Date: 10/13/23 9:06 PM
 * @Version: V1
 **/
public class 爬楼梯 {
    public static void main(String[] args) {
        System.out.println(proClimbStairs(5));
    }
    public static int climbStairs(int n) {
        int [] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
    public static int proClimbStairs(int n) {
        int p = 0, q = 0, r = 1;
        for (int i = 1; i <= n; i++) {
            p = q;
            q = r;
            r = p + q;
        }
        return r;
    }
}