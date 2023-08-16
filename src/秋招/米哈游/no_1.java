package 秋招.米哈游;

import java.util.*;

/**
 * @ClassName: no_1_1
 * @Description:
 * @Author: lww
 * @Date: 8/14/23 10:23 AM
 * @Version: V1
 **/
public class no_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] points = new int[3][2];
        for (int i = 0; i < 3; i++) {
            points[i][0] = sc.nextInt();
            points[i][1] = sc.nextInt();
        }
        int res = 0;
        for (int i = 0; i < 2; i++) {
            res += Math.min(Math.abs(points[i][0] - points[i + 1][0]), n - Math.abs(points[i][0] - points[i + 1][0]));
            res += Math.min(Math.abs(points[i][1] - points[i + 1][1]), m - Math.abs(points[i][1] - points[i + 1][1]));
        }
        System.out.println(res);
    }
}
