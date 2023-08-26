package 秋招.字节;

import java.util.*;

/**
 * @ClassName: no_11
 * @Description:
 * @Author: lww
 * @Date: 8/20/23 7:14 PM
 * @Version: V1
 **/

public class no_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();  // 读取询问次数
        int[] result = new int[t];
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();  // 珠子总数量
            int k = scanner.nextInt();  // 要求的珠子距离
            int[] a = new int[3];  // 三个珠子的位置
            for (int j = 0; j < 3; j++) {
                a[j] = scanner.nextInt();
            }
            int res = solve(n, k, a);
            result[i] = res;
        }
        for (int i = 0; i < t; i++) {
            System.out.println(result[i]);
        }
    }

    public static int solve(int n, int k, int[] a) {
        int[] redPos = new int[3];
        for (int i = 0; i < 3; i++) {
            redPos[i] = a[i];
        }
        // 对红珠子的位置进行排序
        for (int i = 0; i < 2; i++) {
            for (int j = i + 1; j < 3; j++) {
                if (redPos[i] > redPos[j]) {
                    int temp = redPos[i];
                    redPos[i] = redPos[j];
                    redPos[j] = temp;
                }
            }
        }
        // 计算两个相邻红珠子之间的间隔
        int redGap = Math.max(redPos[1] - redPos[0], redPos[2] - redPos[1]);
        // 计算需要交换的白珠子数量
        int whiteSwaps = 0;
        if (redGap < k) {
            whiteSwaps = k - redGap;
        }
        // 计算最小交换次数
        int minSwaps = whiteSwaps;
        // 如果红珠子间隔小于 k，需要考虑环上的情况
        if (redGap < k) {
            redGap = n - redGap; // 环上的另一段间隔
            minSwaps = Math.min(whiteSwaps, redGap - (k - 1));
        }
        return minSwaps;
    }
}

/*

2
6 2 1 2 3
5 2 1 3 4

6
1 1 S
2 2 S
3 2 S
4 2 S
5 2 S
1 10 H

1
*/
