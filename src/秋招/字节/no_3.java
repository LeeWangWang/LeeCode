package 秋招.字节;

import java.util.*;

/**
 * @ClassName: no_3
 * @Description:
 * @Author: lww
 * @Date: 8/20/23 7:51 PM
 * @Version: V1
 **/
public class no_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();  // 数组的大小
        int[] arr = new int[n];     // 数组元素
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int result = minOperationsToGoodArray(arr);
        System.out.println(result);
    }

    public static int minOperationsToGoodArray(int[] arr) {
        Arrays.sort(arr);  // 排序数组
        if (arr.length < 3)
            return 0;
        int median = arr[arr.length / 2];  // 众数
        int max = 0;
        int operations = 0;
        for (int num : arr) {
            int res = Math.abs(num - median);
            operations += res;
            max = Math.max(res, max);
        }
        return operations - max;
    }
}


/*
6
2 2 4 5 1 2
*/
