package 秋招.腾讯;

import java.util.Scanner;

/**
 * @ClassName: Main5
 * @Description:
 * @Author: lww
 * @Date: 9/10/23 8:37 PM
 * @Version: V1
 **/
public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n && k > 0; i++) {
            while (k > 0 && arr[i] > 0) {
                int low = arr[i] & -arr[i];
                arr[i] -= low;
                k--;
            }
        }
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.println(sum);

    }
}