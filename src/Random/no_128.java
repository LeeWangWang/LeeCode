package Random;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName: no_128
 * @Description:
 * @Author: lww
 * @Date: 10/27/23 4:39 PM
 * @Version: V1
 **/
public class no_128 {
    public static void main(String[] args) {
        int [] nums = {1, 2, 33, 46, 1, 4, 6, 10};
        System.out.println(longestConsecutive(nums));
    }
    public static int longestConsecutive(int[] nums) {
        Set<Integer> setNum = new HashSet<>();
        for (int num : nums) {
            // 加入Set去重
            setNum.add(num);
        }
        int len = 0;

        for (int num : nums) {
            // 判断 num-1 是否在set中，不在，就跳过
            if (!setNum.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;
                // 继续判断当该 num+1 是否在 setNum 中
                while (setNum.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }
                // 更新最大长度
                len = Math.max(len, currentStreak);
            }
        }
        return len;
    }
}