package 秋招.game4399;

import java.util.Scanner;

/**
 * @ClassName: no_1
 * @Description:
 * @Author: lww
 * @Date: 8/16/23 8:41 AM
 * @Version: V1
 **/
public class no_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] books = scanner.nextLine().split(" ");
        int cnt = scanner.nextInt();
        scanner.close();
        System.out.println(interestingReadingList(books, cnt));
    }

    public static int interestingReadingList(String[] books , int cnt) {
        int res = 0;
        int[] count = new int[26];
        int left = 0, right = 0;
        while (right < books .length) {
            count[books[right].charAt(0) - 'A']++;
            while (count[books[right].charAt(0) - 'A'] > cnt) {
                count[books[left].charAt(0) - 'A']--;
                left++;
            }
            res += right - left + 1;
            right++;
        }
        return res;
    }
}