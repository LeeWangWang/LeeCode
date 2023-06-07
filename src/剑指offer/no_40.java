package 剑指offer;

import java.util.Arrays;

/**
 * @ClassName: no_40
 * @Description:
 * @Author: JoshLee
 * @Date: 2023/6/7 20:23
 * @Version: V1
 */
public class no_40 {
    public static int[] getLeastNumbers(int[] arr, int k) {
        Arrays.sort(arr);
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = arr[i];
        }
        return res;
    }
    public static void sout(int[] num) {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] num1 = {3,2,1};
        int[] num2 = {0,1,2,1};
        int[] num3 = {4,5,1,6,2,7,3};
        int k1 = 2;
        int k2 = 1;
        int k3 = 4;
        sout(getLeastNumbers(num1, k1));
        sout(getLeastNumbers(num2, k2));
        sout(getLeastNumbers(num3, k3));
    }
}
