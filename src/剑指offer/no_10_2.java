package 剑指offer;

/**
 * @ClassName no_10_2
 * @Description 青蛙跳台阶问题
 * @Author JoshLee
 * @Date 2023/5/14 15:30
 * @Version: V1
 */
public class no_10_2 {
    /*
    一只青蛙一次可以跳上 1 级台阶，也可以跳上 2 级台阶。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
    答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
     */

    public static int numWays(int n) {
        if (n==0) return 1;
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = (dp[i-1] + dp[i-2])  % 1000000007;
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(numWays(2));
        System.out.println(numWays(7));
        System.out.println(numWays(0));
        System.out.println(numWays(46));
    }
}
