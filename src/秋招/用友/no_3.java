package 秋招.用友;

import java.util.Arrays;

/**
 * @ClassName: no_3
 * @Description:
 * @Author: lww
 * @Date: 9/4/23 7:20 PM
 * @Version: V1
 **/
public class no_3 {

    public int minimumCost (int n, int[][] connections) {
        // 创建并初始化并查集
        UnionFind uf = new UnionFind(n);
        // 按照能量消耗对连接进行排序
        Arrays.sort(connections, (a, b) -> a[2] - b[2]);
        int energyCost = 0;
        int numConnections = 0;

        for (int[] connection : connections) {
            int x = connection[0];
            int y = connection[1];
            int energy = connection[2];
            // 如果两个星球不再同一个联通分量，则开启这个星际门，并将两个连通分量合并
            if (!uf.isConnect(x, y)) {
                uf.union(x, y);
                energyCost += energy;
                numConnections++;

                // 如果已经连通了所有星球，则返回最小能量消耗
                if (numConnections == n-1) {
                    return energyCost;
                }
            }
        }
        // 如果无法连通所有星球，则返回-1
        return -1;
    }
}

class UnionFind {
    private int[] parent;
    private int[] rank;
    public UnionFind(int n) {
        parent = new int[n+1];
        rank = new int[n+1];
        for (int i = 0; i <= n; i++) {
            parent[i] = i;
            rank[i] = 1;
        }
    }
    public int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }
    public void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
        if (rootX != rootY) {
            if (rank[rootX] < rank[rootY])
                parent[rootY] = rootX;
            else if (rank[rootX] > rank[rootY])
                parent[rootY] = rootX;
            else {
                parent[rootY] = rootX;
                rank[rootX]++;
            }
        }
    }
    public boolean isConnect(int x, int y) {
        return find(x) == find(y);
    }
}










