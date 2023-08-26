package 秋招.面试;

/**
 * @ClassName: Demo1
 * @Description:
 * @Author: lww
 * @Date: 8/22/23 2:29 PM
 * @Version: V1
 **/
public class Demo1 {
    public static void main(String[] args) {
        int count = 0; // 记录满足条件的组合数量
        // 三重循环穷举所有可能的组合
        for (int a = 0; a <= 9; a++) {
            for (int b = 0; b <= 9; b++) {
                for (int c = 0; c <= 9; c++) {
                    if (a + b + c == 18 && a != b && b != c && a != c) {
                        count++;
                    }
                }
            }
        }
        double probability = (double) count / 720; // 计算概率

        System.out.println("概率：" + probability);
    }
}




