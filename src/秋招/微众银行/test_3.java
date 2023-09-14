package 秋招.微众银行;

import java.util.*;

/**
 * @ClassName: test_3
 * @Description:
 * @Author: lww
 * @Date: 9/13/23 8:38 PM
 * @Version: V1
 **/
public class test_3 {
    static int n,m,s,t;
    static List<Integer>[] graph;
    static boolean[] visited;
    static boolean[] visitedFromS, visitedFromT;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); // 岛屿个数
        m = sc.nextInt(); // 航班路线数量
        s = sc.nextInt(); // 小明所在岛屿
        t = sc.nextInt(); // 目的地
        // 临接表，存储航班信息
        graph = new ArrayList[n+1];
        for (int i = 0; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }
        // 读取航班信息
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt(); // 起点
            int y = sc.nextInt(); // 终点
            graph[x].add(y);
            graph[y].add(x);
        }
        visited = new boolean[n+1]; // 每个岛屿访问状态
        visitedFromS = new boolean[n+1];
        visitedFromT = new boolean[n+1];
        int reachableFromS = dfs(s, visitedFromS); // 从小明所在岛屿开始进行深度优先搜索，返回可达的岛屿个数
        Arrays.fill(visited, false); // 将访问状态置为false
        int reachableFromT = dfs(t, visitedFromT); // 从朋友所在岛屿开始进行深度优先搜索，返回可达的岛屿个数

        long totalWays = (long) n * (n-1) / 2; // 计算总的架设传送门的方法数量
        int shareLands = 0; // 共享岛屿个数0
        for (int i = 0; i <= n; i++) {
            if (visitedFromS[i] && visitedFromT[i]) {
                shareLands++;
            }
        }
        long invalidWays = (long) shareLands * (shareLands - 1) / 2; // 计算无效的架设传送门的方法数量
        System.out.println("reachableFromS: " + reachableFromS);
        System.out.println("reachableFromT: " + reachableFromT);
        System.out.println("totalWays: " + totalWays);
        System.out.println("invalidWays: " + invalidWays);
        System.out.println(totalWays - invalidWays);
    }
    static int dfs(int node, boolean[] reachAble) {
        visited[node] = true; // 将当前岛屿标记为已访问
        reachAble[node] = true;
        int count = 1; // 初始化可达岛屿1
        // 遍历当前岛屿相邻的岛屿
        for (int next : graph[node]) {
            // 如果相邻岛屿未被访问
            if (!visited[next]) {
                count += dfs(next, reachAble); // 递归调用dfs函数，并将返回的可达岛屿个数累加到count
            }
        }
        return count;
    }
}
/*
3 1 1 3
1 2

reachableFromS: 2
reachableFromT: 1
totalWays: 3
invalidWays: 2
1
*/

/*
3 2 1 3
1 2
2 3

reachableFromS: 3
reachableFromT: 3
totalWays: 3
invalidWays: 9
-6

*/
