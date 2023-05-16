package 剑指offer;

/**
 * @ClassName no_17
 * @Description TODO
 * @Author JoshLee
 * @Date 2023/5/16 21:38
 * @Version: V1
 */
public class no_17 {
    public static int[] printNumbers(int n) {
        int len = (int) Math.pow(10, n);
        System.out.println(len);
        int[] res = new int[len-1];
        for (int i = 0; i < len-1; i++) {
            res[i] = i+1;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] num = printNumbers(2);
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }
}
