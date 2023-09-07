package 秋招.携程;

import java.util.Scanner;

/**
 * @ClassName: no_4
 * @Description: 85%
 * @Author: lww
 * @Date: 9/7/23 7:42 PM
 * @Version: V1
 **/
public class no_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "010";
        int n = s.length();
        int[] dp = new int[n+1];
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (s.charAt(i-1) == '0')
                dp[i] = dp[i-1] + 1;
            else
                dp[i] = Math.max(dp[i-1]-1, 0);
            sum += dp[i];
        }
        System.out.println(sum);
    }
}