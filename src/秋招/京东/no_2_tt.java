package 秋招.京东;

import java.util.*;

/**
 * @ClassName: no_2_tt
 * @Description:
 * @Author: lww
 * @Date: 8/12/23 8:25 PM
 * @Version: V1
 **/
public class no_2_tt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        String str = in.nextLine();
        int minOps = n;
        for (int i = 0; i < n; i++) {
            String rotated = str.substring(i) + str.substring(0,i);
            int ops = i;
            for (int j = 0; j < n / 2; j++) {
                if (rotated.charAt(j) != rotated.charAt(n-j-1)) {
                    ops++;
                }
            }
            minOps = Math.min(minOps, ops);
        }
        System.out.println(minOps);
    }
}