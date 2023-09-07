package 秋招.顺丰;

import java.util.*;

/**
 * @ClassName: Test_1
 * @Description:
 * @Author: lww
 * @Date: 9/5/23 4:52 PM
 * @Version: V1
 **/
public class Test_1 {
    static int mod = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long res = 0;
        if (n % 2 == 0) {
            res = (n*(n/2)) % mod;
        } else {
            res = (2*(n/2) * (n/2 + 1)) % mod;
        }
        System.out.println(res);
    }
}



