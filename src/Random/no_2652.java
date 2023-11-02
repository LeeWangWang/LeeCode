package Random;

/**
 * @ClassName: no_2652
 * @Description:
 * @Author: lww
 * @Date: 10/17/23 10:20 AM
 * @Version: V1
 **/
public class no_2652 {
    public static void main(String[] args) {
        System.out.println(sumOfMultiples(10));
    }
    public static int sumOfMultiples(int n) {
        if (n < 3) return 0;
        if (n == 3) return 3;
        int sum = 0;
        for (int i = 3; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}