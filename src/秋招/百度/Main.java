package 秋招.百度;

import java.util.*;

/**
 * @ClassName: Main
 * @Description:
 * @Author: lww
 * @Date: 8/14/23 1:54 PM
 * @Version: V1
 **/
public class Main {
    public static int findMajorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
                count++;
            } else if (candidate == num) {
                count++;
            } else {
                count--;
            }
        }
        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }
        if (count > nums.length / 2) {
            return candidate;
        } else {
            return -1;
        }
    }
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 5,};
        int[] nums2 = {1, 1, 2, 3, 1};
        System.out.println(findMajorityElement(nums1));
        System.out.println(findMajorityElement(nums2));
    }

}








