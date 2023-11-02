package 动态规划;

import java.util.*;

/**
 * @ClassName: 括号生成
 * @Description:
 * @Author: lww
 * @Date: 10/13/23 9:17 PM
 * @Version: V1
 **/
public class 括号生成 {
    public static List<String> generateParenthesis(int n) {
        // 创建一个字符串列表，用于存储生成的括号组合
        List<String> ans = new ArrayList<>();
        // 调用递归函数生成括号组合
        generateKuoHao(ans, new StringBuilder(), 0, 0, n);
        return ans;
    }
    public static void generateKuoHao(List<String> ans, StringBuilder sb, int open, int close, int max) {
        // 如果当前字符串的长度达到了所需的括号对数（2*n），则将其添加到结果列表中
        if (sb.length() == max * 2) {
            ans.add(sb.toString());
            return;
        }
        // 如果左括号数量小于 n，可以继续添加左括号
        if (open < max) {
            sb.append('(');
            generateKuoHao(ans, sb, open+1, close, max);
            sb.deleteCharAt(sb.length() - 1); // 回溯，删除刚刚添加的左括号
        }
        // 如果右括号数量小于左括号数量，可以继续添加右括号
        if (close < open) {
            sb.append(')');
            generateKuoHao(ans, sb, open, close + 1, max);
            sb.deleteCharAt(sb.length() - 1); // 回溯，删除刚刚添加的右括号
        }
    }
}