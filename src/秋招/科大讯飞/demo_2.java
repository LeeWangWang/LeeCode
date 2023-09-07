package 秋招.科大讯飞;

import java.util.Scanner;

/**
 * @ClassName: demo_2
 * @Description:
 * @Author: lww
 * @Date: 8/26/23 2:39 PM
 * @Version: V1
 **/
public class demo_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        String[] str1 = new String[t];
        String[] str2 = new String[t];
        int[] result = new int[t];
        for (int i = 0; i < t; i++) {
            str1[i] = scanner.nextLine();
            str2[i] = scanner.nextLine();
        }
        for (int i = 0; i < t; i++) {
            if (str1[i].length() == str2[i].length())
                result[i]++;
            if (str1[i].matches(".*\\d.*") && str2[i].matches(".*\\d.*"))
                result[i]++;
//            if (str1[i].matches(".*[a-zA-Z].*") && str2[i].matches(".*[a-zA-Z].*"))
//                result[i]++;
            if (str1[i].matches(".*[^a-zA-Z0-9].*") && str2[i].matches(".*[^a-zA-Z0-9].*"))
                result[i]++;
        }
        for (int num : result) {
            System.out.println(num);
        }
    }
}