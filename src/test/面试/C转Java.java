package test.面试;

import java.util.*;

/**
 * @ClassName: C转Java
 * @Description: TODO
 * @Author: lww
 * @Date: 2023/3/26 15:25
 * @Version: V1
 **/
public class C转Java {

    static final int maxn = 1000005;
    static final int N = 200005;
    static int n, k, num, ans;
    static int[] minp = new int[maxn];
    static int[] a = new int[N];
    static PriorityQueue<Integer> p = new PriorityQueue<>(Collections.reverseOrder());

    static void init() {
        for (int i = 2; i < maxn; ++i)
            minp[i] = i;
        for (int i = 2; i < maxn; ++i) {
            if (minp[i] != i)
                continue;
            for (int j = 2 * i; j < maxn; j += i)
                if (minp[j] == j)
                    minp[j] = i;
        }
    }

    static int cal(int num) {
        int p = 0;
        while (num != 1) {
            p = minp[num];
            num /= p;
        }
        return p;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        init();
        n = sc.nextInt();
        k = sc.nextInt();
        for (int i = 0; i < n; ++i) {
            a[i] = sc.nextInt();
            p.offer(a[i]);
        }
        while (k-- > 0) {
            int tmp = p.poll();
            p.offer(tmp / cal(tmp));
        }
        while (!p.isEmpty()) {
            int tmp = p.poll();
            ans += tmp;
        }
        System.out.println(ans);
    }
}