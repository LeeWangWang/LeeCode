import java.util.*;

public class Test_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = "abcdefgh";
        String b = "aabhgfdec";
        int ans = getLen(a, b);
        System.out.println(ans*ans);
    }

    public static int getLen(String a, String b) {
        int m = a.length();
        int n = b.length();
        int [][] dp = new int[m+1][n+1];

        for (int i = 0; i <= m; i++) {
            dp[i][0] = 0;
        }
        for (int j = 0; j <= n; j++) {
            dp[0][j] = 1;
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (a.charAt(i - 1) == b.charAt(j - 1)) {
                    dp[i][j] = dp[i-1][j-1] + dp[i][j-1];
                } else {
                    dp[i][j] = dp[i][j-1];
                }
            }
        }
        return dp[m][n];
    }

}