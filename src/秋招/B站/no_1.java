package 秋招.B站;

/**
 * @ClassName: no_1
 * @Description:
 * @Author: lww
 * @Date: 8/29/23 7:47 PM
 * @Version: V1
 **/
public class no_1 {

    public class Solution {
        public float cal_max_avg_for_sub_list (int n, int k, int[] arr) {
            if (n <= 0 || k <= 0 || arr == null || arr.length < k) {
                return (float) (0.00);
            }
            double max = Double.NEGATIVE_INFINITY;
            for (int i = 0; i < n - k; i++) {
                int sum = 0;
                for (int j = i; j < i+k; j++) {
                    sum += arr[j];
                }
                double average = (double) sum / k;
                max = Math.max(max, average);
            }
            return Float.parseFloat(String.format("%.2f", max));
        }
    }

}