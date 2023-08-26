package 秋招.字节;

import java.util.Scanner;

/**
 * @ClassName: no_4
 * @Description:
 * @Author: lww
 * @Date: 8/20/23 8:01 PM
 * @Version: V1
 **/
public class no_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        long ans = 0;
        int[] cnt = new int[n];
        for (int i = 0; i < n; i++) {
            cnt[i] = 1;
            if (i > 0 && s.charAt(i) == s.charAt(i - 1)) {
                cnt[i] += cnt[i - 1];
            }
            ans += cnt[i];
        }
        System.out.println(ans);
    }
}

