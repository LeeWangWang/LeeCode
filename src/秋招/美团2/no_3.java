package 秋招.美团2;

import java.util.Scanner;

/**
 * @ClassName: no_3
 * @Description:
 * @Author: lww
 * @Date: 8/19/23 7:26 PM
 * @Version: V1
 **/
public class no_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if (str.equals("")) {
            System.out.println(0);
        }
        int n = str.length();
        int[] dp = new int[n];
        dp[0] = 0;
        for (int i = 1; i < n; i++) {
            if (str.charAt(i) == str.charAt(i-1))
                dp[i] = dp[i-1];
            else{
                dp[i] = dp[i-1] + 1;
            }
        }
        int sum = 0;
        for (int num : dp) {
            sum += num;
        }
        System.out.println(sum);
    }
}