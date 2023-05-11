package Random; /**
 * @title: Random.no_1
 * @description: 求解一个数组中的两个数之和为某个数
 * @author： 李旺旺
 * @date： 2021/11/1 10:05
 * @version: 1.0
 */

import java.util.HashMap;

public class no_1 {

    //暴力破解，时间复杂度O(n^2)，空间复杂度O(1)
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    // 时间复杂度O(n)，空间复杂度O(n)
    public static int[] twoSum2(int[] nums, int target) {
        HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (hashmap.containsKey(target - nums[i])) {
                return new int[]{hashmap.get(target - nums[i]) ,i};
            }
            hashmap.put(nums[i], i);
        }
        return new int[0];
    }


    public static void main(String[] args) {
        int[] num = new int[4];
        num[0] = 2;
        num[1] = 7;
        num[2] = 11;
        num[3] = 15;
        int target = 9;
        int[] res = twoSum2(num, target);
        System.out.println(res[0]);
        System.out.println(res[1]);
    }
}
