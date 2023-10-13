package 秋招.网易;

import java.util.Scanner;

/**
 * @ClassName: Main
 * @Description:
 * @Author: lww
 * @Date: 9/23/23 2:06 PM
 * @Version: V1
 **/
public class no_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(canBeSorted(arr) ? "YES" : "NO");
        }
    }
    private static boolean canBeSorted(int[] arr) {
        int n = arr.length;
        if (n % 2 != 0) {
            return true;
        }

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (arr[j] > arr[(j+2)%n]) {
                    int temp = arr[j];
                    arr[j] = arr[(j+2)%n];
                    arr[(j+2)%n] = temp;
                }
            }
        }
        for (int i = 1; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (arr[i] < arr[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}