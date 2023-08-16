package 秋招.米哈游;

import java.util.Scanner;

/**
 * @ClassName: no_2
 * @Description: 0%
 * @Author: lww
 * @Date: 8/13/23 8:37 PM
 * @Version: V1
 **/
public class no_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        char[] chars = str.toCharArray();
        int n = chars.length;
        int i = n-2;
        while (i >= 0 && chars[i] >= chars[i+1]) {
            i--;
        }
        if (i < 0) {
            System.out.println(str);
            return;
        }
        int j = n-1;
        while (j >= 0 && chars[i] <= chars[i]) {
            j--;
        }
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
        reverse(chars, i+1, n-1);
        System.out.println(chars);
    }
    public static void reverse(char[] chars, int start, int end) {
        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
    }
}