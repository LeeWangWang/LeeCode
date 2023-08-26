package 秋招.高德;

/**
 * @ClassName: Main
 * @Description:
 * @Author: lww
 * @Date: 8/23/23 7:28 PM
 * @Version: V1
 **/
public class Main {
    public static int findMissingNumber(int[] a, int m, int n) {
        int xor = 0;
        for (int i = 0; i < a.length; i++) {
            xor ^= a[i];
        }
        for (int i = m; i <= m + n - 1; i++) {
            xor ^= i;
        }
        return xor;
    }
    public static void main(String[] args) {
        int[] a = {2, 4, 6, 8}; // 示例中给出的数组a
        int m = 1; // 示例中的m
        int n = 100; // 示例中的n
        int missingNumber = findMissingNumber(a, m, n);
        System.out.println("The missing number is: " + missingNumber);
    }
}


