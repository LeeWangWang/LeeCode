package 找实习.wps;

import java.util.Scanner;

/**
 * @ClassName: no_2
 * @Description: 25%
 * @Author: lww
 * @Date: 10/29/23 7:39 PM
 * @Version: V1
 **/
public class no_2 {
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
        for (int i = 0; i < len; i++) {
            int curLen = 1;
            int cur = nums[i];
            for (int j = i + 1; j < len; j++) {
                if (nums[j] > cur && nums[j] % cur == 0) {
                    cur = nums[j];
                    curLen++;
                }
            }
            maxLen = Math.max(maxLen, curLen);
        }
        System.out.println(maxLen);
    }
}