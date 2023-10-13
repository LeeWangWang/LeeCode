package Hot100;

/**
 * @ClassName: LCS最长公共子串
 * @Description: 动态规划
 * @Author: lww
 * @Date: 10/12/23 8:57 AM
 * @Version: V1
 **/
public class LCS最长公共子串 {
    public static void main(String[] args) {
        String s1 = "ABCBDAB";
        String s2 = "BDCABA";
        System.out.println(longestCommonSubstring(s1, s2));
    }
    public static int longestCommonSubstring(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        int max = 0;
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            char c1 = text1.charAt(i - 1);
            for (int j = 1; j <= n; j++) {
                char c2 = text2.charAt(j - 1);
                if (c1 == c2) {
                    dp[i][j] = dp[i-1][j-1]+1;
                }
                max = Math.max(max, dp[i][j]);
            }
        }
        return max;
    }
}