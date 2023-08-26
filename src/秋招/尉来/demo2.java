package 秋招.尉来;

import java.util.*;

/**
 * @ClassName: demo2
 * @Description:
 * @Author: lww
 * @Date: 8/25/23 9:18 AM
 * @Version: V1
 **/
public class demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String str = sc.next();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length() - k + 1; i++) {
            String sub = str.substring(i, i + k);
            map.put(sub, map.getOrDefault(sub, 0) + 1);
        }
        String res = "-1";
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                res = entry.getKey();
            } else if (entry.getValue() == maxCount) {
                if (entry.getKey().length() < res.length()) {
                    res = entry.getKey();
                } else if (entry.getKey().length() == res.length() && entry.getKey().compareTo(res) < 0) {
                    res = entry.getKey();
                }
            }
        }
        System.out.println(res);
    }
}