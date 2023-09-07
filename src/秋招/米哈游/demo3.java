package 秋招.米哈游;

import java.util.*;

/**
 * @ClassName: demo3
 * @Description:
 * @Author: lww
 * @Date: 8/27/23 9:28 PM
 * @Version: V1
 **/
public class demo3 {
    private static List<Integer>[] edges;
    private static long[][] dp;
    private static char[] chars;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        edges = new List[n];
        for (int i = 0; i < n; i++) {
            edges[i] = new ArrayList<>();
        }
        chars = sc.next().toCharArray();
        for (int i = 0; i < n - 1; i++) {
            int u = sc.nextInt() - 1;
            int v = sc.nextInt() - 1;
            edges[u].add(v);
            edges[v].add(u);
        }
        dp = new long[n][3];
        dfs(0, -1);
        long res = 0;
        for (int i = 0; i < n; i++) {
            res += dp[i][0];
        }
        System.out.println(res*2);
    }

    private static void dfs(int u, int p) {
        if (chars[u] == 'm') {
            dp[u][2] = 1;
        } else if (chars[u] == 'h') {
            dp[u][1] = dp[u][2];
        } else if (chars[u] == 'y') {
            dp[u][0] = dp[u][1];
        }
        for (int v : edges[u]) {
            if (v == p) continue;
            dfs(v, u);
            dp[u][0] += dp[v][0];
            dp[u][1] += dp[v][1];
            dp[u][2] += dp[v][2];
            if (chars[u] == 'h') {
                dp[u][1] += dp[v][2];
            } else if (chars[u] == 'y') {
                dp[u][0] += dp[v][1];
            }
        }
    }
}



