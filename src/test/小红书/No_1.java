package test.小红书;

import java.util.*;

/**
 * @ClassName: No_1
 * @Description: TODO
 * @Author: lww
 * @Date: 2023/4/9 16:31
 * @Version: V1
 **/

public class No_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 1; i < n; i++) {
            int s = sc.nextInt(); // 子节点
            int t = sc.nextInt(); // 父亲节点
            graph.get(s).add(t);
            graph.get(t).add(s);
        }
        sc.close();
        int[] tree_size = new int[n+1];
        dfs(graph, 1, 0, tree_size);
        long totalSize = tree_size[1];
        long minDiff = Long.MAX_VALUE;
        long count = 0;
        for (int i = 1; i <= n; i++) {
            long sizeA = tree_size[i];
            long sizeB = totalSize - sizeA;
            long diff = Math.abs(sizeA - sizeB);
            if (diff < minDiff) {
                minDiff = diff;
                count = 1;
            } else if (diff == minDiff) {
                count++;
            }
        }
        System.out.println(minDiff + " " + count);
    }
    private static void dfs(List<List<Integer>> graph, int cur, int parent, int[] tree_size) {
        tree_size[cur] = 1;
        for (int child : graph.get(cur)) {
            if (child != parent) {
                dfs(graph, child, cur, tree_size);
                tree_size[cur] += tree_size[child];
            }
        }
    }
}

/*
public class No_1 {
    static int n;
    static int[] head, nxt, ver;
    static int idx;
    static int[] size;
    static int ans = Integer.MAX_VALUE;
    static int cnt;
    static int sum;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        head = new int[n+1];
        nxt = new int[2*n-2];
        ver = new int[2*n-2];
        size = new int[n+1];
        Arrays.fill(head, -1);
        for (int i = 1; i < n; i++) {
            int s = sc.nextInt(); // 子节点
            int t = sc.nextInt(); // 父亲节点
            add(s, t);
            add(t, s);
        }
        sum = size[1] = dfs(1, 0);
        for (int i = head[1]; i != -1; i = nxt[i]) {
            int j = ver[i];
            int s1 = size[j];
            int s2 = sum - s1;
            ans = Math.min(ans, Math.abs(s1-s2));
        }
        for (int i = head[1]; i != -1; i = nxt[i]) {
            int j = ver[i];
            int s1 = size[j];
            int s2 = sum - s1;
            if (Math.abs(s1-s2) == ans) {
                cnt++;
            }
        }
        System.out.println(ans + " " + cnt);
    }
    private static int dfs(int cur, int parent) {
        int s = 1;
        for (int i = head[cur]; i != -1; i = nxt[i]) {
            int j = ver[i];
            if (j == parent) {
                continue;
            }
            s += dfs(j, cur);
        }
        size[cur] = s;
        return s;
    }
    private static void add(int a, int b) {
        ver[idx] = b;
        nxt[idx] = head[a];
        head[a] = idx++;
    }
}*/

