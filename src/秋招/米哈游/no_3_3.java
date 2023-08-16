package 秋招.米哈游;

import java.util.*;

/**
 * @ClassName: no_3_3
 * @Description:
 * @Author: lww
 * @Date: 8/14/23 10:50 AM
 * @Version: V1
 **/
public class no_3_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("No Answer");
        } else {
            for (int i = 0; i < (n - 1) / 2; i++) {
                System.out.print("-1 ");
            }
            for (int i = 0; i < (n - 1) / 2; i++) {
                System.out.print("1 ");
            }
            System.out.println("0");
        }

    }
}