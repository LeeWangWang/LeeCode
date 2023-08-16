package 秋招.美团;

import java.util.Scanner;

/**
 * @ClassName: no_2
 * @Description:
 * @Author: lww
 * @Date: 8/12/23 3:45 PM
 * @Version: V1
 **/
public class no_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 输入站的数量
        int n = scanner.nextInt();
        int[] distances = new int[n];
        // 输入站点之间的距离
        for (int i = 0; i < n - 1; i++) {
            distances[i] = scanner.nextInt();
        }
        // 最后一个站到第1站的距离
        distances[n-1] = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        scanner.close();

        long clockwiseDistance = calculateClockwiseDistance(distances, x, y);
        long counterclockwiseDistance = calculateCounterclockwiseDistance(distances, x, y);

        long shortestDistance = Math.min(clockwiseDistance, counterclockwiseDistance);
        System.out.println(shortestDistance);
    }

    private static long calculateClockwiseDistance(int[] distances, int x, int y) {
        long distance = 0;
        if (x < y) {
            for (int i = x - 1; i < y - 1; i++) {
                distance += distances[i];
            }
        } else {
            for (int i = x - 1; i < distances.length; i++) {
                distance += distances[i];
            }
            for (int i = 0; i < y - 1; i++) {
                distance += distances[i];
            }
        }
        return distance;
    }

    private static long calculateCounterclockwiseDistance(int[] distances, int x, int y) {
        long distance = 0;
        if (x > y) {
            for (int i = y - 1; i < x - 1; i++) {
                distance += distances[i];
            }
        } else {
            for (int i = y - 1; i < distances.length; i++) {
                distance += distances[i];
            }
            for (int i = 0; i < x - 1; i++) {
                distance += distances[i];
            }
        }
        return distance;
    }

}

