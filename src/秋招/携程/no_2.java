package 秋招.携程;

import java.util.Scanner;

/**
 * @ClassName: no_2
 * @Description: 0%
 * @Author: lww
 * @Date: 9/7/23 8:19 PM
 * @Version: V1
 **/
public class no_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        char[][] matrix = new char[n][m];
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            for (int j = 0; j < m; j++) {
                matrix[i][j] = str.charAt(j);
            }
        }

        int count = 0;
        // 记录y和o在矩阵中的位置
        int[][] horizon = new int[n][m];
        int[][] vertical = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int yCount = 0;
                int oCount = 0;
                if (matrix[i][j] == 'y')
                    yCount = 1;
                else if (matrix[i][j] == 'o')
                    oCount = 1;

                if (i > 0) {
                    yCount += horizon[i-1][j];
                    oCount += vertical[i-1][j];
                }

                if (j > 0) {
                    yCount += vertical[i][j-1];
                    oCount += horizon[i][j-1];
                }

                horizon[i][j] = yCount;
                vertical[i][j] = oCount;

                if (matrix[i][j] == 'u') {
                    count += (yCount * oCount);
                }
            }
        }
        System.out.println(count);
    }
}