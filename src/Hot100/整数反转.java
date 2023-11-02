package Hot100;

/**
 * @ClassName: 整数反转
 * @Description:
 * @Author: lww
 * @Date: 10/22/23 10:52 AM
 * @Version: V1
 **/
public class 整数反转 {
    public static void main(String[] args) {
        System.out.println(reverse(124));
        System.out.println(reverse(-124));
    }
    public static int reverse(int x) {
        int ans = 0;
        while (x != 0) {
            // 取最后的尾数
            int cur = x % 10;
            // 判断是否溢出
            if (ans > Integer.MAX_VALUE / 10) {
                return 0;
            }
            if (ans < Integer.MIN_VALUE / 10) {
                return 0;
            }
            ans = ans*10 + cur;
            x /= 10;
        }
        return ans;
    }
}