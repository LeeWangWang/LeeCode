package 秋招.得物;

import java.util.Scanner;

/**
 * @ClassName: test_1
 * @Description:
 * @Author: lww
 * @Date: 8/31/23 10:18 AM
 * @Version: V1
 **/
public class test_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        System.out.println(borrow_arrows(N, A, B));
    }
    public static long borrow_arrows(int N, int A, int B) {
        int mod = 1000000007;
        long[] arrows = new long[N];
        arrows[0] = A;
        arrows[1] = B;
        int len = 2;
        for (int i = 2; i < N; i++) {
            long next = (sum_arr(arrows, len) + 1) % mod;
            arrows[i] = next;
            len++;
        }
        return sum_arr(arrows, N);
    }

    public static long sum_arr(long[] arr, int len) {
        long res = 0;
        for (int i = 0; i < len; i++) {
            res += arr[i];
        }
        return res;
    }
}