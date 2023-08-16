package 秋招.大疆;

import java.util.*;

/**
 * @ClassName: no_2
 * @Description:
 * @Author: lww
 * @Date: 8/13/23 3:04 PM
 * @Version: V1
 **/
public class no_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //String str = scanner.nextLine();
        String ss = "RUDDLLURRR";
        char[] chars = ss.toCharArray();
        int x = 0;
        int y = 0;
        for (int i = 0; i < ss.length(); i++) {
            switch (chars[i]) {
                case 'U' : y++; break; // 前
                case 'D' : y--; break; // 后
                case 'L' : x--; break; // 左
                case 'R' : x++; break; // 右
            }
        }
        System.out.println("无人机的最终坐标是:(" + x + "," + y + ")");
    }
}