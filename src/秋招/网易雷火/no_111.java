package 秋招.网易雷火;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @ClassName: no_111
 * @Description:
 * @Author: lww
 * @Date: 8/20/23 2:33 PM
 * @Version: V1
 **/
public class no_111 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> list = new ArrayList<>();
        String str = scanner.nextLine();
        String[] arr = str.replace("[", "")
                .replace("]", "")
                .split(",");
        if (arr.length == 0)
            System.out.println(0);
        for (String s : arr) {
            list.add(Double.valueOf(s));
        }
        int ans = 0;
        int n = list.size();
        int start = 0;
        for (int i = 0; i < n; i++) {
            if (i > 0 && list.get(i) <= list.get(i-1)) {
                start = i;
            }
            ans = Math.max(ans, i-start+1);
        }
        System.out.println(ans);
    }
}