package 动态规划;

/**
 * @ClassName: 最长回文子串
 * @Description:
 * @Author: lww
 * @Date: 10/17/23 10:41 AM
 * @Version: V1
 **/
public class 最长回文子串 {
    public String longestPalindrome(String s) {
        if (s.length() < 2) return s;

        int len = s.length();
        int maxLen = 1;
        int begin = 0;
        // dp[i][j] 表示 s[i..j] 是否是回文串
        boolean[][] dp = new boolean[len][len];
        // 初始化：所有长度为 1 的子串都是回文串
        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
        }
        char[] chars = s.toCharArray();
        for (int k = 2; k <= len; ++k) {
            // 枚举左边界，左边界的上限设置可以宽松一些
            for (int i = 0; i < len; i++) {
                // 由 k 和 i 可以确定右边界，即 j - i + 1 = k 得
                int j = k +i -1;
                // 如果右边界越界，就可以退出当前循环
                if (j >= len) break;
                if (chars[i] != chars[j])
                    dp[i][j] = false;
                else {
                    if (j-i < 3) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                }
                // 只要 dp[i][L] == true 成立，就表示子串 s[i..L] 是回文，此时记录回文长度和起始位置
                if (dp[i][j] && j - i + 1 > maxLen) {
                    maxLen = j - i + 1;
                    begin = i;
                }
            }
        }
        return s.substring(begin, begin + maxLen);
    }
}