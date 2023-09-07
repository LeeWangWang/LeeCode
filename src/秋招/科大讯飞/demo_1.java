package 秋招.科大讯飞;

import java.util.Scanner;

/**
 * @ClassName: demo_1
 * @Description:
 * @Author: lww
 * @Date: 8/26/23 2:34 PM
 * @Version: V1
 **/
public class demo_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        scanner.nextLine();

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        scanner.close();
        int count = 0;
        for (int num : nums) {
            if (num%2 == 0 && num >= l && num <= r) {
                count++;
            }
        }
        System.out.println(count);
    }
}