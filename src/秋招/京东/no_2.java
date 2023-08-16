package 秋招.京东;

import java.util.*;

/**
 * @ClassName: no_2
 * @Description:
 * @Author: lww
 * @Date: 8/12/23 8:13 PM
 * @Version: V1
 **/
public class no_2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        in.nextLine();
        String str = in.nextLine();
        int count = 0;
        int i = 0, j = n-1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                if (str.charAt(i) < str.charAt(j)) {
                    str = str.substring(0, i) + str.charAt(i) + str.substring(i, n);
                } else {
                    str = str.substring(0, j+1) + str.charAt(j) + str.substring(j+1, n);
                }
                count++;
            }
            i++;
            j--;
        }
        System.out.println(count);
    }
}