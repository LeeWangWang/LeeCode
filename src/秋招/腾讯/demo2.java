package 秋招.腾讯;

import java.util.*;

/**
 * @ClassName: demo2
 * @Description:
 * @Author: lww
 * @Date: 8/25/23 7:33 PM
 * @Version: V1
 **/
public class demo2 {
    public static void main(String[] args) {
        String str = "aaaabcccbbda";
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
        String res = eliminateTripleDuplication(str);
        System.out.println(res);
    }

    public static String eliminateTripleDuplication(String str) {
        while (true) {
            boolean flag = false;
            if (str.length() == 0) {
                break;
            }
            char target = str.charAt(0);
            int count = 1;
            for (int i = 1; i < str.length(); i++) {
                char c = str.charAt(i);
                if (target == c) {
                    count++;
                } else {
                    target = c;
                }
                if (count == 3) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                str = deleteEliminate(str, target);
            } else {
                break;
            }
        }
        return str;
    }

    public static String deleteEliminate(String str, char target) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c != target) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}





