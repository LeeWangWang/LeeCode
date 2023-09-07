package 秋招.腾讯音乐;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: no_1
 * @Description:
 * @Author: lww
 * @Date: 9/6/23 7:11 PM
 * @Version: V1
 **/
public class no_1 {

    public int perfectPair (int[] arr) {
        // write code here
        int totalCount = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (i != j) {
                    long product = (long) arr[i] * arr[j];
                    long res = getNonZeroDigit(product);
                    if (res != 0 && res < 10) {
                        totalCount++;
                    }
                }
            }
        }
        return totalCount;
    }

    public static long getNonZeroDigit(long num) {
        while (num % 10 == 0) {
            num /= 10;
        }
        return num;
    }
}