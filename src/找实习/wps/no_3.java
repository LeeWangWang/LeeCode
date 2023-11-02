package 找实习.wps;

import java.util.Scanner;

/**
 * @ClassName: no_3
 * @Description: 100%
 * @Author: lww
 * @Date: 10/29/23 7:39 PM
 * @Version: V1
 **/
public class no_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        boolean[][][][] f = new boolean[101][101][101][101];
        char[] a = new char[101];
        char[] b = new char[101];
        for (int t = 0; t < T; t++) {
            String A = sc.nextLine();
            String B = sc.nextLine();
            a = A.toCharArray();
            b = B.toCharArray();
            int ans = 0;
            int n = A.length()+1;
            int m = A.length()+1;
            for (int len1 = 0; len1 <= n; len1++) {

                for (int len2 = 0; len2 <= m; len2++) {

                    for (int i = 1; i+len1-1 <= n; i++) {

                        for (int k = 1; k +len2-1 <= m; k++) {

                            int j = i + len1-1, l = k + len2-1;

                            if (len2+len1 <= 1) {
                                f[i][j][k][l] = true;
                            } else {
                                f[i][j][k][l] = false;
                                if (len1>1) f[i][j][k][l] |= (f[i+1][j-1][k][l] && (a[i] == a[j]));

                                if (len1 != 0 && len2 != 0) f[i][j][k][l] |= (f[i+1][j][k][l-1] &&(a[i] == b[l]));

                                if (len1 != 0 && len2 != 0) f[i][j][k][l] |= (f[i][j-1][k+1][l] &&(a[j] == b[k]));

                                if (len2>1) f[i][j][k][l] |= (f[i][j][k+1][l-1] && (b[k] == b[l]));
                            }
                            if (f[i][j][k][l]) {
                                ans = Math.max(ans, len2 + len1);
                            }
                        }
                    }
                }
            }
            System.out.println(ans);
        }
    }
}