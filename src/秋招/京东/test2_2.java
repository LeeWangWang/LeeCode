package 秋招.京东;

import java.util.*;

/**
 * @ClassName: test2_2
 * @Description:
 * @Author: lww
 * @Date: 8/19/23 10:36 AM
 * @Version: V1
 **/
public class test2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            char[][] board = new char[3][3];
            for (int j = 0; j < 3; j++) {
                String row = sc.next();
                for (int k = 0; k < 3; k++) {
                    board[j][k] = row.charAt(k);
                }
            }
            System.out.println(getWinner(board));
        }
    }
    public static String getWinner(char[][] board) {
        boolean blackEaten = false;
        boolean whiteEaten = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '*') {
                    if ((i > 0 && i < 2 && board[i - 1][j] == 'o' && board[i + 1][j] == 'o') ||
                            (j > 0 && j < 2 && board[i][j - 1] == 'o' && board[i][j + 1] == 'o')) {
                        blackEaten = true;
                    }
                } else if (board[i][j] == 'o') {
                    if ((i > 0 && i < 2 && board[i - 1][j] == '*' && board[i + 1][j] == '*') ||
                            (j > 0 && j < 2 && board[i][j - 1] == '*' && board[i][j + 1] == '*')) {
                        whiteEaten = true;
                    }
                }
            }
        }
        if (blackEaten && !whiteEaten) {
            return "yukari";
        } else if (!blackEaten && whiteEaten) {
            return "kou";
        } else {
            return "draw";
        }
    }
}



