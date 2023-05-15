package 剑指offer;

import java.util.HashMap;

/**
 * @ClassName: no_3
 * @Description: 找出数组中重复的数字。
 * @Author: lww
 * @Date: 2023/5/4 09:05
 * @Version: V1
 **/
public class no_3 {

    /*
    在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。
    数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。
    请找出数组中任意一个重复的数字。
     */
    public static int findRepeatNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return nums[i];
            }
            map.put(nums[i], i);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,1,0,2,5,3};
        System.out.println(findRepeatNumber(nums));
    }
}