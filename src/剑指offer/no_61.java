package 剑指offer;

import java.util.*;

/**
 * @ClassName: no_61
 * @Description:
 * @Author: lww
 * @Date: 8/17/23 7:41 PM
 * @Version: V1
 **/
public class no_61 {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5};
        System.out.println(isStraight(num));
    }

    public static boolean isStraight(int[] nums) {
        Set<Integer> repeat = new HashSet<>();
        int max = 0, min = 14;
        for(int num : nums) {
            if(num == 0) continue; // 跳过大小王
            max = Math.max(max, num); // 最大牌
            min = Math.min(min, num); // 最小牌
            if(repeat.contains(num)) return false; // 若有重复，提前返回 false
            repeat.add(num); // 添加此牌至 Set
        }
        return max - min < 5; // 最大牌 - 最小牌 < 5 则可构成顺子
    }
}