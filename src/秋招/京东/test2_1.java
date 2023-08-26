package 秋招.京东;

import java.util.*;

/**
 * @ClassName: test2_1
 * @Description:
 * @Author: lww
 * @Date: 8/19/23 10:30 AM
 * @Version: V1
 **/
public class test2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 读取输入字符串
        String s = sc.nextLine();
        int n = s.length();
        if (n <= 1)
            System.out.println(n);
        // 创建一个数组 dp，用来存储每个位置的最长连续非重复子串的长度
        int[] dp = new int[n];
        dp[0] = 1; // 第一个字符的最长连续非重复子串长度为1
        for (int i = 1; i < n; i++) {
            // 比较当前字符和前一个字符是否相同
            if (s.charAt(i) != s.charAt(i - 1)) {
                // 如果不相同，将当前位置的最长连续非重复子串长度设为前一个位置的长度加1
                dp[i] = dp[i - 1] + 1;
            } else {
                // 如果相同，将当前位置的最长连续非重复子串长度设为1
                dp[i] = 1;
            }
        }
        int max = 0;
        // 找到最长连续非重复子串的最大长度
        for (int i = 0; i < n; i++) {
            max = Math.max(max, dp[i]);
        }
        // 输出最长连续非重复子串的最大长度
        System.out.println(max);
    }
}





