package 秋招.饿了么;

import java.util.*;


/**
 * @ClassName: no_3
 * @Description:
 * @Author: lww
 * @Date: 8/21/23 7:47 PM
 * @Version: V1
 **/
public class no_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String horizontal = in.next();
        String vertical = in.next();
        int q = in.nextInt();

        int[] result = new int[q];
        for (int k = 0; k < q; k++) {
            String c1 = in.next();
            String c2 = in.next();
            result[k] = findMinDistance(c1, c2, horizontal, vertical, n);

        }
        for (int i = 0; i < q; i++) {
            System.out.println(result[i]);
        }
    }

    private static int findMinDistance(String c1, String c2, String horizontal, String vertical, int n) {
        if (!horizontal.contains(c1) && !vertical.contains(c1) || !horizontal.contains(c2) && !vertical.contains(c2)) {
            return -1;
        }
        int minDistance = n * 2;
        for (int i = 0; i < n; i++) {
            if (horizontal.charAt(i) == c1.charAt(0)) {
                for (int j = 0; j < n; j++) {
                    if (vertical.charAt(j) == c2.charAt(0)) {
                        minDistance = Math.min(minDistance, Math.abs(i - j) + Math.abs(i - n / 2) + Math.abs(j - n / 2));
                    }
                }
            }
            if (horizontal.charAt(i) == c2.charAt(0)) {
                for (int j = 0; j < n; j++) {
                    if (vertical.charAt(j) == c1.charAt(0)) {
                        minDistance = Math.min(minDistance, Math.abs(i - j) + Math.abs(i - n / 2) + Math.abs(j - n / 2));
                    }
                }
            }
            if (horizontal.charAt(i) == c1.charAt(0)) {
                for (int j = 0; j < n; j++) {
                    if (i != j && horizontal.charAt(j) == c2.charAt(0)) {
                        minDistance = Math.min(minDistance, Math.abs(i - j));
                    }
                }
            }
            if (vertical.charAt(i) == c1.charAt(0)) {
                for (int j = 0; j < n; j++) {
                    if (i != j && vertical.charAt(j) == c2.charAt(0)) {
                        minDistance = Math.min(minDistance, Math.abs(i - j));
                    }
                }
            }
        }
        return minDistance;
    }
}


