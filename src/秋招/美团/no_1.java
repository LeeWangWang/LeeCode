package 秋招.美团;

import java.util.Scanner;

/**
 * @ClassName: no_1
 * @Description:
 * @Author: lww
 * @Date: 8/12/23 3:29 PM
 * @Version: V1
 **/
public class no_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 输入排列的长度
        int n = scanner.nextInt();
        // 输入排列的元素
        int[] permutation = new int[n];
        for (int i = 0; i < n; i++) {
            permutation[i] = scanner.nextInt();
        }
        // 输入x和y
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        // 关闭输入流
        scanner.close();
        //断x和y是否在排列中相邻
        boolean adjacent = false;
        for (int i = 0; i < n - 1; i++) {
            if ((permutation[i] == x && permutation[i+1] == y) ||
                    (permutation[i] == y && permutation[i+1] == x) ) {
                adjacent = true;
                break;
            }
        }
        // 输出结果
        if (adjacent)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}