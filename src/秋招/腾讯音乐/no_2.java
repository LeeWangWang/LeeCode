package 秋招.腾讯音乐;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: no_2
 * @Description:
 * @Author: lww
 * @Date: 9/6/23 7:45 PM
 * @Version: V1
 **/
public class no_2 {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(kawaiiStrings(n));
    }
    public static int kawaiiStrings (int n) {
        // write code here
        List<String> allString = new ArrayList<>();
        char[] letters = {'r', 'e', 'd'};
        generateString(allString, letters, n, "");
        int count = countString(allString);
        return count;
    }

    public static int countString(List<String> all) {
        int count = 0;
        for (String ss : all) {
            if (!ss.contains("red") && JudgeStr(ss, "red")) {
                count++;
            }
        }
        return count;
    }
    public static boolean JudgeStr(String str, String target) {
        int i = 0, j = 0;
        while (i < str.length() && j < target.length()) {
            if (str.charAt(i) == target.charAt(j)) {
                j++;
            }
            i++;
        }
        return j == target.length();
    }

    public static void generateString(List<String> all, char[] letters, int n, String current) {
        if (n == 0) {
            all.add(current);
            return;
        }
        for (char cc : letters) {
            generateString(all, letters, n-1, current + cc);
        }
    }
}