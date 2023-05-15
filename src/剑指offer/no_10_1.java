package 剑指offer;

/**
 * @ClassName no_10
 * @Description 斐波那契数列
 * @Author JoshLee
 * @Date 2023/5/14 15:10
 * @Version: V1
 */
public class no_10_1 {
    /**
     * 写一个函数，输入 n ，求斐波那契（Fibonacci）数列的第 n 项（即 F(N)）。斐波那契数列的定义如下：
     * F(0) = 0,   F(1) = 1
     * F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
     * 斐波那契数列由 0 和 1 开始，之后的斐波那契数就是由之前的两数相加而得出。
     * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
     */

    /*
    递归：超时
    public static int fib(int n) {
        // 0,1,1,2,3,5,8
        if (n <= 0) return 0;
        if (n == 1) return 1;
        return (fib(n-1) + fib(n-2)) % 1000000007;
    }
     */
    public static int fib(int n) {
        int a=0, b=1, sum;
        for (int i = 0; i < n; i++) {
            sum = (a+b) % 1000000007;
            a = b;
            b = sum;
        }
        return a;
    }

    public static void main(String[] args) {
        int n = 44, m = 5;
        System.out.println(fib(n)); // 1
        System.out.println(fib(m)); // 5
    }
}
