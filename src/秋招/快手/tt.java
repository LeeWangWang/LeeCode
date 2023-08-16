package 秋招.快手;

/**
 * @ClassName: tt
 * @Description:
 * @Author: lww
 * @Date: 8/14/23 11:51 AM
 * @Version: V1
 **/
public class tt {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
        int[] num = {5,4,-1,7,8};
        System.out.println(maxSubArray(num));
    }
    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currSum = Math.max(currSum + nums[i], nums[i]);
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }
}
