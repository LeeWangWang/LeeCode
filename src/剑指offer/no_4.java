package 剑指offer;

/**
 * @ClassName: no_4
 * @Description: TODO
 * @Author: lww
 * @Date: 2023/5/4 10:31
 * @Version: V1
 **/
public class no_4 {
    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        int i = matrix.length - 1;
        int j = 0;
        while (i >= 0 && j < matrix[0].length){
            if (matrix[i][j] > target) i--;
            else if (matrix[i][j] < target) j++;
            else return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] nums = {
                {1,   4,  7, 11, 15},
                {2,   5,  8, 12, 19},
                {3,   6,  9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30} };
        System.out.println(findNumberIn2DArray(nums, 5));
        System.out.println(findNumberIn2DArray(nums, 20));
    }
}