package test.面试;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName: Candy
 * @Description: TODO
 * @Author: lww
 * @Date: 2023/3/25 19:07
 * @Version: V1
 **/
public class Candy {

    public static int maxCandy(int[] candies) {
        int n = candies.length;
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return candies[0];
        } else if (n == 2) {
            return Math.max(candies[0], candies[1]);
        }
        int[] dp = new int[n];
        dp[0] = candies[0];
        // 两个当中最大
        dp[1] = Math.max(candies[0], candies[1]);
        // 三个当中的最大
        dp[2] = Math.max(Math.max(candies[0] , candies[1]), candies[2]);

        for (int i = 3; i < n; i++) {
            dp[i] = Math.max(dp[i - 2] + candies[i], dp[i - 3] + candies[i]);
        }
        return Math.max(dp[n - 1], dp[n - 2]);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = scanner.nextInt();
        }

        int[] num1 = {4, 8, 3, 6};
        int[] num2 = {4, 7, 3, 5, 9};
        int[] num3 = {3, 1, 2, 7, 10, 2, 4};
//        System.out.println(maxCandy(num1));
//        System.out.println(maxCandy(num2));
//        System.out.println(maxCandy(num3));
//
//        System.out.println(getMaxCandy(num1));
//        System.out.println(getMaxCandy(num2));
//        System.out.println(getMaxCandy(num3));

        System.out.println(getMax(num1));
        System.out.println(getMax(num2));
        System.out.println(getMax(num3));
    }

    public static int getMax(int[] candies) {
        int n = candies.length;
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return candies[0];
        } else if (n == 2) {
            return Math.max(candies[0], candies[1]);
        }
        int len = candies.length;
        int[] sum = new int[len-2];
        int flag = 0;
        int step;
        for (int i = 0; i < len/2; i++) {
            step = flag;
            while (step+3 < len) {
                sum[i] += candies[step+3];
                step += 3;
            }
        }
        Arrays.sort(sum);
        return sum[len-3];
    }

    public static int getMaxCandy(int[] candies) {
        int n = candies.length;
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return candies[0];
        } else if (n == 2) {
            return Math.max(candies[0], candies[1]);
        }

        int[] dp = new int[n];
        dp[0] = candies[0];
        dp[1] = Math.max(candies[0], candies[1]);
        dp[2] = Math.max(candies[0] + candies[2], candies[1]);

        for (int i = 3; i < n; i++) {
            dp[i] = Math.max(dp[i - 2] + candies[i], dp[i - 3] + candies[i]);
        }

        return Math.max(dp[n - 1], dp[n - 2]);
    }


}
