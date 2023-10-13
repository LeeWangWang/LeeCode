package 秋招.去哪儿;

/**
 * @ClassName: no_2
 * @Description: 80%
 * @Author: lww
 * @Date: 9/15/23 3:17 PM
 * @Version: V1
 **/
public class no_2 {
    public int find (int n, int v, int[] a) {
        // write code here
        if (n == 0)
            return 1;
        int left = 0;
        int right = n-1;
        int result = n+1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (a[mid] >= v) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return result + 1;
    }
}