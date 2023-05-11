package Random;

/**
 * @title: Random.no_2373
 * @description: 矩阵中的局部最大值
 * @author: 李旺旺
 * @date: 2023/3/1 14:48
 * @version: 1.0
 */
public class no_2373 {
    public static void outgrid(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public static int[][] largestLocal(int[][] grid) {
        int [][] result = new int[grid.length-2][grid.length-2];
        for (int i = 0; i < grid.length - 2; i++) { //行
            for (int j = 0; j < grid.length - 2; j++) { //列
                // 判断最大值
                int max = 0;
                for (int k = i; k < i + 3; k++) {
                    for (int l = j; l < j + 3; l++) {
                        if (grid[k][l] > max)
                            max = grid[k][l];
                    }
                }
                result[i][j] = max;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int [][] grid1 = {{9,9,8,1}, {5,6,2,5}, {8,2,6,4}, {6,2,2,2}};
        int [][] grid2 = {{1,1,1,1,1}, {1,1,1,1,1}, {1,1,2,1,1}, {1,1,1,1,1}, {1,1,1,1,1}};
        int [][] res1 = largestLocal(grid1);
        int [][] res2 = largestLocal(grid2);
        outgrid(grid1);
        outgrid(res1);
        System.out.println("********");
        outgrid(grid2);
        outgrid(res2);
    }
}
