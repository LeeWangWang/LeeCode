package Random;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName: no_260
 * @Description:
 * @Author: lww
 * @Date: 10/16/23 10:50 AM
 * @Version: V1
 **/
public class no_260 {
    public int[] singleNumber(int[] nums) {
        int[] ans = new int[2];
        Map<Integer, Integer> hm = new HashMap<>();
        for (int num : nums) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        int index = 0;
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() == 1) {
                ans[index++] = entry.getKey();
            }
        }
        return ans;
    }
}