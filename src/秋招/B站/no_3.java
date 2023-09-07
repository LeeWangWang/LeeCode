package 秋招.B站;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: no_3
 * @Description:
 * @Author: lww
 * @Date: 8/29/23 8:05 PM
 * @Version: V1
 **/
public class no_3 {
    public int[][] print_snake_matrix (int n) {
        // write code here
        int[][] matrix = new int[n][n];
        if (n == 1) {
            matrix[0][0] = 1;
            return matrix;
        }
        List<Integer> order = new ArrayList<Integer>();
        for (int i = 1; i < n*n; i++) {
            order.add(i);
        }
        int rows = n;
        int cols = n;
        boolean[][] visited = new boolean[n][n];
        int total = n*n;
        int row = 0;
        int col = 0;
        int[][] directions = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
        int index = 0;
        for (int i = 0; i < total; i++) {
            matrix[row][col] = order.get(i);
            System.out.println(matrix[col][row]);
            visited[row][col] = true;
            int nextRow = row + directions[index][0];
            int nextCol = col + directions[index][1];
            if (nextRow < 0 || nextRow >= rows || nextCol < 0 || nextCol >= cols || visited[nextRow][nextCol]) {
                index = (index + 1) % 4;
            }
            row += directions[index][0];
            col += directions[index][1];
        }
        return matrix;
    }
}