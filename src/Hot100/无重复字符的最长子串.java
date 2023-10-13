package Hot100;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: 无重复字符的最长子串
 * @Description: 双指针
 * @Author: lww
 * @Date: 10/11/23 9:07 AM
 * @Version: V1
 **/
public class 无重复字符的最长子串 {
    public static void main(String[] args) {
        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";
        System.out.println(s1 + ": " + lengthOfLongestSubstring(s1));
        System.out.println(s2 + ": " + lengthOfLongestSubstring(s2));
        System.out.println(s3 + ": " + lengthOfLongestSubstring(s3));
    }
    public static int lengthOfLongestSubstring(String s) {
        // 长度为0，直接返回
        if (s.length() == 0) return 0;
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int left = 0, max = 0;
        for (int i = 0; i < s.length(); i++) {
            // 如果当前字符在HashMap中
            if (map.containsKey(s.charAt(i))) {
                left = Math.max(left, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i-left+1);
        }
        return max;
    }
}