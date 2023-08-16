package 秋招.米哈游;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @ClassName: no_3
 * @Description:
 * @Author: lww
 * @Date: 8/13/23 8:37 PM
 * @Version: V1
 **/
public class no_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> res = constructArray(n);
        if (res == null) {
            System.out.println("No Answer");
        } else {
            for (int num : res) {
                System.out.print(num + " ");
            }
        }
    }

    public static List<Integer> constructArray(int n) {
        List<Integer> result = new ArrayList<>();
        if (backtrack(result, n, 0)) {
            return result;
        } else {
            return null;
        }
    }

    public static boolean backtrack(List<Integer> result, int n, int sum) {
        if (result.size() == n) {
            return sum == 0;
        }
        int maxSum = sum + (n - result.size() *3);
        int minSum = sum + (n - result.size() * (-3) );
        if (maxSum < 0 || minSum > 0) return false;

        for (int i = -3; i <= 3; i++) {
            if (i == 0) continue;
            if (!result.isEmpty()) {
                int last = result.get(result.size() - 1);
                if (last * i >= 0 || last + i == 0) continue;
            }
            result.add(i);
            if (backtrack(result, n, sum+i)) {
                return true;
            }
            result.remove(result.size() - 1);
        }
        return false;
    }
}