package 秋招.饿了么;

import java.util.Scanner;

/**
 * @ClassName: no_2
 * @Description:
 * @Author: lww
 * @Date: 8/21/23 7:30 PM
 * @Version: V1
 **/
import java.util.Scanner;

public class no_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int max = 0;
        int min = 0;
        if (n % 3 == 0) {
            max = k / n * 2;
            min = k / n * 2;
        } else if (n % 3 == 1) {
            max = k / n * 2 + k / n;
            min = k / n * 2;
        } else {
            max = k / n * 2 + k / n;
            min = k / n * 2 + k / n - 1;
        }
        System.out.println(max + " " + min);
    }
}

