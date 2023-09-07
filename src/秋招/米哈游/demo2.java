package 秋招.米哈游;

import java.util.*;

/**
 * @ClassName: demo2
 * @Description:
 * @Author: lww
 * @Date: 8/27/23 9:12 PM
 * @Version: V1
 **/
public class demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        boolean[] dp = new boolean[n];
        for (int i = n - 1; i >= 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (nums[j] < nums[i] && !dp[j]) {
                    dp[i] = true;
                    break;
                }
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (dp[i]) count++;
        }
        int gcd = gcd(count, n);
        System.out.println(count / gcd + "/" + n / gcd);
    }
    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}



