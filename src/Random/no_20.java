package Random;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @title: Random.no_20
 * @description: 有效的括号，给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 * @author: 李旺旺
 * @date: 2023/2/27 19:03
 * @version: 1.0
 */
public class no_20 {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> hashMap = new HashMap<>();
        hashMap.put('(', ')');
        hashMap.put('[', ']');
        hashMap.put('{', '}');
        if (s.length() > 0 && !hashMap.containsKey(s.charAt(0))) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (hashMap.containsKey(s.charAt(i))) { //左括号，进栈
                stack.push(s.charAt(i));
            } else if (!stack.isEmpty()) { //如果栈非空
                if (hashMap.get(stack.pop()) != s.charAt(i)) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String str1 = "()[]{}";
        String str2 = "(}";
        String str3 = "(";
        String str4 = "}";
        String str5 = "[]}";
        System.out.println(isValid(str1));
        System.out.println(isValid(str2));
        System.out.println(isValid(str3));
        System.out.println(isValid(str4));
        System.out.println(isValid(str5));
    }
}
