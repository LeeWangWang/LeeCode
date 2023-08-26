package 秋招.百度;

/**
 * @ClassName: demo1
 * @Description:
 * @Author: lww
 * @Date: 8/22/23 7:38 PM
 * @Version: V1
 **/
public class demo1 {
    public static void main(String[] args) {
        int [] nums = {1,2,-1,4,-5,7};
        System.out.println(maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums) {
        int res = nums[0];
        for(int i = 1; i < nums.length; i++) {
            // 以第i个位置结尾第数组第和
            nums[i] += Math.max(nums[i - 1], 0);
            // 得到最大值
            res = Math.max(res, nums[i]);
        }
        return res;
    }

}

