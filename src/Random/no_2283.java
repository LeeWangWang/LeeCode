package Random;

import java.util.HashMap;

/**
 * @title: Random.no_2283
 * @description: 判断一个数的数字计数是否等于数位的值
 * @author: 李旺旺
 * @date: 2023/1/11 19:37
 * @version: 1.0
 */
public class no_2283 {
    public static boolean digitCount(String num) {
        int[] list = new int[10];
        int n = num.length();
        for (int i = 0; i < n; i++) {
            int nn = Integer.parseInt(String.valueOf(num.charAt(i)));
            list[nn]++;
        }
        for (int i = 0; i < n; i++) {
            if (Integer.parseInt(String.valueOf(num.charAt(i))) != list[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(digitCount("1210"));
    }
}
