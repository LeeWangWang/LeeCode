package 剑指offer;

/**
 * @ClassName: no_12
 * @Description: 矩阵中的路径
 * @Author: lww
 * @Date: 2023/5/18 15:31
 * @Version: V1
 **/
public class no_12 {
    public static boolean exist(char[][] board, String word) {
        char[] words = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(board, words, i, j, 0)) return true;
            }
        }
        return false;
    }

    static boolean dfs(char[][] board, char[] word, int i, int j, int k) {
        if (i >= board.length || i < 0 || j >= board[0].length || j < 0 || board[i][j] != word[k]) return false;
        if (k == word.length-1) return true;
        board[i][j] = '\0';
        boolean res = dfs(board, word, i + 1, j, k + 1) || dfs(board, word, i - 1, j, k + 1) ||
                      dfs(board, word, i, j + 1, k + 1) || dfs(board, word, i, j - 1, k + 1);
        board[i][j] = word[k];
        return res;
    }

    public static void main(String[] args) {
        char[][] cc = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String str = "ABCB";
        System.out.println(exist(cc, str));
    }

}



