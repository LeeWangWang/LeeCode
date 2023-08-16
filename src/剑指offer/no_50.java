package 剑指offer;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: no_50
 * @Description:
 * @Author: lww
 * @Date: 2023/6/27 16:42
 * @Version: V1
 **/
public class no_50 {
    public static char firstUniqChar(String s) {
        char[] str = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : str) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 0);
            }
        }
        for (char c : str) {
            if (map.get(c) == 0)
                return c;
        }
        return ' ';
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("abaccdeff"));
    }
}