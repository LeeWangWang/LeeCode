package 秋招.得物;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName: demo4444
 * @Description:
 * @Author: lww
 * @Date: 8/23/23 8:26 PM
 * @Version: V1
 **/
public class demo4444 {
    public static int getMaxAdjacentDifference(int[] nums) {
        // 首先对数组进行排序，确保相邻数的差值最小
        Arrays.sort(nums);
        int maxDiff = 0;
        for (int i = 1; i < nums.length; i++) {
            int diff = Math.abs(nums[i] - nums[i - 1]);
            if (diff > maxDiff) {
                maxDiff = diff;
            }
        }
        return maxDiff;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        int maxDiff = getMaxAdjacentDifference(nums);
        System.out.println("最大差值: " + maxDiff);
    }
    //5
    //2 1 1 3 2
}

