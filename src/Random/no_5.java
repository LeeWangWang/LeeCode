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


    // 2.
    public static String longestPalindrome(String s) {
        return "";
    }

    public static void main(String[] args) {
        String s = "babad";
        String s1 = new StringBuffer(s).reverse().toString(); //字符串反转
        System.out.println(longestPalindrome(s));
    }
}
