package 秋招.携程;

import java.util.*;

/**
 * @ClassName: no_3
 * @Description: 50%
 * @Author: lww
 * @Date: 9/7/23 7:30 PM
 * @Version: V1
 **/
public class no_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int j = 0; j < t; j++) {
            int n = sc.nextInt();
            int l = sc.nextInt();
            int r = sc.nextInt();
            int [] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
            int result = minOperate(nums, l, r);
            System.out.println(result);
        }
    }
    public static int minOperate(int[] nums, int l, int r) {
        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[nums.length-1];

        if (max < l || min > r)
            return -1;

        int p = 0;
        for (int num : nums) {
            if (num < l) {
                p += (l-num);
            } else {
                break;
            }
        }
        int q = 0;
        for (int i = nums.length-1; i >= 0; i--) {
            if (nums[i] > r) {
                q += (nums[i] - r);
            } else {
                break;
            }
        }
        return Math.max(p, q);
    }
}





