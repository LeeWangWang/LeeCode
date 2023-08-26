package 剑指offer;

import java.util.Scanner;

/**
 * @ClassName: no_62
 * @Description:
 * @Author: lww
 * @Date: 8/23/23 3:57 PM
 * @Version: V1
 **/
public class no_62 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();
        scanner.close();
        System.out.println(lastRemaining(n, m));
    }
    public static int lastRemaining(int n, int m) {
        int ans = 0;
        // 最后一轮剩下2个人，所以从2开始反推
        for (int i = 2; i <= n; i++) {
            ans = (ans + m) % i;
        }
        return ans;
    }
}


