package 秋招.美团;
import java.util.*;

/**
 * @ClassName: no_3
 * @Description:
 * @Author: lww
 * @Date: 8/12/23 4:59 PM
 * @Version: V1
 **/
public class no_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] a = new int[n][m];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = scanner.nextInt();
                sum += a[i][j];
            }
        }

        int target = sum / 2;
        boolean[] dp = new boolean[target + 1];
        dp[0] = true;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = target; k >= a[i][j]; k--) {
                    if (dp[k - a[i][j]]) {
                        dp[k] = true;
                    }
                }
            }
        }

        int ans = sum;
        for (int i = target; i >= 0; i--) {
            if (dp[i]) {
                ans = sum - 2 * i;
                break;
            }
        }

        System.out.println(ans);
    }
}
