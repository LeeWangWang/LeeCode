package 秋招.灵犀互娱;

import java.util.*;

/**
 * @ClassName: no2
 * @Description:
 * @Author: JoshLee
 * @Date: 2023/8/26 10:56
 * @Version: V1
 */

public class no2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int[][] grid = {{2,1,0},{1,0,1},{0,0,0}};
        int minutes = rottenApples(grid);
        System.out.println(minutes);
    }

    public static int rottenApples(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        boolean[][] visited = new boolean[rows][cols];

        // 定义四个方向，上、下、左、右
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        Queue<int[]> queue = new LinkedList<>();

        // 将所有腐烂的苹果位置入队，并设置为已访问
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 2) {
                    queue.offer(new int[]{i, j});
                    visited[i][j] = true;
                }
            }
        }

        int minutes = 0;

        // 进行腐烂传播，直到队列为空
        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean hasFreshApple = false;

            for (int i = 0; i < size; i++) {
                int[] curr = queue.poll();
                int row = curr[0];
                int col = curr[1];

                // 尝试向四个方向传播病菌
                for (int[] direction : directions) {
                    int newRow = row + direction[0];
                    int newCol = col + direction[1];

                    // 判断新位置是否有效且未访问
                    if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols && grid[newRow][newCol] == 1 && !visited[newRow][newCol]) {
                        queue.offer(new int[]{newRow, newCol});
                        visited[newRow][newCol] = true;
                        grid[newRow][newCol] = 2; // 设置为腐烂状态
                        hasFreshApple = true;
                    }
                }
            }

            if (hasFreshApple) {
                minutes++;
            }
        }

        // 检查是否还有完好的苹果
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    return -1;
                }
            }
        }

        return minutes;
    }
}









