package 秋招.小红书;

import java.util.*;

/**
 * @ClassName: test_1
 * @Description:
 * @Author: lww
 * @Date: 8/19/23 4:28 PM
 * @Version: V1
 **/
public class test_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String word = sc.next();
            if (!set.contains(word)) {
                set.add(word);
                for (int j = 0; j < set.size(); j++) {
                    if (i + 1 < n) {
                        word = sc.next();
                        i++;
                    }
                }
            }
        }
        System.out.println(set.size());
    }
}
/*
5
you
thank
thank
hello
thank
*/