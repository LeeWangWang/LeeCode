package 剑指offer;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: no_20
 * @Description: 表示数值的字符串（有限状态自动机，清晰图解）
 * @Author: lww
 * @Date: 8/4/23 10:56 AM
 * @Version: V1
 **/
public class no_20 {
    /*
    按照字符串从左到右的顺序，定义以下 9 种状态。
    0 开始的空格
    1 幂符号前的正负号
    2 小数点前的数字
    3 小数点、小数点后的数字
    4 当小数点前为空格时，小数点、小数点后的数字
    5 幂符号
    6 幂符号后的正负号
    7 幂符号后的数字
    8 结尾的空格
    */

    public boolean isNumber(String s) {
        Map[] states = {
                new HashMap<Object, Object>() {{ put(' ', 0); put('s', 1); put('d', 2); put('.', 4); }}, // 0.
                new HashMap<Object, Object>() {{ put('d', 2); put('.', 4); }},                           // 1.
                new HashMap<Object, Object>() {{ put('d', 2); put('.', 3); put('e', 5); put(' ', 8); }}, // 2.
                new HashMap<Object, Object>() {{ put('d', 3); put('e', 5); put(' ', 8); }},              // 3.
                new HashMap<Object, Object>() {{ put('d', 3); }},                                        // 4.
                new HashMap<Object, Object>() {{ put('s', 6); put('d', 7); }},                           // 5.
                new HashMap<Object, Object>() {{ put('d', 7); }},                                        // 6.
                new HashMap<Object, Object>() {{ put('d', 7); put(' ', 8); }},                           // 7.
                new HashMap<Object, Object>() {{ put(' ', 8); }}
        };
        int p = 0;
        char t;
        for (char c : s.toCharArray()) {
            if (c >= '0' && c <= '9') t = 'd';
            else if (c == '+' || c == '-') t = 's';
            else if (c == 'e' || c == 'E') t = 'e';
            else if (c == '.' || c == ' ') t = c;
            else t = '?';
            if (!states[p].containsKey(t)) return false;
            p = (int) states[p].get(t);
        }
        return p == 2 || p == 3 || p == 7 || p == 8;
    }

    public static void main(String[] args) {
        String str = "";
    }
}