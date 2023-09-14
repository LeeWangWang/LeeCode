package 秋招.腾讯;

import java.util.Scanner;

/**
 * @ClassName: Main4
 * @Description:
 * @Author: lww
 * @Date: 9/10/23 9:21 PM
 * @Version: V1
 **/
public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int result = computeCheck(n, k);
            if (result > 0)
                result = 1;
            System.out.println(result);
        }
    }
    public static int computeCheck(int n, int k) {
        int mod = 1000000007;
        long result = 1;
        long pow = 1;
        // 计算2的k次方
        for (int i = 0; i < k; i++) {
            pow = (pow*2) % mod;
        }
        long powN = 1;
        for (int i = 0; i < n; i++) {
            powN = (powN*2) % mod;
        }

        long powNK = 1;
        for (int i = 0; i < (n - k); i++) {
            powNK = (powNK*2) % mod;
        }

        result = (powN - pow + mod) % mod;
        result = (result * powNK) % mod;
        return (int) result;
    }
}