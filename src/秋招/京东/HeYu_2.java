package 秋招.京东;

import java.util.*;

/**
 * @ClassName: HeYu_2
 * @Description:
 * @Author: lww
 * @Date: 8/19/23 11:06 AM
 * @Version: V1
 **/
class State {
    int x;
    int y;
    int steps;
    public State(int x, int y, int steps) {
        this.x = x;
        this.y = y;
        this.steps = steps;
    }
}
public class HeYu_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();
        char[][] grid = new char[n][m];
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            grid[i] = line.toCharArray();
        }
        int result = findShortestPath(grid);
        System.out.println(result);
    }
    private static int findShortestPath(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] visited = new boolean[n][m];
        visited[0][0] = true;
        int[] dx = {1, 0, 1};
        int[] dy = {0, 1, 1};
        Queue<State> queue = new LinkedList<>();
        queue.offer(new State(0, 0, 0));
        while (!queue.isEmpty()) {
            State curr = queue.poll();
            int x = curr.x;
            int y = curr.y;
            int steps = curr.steps;
            if (x == n-1 && y == m-1) return steps;
            for (int i = 0; i < 3; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx < 0 || nx >= n || ny < 0 || ny >= m || visited[nx][ny] || grid[nx][ny] == '*') {
                    continue;
                }
                visited[nx][ny] = true;
                queue.offer(new State(nx, ny, steps + 1));
            }
        }
        return -1;
    }
}

