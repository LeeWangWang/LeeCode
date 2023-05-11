package Random;

/**
 * @title: Random.no_26
 * @description: 删除有序数组中的重复项
 * @author: 李旺旺
 * @date: 2023/3/2 20:54
 * @version: 1.0
 */
public class no_26 {

    public static int removeDuplicates(int[] nums) {
        int flag = 0;
        if (nums.length == 1)
            return 1;
        int repeat = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (repeat == nums[i]) {
                for (int j = i; j < nums.length - i; j++) {
                    nums[j] = nums[j+1];
                }
            }
            repeat = nums[i];
            flag += 1;
        }
        return flag;
    }

    public static void main(String[] args) {
        int[] num1 = new int[]{1,1,2};
        int[] num2 = new int[]{0,0,1,1,1,2,2,3,3,4};
        int k1 = removeDuplicates(num1);
        int k2 = removeDuplicates(num2);
        for (int i = 0; i < k1; i++) {
            System.out.print(num1[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < k2; i++) {
            System.out.print(num2[i] + " ");
        }
    }
}
