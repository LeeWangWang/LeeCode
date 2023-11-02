package Random;

import java.util.PriorityQueue;

/**
 * @ClassName: no_2530
 * @Description:
 * @Author: lww
 * @Date: 10/19/23 10:25 AM
 * @Version: V1
 **/
public class no_2530 {
    public static void main(String[] args) {
        int[] num1 = {10,10,10,10,10};
        int[] num2 = {1,10,3,3,3};
        System.out.println(maxKelements(num1, 5));
        System.out.println(maxKelements(num2, 3));
    }
    public static long maxKelements(int[] nums, int k) {
        long score = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>((a, b) -> b - a);
        for (int num : nums) {
            queue.offer(num);
        }
        for (int i = 0; i < k; i++) {
            int ans = queue.poll();
            score += ans;
            queue.offer((int) Math.ceil(ans*1.0 / 3.0));
        }
        return score;
    }
}