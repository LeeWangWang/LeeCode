package 秋招.广联达;

import java.util.Scanner;

/**
 * @ClassName: no_2
 * @Description:
 * @Author: lww
 * @Date: 9/6/23 10:12 AM
 * @Version: V1
 **/

import java.util.*;
public class no_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] nums = new int[n];
        String[] inputStr = sc.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(inputStr[i]);
        }
        sc.close();
        int min = minCopy(n, nums);
        System.out.println(min);
    }
    public static int minCopy(int n, int[] nums) {
        int maxCount = 1;
        int minOperate = n;
        int current = 1;
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i-1]) {
                current++;
            } else {
                maxCount = Math.max(maxCount, current);
                current = 1;
            }
        }
        maxCount = Math.max(maxCount, current);
        if (maxCount >= n/2) {
            return 1;
        }
        while (maxCount > 0) {
            maxCount /= 2;
            minOperate *= 2;
        }
        return minOperate / n;
    }
}