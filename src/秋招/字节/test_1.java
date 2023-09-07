package 秋招.字节;

import java.util.*;

/**
 * @ClassName: test_1
 * @Description:
 * @Author: lww
 * @Date: 9/3/23 7:50 PM
 * @Version: V1
 **/
public class test_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        scanner.close();

        StringBuilder result = new StringBuilder();
        char currentChar = 'a';

        while (result.length() < 100000) {
            for (int i = 0; i < k; i++) {
                result.append(currentChar);
                if (result.length() >= 100000) {
                    break;
                }
            }

            currentChar++;
            if (currentChar > 'z') {
                currentChar = 'a';
            }
        }

        System.out.println(result.toString());
    }
}



