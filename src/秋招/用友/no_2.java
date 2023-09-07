package 秋招.用友;

/**
 * @ClassName: no_2
 * @Description:
 * @Author: lww
 * @Date: 9/4/23 7:49 PM
 * @Version: V1
 **/
public class no_2 {
    public int maxValue (int[][] grid) {
        // write code here
        int rows = grid.length;
        int cols = grid[0].length;

        // 二维数组存储最大收益
        int[][] dp = new int[rows][cols];

        dp[0][0] = grid[0][0];
        // 初始化第一行和第一列
        for (int i = 1; i < rows; i++) {
            dp[i][0] = dp[i-1][0] + grid[i][0];
        }
        for (int i = 1; i < cols; i++) {
            dp[0][i] = dp[0][i-1] + grid[0][i];
        }

        // 填充dp
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                dp[i][j] = grid[i][j] + Math.max( dp[i-1][j], dp[i][j-1] );
            }
        }
        return dp[rows-1][cols-1];
    }
}