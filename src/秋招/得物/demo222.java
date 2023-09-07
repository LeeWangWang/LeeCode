package 秋招.得物;

import java.util.*;

/**
 * @ClassName: demo222
 * @Description: 运动会开幕式
 * @Author: lww
 * @Date: 8/23/23 7:33 PM
 * @Version: V1
 **/
public class demo222 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        Arrays.sort(h);
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n / 2; i++) {
            ans = Math.min(ans, h[i + n / 2] - h[i]);
        }
        System.out.println(ans);
    }
}





