package test.网易雷火;

import java.util.Arrays;

/**
 * @ClassName: Solution
 * @Description: TODO
 * @Author: lww
 * @Date: 2023/4/22 15:09
 * @Version: V1
 **/
public class test01 {

    public static void main(String[] args) {
        int[] nums = {2,3,5,4};
        int k = 2;
        System.out.println(maxMinDifference(nums, k));
    }
    public static int maxMinDifference(int[] price, int k) {
        int n = price.length;
        Arrays.sort(price);
        int maxMinDiff = price[n-1] - price[0];
        // 二分答案，寻找最小分数
        int left = 0, right = maxMinDiff;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (check(price, k, mid)) {
                maxMinDiff = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return maxMinDiff;
    }
    // 检查是否存在分配方案使得最小分数不小于limit
    private static boolean check(int[] price, int k, int limit) {
        int n = price.length;
        int curBag = 0; // 当前行囊
        int curIndex = 0; // 当前宝石下标
        while (curIndex < n && curBag < k) {
            int bagMin = Integer.MAX_VALUE;
            int bagMax = Integer.MIN_VALUE;
            while (curIndex < n && bagMax - bagMin <= limit) {
                bagMin = Math.min(bagMin, price[curIndex]);
                bagMax = Math.max(bagMax, price[curIndex]);
                curIndex++;
            }
            curBag++;
        }
        return curIndex >= n;
    }
}