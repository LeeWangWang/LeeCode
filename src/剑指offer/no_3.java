package 剑指offer;

import java.util.HashMap;

/**
 * @ClassName: no_3
 * @Description: TODO
 * @Author: lww
 * @Date: 2023/5/4 09:05
 * @Version: V1
 **/
public class no_3 {

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