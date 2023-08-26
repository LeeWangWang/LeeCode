package 秋招.腾讯;

import java.util.Stack;

/**
 * @ClassName: Demo
 * @Description:
 * @Author: lww
 * @Date: 8/24/23 7:56 PM
 * @Version: V1
 **/
public class Demo1 {
    public static void main(String[] args) {
        String input = "aaaabcccbbda";
        String output = eliminateTripleDuplicates_1(input);
        System.out.println(output); // 输出：b
    }
    // 解法1：使用for循环遍历
    // 消除连续相同大于等于3个的字符，只消除一次
    public static String eliminateTripleDuplicates_1(String input) {
        StringBuilder result = new StringBuilder();
        char[] chars = input.toCharArray(); // 字符串转为字符数组
        int count = 1;
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == chars[i + 1]) {
                // 如果第 i 个和第 i+1 个相同，count++
                count++;
            } else {
                // 如果不同
                if (count < 3) {
                    // 存入1个或2个字符
                    for (int j = 0; j < count; j++) {
                        result.append(chars[i]);
                    }
                }
                // 大于等于3个，直接消除
                count = 1;
            }
        }
        // 处理最后一个字符
        if (count < 3) {
            for (int j = 0; j < count; j++) {
                result.append(chars[chars.length - 1]);
            }
        }
        return result.toString();
    }

    // 解法2：使用栈
    // 消除连续3个相同第字符，多次消除
    public static String eliminateTripleDuplicates_2(String str) {
        // 栈1
        Stack<Character> s1 = new Stack<>();
        // 栈2
        Stack<Integer> s2 = new Stack<>();
        int n = str.length();
        s1.add(str.charAt(0));
        s2.add(1);
        for (int i = 1; i < n; i++) {
            char c = str.charAt(i);
            if (s1.isEmpty()) {
                s2.add(1);
            } else {
                if (c == s1.peek()) {
                    s2.add(s2.peek() + 1);
                } else {
                    s2.add(1);
                }
            }
            s1.add(c);
            if (s2.peek() == 3) {
                for (int j = 0; j < 3; j++) {
                    s1.pop();
                    s2.pop();
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!s1.isEmpty()) {
            sb.append(s1.pop());
        }
        return sb.reverse().toString();
    }

}


