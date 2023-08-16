package 找实习.字节;

import java.util.Scanner;

/*
帮我用Java解决下面的问题
有n份礼物，每份礼物数量不一，第i份礼品中有a_i个苹果和b_i个糖果，但是其它礼品盒中苹果和糖果数量不一定是这个数。决定补足苹果和糖果，框子中有无限苹果和糖果。
他有如下三种选择：
1.从框子中拿起一个苹果，放进任意一个礼品盒中。
2.从框子中拿起一个糖果，放进任意一个礼品盒中。
3.从框子中同时拿起一个苹果和一个糖果，放进任意一个礼品盒中。(同时拿起的苹果和糖果只能一起放进同一个礼品盒）
希望使用最少的次数让每个盒中的苹果数量相等，糖果数量相等。

2
2
9 6
6 9
4
1 2 4 3
2 1 6 2
*/

/**
 * @ClassName: AppleAndCandy
 * @Description: TODO
 * @Author: lww
 * @Date: 2023/4/6 14:21
 * @Version: V1
 **/
public class AppleAndCandy {

    public static int solve(int n, int a[], int b[], int maxA, int maxB) {
        if (n <= 1)  return 0;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] < maxA && b[i] < maxB) ans += Math.max(maxA - a[i], maxB - b[i]);
            else if (a[i] < maxA) ans += maxA - a[i];
            else if (b[i] < maxB) ans += maxB - b[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] result = new int[T];
        for (int g = 0; g < T; g++) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            int maxA = 0, maxB = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (a[i] > maxA) maxA = a[i];
            }
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
                if (b[i] > maxB) maxB = b[i];
            }
            result[g] = solve(n, a, b, maxA, maxB);
        }
        for (int i = 0; i < T; i++) {
            System.out.println(result[i]);
        }
    }
}

