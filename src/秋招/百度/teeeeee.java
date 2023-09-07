package 秋招.百度;

/**
 * @ClassName: teeeeee
 * @Description:
 * @Author: lww
 * @Date: 8/28/23 8:12 PM
 * @Version: V1
 **/
public class teeeeee {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,788};
        int flag = 5;
        System.out.println(search(nums, flag));
    }

    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // 如果未找到目标数，则返回-1
    }

}


