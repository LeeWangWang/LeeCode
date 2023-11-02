package 秋招.菜鸟;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @ClassName: Test03
 * @Description:
 * @Author: lww
 * @Date: 10/25/23 7:33 PM
 * @Version: V1
 **/
public class Test03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        // 创建一个集合来存储不同的取值
        Set<Integer> distinctValues = new HashSet<>();
        for (int i = 0; i < n; i++) {
            // 初始的权值等于当前元素
            int currentOrValue = a[i];
            // 将初始权值添加到集合中
            distinctValues.add(currentOrValue);
            for (int j = i + 1; j < n; j++) {
                // 计算子区间的权值
                currentOrValue |= a[j];
                distinctValues.add(currentOrValue);
            }
        }
        System.out.println(distinctValues.size());
    }
}