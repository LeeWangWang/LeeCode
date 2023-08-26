package 秋招.美团2;

/**
 * @ClassName: mianshi
 * @Description:
 * @Author: lww
 * @Date: 8/24/23 9:06 PM
 * @Version: V1
 **/
public class mianshi {
    public static void main(String[] args) {
        int[] nums1 = {3,4,5,1,2};
        int[] nums2 = {2,2,2,0,1};
        System.out.println(minArray(nums1));
        System.out.println(minArray(nums2));

    }
    public static int minArray(int[] numbers) {
        int low = 0;
        int high = numbers.length - 1;
        while (low < high) {
            int pivot = low + (high - low) / 2;
            if (numbers[pivot] < numbers[high]) {
                high = pivot;
            } else if (numbers[pivot] > numbers[high]) {
                low = pivot + 1;
            } else {
                high -= 1;
            }
        }
        return numbers[low];
    }
}
