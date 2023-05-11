package test.面试;

import java.util.Scanner;

/**
 * @ClassName: Main
 * @Description: TODO
 * @Author: lww
 * @Date: 2023/3/26 11:23
 * @Version: V1
 **/
public class Main {
    public static int getYinZi(int num) {
        if (num == 1)
            return 1;
        int flag = 0;
        for (int i = 1; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                flag += 2;
            }
        }
        return flag;
    }

    public static int getWeight(int[] nums, int w) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int sum = 1;
                for (int k = i; k <= j; k++) {
                    sum *= nums[k];
                }
                int weight = getYinZi(sum);
                if (weight >= w)
                    result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.println(getWeight(nums, k));
    }
    // 剩余最大人数：罚下的1红牌，黄牌每人一个之后再罚下
    private static int calculateMax(int n, int x, int y) {
        // 红牌罚下
        int less = n - y;
        // 每人一张黄牌
        int yellow = less - x;
        // 黄牌小于人数
        if (yellow > 0)
            return less;
        // 黄牌大于人数
        else
            return (2*less - x);
    }
    // 剩余最小人数：罚下的2黄牌或1红牌
    private static int calculateMin(int n, int x, int y) {
        // 红牌罚下
        int less = n - y;
        // 黄牌罚下
        less = (int) Math.ceil((2*less-x)/2.0);
        return less;
    }
}