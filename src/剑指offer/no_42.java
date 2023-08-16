package 剑指offer;

/**
 * @ClassName: no_42
 * @Description: 连续子数组的最大和
 * @Author: lww
 * @Date: 2023/6/27 16:26
 * @Version: V1
 **/
public class no_42 {
    public static int maxSubArray(int[] nums) {
        int pre = 0, maxAns = nums[0];
        for (int x : nums) {
            pre = Math.max(pre + x, x);
            maxAns = Math.max(maxAns, pre);
        }
        return maxAns;
    }
    public static void main(String[] args) {
        int[] num = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        for (int x : num) {
            System.out.print(x + " ");
        }
        //System.out.println(maxSubArray(num));
    }
}