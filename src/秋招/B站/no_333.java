package 秋招.B站;

/**
 * @ClassName: no_333
 * @Description:
 * @Author: lww
 * @Date: 8/29/23 8:13 PM
 * @Version: V1
 **/
public class no_333 {
    public int[][] print_snake_matrix (int n) {
        int[][] matrix = new int[n][n];
        int num = 1;
        int top = 0;
        int bottom = n-1;
        int left = 0;
        int right = n-1;
        while (num <= n*n) {
            for (int row = top; row <= bottom; row++) {
                matrix[row][left] = num++;
            }
            left++;

            for (int col = left; col <= right; col++) {
                matrix[bottom][col] = num++;
            }
            bottom--;

            for (int row = bottom; row >= top; row--) {
                matrix[row][right] = num++;
            }
            right--;

            for (int col = right; col >= left; col--) {
                matrix[top][col] = num++;
            }
            top++;
        }
        return matrix;
    }
}