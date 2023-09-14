package 秋招.滴滴;

import java.util.Scanner;

/**
 * @ClassName: no_1
 * @Description: 82%
 * @Author: lww
 * @Date: 9/8/23 7:27 PM
 * @Version: V1
 **/
public class no_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 糖果工厂可以生产的糖果种类数量
        int a = sc.nextInt(); // 订单的需求是 a 包糖果
        int b = sc.nextInt(); // 每包不少于b个
        sc.nextLine();
        int[] candies = new int[n];
        for (int i = 0; i < n; i++) {
            candies[i] = sc.nextInt();
        }
        // 计算最少天数
        int days = 1;
        while (true) {
            long[] totalCandies = new long[n]; // 当前可用的糖果总数
            long totalPackages = 0;
            for (int i = 0; i < n; i++) {
                totalCandies[i] += (long) candies[i] * days; // 第 days+1 天的时候每种糖果的数量
                totalPackages += totalCandies[i] / b;
            }
            if (totalPackages >= a) {
                break; // 可以满足订单要求，退出循环
            }
            days++;
        }
        System.out.println(days);
    }
}

/*
3 10 20
7 9 6
*/




