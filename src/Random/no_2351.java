package Random;

import java.util.HashMap;

/**
 * @title: Random.no_2351
 * @description: 给你一个由小写英文字母组成的字符串 s ，请你找出并返回第一个出现 两次 的字母。
 * @author: 李旺旺
 * @date: 2023/1/1 16:26
 * @version: 1.0
 */
public class no_2351 {
    public static char repeatedCharacter(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            if (hashMap.containsKey(s.charAt(i))) {
                return s.charAt(i);
            }
            hashMap.put(s.charAt(i), i);
        }
        return ' ';
    }

    public static void main(String[] args) {
        String str1 = "abccbaacz";
        String str2 = "abcdd";
        System.out.println(repeatedCharacter(str1));
        System.out.println(repeatedCharacter(str2));
    }
}
