import java.util.*;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ClassName: Main
 * @Description: TODO
 * @Author: lww
 * @Date: 2023/4/17 21:15
 * @Version: V1
 **/


import java.util.*;




public class Main {

    public static int wiggleMaxLength(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int n = nums.length;
        int[] up = new int[n];
        int[] down = new int[n];
        up[0] = down[0] = 1;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    up[i] = Math.max(up[i], down[j] + 1);
                } else if (nums[i] < nums[j]) {
                    down[i] = Math.max(down[i], up[j] + 1);
                }
            }
        }
        return Math.max(up[n-1], down[n-1]);
    }

    public static void main(String[] args) {
        int[] nums = {1,10,9,12,7,8,3,6};
        System.out.println(wiggleMaxLength(nums));
    }
}



//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        scanner.nextLine();
//        String replaceableString = scanner.nextLine();
//        // 将含有替换的字符串中的{}替换为正则表达式中的匹配组
//        String regex = replaceableString.replaceAll("\\{(.*?)\\}", "(.*?)");
//        Pattern pattern = Pattern.compile(regex);
//        String[] ss = new String[n];
//        for (int i = 0; i < n; i++) {
//            ss[i] = scanner.nextLine();
//        }
//        for (int i = 0; i < n; i++) {
//            Matcher matcher = pattern.matcher(ss[i]);
//            System.out.println(matcher.matches() ? "True" : "False");
//        }
//    }
//}


//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] a = new int[n];
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//        }
//        List<int[]> edges = new ArrayList<>();
//        int cnt = 0;
//        for (int i = 1; i < n; i++) {
//            if (a[i] < a[i - 1]) {
//                System.out.println(-1);
//                return;
//            }
//            if (a[i] == a[i - 1]) {
//                cnt++;
//            } else {
//                int d = a[i] - a[i - 1];
//                if (cnt == 0) {
//                    edges.add(new int[]{i - 1, i});
//                } else if (cnt >= d) {
//                    for (int j = i - cnt - 1; j < i; j++) {
//                        edges.add(new int[]{j, j + 1});
//                    }
//                } else {
//                    System.out.println(-1);
//                    return;
//                }
//                cnt = 0;
//            }
//        }
//        System.out.println(edges.size());
//        for (int[] edge : edges) {
//            System.out.println((edge[0] + 1) + " " + (edge[1] + 1));
//        }
//    }
//}
