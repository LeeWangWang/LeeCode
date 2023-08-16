package 找实习;

/**
 * @ClassName: tt6
 * @Description:
 * @Author: lww
 * @Date: 8/1/23 8:35 PM
 * @Version: V1
 **/
public class tt6 {

    public static void printSlantNumberTower(int n) {
        int num = 1; // 用于存储当前行的起始数字
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 10;
        printSlantNumberTower(n);
    }
}
