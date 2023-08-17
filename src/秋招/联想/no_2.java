package 秋招.联想;

import java.util.Scanner;

/**
 * @ClassName: no_2
 * @Description:
 * @Author: lww
 * @Date: 8/16/23 8:25 PM
 * @Version: V1
 **/
public class no_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.nextLine();
        String numStr = scanner.nextLine();
        String result = constructMaxNumber(numStr, k);
        System.out.println(result);
    }

    public static String constructMaxNumber(String str, int k) {
        StringBuilder sb = new StringBuilder();
        boolean inserted = false;
        for (int i = 0; i < str.length(); i++) {
            int digit = Character.getNumericValue(str.charAt(i));
            if (!inserted && digit < k) {
                sb.append(k);
                inserted = true;
            }
            sb.append(digit);
        }
        if (!inserted) {
            sb.append(k);
        }
        return sb.toString();
    }
}