package 秋招.广联达;

/**
 * @ClassName: no_1
 * @Description:
 * @Author: lww
 * @Date: 9/6/23 9:37 AM
 * @Version: V1
 **/

import java.util.*;

public class no_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] s = new int[n];
        int[] t = new int[n];
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            t[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int max = getmax(n,s,t,a);
        System.out.println(max);
    }

    public static int getmax(int n, int[] s, int[] t, int[] a) {
        PriorityQueue<Order> queue = new PriorityQueue<>(Comparator.comparingInt(o->o.endTime));
        int max = 0;
        for (int i = 0; i < n; i++) {
            while (!queue.isEmpty() && queue.peek().endTime <= s[i]) {
                max = Math.max(max, a[i] + queue.poll().profit);
            }
            queue.offer(new Order(s[i] + t[i], a[i]));
        }
        while (!queue.isEmpty()) {
            max = Math.max(max, queue.poll().profit);
        }
        return max;
    }

    static class Order {
        int endTime;
        int profit;
        public Order(int endTime, int profit) {
            this.endTime = endTime;
            this.profit = profit;
        }
    }
}