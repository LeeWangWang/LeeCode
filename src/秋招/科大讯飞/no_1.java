package 秋招.科大讯飞;

import java.util.*;

/**
 * @ClassName: no_1
 * @Description:
 * @Author: lww
 * @Date: 8/13/23 2:18 PM
 * @Version: V1
 **/
public class no_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = n-i;
        }
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}