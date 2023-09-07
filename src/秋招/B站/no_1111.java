package 秋招.B站;

/**
 * @ClassName: no_1111
 * @Description:
 * @Author: lww
 * @Date: 8/29/23 8:20 PM
 * @Version: V1
 **/
public class no_1111 {
    public float cal_max_avg_for_sub_list (int n, int k, int[] arr) {
        // write code here
        if (k <= 0 || arr == null || arr.length < k) {
            return 0;
        }
        float max = 0;
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        max = (float) sum/k;

        for (int i = k; i < n; i++) {
            sum = sum - arr[i-k] + arr[i];
            float average = (float) sum/k;
            max = Math.max(max, average);
        }
        return Float.parseFloat(String.format("%.2f", max));
    }
}