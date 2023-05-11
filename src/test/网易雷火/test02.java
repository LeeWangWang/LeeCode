package test.网易雷火;
import java.util.*;

/**
 * @ClassName: test02
 * @Description: TODO
 * @Author: lww
 * @Date: 2023/4/22 15:16
 * @Version: V1
 **/


import java.util.LinkedList;
import java.util.Queue;

public class test02 {
    private static int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public static int getMeetingTime(int[][] map, int ax, int ay, int bx, int by) {
        int m = map.length;
        int n = map[0].length;
        boolean[][] visitedA = new boolean[m][n];
        boolean[][] visitedB = new boolean[m][n];
        Queue<int[]> queueA = new LinkedList<>();
        Queue<int[]> queueB = new LinkedList<>();
        queueA.offer(new int[]{ax, ay, 0});
        queueB.offer(new int[]{bx, by, 0});
        visitedA[ax][ay] = true;
        visitedB[bx][by] = true;
        while (!queueA.isEmpty() && !queueB.isEmpty()) {
            int[] currA = queueA.poll();
            int[] currB = queueB.poll();
            if (visitedA[currB[0]][currB[1]] || visitedB[currA[0]][currA[1]]) {
                return currA[2] + currB[2];
            }
            for (int[] dir : dirs) {
                int nextAX = currA[0] + dir[0];
                int nextAY = currA[1] + dir[1];
                if (nextAX >= 0 && nextAX < m && nextAY >= 0 && nextAY < n &&
                        map[nextAX][nextAY] == 1 && !visitedA[nextAX][nextAY]) {
                    visitedA[nextAX][nextAY] = true;
                    queueA.offer(new int[]{nextAX, nextAY, currA[2] + 1});
                }
                int nextBX = currB[0] + dir[0];
                int nextBY = currB[1] + dir[1];
                if (nextBX >= 0 && nextBX < m && nextBY >= 0 && nextBY < n &&
                        map[nextBX][nextBY] == 1 && !visitedB[nextBX][nextBY]) {
                    visitedB[nextBX][nextBY] = true;
                    queueB.offer(new int[]{nextBX, nextBY, currB[2] + 1});
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[][] map = {{1,1}, {1,1}};
        int ax = 0, ay = 0, bx = 1, by = 1;
        int meetingTime = getMeetingTime(map, ax, ay, bx, by);
        System.out.println(meetingTime); // output: 1
    }
}



