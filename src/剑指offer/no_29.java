package 剑指offer;

/**
 * @ClassName no_29
 * @Description 顺时针打印矩阵
 * @Author JoshLee
 * @Date 2023/5/19 20:47
 * @Version: V1
 */
public class no_29 {
    public static void main(String[] args) {
        no_29 test = new no_29();
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        int[] result = test.spiralOrder(matrix);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
    public int[] spiralOrder(int[][] matrix) {
        if (matrix.length == 0) return new int[0];
        int high = matrix[0].length - 1, len = matrix.length - 1;
        int l = 0, t = 0, x = 0;
        int[] res = new int[(high + 1) * (len + 1)];
        while(true) {
            for(int i = l; i <= high; i++)
                res[x++] = matrix[t][i]; // left to right.
            if(++t > len) break;

            for(int i = t; i <= len; i++)
                res[x++] = matrix[i][high]; // top to bottom.
            if(l > --high) break;

            for(int i = high; i >= l; i--)
                res[x++] = matrix[len][i]; // right to left.
            if(t > --len) break;

            for(int i = len; i >= t; i--)
                res[x++] = matrix[i][l]; // bottom to top.
            if(++l > high) break;
        }
        return res;
    }
}
