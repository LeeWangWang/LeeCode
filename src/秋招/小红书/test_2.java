package 秋招.小红书;

import java.util.*;

/**
 * @ClassName: test_2
 * @Description:
 * @Author: lww
 * @Date: 8/19/23 4:35 PM
 * @Version: V1
 **/
public class test_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            String s = sc.next();
            boolean flag = true;
            for (int i = 0; i < s.length() / 2; i++) {
                char c1 = s.charAt(i);
                char c2 = s.charAt(s.length() - i - 1);
                if (c1 == 'w' || c1 == 'm' || c2 == 'w' || c2 == 'm') {
                    flag = false;
                    break;
                }
                if (c1 == 'b' || c1 == 'd' || c1 == 'p' || c1 == 'q') {
                    if (c2 != 'b' && c2 != 'd' && c2 != 'p' && c2 != 'q') {
                        flag = false;
                        break;
                    }
                } else if (c1 == 'n' || c1 == 'u') {
                    if (c2 != 'n' && c2 != 'u') {
                        flag = false;
                        break;
                    }
                } else if (c1 != c2) {
                    flag = false;
                    break;
                }
            }
            System.out.println(flag ? "YES" : "NO");
        }
    }
}

