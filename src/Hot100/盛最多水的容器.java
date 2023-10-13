package Hot100;

/**
 * @ClassName: 盛最多水的容器
 * @Description: 双指针
 * @Author: lww
 * @Date: 10/11/23 10:57 AM
 * @Version: V1
 **/
public class 盛最多水的容器 {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
    public static int maxArea(int[] height) {
        // 定义双指针
        int left = 0, right = height.length-1;
        int res = 0;
        while (left < right) {
            // 求面积
            int area = Math.min(height[left], height[right]) * (right - left);
            res = Math.max(res, area);
            // 如果左边小于右边
            if (height[left] <= height[right])
                ++left;
            else
                --right;
        }
        return res;
    }
}