package 找实习.面试;

import java.util.Scanner;
/**
 * @ClassName: 涂色
 * @Description: TODO
 * @Author: lww
 * @Date: 2023/3/26 16:45
 * @Version: V1
 **/
public class 涂色 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] l = new int[m];
        int[] r = new int[m];
        char[] op = new char[m];
        int[] x = new int[m];
        for (int i = 0; i < m; i++) {
            l[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            r[i] = sc.nextInt();
        }
        String s = sc.next();
        for (int i = 0; i < m; i++) {
            op[i] = s.charAt(i);
        }
        for (int i = 0; i < m; i++) {
            x[i] = sc.nextInt();
        }
        sc.close();
        int[] add = new int[n];
        int[] and = new int[n];
        int[] set = new int[n];
        for (int i = 0; i < m; i++) {
            if (op[i] == '|') {
                add[l[i]-1] += x[i];
                if (r[i] < n) {
                    add[r[i]] -= x[i];
                }
            } else if (op[i] == '&') {
                and[l[i]-1] |= x[i];
                if (r[i] < n) {
                    and[r[i]] |= -1 ^ (1 << Integer.toBinaryString(x[i]).length()) | x[i];
                }
            } else {
                set[l[i]-1] = x[i];
                if (r[i] < n) {
                    set[r[i]] = -1;
                }
            }
        }
        int or = 0;
        for (int i = 0; i < n; i++) {
            or |= and[i];
            arr[i] |= or;
            arr[i] &= -1 ^ add[i];
            arr[i] = (set[i] == -1) ? set[i] : ((set[i] == 0) ? arr[i] : set[i]);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}


