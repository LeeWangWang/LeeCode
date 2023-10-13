package 秋招.蚂蚁;

import java.util.*;

/**
 * @ClassName: test_1
 * @Description:
 * @Author: lww
 * @Date: 9/26/23 7:38 PM
 * @Version: V1
 **/
public class test_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 5;
        int k = 2;
        String s = "aabbb";
        int[] cnt = new int[26];
        for (int i = 0; i < n; i++) {
            cnt[s.charAt(i) - 'a']++;
        }
        Arrays.sort(cnt);
        int max = 0;
        for (int i = 25; i >= 24; i--) {
            max = Math.max(max, (cnt[i] + k - 1) / k);
        }
        for (int i = 0; i < 26; i++) {
            if (cnt[i] > max * k) {
                System.out.println(-1);
                return;
            }
        }
        System.out.println(max);
    }
}




