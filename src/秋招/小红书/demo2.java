package 秋招.小红书;

import java.util.*;

/**
 * @ClassName: demo2
 * @Description:
 * @Author: lww
 * @Date: 9/2/23 2:49 PM
 * @Version: V1
 **/
public class demo2 {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> myList = findDuplicates(nums);
        Iterator<Integer> iterator = myList.iterator();
        while (iterator.hasNext()) {
            int element = iterator.next();
            System.out.print(element + " ");
        }
    }
    public static List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i< nums.length;i++) {
            while(nums[nums[i] - 1] != nums[i]) {
                int k = nums[i] - 1;
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;
            }
        }
        for(int i=0;i< nums.length;i++) {
            if(nums[i]-1 != i) {
                list.add(nums[i]);
            }
        }
        return list;
    }
}