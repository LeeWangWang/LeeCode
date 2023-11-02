package 找实习.wps;

import java.util.Scanner;

/**
 * @ClassName: no_1
 * @Description: 100%
 * @Author: lww
 * @Date: 10/29/23 7:36 PM
 * @Version: V1
 **/
public class no_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        scanner.nextLine();
        String[] strings = scanner.nextLine().split(" ");
        int[] nums = new int[len];
        for (int i = 0; i < len; i++) {
            nums[i] = Integer.parseInt(strings[i]);
        }

        int maxLen = 1;
        int currentLen = 1;

        for (int i = 1; i < len; i++) {
            if (nums[i] - nums[i - 1] <= 8) {
                currentLen++;
            } else {
                maxLen = Math.max(maxLen, currentLen);
                currentLen = 1;
            }
        }
        maxLen = Math.max(maxLen, currentLen);
        System.out.println(maxLen);
    }
}