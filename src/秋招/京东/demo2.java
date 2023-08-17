package 秋招.京东;

import java.util.*;

/**
 * @ClassName: demo2
 * @Description:
 * @Author: lww
 * @Date: 8/16/23 2:55 PM
 * @Version: V1
 **/
public class demo2 {
    public static void main(String[] args) {
        String str = "I am a student";
        System.out.println(reverseWords(str));
    }
    public static String reverseWords(String s) {
        int left = 0, right = s.length() - 1;
        // 去掉字符串开头的空白字符
        while (left <= right && s.charAt(left) == ' ') {
            ++left;
        }
        // 去掉字符串末尾的空白字符
        while (left <= right && s.charAt(right) == ' ') {
            --right;
        }
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

/*
思路
这段代码的思路是将给定字符串中的单词逆序排列并返回结果。以下是代码的主要步骤：

1. 在`main`方法中，定义了一个字符串`str`，它包含句子 or 短语句 "I am a student"。
2. 在`main`方法中，通过调用`reverseWords`方法将`str`作为参数传递，并将结果打印到控制台。
3. 在`reverseWords`方法中，通过定义两个指针`left`和`right`来遍历字符串`s`的字符。
4. 通过循环，从字符串`s`的开头和结尾移除空格字符。
5. 创建一个双端队列（`Deque`）的实例，使用`ArrayDeque`类进行实现。
6. 创建一个用于拼接单词的`StringBuilder`对象`word`。
7. 使用循环，遍历从`left`到`right`的字符，逐个处理每个字符。
8. 如果当前字符不是空格字符，则将其附加到`word`字符串的末尾。
9. 如果当前字符是空格字符，并且`word`字符串的长度不为0，则将`word`字符串添加到双端队列的头部，并将`word`重置为空字符串。
10. 将`left`自增1，以便继续处理下一个字符。
11. 将最后一个单词`word`添加到双端队列的头部。
12. 使用`String.join()`方法将双端队列中的单词用空格连接起来，并将结果作为返回值。

代码的主要思路是使用双端队列和字符串处理的方法，将给定字符串中的单词逆序排列，并且去除开头和结尾的空格字符。最后返回逆序排列后的字符串。
*/
