package 秋招.京东;

import java.util.*;

/**
 * @ClassName: no_1
 * @Description:
 * @Author: lww
 * @Date: 8/12/23 8:12 PM
 * @Version: V1
 **/
public class no_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int count = 0;

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : arr) {
            if (num == map.getOrDefault(num, 0)) {
                count++;
            }
        }

        System.out.println(count);
    }
}
