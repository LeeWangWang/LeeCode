package 秋招.字节;

import java.util.*;

/**
 * @ClassName: zongshu
 * @Description:
 * @Author: lww
 * @Date: 8/20/23 8:19 PM
 * @Version: V1
 **/
public class zongshu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();  // 数组的大小
        int[] arr = new int[n];     // 数组元素
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr); // 排序数组
        int median = arr[arr.length / 2];  // 众数
        System.out.println(median);
    }
}
