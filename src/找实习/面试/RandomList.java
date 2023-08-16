package 找实习.面试;

/**
 * @ClassName: RandomList
 * @Description: TODO
 * @Author: lww
 * @Date: 2023/3/26 09:22
 * @Version: V1
 **/
public class RandomList {

    public static int findSingleNumber(int[] nums) {
        // 如果为空，返回负数
        if (nums == null) {
            return -1;
        }
        // 如果长度为偶数，返回负数
        if (nums.length % 2 == 0) {
            return -1;
        }
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (mid % 2 == 1) {
                mid--;
            }
            if (nums[mid] != nums[mid + 1]) {
                r = mid;
            } else {
                l = mid + 2;
            }
        }
        return nums[l];
    }


    public static void main(String[] args) {
        int[] num = {1,1,2,3,3,4,4,8,8};
        int[] num2 = {3,3,7,7,10,11,11};
        System.out.println(findSingleNumber(num));
        System.out.println(findSingleNumber(num2));
    }


}