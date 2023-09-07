package 秋招.腾讯音乐;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: no_3
 * @Description:
 * @Author: lww
 * @Date: 9/6/23 8:22 PM
 * @Version: V1
 **/
public class no_3 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(cntOfTrees(n));
    }
    public static int cntOfTrees (int n) {
        if (n % 2 == 0)
            return 0;
        if (n == 3 || n == 1)
            return 1;
        Map<Integer, Integer> map = new HashMap<>();
        if (map.containsKey(n)) {
            return map.get(n);
        }
        int count = 0;
        if ( ( (n-1)/2 )%2 == 0 ) {
            for (int i = 1; i < (n-1)/2; i++) {
                int num1 = cntOfTrees(i);
                int num2 = cntOfTrees(n-i-1);
                count += num1 * num2;
            }
            count *= 2;
        } else {
            for (int i = 1; i <= (n-1)/2-1; i+=2) {
                int num1 = cntOfTrees(i);
                int num2 = cntOfTrees(n-i-1);
                count += num1 * num2;
            }
            count *= 2;
            count += cntOfTrees((n-1)/2);
        }
        map.put(n, count);
        return count % 1000000007;
    }
}