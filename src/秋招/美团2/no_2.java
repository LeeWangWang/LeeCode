package 秋招.美团2;

import java.util.Scanner;

/**
 * @ClassName: no_2
 * @Description:
 * @Author: lww
 * @Date: 8/19/23 7:26 PM
 * @Version: V1
 **/
public class no_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        if (n == 0) {
            System.out.println();
        } else if (n == 1) {
            System.out.println(nums[0]);
        }
        long maxSum = findMaxNum(nums);
        System.out.println(maxSum);
    }
    public static long findMaxNum(int[] nums) {
        int n = nums.length;
        long totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        long maxNum = totalSum;
        for (int i = 0; i < n - 1; i++) {
            long curNum = totalSum - nums[i] - nums[i+1] + ((long) nums[i] * nums[i+1]);
            maxNum = Math.max(curNum, maxNum);
        }
        return maxNum;
    }
}