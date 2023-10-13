package Random;

import java.util.Arrays;

/**
 * @ClassName: no_179
 * @Description:
 * @Author: lww
 * @Date: 9/19/23 8:51 AM
 * @Version: V1
 **/
public class no_179 {
    public String largestNumber(int[] nums) {
        int n = nums.length;
        // 创建一个字符串数组，用于存放将整数转换为字符串后的结果
        String[] ss = new String[n];
        // 将整数数组转换为字符串数组
        for (int i = 0; i < n; i++) ss[i] = "" + nums[i];
        // 对字符串数组进行排序，排序规则通过 lambda 表达式指定
        Arrays.sort(ss, (a, b) -> {
            // 将两个字符串进行拼接，形成两种不同的拼接顺序
            String sa = a + b, sb = b + a;
            // 比较两种拼接顺序的字典序，实现降序排序
            return sb.compareTo(sa);
        });
        // 创建一个 StringBuilder 对象，用于拼接最大的字符串
        StringBuilder sb = new StringBuilder();
        // 将排好序的字符串按顺序拼接到 StringBuilder 中
        for (String s : ss) sb.append(s);

        // 获取拼接后的字符串长度
        int len = sb.length();
        int k = 0;
        // 处理拼接后最大数为0的特殊情况
        while (k < len - 1 && sb.charAt(k) == '0') k++;
        // 返回最大拼接字符串
        return sb.substring(k);
    }
}