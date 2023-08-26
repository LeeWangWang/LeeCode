package 秋招.美团2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName: no_5
 * @Description:
 * @Author: lww
 * @Date: 8/19/23 7:26 PM
 * @Version: V1
 **/
public class no_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int count = 0;
        if (array.length == 1) {
            return ;
        }
    }
}