package 秋招.字节;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @ClassName: no_1
 * @Description:
 * @Author: lww
 * @Date: 8/17/23 11:40 AM
 * @Version: V1
 **/
public class no_1 {
    public static void main(String[] args) {
        String str = " I am a student ";
        System.out.println(reverseWords(str));
    }
    public static String reverseWords(String s) {
        int left = 0, right = s.length() - 1;
        // 创建一个双端队列
        Deque<String> deque = new ArrayDeque<String>();
        // 用于拼接一个单词的临时变量
        StringBuilder word = new StringBuilder();

        while (left <= right) {
            char c = s.charAt(left);
            if ((word.length() != 0) && (c == ' ')) {
                // 将单词 push 到队列的头部
                deque.offerFirst(word.toString());
                word.setLength(0);
            } else if (c != ' ') {
                word.append(c);
            }
            ++left;
        }
        deque.offerFirst(word.toString());
        return String.join(" ", deque);
    }
}