package 秋招.米哈游;

import java.util.Scanner;

/**
 * @ClassName: no_2_ff
 * @Description: 12.5%
 * @Author: lww
 * @Date: 8/13/23 9:26 PM
 * @Version: V1
 **/
public class no_2_ff {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        char[] chars = str.toCharArray();
        int i = chars.length - 2;
        while (i >= 0 && chars[i] >= chars[i+1]) {
            i--;
        }
        if (i >= 0) {
            int j = chars.length-1;
            while (j >= 0 && chars[j] <= chars[i]) {
                j--;
            }
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        System.out.println(chars);

    }
}