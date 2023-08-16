package 秋招.米哈游;

import java.util.Scanner;

/**
 * @ClassName: no_2_tt
 * @Description: 16.67%
 * @Author: lww
 * @Date: 8/13/23 8:59 PM
 * @Version: V1
 **/
public class no_2_tt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        char[] chars = str.toCharArray();

        for (int i = chars.length - 1; i > 0; i--) {
            if (chars[i] < chars[i-1]) {
                char temp = chars[i];
                chars[i] = chars[i-1];
                chars[i-1] = temp;
                break;
            }
        }
        System.out.println(chars);
    }
}