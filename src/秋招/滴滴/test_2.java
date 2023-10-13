package 秋招.滴滴;

import java.util.*;

/**
 * @ClassName: test_2
 * @Description:
 * @Author: lww
 * @Date: 9/15/23 7:52 PM
 * @Version: V1
 **/
public class test_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();  // 可以安装照明灯的位置数
        int k = scanner.nextInt();  // 需要安装的照明灯数量
        int[] positions = new int[n];  // 可以安装照明灯的坐标数组
        // 读取可以安装照明灯的坐标
        for (int i = 0; i < n; i++) {
            positions[i] = scanner.nextInt();
        }
        // 计算相邻安装位置之间的距离
        int[] distances = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            distances[i] = positions[i + 1] - positions[i];
        }
        // 对距离进行排序
        Arrays.sort(distances);
        // 计算最大的k-1个距离之和
        int maxDistance = 0;
        for (int i = 0; i < n - k; i++) {
            maxDistance += distances[i];
        }
        // 输出结果
        System.out.println(maxDistance);
    }
}





