package 秋招.快手;

import java.util.*;

/**
 * @ClassName: Main
 * @Description:
 * @Author: lww
 * @Date: 8/21/23 2:10 PM
 * @Version: V1
 **/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] input = str.split(",");
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= input.length; i++) {
            combination(input, result, new String[i], 0, 0);
        }
        System.out.println(String.join(",", result));
    }
    private static void combination(String[] input, List<String> result, String[] temp, int start, int index) {
        if (index == temp.length) {
            result.add(String.join("", temp));
            return;
        }
        for (int i = start; i < input.length; i++) {
            temp[index] = input[i];
            combination(input, result, temp, i + 1, index + 1);
        }
    }
}


