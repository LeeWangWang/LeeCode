package 剑指offer;

/**
 * @ClassName: no_16
 * @Description:
 * @Author: lww
 * @Date: 7/3/23 3:28 PM
 * @Version: V1
 **/
public class no_16 {
    public double myPow(double x, int n) {
        if (x == 0 || x == 1)
            return x;
        long len = n;
        double result = 1.0;
        if (len < 0){
            len = -len;
            x = 1/x;
        }
        while (len > 0) {
            if ((len & 1) == 1)
                result *= x;
            x *= x;
            len >>= 1;
        }
        return result;
    }
}