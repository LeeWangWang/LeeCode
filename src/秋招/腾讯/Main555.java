package 秋招.腾讯;

import java.util.Scanner;

/**
 * @ClassName: Main555
 * @Description:
 * @Author: lww
 * @Date: 9/10/23 9:41 PM
 * @Version: V1
 **/
public class Main555 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] sequence = new int[n];
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            sequence[i] = sc.nextInt();
        }
        int result = findMin(sequence, k);
        System.out.println(result/2);
    }
    public static int findMin(int[] sequence, int k){
        int minSum = 0;
        int[] lowest = new int[sequence.length];
        for (int i = 0; i < sequence.length; i++) {
            lowest[i] = Integer.numberOfTrailingZeros(sequence[i]);
        }
        for (int i = 0; i < k; i++) {
            int minPosition = -1;
            for (int j = 0; j < sequence.length; j++) {
                if (lowest[j] != -1 && (minPosition == -1 || lowest[j] < lowest[minPosition])) {
                    minPosition = j;
                }
            }
            if (minPosition == -1) {
                break;
            }
            sequence[minPosition] &= (sequence[minPosition] - 1);
            lowest[minPosition] = -1;
        }
        for (int num : sequence) {
            minSum += num;
        }
        return minSum;
    }
}