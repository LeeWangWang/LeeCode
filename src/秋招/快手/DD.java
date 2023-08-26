package 秋招.快手;

import java.util.*;

/**
 * @ClassName: DD
 * @Description:
 * @Author: lww
 * @Date: 8/21/23 2:37 PM
 * @Version: V1
 **/
public class DD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();// 读取一行输入
        String[] input = str.split(",");// 将输入字符串按照逗号分隔，得到一个字符串数组
        List<String> result = new ArrayList<>(); // 创建一个List来存储结果
        // 遍历所有可能的组合长度
        for (int i = 1; i <= input.length; i++) {
            // 调用combination方法，计算长度为i的所有组合
            combination(input, result, new String[i], 0, 0);
        }
        System.out.println(String.join(",", result));
    }
    // 计算所有可能的组合
    private static void combination(String[] input, List<String> result, String[] temp, int start, int index) {
        // 如果当前组合已经填满，则将其添加到结果列表中
        if (index == temp.length) {
            result.add(String.join("", temp));
            return;
        }
        // 遍历所有可能的元素
        for (int i = start; i < input.length; i++) {
            // 将当前元素添加到当前组合中
            temp[index] = input[i];
            // 递归调用combination方法，继续填充剩余位置
            combination(input, result, temp, i + 1, index + 1);
        }
    }
}
