package Random;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: no_137
 * @Description:
 * @Author: lww
 * @Date: 10/19/23 10:47 AM
 * @Version: V1
 **/
public class no_137 {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> hm = new HashMap<>();
        for (int num : nums) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            int key = entry.getKey(), value = entry.getValue();
            if (value == 1) {
                return key;
            }
        }
        return -1;
    }
}