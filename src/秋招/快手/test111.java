package 秋招.快手;
import java.util.*;

/**
 * @ClassName: test111
 * @Description:
 * @Author: lww
 * @Date: 8/28/23 3:15 PM
 * @Version: V1
 **/
public class test111 {
    public static void main(String[] args) {
        int[] array = {5, 9, 2, 12, 8, 6, 14, 10};
        int n = 3; // 前n大的数
        int nums[] = getMax(array, n);
        for (int num : nums)
            System.out.print(num + " ");
    }
    public static int[] getMax(int[] array, int n) {
        int[] result = new int[n];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : array) {
            pq.offer(num);
            if (pq.size() > n) {
                pq.poll();
            }
        }
        System.out.println("前 " + n + " 大的数是：");
        int i = 0;
        while (!pq.isEmpty()) {
            result[i++] = pq.poll();
        }
        return result;
    }
}

