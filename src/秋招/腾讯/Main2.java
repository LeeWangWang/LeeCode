package 秋招.腾讯;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @ClassName: Main2
 * @Description:
 * @Author: lww
 * @Date: 9/10/23 8:25 PM
 * @Version: V1
 **/
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            sc.nextLine();
            List<Integer> a = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                a.add(sc.nextInt());
            }
            List<Integer> b = new ArrayList<>();
            for (int j = 0; j < n - 1; j++) {
                b.add(sc.nextInt());
            }

            List<Double> results = calculate(n, a, b);
            for (double result : results) {
                if (result % 1 == 0)
                    System.out.println(result + " ");
                else
                    System.out.println(String.format("%.1f", result) + " ");
            }
        }
    }
    public static List<Double> calculate(int n, List<Integer> a, List<Integer> b) {
        List<Double> results = new ArrayList<>();
        List<Integer> sortedA = new ArrayList<>(a);
        sortedA.sort(null);

        for (int i = 0; i < n - 1; i++) {
            double median = calculateMedian(sortedA);
            results.add(median);
            int index = b.get(i)-1;
            sortedA.remove(a.indexOf(index));
        }
        double finalMedian = calculateMedian(sortedA);
        results.add(finalMedian);
        return results;
    }
    public static double calculateMedian(List<Integer> nums) {
        int n = nums.size();
        if (n % 2 == 1)
            return nums.get(n/2);
        else
            return (double) (nums.get(n/2-1) + nums.get(n/2)) / 2;
    }
}










