package 秋招.滴滴;

import java.util.*;

/**
 * @ClassName: no_2
 * @Description:
 * @Author: lww
 * @Date: 9/8/23 8:08 PM
 * @Version: V1
 **/
public class no_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 输入字符串的个数
        sc.nextLine();
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            strings.add(sc.nextLine()); // 读取每个字符串并加入列表
        }
        List<String> result = new ArrayList<>(); // 符合条件的字符串列表
        // 遍历每个字符串进行判断
        for (String s : strings) {
            // 循环判断所有字符串的组合是否满足条件
            for (String s1 : strings) {
                for (String s2 : strings) {
                    // 排除自身和重复的组合
                    String ss1 = s1.concat(s2);
                    if (isChild(ss1, s)) {
                        result.add(s);
                        break;
                    }
                }
            }
        }
        Collections.sort(result);
        System.out.println(result.size());
        for (String s : result) {
            System.out.println(s);
        }
    }
    static boolean isChild(String s1, String s2) {
        if (s1.length() < s2.length())
            return false;
        return s1.substring(1,s1.length()-1).contains(s2);
    }
}