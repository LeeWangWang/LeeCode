package Hot100;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/**
 * @ClassName: 下一个更大元素
 * @Description:
 * @Author: lww
 * @Date: 10/22/23 4:09 PM
 * @Version: V1
 **/
public class 下一个更大元素 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] ss = sc.nextLine().split(" ");
        int[] nums = new int[ss.length];
        for (int i = 0; i < ss.length; i++) {
            nums[i] = Integer.valueOf(ss[i]);
        }
        System.out.println(Arrays.toString(dailyTemperatures(nums)));
    }
    public static int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures .length;
        int[] answer = new int[n];
        Stack<Integer> stack = new Stack<>(); // 用于存储数组索
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int index = stack.pop();
                answer[index] = i - index;
            }
            stack.push(i);
        }
        return answer;
    }
}