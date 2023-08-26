package 秋招.美团2;

import java.util.Scanner;

/**
 * @ClassName: no_1
 * @Description:
 * @Author: lww
 * @Date: 8/19/23 7:08 PM
 * @Version: V1
 **/
public class no_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] m = new long[n];
        long[] x = new long[n];
        for (int i = 0; i < n; i++) {
            m[i] = scanner.nextLong();
            x[i] = scanner.nextLong();
        }
        for (int i = 0; i < n-1; i++) {
            System.out.println(query(m[i], x[i]));
        }
        System.out.print(query(m[n-1], x[n-1]));
    }
    public static long query(long m, long x) {
        if (x <= m) {
            return x;
        } else {
            return query(m, x-m);
        }
    }
}