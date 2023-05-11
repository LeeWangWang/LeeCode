package test.面试;

/**
 * @title: test.面试.面试0502
 * @description:
 * @author: 李旺旺
 * @date: 2023/3/2 16:03
 * @version: 1.0
 */
public class 面试0502 {
    /* 解体思路：
    大家用手计算二进制肯定就是一位一位减，先减尽可能的最大的该进制下小于num的数，
    然后慢慢往小的数里面减，可以减就是1不可以减就是0，直到最后num为0。
    我的方法朴实无华又低调，就是模拟大家用手计算。题目说最多32位不行就是ERROR，
    那咱不来证明最多循环6次，就实打实的32，从大数开始循环即可。

    public static String printBin(double num) {
        StringBuilder ss = new StringBuilder("0.");
        for (int i = 1; i < 32; i++) {
            if (num == 0)
                return ss.toString();
            double d = Math.pow(2, -i);
            if (num >= d) {
                num -= d;
                ss.append("1");
            } else {
                ss.append("0");
            }
        }
        return "ERROR";
    }

     */

    public static String printBin(double num) {
        StringBuilder bin = new StringBuilder("0.");
        for (int i = 0; i < 6; i++) {
            num *= 2;
            if (num < 1) {
                bin.append('0');
            } else {
                bin.append('1');
                if (--num == 0)
                    return bin.toString();
            }
        }
        return "ERROR";
    }

    public static void main(String[] args) {
        double d1 = 0.75;
        double d2 = 0.1;
        double d3 = 0.625;
        System.out.println(printBin(d1));
        System.out.println(printBin(d2));
        System.out.println(printBin(d3));
    }
}
