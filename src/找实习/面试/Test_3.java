package 找实习.面试;

import java.util.Stack;

/**
 * @ClassName: Test_3
 * @Description: TODO
 * @Author: lww
 * @Date: 2023/3/26 10:49
 * @Version: V1
 **/
public class Test_3 {
    public String removeDuplicateLetters (String str) {
        // write code here
        int len = str.length();
        char[] chrs = str.toCharArray();
        boolean[] visiteds = new boolean[26];
        int[] lastIndexs = new int[26];
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < chrs.length; i++) {
            lastIndexs[chrs[i] - 'a'] = i;
        }
        for (int i = 0; i < chrs.length; i++) {
            if (visiteds[chrs[i] - 'a']) {
                continue;
            }
            while (!stack.isEmpty() && stack.peek() > chrs[i] && lastIndexs[stack.peek() - 'a'] > i) {
                char topChar = stack.pop();
                visiteds[topChar - 'a'] = false;
            }
            stack.push(chrs[i]);
            visiteds[chrs[i] - 'a'] = true;
        }
        StringBuffer sb = new StringBuffer("");
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        sb.reverse();
        return new String (sb);
    }

    public static void main(String[] args) {
        String str = "abcd";
        System.out.println(str);
    }
}
