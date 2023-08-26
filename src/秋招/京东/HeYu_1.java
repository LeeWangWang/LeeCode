package 秋招.京东;

import java.util.Scanner;

/**
 * @ClassName: HeYu_1
 * @Description:
 * @Author: lww
 * @Date: 8/19/23 11:00 AM
 * @Version: V1
 **/
public class HeYu_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String symptoms = scanner.nextLine();
        int m = scanner.nextInt();
        scanner.nextLine();
        String[] treatments = new String[m];
        String[] sideEffects = new String[m];
        for (int i = 0; i < m; i++) {
            treatments[i] = scanner.nextLine();
            sideEffects[i] = scanner.nextLine();
        }
        int q = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < q; i++) {
            int u = scanner.nextInt();
            scanner.nextLine();
            // 创建当前症状数组，初始化为小红目前的症状
            int[] currentSymptoms = new int[n];
            for (int j = 0; j < n; j++) {
                currentSymptoms[j] = (symptoms.charAt(j) == '1') ? 1 : 0;
            }
            // 根据小红服用的药物更新症状数组
            for (int j = 0; j < u; j++) {
                int index = scanner.nextInt() - 1;
                scanner.nextLine();
                // 更新症状数组
                for (int k = 0; k < n; k++) {
                    if (treatments[index].charAt(k) == '1') {
                        currentSymptoms[k] = 0;
                    }
                    if (sideEffects[index].charAt(k) == '1') {
                        currentSymptoms[k] = 1;
                    }
                }
            }
            // 统计当前症状的数量
            int count = 0;
            for (int j = 0; j < n; j++) {
                count += currentSymptoms[j];
            }
            System.out.println(count);
        }
        scanner.close();
    }
}
