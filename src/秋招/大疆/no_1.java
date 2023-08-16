package 秋招.大疆;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: no_1
 * @Description:
 * @Author: lww
 * @Date: 8/13/23 3:03 PM
 * @Version: V1
 **/
public class no_1 {
    public static void main(String[] args) {
        int[] selectedDigits = {1,2,3,4,5,6,7,8,9};
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < selectedDigits.length; i++) {
            for (int j = 0; j < selectedDigits.length; j++) {
                for (int k = 0; k < selectedDigits.length; k++) {
                    if (i != j && i != k && j != k) {
                        int num = selectedDigits[i] * 100 + selectedDigits[j] * 10 + selectedDigits[k];
                        list.add(num);
                    }
                }
            }
        }
        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}