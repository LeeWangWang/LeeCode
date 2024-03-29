package 剑指offer;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassName no_13
 * @Description 机器人的运动范围
 * @Author JoshLee
 * @Date 2023/5/20 17:05
 * @Version: V1
 */
public class no_13 {

    /**
     * 广度优先遍历
     **/
    public int movingCount(int m, int n, int k) {
        if (k == 0) {
            return 1;
        }
        Queue<int[]> queue = new LinkedList<int[]>();
        // 向右向下
        int[] dx = {0, 1};
        int[] dy = {1, 0};
        boolean[][] vis = new boolean[m][n];
        queue.offer(new int[]{0, 0});
        vis[0][0] = true;
        int ans = 1;
        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            int x = cell[0], y = cell[1];
            for (int i = 0; i < 2; ++i) {
                int tx = dx[i] + x;
                int ty = dy[i] + y;
                if (tx<0 || tx>=m || ty<0 || ty>=n || vis[tx][ty] || get(tx)+get(ty)>k)
                    continue;
                queue.offer(new int[]{tx, ty});
                vis[tx][ty] = true;
                ans++;
            }
        }
        return ans;
    }

    public int get(int x) {
        int res = 0;
        while (x != 0) {
            res += x%10;
            x /= 10;
        }
        return res;
    }

    public static void main(String[] args) {
        no_13 no = new no_13();
        System.out.println(no.movingCount(2, 3, 1));
        System.out.println(no.movingCount(20, 20, 5));
    }
}
