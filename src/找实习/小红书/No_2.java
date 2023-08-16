package 找实习.小红书;

import java.util.Scanner;

/**
 * @ClassName: Main
 * @Description: TODO
 * @Author: lww
 * @Date: 2023/4/9 17:30
 * @Version: V1
 **/
public class No_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int X = sc.nextInt();
        int C = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            y[i] = sc.nextInt();
        }
        int max = 0;
        int volume = 0;
        while (volume < C) {
            int index = -1;
            int maxY = 0;
            for (int i = 0; i < n; i++) {
                if (x[i] <= C - volume) {
                    if (maxY < y[i]) {
                        maxY = y[i];
                        index = i;
                    } else if (maxY == y[i] && x[index] > x[i]) {
                        index = i;
                    }
                }
            }
            if (index == -1) {
                break;
            }
            if (volume + x[index] == C) {
                max += y[index];
                break;
            } else {
                if (volume + x[index] == volume * 2 && X > 0) {
                    max += y[index] + X;
                    X = 0;
                } else {
                    max += y[index];
                }
                volume += x[index];
            }
        }
        System.out.println(max);
    }
}