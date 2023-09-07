package 秋招.B站;

import java.util.Scanner;

/**
 * @ClassName: no_2
 * @Description:
 * @Author: lww
 * @Date: 8/31/23 3:17 PM
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
        System.out.println(del_repeat_item(n, nums));
    }
    public static int del_repeat_item(int n, int[] nums) {
        if (n <= 1) {
            return n;
        }
        int id_x = 1;

        for (int i = 1; i < n; i++) {
            if (nums[i] > nums[id_x - 1]) {
                nums[id_x] = nums[i];
                id_x++;
            }
        }
        return id_x;
    }
}