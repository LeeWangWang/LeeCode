package 秋招.微众银行;

import java.util.ArrayDeque;
import java.util.LinkedHashSet;
import java.util.Queue;
import java.util.Scanner;

/**
 * @ClassName: test_2
 * @Description: 100%
 * @Author: lww
 * @Date: 9/13/23 8:59 PM
 * @Version: V1
 **/
public class test_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 歌单长度
        int[] songList = new int[n]; // 歌曲ID数组
        Queue<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            songList[i] = sc.nextInt();
            queue.offer(songList[i]);
        }

        int[] playOrder = new int[n];
        int index = 0;

        while (!queue.isEmpty()) {
            playOrder[index++] = queue.poll();
            if (!queue.isEmpty()) {
                int nextSong = queue.poll();
                queue.offer(nextSong);
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(playOrder[i]);
            if (i < n-1)
                System.out.print(" ");
        }

    }
}