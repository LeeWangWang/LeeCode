package 秋招.网易;

import java.util.*;

/**
 * @ClassName: no_2
 * @Description:
 * @Author: lww
 * @Date: 9/23/23 2:14 PM
 * @Version: V1
 **/
public class no_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sortedString = new String(chars);
            map.put(sortedString, map.getOrDefault(sortedString, 0) + 1);
        }
        long count = 0;
        for (int frequency : map.values()) {
            count += (long) frequency * (frequency - 1) / 2;
        }
        System.out.println(count);
        sc.close();
    }
}