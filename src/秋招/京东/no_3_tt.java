package 秋招.京东;

import java.util.*;

/**
 * @ClassName: no_3_tt
 * @Description:
 * @Author: lww
 * @Date: 8/12/23 8:32 PM
 * @Version: V1
 **/
public class no_3_tt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        in.nextLine();
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        in.close();
        int [][] dp = new int[n][10];
        dp[0][array[0]] = 1;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < 10; j++) {
                dp[i][(j + array[i]) % 10] = (dp[i][(j + array[i]) % 10] + dp[i-1][j]) % 1000000007;
                dp[i][(j * array[i]) % 10] = (dp[i][(j * array[i]) % 10] + dp[i-1][j]) % 1000000007;
            }
        }
        int[] res = new int[10];
        for (int i = 0; i < 10; i++) {
            res[i] = dp[n-1][i];
        }
        System.out.print(res + " ");
    }
}