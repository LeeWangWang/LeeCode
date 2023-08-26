package 秋招.京东;

import java.util.*;

/**
 * @ClassName: YiDongQueen
 * @Description:
 * @Author: lww
 * @Date: 8/19/23 11:34 AM
 * @Version: V1
 **/
public class YiDongQueen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine(); // 消耗换行符
        char[][] board = new char[n][m];
        for (int i = 0; i < n; i++) {
            String row = scanner.nextLine();
            board[i] = row.toCharArray();
        }
        int minSteps = findMinSteps(board);
        System.out.println(minSteps);
    }
    private static int findMinSteps(char[][] board) {
        int n = board.length;
        int m = board[0].length;

        int[][] dp = new int[n][m];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], Integer.MAX_VALUE);
        }
        dp[0][0] = board[0][0] == '*' ? Integer.MAX_VALUE : 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == '*') {
                    continue;
                }
                if (i + 1 < n) {
                    dp[i + 1][j] = Math.min(dp[i + 1][j], dp[i][j] + (board[i + 1][j] == '*' ? Integer.MAX_VALUE : 1));
                }
                if (j + 1 < m) {
                    dp[i][j + 1] = Math.min(dp[i][j + 1], dp[i][j] + (board[i][j + 1] == '*' ? Integer.MAX_VALUE : 1));
                }
                if (i + 1 < n && j + 1 < m) {
                    dp[i + 1][j + 1] = Math.min(dp[i + 1][j + 1], dp[i][j] + (board[i + 1][j + 1] == '*' ? Integer.MAX_VALUE : 1));
                }
            }
        }
        return dp[n - 1][m - 1] == Integer.MAX_VALUE ? -1 : dp[n - 1][m - 1];
    }
}