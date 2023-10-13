package Hot100;

import java.util.*;

/**
 * @ClassName: 三数之和
 * @Description:
 * @Author: lww
 * @Date: 10/11/23 11:07 AM
 * @Version: V1
 **/
public class 三数之和 {
    public static void main(String[] args) {
    }
//    public static List<List<Integer>> threeSum(int[] nums) {
//        List<List<Integer>> ans = new ArrayList<List<Integer>>();
//        // 特判，如果数组为 null 或者数组长度小于 3，返回 []。
//        if (nums.length < 3) return ans;
//        Arrays.sort(nums);
//
//        for (int i = 0; i < nums.length; i++) {
//            // 需要和上一次枚举的数不相同
//            if (i > 0 && nums[i] == nums[i-1])
//                continue;
//
//            int k = nums.length - 1;
//            int target =
//        }
//
//        for (int i = 0; i < nums.length; i++) {
//            // 当前大于0，可以直接返回
//            if (nums[i] > 0) return res;
//            // 相同，跳过
//            if (i > 0 && nums[i] == nums[i-1]) continue;
//            int left = i + 1;
//            int right = nums.length - 1;
//            while (left < right) {
//                if (nums[i] + nums[left] + nums[right] == 0) {
//                    List<Integer> list = new ArrayList<>();
//                    list.add(nums[i]);
//                    list.add(nums[left]);
//                    list.add(nums[right]);
//                    res.add(list);
//                    while (left < right && nums[left] == nums[left+1])
//                        ++left;
//                    while (left < right && nums[right] == nums[right-1])
//                        --right;
//                } else if (nums[i] + nums[left] + nums[right] > 0) {
//                    --right;
//                } else
//                    ++left;
//            }
//        }
//        return res;
//    }
}