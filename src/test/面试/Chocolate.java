package test.面试;

import java.util.Arrays;
import java.util.Scanner;

/*
小美明天要去春游了、她非常喜欢吃巧克力，希望能够带尽可能多的巧克力在春游的路上吃。她
现在有n个巧克力，很巧的是她所有的巧克力都是厚度一样的正方形的巧克力板，这n个巧克力板
的边长分别为a1,a2,...an，因为都是厚度一致的正方形巧克力板，我们认为第i个巧克力的重量
为a_i^2，小美现在准备挑选个合适大小的包来装尽可能多的巧克力板，她十分需要你的帮助来
在明天之前准备完成，请你帮帮她。

输入描述
第一行两个整数n和m,表示小美的巧克力数量和小美的询问数量。
第二行n个整数a1,a2,...,an表示n块正方形巧克力板的边长。注意你不能将巧克力板进
行拆分。
第三行m个整数q1,q2,...,qm，第i个整数表示询间:如果小美选择一个能装qi重量的
包。最多能装多少块巧克力板? (不考虑体积影响，我们认为只要质量满足要求，巧克力板总能塞进包里)

输出描述
输出一行m个整数，分别表示每次询问的答案
 */

/**
 * @ClassName: Chocolate
 * @Description: TODO
 * @Author: lww
 * @Date: 2023/3/25 19:54
 * @Version: V1
 **/
public class Chocolate {
    public static void main(String[] args) {
        // 输入部分
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] chocolates = new int[n];
        for (int i = 0; i < n; i++) {
            chocolates[i] = scanner.nextInt();
        }
        // 给巧克力从小到大排序
        Arrays.sort(chocolates);
        int[] sums = new int[n];
        sums[0] = chocolates[0]*chocolates[0];
        // 计算
        for (int i = 1; i < n; i++) {
            sums[i] = sums[i-1] + chocolates[i]*chocolates[i];
        }
        for (int i = 0; i < m; i++) {
            int q = scanner.nextInt();
            int index = Arrays.binarySearch(sums, q);
            if (index < 0) {
                index = -index - 2;
            }
            System.out.print(index + 1 + " ");
        }
    }
}




