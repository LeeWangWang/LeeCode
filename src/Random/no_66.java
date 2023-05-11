package Random;

/**
 * @ClassName: no_66
 * @Description: TODO
 * @Author: lww
 * @Date: 2023/3/26 22:01
 * @Version: V1
 **/
public class no_66 {

    public static void main(String[] args) {
        int[] num = {2,2,4};
        int[] result = plusOne(num);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            // 加一
            digits[i]++;
            // 是否需要进位
            digits[i] = digits[i] % 10;
            // 不进位
            if (digits[i] != 0) {
                return digits;
            }
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}