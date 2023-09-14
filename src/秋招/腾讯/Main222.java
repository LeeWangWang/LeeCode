package 秋招.腾讯;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @ClassName: Main222
 * @Description:
 * @Author: lww
 * @Date: 9/10/23 9:07 PM
 * @Version: V1
 **/
public class Main222 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            sc.nextLine();
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
            }
            int[] b = new int[n];
            for (int j = 0; j < n - 1; j++) {
                b[j] = sc.nextInt();
            }

            List<Double> results = calculate(a, b);
            for (double result : results) {
                if (result % 1 == 0)
                    System.out.println(result + " ");
                else
                    System.out.println(String.format("%.1f", result) + " ");
            }
        }
    }
    public static List<Double> calculate(int[] a, int[] b) {
        List<Double> result = new ArrayList<>();
        Arrays.sort(a);
        int n = a.length;
        result.add(calculateMedian(a));
        for (int i = 0; i < b.length; i++) {
            int idx = b[i]-1;
            int numToBeDel = a[idx];

            int[] newA = new int[n-1];
            int newIndex = 0;
            for (int j = 0; j < n; j++) {
                if (a[j] != numToBeDel) {
                    newA[newIndex++] = a[i];
                }
            }
            a = newA;
            n--;
            result.add(calculateMedian(a));
        }
        return result;
    }
    public static double calculateMedian(int[] a) {
        int n = a.length;
        if (n % 2 == 0)
            return (a[n/2-1] + a[n/2]) / 2.0f;
        else
            return a[n/2];
    }
}