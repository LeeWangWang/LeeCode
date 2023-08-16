package 秋招.美团;

import java.util.*;

/**
 * @ClassName: no_4
 * @Description:
 * @Author: lww
 * @Date: 8/12/23 5:05 PM
 * @Version: V1
 **/
public class no_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入字符串的长度n：");
        int n = scanner.nextInt();
        scanner.nextLine();
        System.out.print("请输入字符串：");
        String str = scanner.nextLine();
        scanner.close();

        int minWeight = Integer.MAX_VALUE;
        List<List<Character>> matrix = new ArrayList<>();

        // 尝试每种可能的行列组合
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                int j = n / i;
                List<List<Character>> currMatrix = generateMatrix(str, i, j);
                int weight = calculateWeight(currMatrix);
                if (weight < minWeight) {
                    minWeight = weight;
                    matrix = currMatrix;
                }
            }
        }

        System.out.println("最小权值为：" + minWeight);
        System.out.println("最小权值对应的矩阵为：");
        for (List<Character> row : matrix) {
            for (char c : row) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    // 生成矩阵
    private static List<List<Character>> generateMatrix(String str, int rows, int cols) {
        List<List<Character>> matrix = new ArrayList<>();
        int index = 0;

        for (int i = 0; i < rows; i++) {
            List<Character> row = new ArrayList<>();
            for (int j = 0; j < cols; j++) {
                row.add(str.charAt(index));
                index++;
            }
            matrix.add(row);
        }

        return matrix;
    }

    // 计算权值
    private static int calculateWeight(List<List<Character>> matrix) {
        int weight = 0;
        int rows = matrix.size();
        int cols = matrix.get(0).size();
        boolean[][] visited = new boolean[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (!visited[i][j]) {
                    dfs(matrix, visited, i, j);
                    weight++;
                }
            }
        }
        return weight;
    }

    // 深度优先搜案
    private static void dfs(List<List<Character>> matrix, boolean[][] visited, int row, int col) {
        int rows = matrix.size();
        int cols = matrix.get(0).size();
        char c = matrix.get(row).get(col);
        visited[row][col] = true;

        // 搜索上方相邻字符
        if (row > 0 && matrix.get(row - 1).get(col) == c && !visited[row - 1][col]) {
            dfs(matrix, visited, row - 1, col);
        }
        // 搜索下方相邻字符
        if (row < rows - 1 && matrix.get(row + 1).get(col) == c && !visited[row + 1][col]) {
            dfs(matrix, visited, row + 1, col);
        }
        // 搜索左方相邻字符
        if (col > 0 && matrix.get(row).get(col - 1) == c && !visited[row][col - 1]) {
            dfs(matrix, visited, row, col - 1);
        }
        // 搜索右方相邻字符
        if (col < cols - 1 && matrix.get(row).get(col + 1) == c && !visited[row][col + 1]) {
            dfs(matrix, visited, row, col + 1);
        }
    }
}



