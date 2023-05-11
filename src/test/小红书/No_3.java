package test.小红书;

import java.util.Scanner;

/**
 * @ClassName: No_3
 * @Description: TODO
 * @Author: lww
 * @Date: 2023/4/9 17:52
 * @Version: V1
 **/
public class No_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] balls = new int[n];
        int[] colors = new int[n];
        for (int i = 0; i < n; i++) {
            balls[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            colors[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] operate = new int[m];
    }
}