package 秋招.联想;

import java.util.Scanner;

/**
 * @ClassName: no_1
 * @Description:
 * @Author: lww
 * @Date: 8/16/23 8:25 PM
 * @Version: V1
 **/
public class no_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int q = scanner.nextInt();
        scanner.nextLine();

        String originalStr = scanner.nextLine();

        int[] lValues = new int[q];
        int[] rValues = new int[q];
        int[] kValues = new int[q];

        for (int i = 0; i < q; i++) {
            lValues[i] = scanner.nextInt();
        }

        for (int i = 0; i < q; i++) {
            rValues[i] = scanner.nextInt();
        }

        for (int i = 0; i < q; i++) {
            kValues[i] = scanner.nextInt();
        }

        StringBuilder result = new StringBuilder(originalStr);

        for (int i = 0; i < q; i++) {
            int l = lValues[i];
            int r = rValues[i];
            int k = kValues[i];
            String copiedStr = originalStr.substring(l-1, r);
            if ( k == 0) {
                result.insert(0, copiedStr);
            } else {
                result.append(copiedStr);
            }
        }
        System.out.println(result.toString());
    }
}