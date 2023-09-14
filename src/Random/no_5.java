package Random;

/**
 * @title: Random.no_5
 * @description: 最长回文子串【如果字符串的反序与原始字符串相同，则该字符串称为回文字符串。】
 * @author: 李旺旺
 * @date: 2023/2/21 19:16
 * @version: 1.0
 */
public class no_5 {

    // 1.暴力求解，列举所有的子串，判断是否为回文串，保存最长的回文串。
    //时间复杂度：两层 for 循环 O(n²），for 循环里边判断是否为回文 O(n），所以时间复杂度为O(n³）
    public static boolean isPalindrome(String s) {
        int len = s.length();
        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len-i-1)) {
                return false;
            }
        }
        return true;
    }
    public static String mether1(String s) {
        String result = "";
        int max_len = 0;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            for (int j = i+1; j <= len; j++) {
                if (max_len >(j-i)) {
                    break;
                }
                String test = s.substring(i, j);
                if (isPalindrome(test) && test.length() > max_len) {
                    result = s.substring(i, j);
                    max_len = Math.max(max_len, result.length());
                }
            }
        }
        return result;
    }


    // 2. 动态规划
    public static String longestPalindrome(String s) {
        int len = s.length();
        // 单个字符一定是回文
        if (len < 2) {
            return s;
        }
        // 最大长度
        int maxLen = 1;
        int begin = 0;
        // 存储是否是回文串
        boolean[][] dp = new boolean[len][len];
        char[] chars = s.toCharArray();

        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
        }
        // 从第2个字符开始
        for (int j = 1; j < len; j++) {
            // 从第1个字符开始，到第j个字符
            for (int i = 0; i < j; i++) {
                // 如果两个字符不相等，那么此位置为false
                if (chars[i] != chars[j]) {
                    dp[i][j] = false;
                } else {
                    // 长度为2或3是，肯定是回文。即除去chars[i]和 chars[j]后，只要1个或0个字符。防止出现例如 i=2 j=3情况下 查看dp[3][2]。
                    if (j - i < 2) {
                        dp[i][j] = true;
                    } else {
                        // 排除头尾元素后，是否是回文串
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                }
                if (dp[i][j] && j - i + 1 > maxLen) {
                    maxLen = j - i + 1;
                    begin = i;
                }
            }
        }
        return s.substring(begin, maxLen + begin);
    }



    public static void main(String[] args) {
        String s = "babad";
        String s1 = new StringBuffer(s).reverse().toString(); //字符串反转
        System.out.println(longestPalindrome(s));
    }
}
