package Random;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: no_1726
 * @Description:
 * @Author: lww
 * @Date: 10/19/23 10:26 AM
 * @Version: V1
 **/
public class no_1726 {
    public static void main(String[] args) {
        int[] num1 = {2, 3, 4, 6};
        int[] num2 = {1, 2, 4, 5, 10};
        System.out.println(tupleSameProduct(num1));
        System.out.println(tupleSameProduct(num2));
    }
    public static int tupleSameProduct(int[] nums) {
        Map<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int key = nums[i] * nums[j];
                // 统计所有不同元素的乘积组合数目
                hm.put(key, hm.getOrDefault(key, 0) + 1);
            }
        }
        // 只需要在满足乘积相同的 数对 中，任意选择 2 个两不同的数对一定可以满构成 8 个不同的同积元组。
        int count = 0;
        // 计算排列组合从 cnt(a×b) 个数对，组合数：
        for (Integer value : hm.values()) {
            count += value * (value - 1) * 4;
        }
        return count;
    }
    public static int tupleSameProduct1(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    for (int k = 0; k < nums.length; k++) {
                        for (int l = 0; l < nums.length; l++) {
                            if (k != l) {
                                if (i != k && i != l && j != k && j != l) {
                                    if (nums[i] * nums[j] == nums[k] * nums[l]) {
                                        count++;
                                    }
                                }
                            }
                        }
                    }

                }
            }
        }
        return count;
    }
}