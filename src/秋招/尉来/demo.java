package 秋招.尉来;

import java.util.Scanner;

/**
 * @ClassName: demo
 * @Description:
 * @Author: lww
 * @Date: 8/25/23 11:04 AM
 * @Version: V1
 **/
public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        int result = majorityElement(nums);
        System.out.println(result);
    }
    public static int majorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }
}
