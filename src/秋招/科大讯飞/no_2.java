package 秋招.科大讯飞;

import java.util.Scanner;

/**
 * @ClassName: no_2
 * @Description:
 * @Author: lww
 * @Date: 8/13/23 2:18 PM
 * @Version: V1
 **/
public class no_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.nextLine();
        String s = scanner.nextLine();

        int total = k;
        for (int i = 0; i < n - 1; i++) {
            int diff = s.charAt(i+1) - s.charAt(i);
            if (diff > 0) {
                total -= diff;
            } else {
                total += Math.abs(diff);
            }
            if (total < 0) {
                System.out.println("-1");
                return;
            }
        }
        System.out.println(total);
    }
}