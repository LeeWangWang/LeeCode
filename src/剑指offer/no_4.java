package 剑指offer;

/**
 * @ClassName: no_4
 * @Description: 二维数组中的查找
 * @Author: lww
 * @Date: 2023/5/4 10:31
 * @Version: V1
 **/
public class no_4 {
    /*
    在一个 n * m 的二维数组中，每一行都按照从左到右非递减的顺序排序，
    每一列都按照从上到下非递减的顺序排序。
    请完成一个高效的函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
     */
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