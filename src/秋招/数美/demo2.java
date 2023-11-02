package 秋招.数美;

import java.util.Stack;

/**
 * @ClassName: demo2
 * @Description:
 * @Author: lww
 * @Date: 11/2/23 3:44 PM
 * @Version: V1
 **/
public class demo2 {
    public static void main(String[] args) {
        String str1 = "/mnt/home/someone/../log";
        String str2 = "/mnt/../mnt/engine/log/..";
        System.out.println(simplifyPath(str1));
        System.out.println(simplifyPath(str2));
    }
    public static String simplifyPath(String path) {
        String[] parts = path.split("/");
        Stack<String> stack = new Stack<>();
        for (String part : parts) {
            if (part.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (!part.isEmpty() && !part.equals(".")) {
                stack.push(part);
            }
        }
        StringBuilder sb = new StringBuilder("/");
        for (String s : stack) {
            sb.append(s).append("/");
        }

        if (sb.length() > 1) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }
}