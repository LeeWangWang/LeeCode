package 秋招.京东;

import java.util.Scanner;

/**
 * @ClassName: TangHuLu
 * @Description:
 * @Author: lww
 * @Date: 8/19/23 11:28 AM
 * @Version: V1
 **/
public class TangHuLu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 读取输入字符串
        String s = sc.nextLine();
        int flag = 0;
        int n = s.length();
        if (n <= 1)
            System.out.println(n);
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == s.charAt(i-1)) {
                System.out.println(flag);
                return;
            } else {
                flag++;
            }
        }
    }
}