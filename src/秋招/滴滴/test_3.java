package 秋招.滴滴;

import java.util.*;

/**
 * @ClassName: test_3
 * @Description:
 * @Author: lww
 * @Date: 9/15/23 8:01 PM
 * @Version: V1
 **/
public class test_3 {
    static class Point {
        int x;
        int y;
        int steps;

        Point(int x, int y, int steps) {
            this.x = x;
            this.y = y;
            this.steps = steps;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] grid = new int[n][m];

        // 读取网格图
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }

        int[] dx = {-1, 1, 0, 0}; // 上、下、左、右
        int[] dy = {0, 0, -1, 1};

        Queue<Point> queue = new ArrayDeque<>();
        queue.offer(new Point(0, 0, 0)); // 起始点

        boolean[][] visited = new boolean[n][m];
        visited[0][0] = true; // 标记起始点已访问

        int minBlackGrids = Integer.MAX_VALUE; // 最少黑色格子数

        while (!queue.isEmpty()) {
            Point current = queue.poll();
            if (current.x == n - 1 && current.y == m - 1) {
                // 到达终点，更新最少黑色格子数
                minBlackGrids = Math.min(minBlackGrids, current.steps);
                continue;
            }
            for (int i = 0; i < 4; i++) {
                int newX = current.x + dx[i];
                int newY = current.y + dy[i];

                if (newX >= 0 && newX < n && newY >= 0 && newY < m && !visited[newX][newY]) {
                    // 检查四个方向，如果是未访问的点，则加入队列并更新步数
                    visited[newX][newY] = true; // 标记已访问

                    System.out.println("位置 (" + "x:" + newX + " y:" + newY + " )" + " steps:"+ current.steps);

                    // 更新步数，如果是黑色格子就加一步
                    int newSteps = current.steps + grid[newX][newY];

                    queue.offer(new Point(newX, newY, newSteps)); // 加入队列
                }
            }
        }
        System.out.println(minBlackGrids); // 输出结果
    }
}

