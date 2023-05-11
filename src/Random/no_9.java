package Random;

/**
 * @title: Random.no_9
 * @description: 回文数，回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * @author: 李旺旺
 * @date: 2022/12/6 19:21
 * @version: 1.0
 */
public class no_9 {

    public static boolean isPalindrome1(int x) {
        if (x < 0) {
            return false;
        } else if (x < 10) {
            return true;
        } else {
            String a = String.valueOf(x);
            StringBuffer b = new StringBuffer(a);
            b.reverse();
            String c = new String(b);
            if (c.equals(a))  {
                return true;
            } else {
                return false;
            }
        }
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        } else if (x < 10) {
            return true;
        } else {
            int a = 0, b = 0;
            int c = x;
            while (c != 0) {
                a = c % 10; // 取最后一位
                b = b * 10 + a;
                c = c / 10; // 取十位
            }

            if (b == x)  {
                return true;
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(1));
        System.out.println(isPalindrome(12));
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(1234321));
        System.out.println(isPalindrome(2222));
        System.out.println(isPalindrome(111222111));
        System.out.println(isPalindrome(1238917));
    }

}
