package 秋招.去哪儿;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: no_1
 * @Description: 100%
 * @Author: lww
 * @Date: 9/15/23 3:13 PM
 * @Version: V1
 **/
public class no_1 {
    public int[] findQ (int n, int[] nums) {
        // write code here
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int temp = nums[i];
            if (list.contains(temp)) {
                list.remove(new Integer(temp));
                list.add(temp);
            } else {
                list.add(temp);
            }
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}