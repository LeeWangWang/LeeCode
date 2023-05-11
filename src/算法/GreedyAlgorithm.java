package 算法;

import java.util.Arrays;

/**
 * @ClassName: GreedyAlgorithm
 * @Description: 贪心算法
 * @Author: lww
 * @Date: 2023/4/2 16:31
 * @Version: V1
 **/
public class GreedyAlgorithm {

    /**
     * @Description: 分发饼干
     * @Param: [cookies, children]
     * @Return: int
     * @Author: lww
     * @Date: 2023/4/2
     **/
    public static int findContentChildren(int[]cookies, int[]children) {
        // 首先进行排序
        Arrays.sort(cookies);
        Arrays.sort(children);
        int child = 0;
        int cookie = 0;
        // 从小到大进行遍历，最小大饼干分给最小的胃口
        while (child < children.length && cookie < cookies.length) {
            if (children[child] <= cookies[cookie++])
                child++;
        }
        return child;
    }

    /**
     * @Description: 376.摆动序列
     * @Param: [nums]
     * @Return: int[]
     * @Author: lww
     * @Date: 2023/4/2
     **/
    public static int wiggleMaxLength(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }
        int result = 1;
        int pre = 0;
        int cur = 0;
        for (int i = 1; i < nums.length; i++) {
            cur = nums[i] - nums[i-1];
            if (cur > 0 && pre <= 0 || cur < 0 && pre >= 0) {
                result++;
                pre = cur;
            }
        }
        return result;
    }

    /**
     * @Description: 最大子序和
     * 给定一个整数数组nums，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
     * @Param: [nums]
     * @Return: int
     * @Author: lww
     * @Date: 2023/4/2
     **/
    public static int Maximum_Suborder_Sum(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int count = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            count += nums[i];
            // 取区间累计的最大值（相当于不断确定最大子序终止为止）
            max = Math.max(max, count);
            if (count < 0){
                // 相当于重置最大子序起始位置，因为遇到负数一定是拉低总和
                count = 0;
            }
        }
        return 0;
    }

    /**
     * @Description: 122.买卖股票的最佳时机-2
     * @Param: [prices]
     * @Return: int
     * @Author: lww
     * @Date: 2023/4/2
     **/
    public static int maxProfit(int[] prices) {

        int max = 0; // 最大利润
        int flag = 0; // 是否持有，0没有，1买入
        int cur = 0;
        for (int i = 1; i < prices.length; i++) {
            cur = prices[i] - prices[i-1];
            if (cur > 0) {
                max += cur;
                flag = 1;
            }
            if (cur < 0 && flag == 1) {
                flag = 0;
            }
            // 优化
            // max += Math.max(prices[i] - prices[i - 1],0);
        }
        return max;
    }

    /**
     * @Description: 55.跳跃游戏
     * @Param: [nums]
     * @Return: boolean
     * @Author: lww
     * @Date: 2023/4/2
     **/
    public static boolean canJump(int[] nums) {
        if (nums.length == 1)
            return true;
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > k) return false;
            k = Math.max(k, i+nums[i]);
        }
        return true;
    }

    public static int MinJumpStep(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return 0;
        }
        int count = 0; // 记录跳跃的次数
        int curDistance = 0; // 当前覆盖的最大区域
        int maxDistance = 0; // 最大的覆盖区域
        for (int i = 0; i < nums.length-1; i++) {
            // 在可覆盖区域内更新最大的覆盖区域
            maxDistance = Math.max(maxDistance, i+nums[i]);
            // 走到当前覆盖的最大区域时，更新下一步可达的最大区域
            if (i == curDistance) {
                curDistance = maxDistance;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
//        int[] cookies = {1, 2, 3, 4, 5};
//        int[] children = {6, 4, 3, 4, 5};
//        System.out.println("Result: " + findContentChildren(cookies, children));

//        int[] nums1 = {1,7,4,9,2,5};
//        int[] nums2 = {1,17,5,10,13,15,10,5,16,8};
//        int[] nums3 = {1,2,3,4,5,6,7,8,9};
//        System.out.println(wiggleMaxLength(nums1));
//        System.out.println(wiggleMaxLength(nums2));
//        System.out.println(wiggleMaxLength(nums3));

        int[] nums1 = {2,3,1,1,4};
        int[] nums2 = {2,3,0,1,4};
        int[] nums3 = {7,6,4,3,1};
        System.out.println(MinJumpStep(nums1));
        System.out.println(MinJumpStep(nums2));
        System.out.println(MinJumpStep(nums3));
    }
}