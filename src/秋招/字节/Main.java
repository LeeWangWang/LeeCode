package 秋招.字节;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName: Main
 * @Description:
 * @Author: lww
 * @Date: 9/10/23 10:31 AM
 * @Version: V1
 **/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();  // 消耗换行符
        String s = scanner.nextLine();
        int q = scanner.nextInt();
        scanner.nextLine();  // 消耗换行符
        int maxCount = calculateWeight(s);
        StringBuilder modifiedS = new StringBuilder(s);
        for (int i = 0; i < q; i++) {
            int index = scanner.nextInt();
            char newChar = scanner.next().charAt(0);
            char oldChar = s.charAt(index - 1);
            if (oldChar != newChar) {
                // 修改字符串的第index个字符并更新权值
                modifiedS.setCharAt(index - 1, newChar);
                if (index == 1) {
                    maxCount += (s.charAt(0) == newChar) ? 0 : 1;
                } else {
                    if (newChar == s.charAt(index - 2)) {
                        maxCount--;
                    } else {
                        maxCount++;
                    }
                }
            }
            // 输出当前权值
            System.out.println(maxCount);
        }
    }
    // 计算字符串的初始权值
    private static int calculateWeight(String s) {
        int maxCount = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                maxCount++;
            }
        }
        return maxCount;
    }
}


/*
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int evenCount = 0;  // 记录偶数的个数
        int oddCount = 0;   // 记录奇数的个数

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        // 计算不同的拼接方式的方案数
        long result = 0;

        if (evenCount >= 2) {
            // 如果有至少两个偶数，可以两两拼接
            result += (long) evenCount * (evenCount - 1);
        }
        // 如果有偶数和奇数，则任意一个偶数与一个奇数拼接都可以
        result += (long) evenCount * oddCount;
        System.out.println(result);
    }
}
*/
