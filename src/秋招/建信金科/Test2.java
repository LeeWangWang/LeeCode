package 秋招.建信金科;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * @ClassName: Test2
 * @Description:
 * @Author: lww
 * @Date: 10/14/23 7:35 PM
 * @Version: V1
 **/
public class Test2 {
    public int Delete_character (String s) {
        // write code here
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        for (int n : count) {
            if (n != 0) {
                heap.offer(n);
            }
        }
        int ans = 0;
        while (!heap.isEmpty()) {
            int curr = heap.poll();
            if (heap.isEmpty()) {
                return ans;
            }
            if (curr == heap.peek()) {
                if (curr > 1) {
                    heap.offer(curr - 1);
                }
                ans++;
            }
        }
        return ans;
    }
}