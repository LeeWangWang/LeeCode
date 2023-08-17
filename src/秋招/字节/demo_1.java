package 秋招.字节;

import java.util.*;

/**
 * @ClassName: demo_1
 * @Description:
 * @Author: lww
 * @Date: 8/17/23 11:44 AM
 * @Version: V1
 **/
public class demo_1 {
    public static void main(String[] args) {
        String str = "I           am a student";
        System.out.println("字符串长度：" + str.length());
        reverseStr(str);
    }

    public static void reverseStr(String s){

        boolean flag = s.matches("[a-zA-Z0-9\\s]+");

        if (!flag) {
            System.out.println("输入包含非英文字母");
            return;
        }

        //1.以空格分隔字符串，放到数组中
        String[] s1 = s.split(" ");

        //2.定义一个字符串newString，用来存放新的字符串
        StringBuffer newStr = new StringBuffer();

        for (String arr : s1) {
            StringBuffer reverseStr = new StringBuffer(arr);
            reverseStr.reverse();//实现翻转
            newStr.append(reverseStr);//放入翻转之后的新的字符串
            newStr.append(" ");
        }

        String res = newStr.toString();
        System.out.println("翻转之后的字符串为：" + res);
        System.out.println("字符串长度：" + res);
    }
}