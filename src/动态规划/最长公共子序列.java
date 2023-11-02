package 动态规划;

/**
 * @ClassName: 最长公共子序列
 * @Description: 动态规划
 * @Author: lww
 * @Date: 10/11/23 7:55 PM
 * @Version: V1
 **/
public class 最长公共子序列 {
    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "ace";
        System.out.println(longestCommonSubsequence(s1, s2));
    }
    public static int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        int[][] dp = new int[m+1][n+1];
        // 遍历 text1 中的每个字符
        for (int i = 1; i <= m; i++) {
            char c1 = text1.charAt(i-1);
            // 遍历 text2 中的每个字符
            for (int j = 1; j <= n; j++) {
                char c2 = text2.charAt(j-1);
                // 如果字符相匹配，更新最长公共子序列的长度
                if (c1 == c2) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else {
                    // 如果字符不匹配，取不考虑当前字符的 text1 或 text2 的最长公共子序列长度的最大值
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }
}