package 秋招.美团;

import java.util.*;

/**
 * @ClassName: no_5
 * @Description:
 * @Author: lww
 * @Date: 8/12/23 5:17 PM
 * @Version: V1
 **/
public class no_5 {
    static final int MAXN = 100005;
    static List<Integer>[] graph = new ArrayList[MAXN]; // 存储图的邻接表
    static long[] dp0 = new long[MAXN];
    static long[] dp1 = new long[MAXN];

    static long square(long x) {
        return x * x;
    }

    static boolean check(long x) {
        long t = (long) Math.sqrt(x);
        return square(t) == x || square(t - 1) == x || square(t + 1) == x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] array = new long[n]; // 存储n个数的数组
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextLong();
        }
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 1; i < n; i++) {
            int aIndex = sc.nextInt() - 1; // 输入边的一个节点
            int bIndex = sc.nextInt() - 1; // 输入边的另一个节点
            // 在邻接表中添加边
            graph[aIndex].add(bIndex);
            graph[bIndex].add(aIndex);
        }
        // 从根节点开始进行深度优先搜索
        dfs(0, 0, array);
        System.out.println(Math.max(dp0[0], dp1[0]));
    }

    static void dfs(int now, int fa, long[] arr) {
        for (int x : graph[now]) {
            if (x != fa) {
                dfs(x, now, arr);
                dp0[now] += Math.max(dp1[x], dp0[x]);
            }
        }
        for (int x : graph[now]) {
            if (x != fa && check(arr[now] * arr[x])) {
                dp1[now] = Math.max(dp1[now], dp0[now] - Math.max(dp1[x], dp0[x]) + dp0[x] + 2);
            }
        }
    }
}

