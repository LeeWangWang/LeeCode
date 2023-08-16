package 找实习.数美;

import java.util.*;

/**
 * @ClassName: test02
 * @Description: TODO
 * @Author: lww
 * @Date: 2023/5/19 14:43
 * @Version: V1
 **/
public class test02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Long>v = new ArrayList<Long>();
        final long up = 1000000000000000000L;
        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < 20; j++) {
                for (int k = 0; k < 10; k++) {
                    long cur = fpow(2,i) * fpow(3,j) * fpow(7,k);
                    if (cur < 0) {
                        continue;
                    }
                    v.add(cur);
                }
            }
        }
        Collections.sort(v);
        int[] num = new int[1000];
        int flag = 0;
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            num[flag] = n;
            flag++;
        }
        for (int i = 0; i < flag; i++) {
            System.out.println(v.get(num[i]-1));
        }
    }
    public static long fpow(long a, long b){
        long cnt = 1;
        while (b > 0) {
            if ( (b&1) == 1) {
                cnt *= a;
            }
            b >>= 1;
            a *= a;
        }
        return cnt;
    }
}