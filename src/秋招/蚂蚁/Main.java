package 秋招.蚂蚁;

import java.util.*;

/**
 * @ClassName: Main
 * @Description:
 * @Author: lww
 * @Date: 9/19/23 7:53 PM
 * @Version: V1
 **/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = 14;
//        for (long i = 1; i < n; ++i) {
//            if (n < getNum(i)) {
//                System.out.println(i-1);
//                return;
//            }
//        }
        System.out.println(getNum(2)); // 6
        System.out.println(getNum(3)); // 15
        System.out.println(getNum(4)); // 29
    }
    public static long getNum(long k) {
        long sum = 0;
        for (long i = 1; i <= k; ++i) {
            sum += i * (k-i+1) + i;
        }
        return sum - 1;
    }
}


