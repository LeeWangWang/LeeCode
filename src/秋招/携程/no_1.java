package 秋招.携程;

import java.util.Scanner;

/**
 * @ClassName: no_1
 * @Description: 100%
 * @Author: lww
 * @Date: 9/7/23 7:19 PM
 * @Version: V1
 **/
public class no_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = i+1;
        }
        int count = countPer(nums, 0);
        System.out.println(count);
    }
    public static int countPer(int[] nums, int start) {
        if (start == nums.length)
            return 1;
        int count = 0;
        for (int i = start; i < nums.length; i++) {
            swap(nums, start, i);
            if (start == 0 || !isPrime(nums[start] + nums[start-1]))
                count += countPer(nums, start+1);
            swap(nums, start, i);
        }
        return count;
    }
    public static void swap (int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static boolean isPrime (int num) {
        if (num < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}