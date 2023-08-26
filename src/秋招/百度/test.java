package 秋招.百度;

/**
 * @ClassName: test
 * @Description:
 * @Author: lww
 * @Date: 8/18/23 11:44 AM
 * @Version: V1
 **/
public class test {
    public static int findLastPerson(int n, int m) {
        if (n == 1) {
            return 0;
        } else {
            return (findLastPerson(n - 1, m) + m) % n;
        }
    }
    public static void main(String[] args) {
        int n = 100; // 总人数
        int m = 4;   // 报数为4的人退出

        int lastPersonPosition = findLastPerson(n, m) + 1; // 最后一个人的位置（从1开始）
        System.out.println("最后剩余的人在原来100人中的位置：" + lastPersonPosition);
    }
}