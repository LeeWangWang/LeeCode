package 秋招.Null;

/**
 * @ClassName: no_1
 * @Description:
 * @Author: lww
 * @Date: 9/24/23 8:40 PM
 * @Version: V1
 **/

import java.util.Scanner;
public class no_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }
        int maxSum = findMaxXORSum(a, b);
        System.out.println(maxSum);
    }
    private static int findMaxXORSum(int[] a, int[] b) {
        int maxXOR = 0;
        for (int i = 0; i < a.length; i++) {
            int sumA = 0;
            int sumB = 0;
            // Calculate sum of array a excluding the ith element
            for (int j = 0; j < a.length; j++) {
                if (j != i) {
                    sumA += a[j];
                }
            }
            // Calculate sum of array b
            for (int j = 0; j < b.length; j++) {
                sumB += b[j];
            }
            // Calculate XOR sum
            int xorSum = sumA ^ sumB;
            maxXOR = Math.max(maxXOR, xorSum);
        }
        return maxXOR;
    }
}


