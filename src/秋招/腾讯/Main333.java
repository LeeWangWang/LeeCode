package 秋招.腾讯;

import java.util.*;

/**
 * @ClassName: Main333
 * @Description:
 * @Author: lww
 * @Date: 9/10/23 9:15 PM
 * @Version: V1
 **/
public class Main333 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);
        long courage = 0;
        long current = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] >= current) {
                current += a[i] - current;
                current = a[i];
            } else {
                current += 1;
                courage += 1;
            }
        }
        System.out.println(courage);


        long maxBravery = 0;
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && a[i] >= a[stack.peek()]) {
                int j = stack.pop();
                int bravery = a[j] * (stack.isEmpty() ? i : (i-stack.peek() - 1));
                maxBravery = Math.max(maxBravery, bravery);
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            int j = stack.pop();
            int brave = a[j] * (stack.isEmpty() ? n : (n-stack.peek()-1));
            maxBravery = Math.max(maxBravery, brave);
        }
        System.out.println(maxBravery/2);
    }
}