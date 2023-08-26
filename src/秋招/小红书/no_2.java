package 秋招.小红书;

import java.util.*;

/**
 * @ClassName: no_2
 * @Description:
 * @Author: lww
 * @Date: 8/19/23 10:06 AM
 * @Version: V1
 **/
public class no_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] words = str.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, (o1, o2) -> {
            if (o1.getValue().equals(o2.getValue())) {
                return o1.getKey() .compareTo(o2.getKey());
            } else {
                return o2.getValue() - o1.getValue();
            }
        });
        for (Map.Entry<String, Integer> entry : list) {
            if (entry.getValue() >= 3)
                System.out.println(entry .getKey());
        }
    }
}