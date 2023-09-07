package 秋招.滴滴;

import java.util.*;

/**
 * @ClassName: demo_1
 * @Description:
 * @Author: lww
 * @Date: 8/29/23 3:31 PM
 * @Version: V1
 **/
public class Main {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12, 1, 3, 1};
        arr = moveAndRemove(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] moveAndRemove(int[] arr) {
        if (arr == null) {
            return null;
        }
        // 将所有非1的元素移到数组左边
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 1) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j++] = temp;
            }
        }
        // 使用HashSet来存储已经出现过的元素，用于判断重复
        HashSet<Integer> seen = new HashSet<>();
        int newLength = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!seen.contains(arr[i])) {
                seen.add(arr[i]);
                arr[newLength++] = arr[i];
            }
        }
        // 截断数组，只保留前面部分
        int[] newArr = new int[newLength];
        System.arraycopy(arr, 0, newArr, 0, newLength);
        return newArr;
    }
}


