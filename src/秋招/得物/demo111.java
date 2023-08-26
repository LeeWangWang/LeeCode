package 秋招.得物;

import java.util.*;

/**
 * @ClassName: demo111
 * @Description:
 * @Author: lww
 * @Date: 8/23/23 7:31 PM
 * @Version: V1
 **/
public class demo111 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int p = sc.nextInt();
            System.out.println(primitiveRoots(p));
        }
    }
    public static int primitiveRoots(int p) {
        ArrayList<Integer> factors = new ArrayList<>();
        int phi = p - 1, n = phi;
        for (int i = 2; i * i <= n; ++i) {
            if (n % i == 0) {
                factors.add(i);
                while (n % i == 0)
                    n /= i;
            }
        }
        if (n > 1)
            factors.add(n);
        int result = phi;
        for (int factor : factors)
            result -= result / factor;

        return result;
    }
}


