package 秋招.网易雷火;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @ClassName: no_1
 * @Description:
 * @Author: lww
 * @Date: 8/20/23 2:13 PM
 * @Version: V1
 **/
public class no_1 {
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
        int curr = 1;
        int longest = 1;
        for (int i = 1; i < arr.length; i++) {
            if (list.get(i) > list.get(i-1)) {
                curr++;
                longest = Math.max(longest, curr);
            } else {
                curr = 1;
            }
        }
        System.out.println(longest);
    }
}