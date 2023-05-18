package 剑指offer;

/**
 * @ClassName: no_21
 * @Description: 调整数组顺序使奇数位于偶数前面
 * @Author: lww
 * @Date: 2023/5/18 14:33
 * @Version: V1
 **/
public class no_21 {
    public static int[] exchange(int[] nums) {
        int[] result = new int[nums.length];
        int a = 0, b = nums.length-1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 1) {
                result[a] = nums[i];
                a++;
            } else {
                result[b] = nums[i];
                b--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7,8};
        int[] res = exchange(num);
        for (int i = 0; i < res.length; i++) {
        }
    }
}