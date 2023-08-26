package 秋招.面试;

/**
 * @ClassName: Demo2
 * @Description:
 * @Author: lww
 * @Date: 8/22/23 2:33 PM
 * @Version: V1
 **/
public class Demo2 {
    public static void main(String[] args) {
        int[] nums = new int[10];
        for (int i = 0; i < 10; i++) {
            nums[i] = i;
        }

        int count = 0;
        int left = 0;
        int right = 9;

        while (left < right) {
            for (int i = left + 1; i < right; i++) {
                if (nums[left] + nums[i] + nums[right] == 18) {
                    count++;
                }
            }

            left++;
            right--;
        }

        double probability = (double) count / 90; // 总共有90种不重复的三位数组合

        System.out.println("概率：" + probability);
    }
}

