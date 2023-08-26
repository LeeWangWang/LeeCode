package 秋招.game4399;

import java.util.Scanner;

/**
 * @ClassName: no_1
 * @Description:
 * @Author: lww
 * @Date: 8/16/23 8:39 AM
 * @Version: V1
 **/
public class no_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        System.out.println(dp[n]);
    }
}


