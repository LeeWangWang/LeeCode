package 剑指offer;

/**
 * @ClassName: no_14_1
 * @Description: 剪绳子
 * @Author: lww
 * @Date: 7/2/23 4:33 PM
 * @Version: V1
 **/
public class no_14_1 {
    public int cuttingRope(int n) {
        int[] dp = new int[n+1];
        for (int i = 2; i <= n; i++) {
            int curMax = 0;
            for (int j = 1; j < i; j++) {
                curMax = Math.max(curMax, Math.max(j * (i-j), j * dp[i-j]));
            }
            dp[i] = curMax;
        }
        return dp[n];
    }
}