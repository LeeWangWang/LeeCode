package 秋招.米哈游;

import java.util.Scanner;

/**
 * @ClassName: no_3_t
 * @Description:
 * @Author: lww
 * @Date: 8/13/23 9:57 PM
 * @Version: V1
 **/
public class no_3_t {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n < 2 || n > 100000) {
            System.out.println("No Answer");
            return;
        }
        if (n % 2 == 0) {
            System.out.println("No Answer");
        }
        int[] arr = new int[n];
        arr[0] = -1;
        int sum = -1;
        for (int i = 1; i < n/2; i++) {
            arr[i] = -1;
            sum -= 1;
        }
        for (int i = n/2; i < n; i++) {
            arr[i] = -sum / (n/2);
            sum += arr[i];
        }
        if (sum != 0) {
            System.out.println("No Answer");
            return;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}