package 秋招.微众银行;

import java.util.*;

/**
 * @ClassName: Main
 * @Description:
 * @Author: lww
 * @Date: 9/3/23 7:58 PM
 * @Version: V1
 **/

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] candies = new int[n];
        for (int i = 0; i < n; i++) {
            candies[i] = scanner.nextInt();
        }
        int maxLength = 0;
        Set<Integer> uniqueTastes = new HashSet<>();
        int left = 0;
        
        for (int right = 0; right < n; right++) {
            if (!uniqueTastes.contains(candies[right])) {
                uniqueTastes.add(candies[right]);
            } else {
                while (candies[left] != candies[right]) {
                    uniqueTastes.remove(candies[left]);
                    left++;
                }
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        System.out.println(maxLength);
    }
}


