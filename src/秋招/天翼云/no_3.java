package 秋招.天翼云;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName: no_3
 * @Description:
 * @Author: lww
 * @Date: 9/14/23 9:03 PM
 * @Version: V1
 **/
public class no_3 {
    public static void main(String[] args) {
        String a = "mnmn";
        String b = "mnpmnp";
        System.out.println(countSubstrings(a, b));
    }

    public static int countSubstrings(String a, String b) {
        // 生成字符串a和b的所有子串，并存储在两个集合中
        Set<String> setA = generateSubstrings(a);
        Set<String> setB = generateSubstrings(b);
        // 找出两个集合中的公共元素，也就是同时是a和b的子串的字符串
        setA.retainAll(setB);
        // 返回这个集合的大小，也就是不同子串的数量
        return setA.size();
    }

    // 定义一个方法来生成一个字符串的所有子串
    public static Set<String> generateSubstrings(String s) {
        // 创建一个集合来存储所有的子串
        Set<String> set = new HashSet<>();
        // 使用两层循环来生成所有可能的子串
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                // 将子串添加到集合中
                set.add(s.substring(i, j));
            }
        }
        // 返回包含所有子串的集合
        return set;
    }
}