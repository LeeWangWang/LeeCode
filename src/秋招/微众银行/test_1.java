package 秋招.微众银行;

import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 * @ClassName: test_1
 * @Description: 100%
 * @Author: lww
 * @Date: 9/13/23 8:58 PM
 * @Version: V1
 **/
public class test_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 珠子颜色
        int[] beads = new int[n];
        for (int i = 0; i < n; i++) {
            beads[i] = sc.nextInt();
        }
        // 使用LinkedHashSet保持原有珠子的相对顺序，并且去重
        LinkedHashSet<Integer> distinctBeads = new LinkedHashSet<>();
        for (int i = n-1; i >=0 ; i--) {
            distinctBeads.add(beads[i]);
        }
        int[] temp = new int[distinctBeads.size()];
        // 输出去重后的珠子颜色
        int i = 0;
        for (int bead : distinctBeads) {
            temp[i] = bead;
            i++;
        }
        for (int j = temp.length-1; j >= 0; j--) {
            System.out.print(temp[j] + " ");
        }
    }
}