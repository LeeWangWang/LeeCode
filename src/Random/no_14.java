package Random;

/**
 * @title: Random.no_14
 * @description: 编写一个函数来查找字符串数组中的最长公共前缀。如果不存在公共前缀，返回空字符串 ""。
 * @author: 李旺旺
 * @date: 2022/12/28 09:36
 * @version: 1.0
 */
public class no_14 {

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }
        int min = 200;
        int same = 0;
        // 循环次数 n
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < min) {
                min = strs[i].length();
            }
        }
        // 循环次数 min * n
        for (int i = 0; i < min; i++) {
            for (int j = 1; j < strs.length; j++) {
                if (strs[0].charAt(i) != strs[j].charAt(i)) {
                    return strs[0].substring(0, same);
                }
            }
            same += 1;
        }
        return strs[0].substring(0, same);
    }

    public static void main(String[] args) {
        String[] strs1 = new String[]{"flower","flower","flower"};
        String[] strs2 = new String[]{"dog","racecar","car"};
        String[] strs3 = new String[]{""};
        String[] strs4 = new String[]{"111"};
        System.out.println(longestCommonPrefix(strs1));
        System.out.println(longestCommonPrefix(strs2));
        System.out.println(longestCommonPrefix(strs3));
        System.out.println(longestCommonPrefix(strs4));
    }
}
