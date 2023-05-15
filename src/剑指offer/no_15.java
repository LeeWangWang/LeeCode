package 剑指offer;

/**
 * @ClassName no_15
 * @Description 二进制中1的个数
 * @Author JoshLee
 * @Date 2023/5/15 19:44
 * @Version: V1
 */
public class no_15 {
    public int hammingWeight(int n) {
        int res = 0;
        while (n != 0) {
            res += n&1;
            n >>>= 1;
        }
        return res;
    }

    public int hammingWeight2(int n) {
        int res = 0;
        while (n != 0) {
            res ++;
            n &= n-1;
        }
        return res;
    }

    public static void main(String[] args) {
    }
}
