package 秋招.京东;

import java.util.*;

/**
 * @ClassName: no_3
 * @Description:
 * @Author: lww
 * @Date: 8/12/23 8:13 PM
 * @Version: V1
 **/
public class no_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        in.close();
        long[] count = new long[10];
        count[array[n-1] % 10] = 1;

        for (int i = n-2; i >= 0; i--) {
            long[] newCount = new long[10];
            for (int j = 0; j < 10; j++) {
                int x = array[i] % 10;
                int y = j;
                int sum = (x+y) % 10;
                int product = (x*y) % 10;
                newCount[sum] = (newCount[sum] + count[j]) % 1000000007;
                newCount[product] = (newCount[product] + count[j]) % 1000000007;
            }
            count = newCount;
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(count[i] + " ");
        }
    }
}