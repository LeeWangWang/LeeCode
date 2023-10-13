package 秋招.网易;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @ClassName: no_3
 * @Description:
 * @Author: lww
 * @Date: 9/23/23 2:56 PM
 * @Version: V1
 **/
public class no_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        double sumOfAverage = 0.0;
        List<List<Integer>> subSequence = generateSubSequence(arr);
        for (List<Integer> sub : subSequence) {
            double average = caculate(sub);
            sumOfAverage += average;
        }
        System.out.println((int) sumOfAverage);
    }
    public static List<List<Integer>> generateSubSequence(int[] arr) {
        List<List<Integer>> subSequence = new ArrayList<>();
        generate(arr, 0, new ArrayList<>(), subSequence);
        return subSequence;
    }
    public static void generate(int[] arr, int index, List<Integer> current, List<List<Integer>> subSequence) {
        if (index == arr.length) {
            if (!current.isEmpty()) {
                subSequence.add(new ArrayList<>(current));
            }
            return;
        }
        generate(arr, index+1, current, subSequence);
        current.add(arr[index]);
        generate(arr, index+1, current, subSequence);
        current.remove(current.size()-1);
    }

    public static double caculate(List<Integer> list) {
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        return (double) sum / list.size();
    }
}







