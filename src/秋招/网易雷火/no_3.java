package 秋招.网易雷火;

import java.util.Scanner;

/**
 * @ClassName: no_3
 * @Description:
 * @Author: lww
 * @Date: 8/20/23 3:16 PM
 * @Version: V1
 **/
public class no_3 {
    static int[][] grid;
    static int rows, cols;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        rows = scanner.nextInt();
        cols = scanner.nextInt();
        grid = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }
        int maxBeans = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                maxBeans = Math.max(maxBeans, eatBeans(i, j, grid[i][j]));
            }
        }
        System.out.println(maxBeans);
    }
    static int[] dr = {-1,1,0,0};
    static int[] dc = {0,0,-1,1};
    public static int eatBeans(int row, int col, int power) {
        int eatbeans = 0;
        for (int i = 0; i < 4; i++) {
            int newRow = row + dr[i];
            int newCol = col + dc[i];

            if (isValid(newRow, newCol) && grid[newRow][newCol] < power) {
                int temp = grid[newRow][newCol];
                grid[newRow][newCol] = power;
                eatbeans = Math.max(eatbeans, eatBeans(newRow, newCol, temp) + 1);
                grid[newRow][newCol] = temp;
            }
        }
        return eatbeans;
    }
    public static boolean isValid (int row, int col) {
        return row >= 0 && row < rows && col >= 0 && col < cols;
    }
}