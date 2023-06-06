package 剑指offer;

import java.util.HashMap;
import java.util.Iterator;

/**
 * @ClassName: no_39
 * @Description:
 * @Author: JoshLee
 * @Date: 2023/6/6 19:56
 * @Version: V1
 */
public class no_39 {
    public static int majorityElement(int[] nums) {
        int len = nums.length;
        if (len == 1)
            return nums[0];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                int num = map.get(nums[i]);
                map.put(nums[i], num+1);
            }
        }
        Iterator<Integer> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            Integer key = iterator.next();
            int value = map.get(key);
            if (value > len/2)
                return key;
        }
        return 0;
    }

    public static int gaoji(int[] nums) {
        int x = 0, votes = 0;
        for(int num : nums){
            if(votes == 0) x = num;
            votes += num == x ? 1 : -1;
        }
        return x;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2, 2, 2, 5, 4, 2};
        System.out.println(majorityElement(nums));
    }
}
