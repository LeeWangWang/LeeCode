package 数据结构;

/**
 * @ClassName: QuickSort
 * @Description: 快速排序
 * @Author: lww
 * @Date: 9/14/23 9:37 PM
 * @Version: V1
 **/
public class QuickSort {
    public static void Solution(int[] arr, int low, int high) {
        int i, j, temp, t;
        if (low > high)
            return;
        i = low;
        j = high;
        temp = arr[low];
        while (i < j) {
            // 先看右边，依次往左递减
            while (temp <= arr[j] && i < j) {
                j--;
            }
            // 再看左边，依次往右递增
            while (temp >= arr[i] && i < j) {
                i++;
            }
            //交换
            if (i < j) {
                t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }
        }
        // 将基准与i和j相等位置的数字交换
        arr[low] = arr[i];
        arr[i] = temp;
        //递归调用
        Solution(arr, low, j-1);
        Solution(arr, j+1, high);
    }
    public static void main(String[] args) {
        int[] nums = {1,3,5,8,1,2,5,7};

        Solution(nums, 0,nums.length-1);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

}