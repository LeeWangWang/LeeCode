package 秋招.蚂蚁;

import java.util.*;

/**
 * @ClassName: no_3
 * @Description:
 * @Author: lww
 * @Date: 9/19/23 7:38 PM
 * @Version: V1
 **/
public class no_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 读取输入的整数 n
        int[] arr = new int[n]; // 创建一个长度为 n 的整数数组
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt(); // 读取 n 个整数并存储到数组中
        }
        int count = countFiveTuples(arr); // 调用 countFiveTuples 方法计算满足条件的五元组个数
        System.out.println(count); // 输出结果
    }

    public static int countFiveTuples(int[] arr) {
        int mod = 1000000007; // 定义一个常量 mod，用于取模运算
        int count = 0; // 计数器，用于记录满足条件的五元组个数
        Map<Integer, Integer> map1 = new HashMap<>(); // 创建一个 HashMap，用于记录数字出现的次数
        Map<Integer, Integer> map2 = new HashMap<>(); // 创建一个 HashMap，用于记录满足条件的配对个数
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i]; // 获取当前位置的数字
            if (map2.containsKey(num)) { // 如果 map2 中存在当前数字
                count = (count + map2.get(num)) % mod; // 更新计数器 count，累加满足条件的配对个数，并进行取模运算
            }
            if (map1.containsKey(num)) { // 如果 map1 中存在当前数字
                int value = map1.get(num); // 获取当前数字出现的次数
                map2.put(num, (map2.getOrDefault(num, 0) + value) % mod); // 更新 map2，累加满足条件的配对个数，并进行取模运算
            }
            map1.put(num, (map1.getOrDefault(num, 0) + 1) % mod); // 更新 map1，记录数字出现的次数，并进行取模运算
        }
        return count; // 返回满足条件的五元组个数
    }
}

