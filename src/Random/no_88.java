package Random;

/**
 * @ClassName: no_88
 * @Description: 合并两个有序数组
 * @Author: lww
 * @Date: 8/16/23 10:04 AM
 * @Version: V1
 **/
public class no_88 {
    public static void main(String[] args) {
        int[] num1 = {1,2,3,0,0,0};
        int[] num2 = {2,4,6};
        merge(num1, 3, num2, 3);
        for (int num : num1) {
            System.out.print(num + " ");
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int len1 = m-1;
        int len2 = n-1;
        int len = m+n-1;
        while(len1 >= 0 && len2 >= 0) {
            nums1[len--] = nums1[len1] > nums2[len2] ? nums1[len1--] : nums2[len2--];
        }
        System.arraycopy(nums2, 0, nums1, 0, len2+1);
    }
}