package test.面试;

import java.util.*;

/**
 * @ClassName: TTTest
 * @Description: TODO
 * @Author: lww
 * @Date: 2023/4/23 19:03
 * @Version: V1
 **/
public class TTTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        Map<Integer, Long> countMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            countMap.put(a, countMap.getOrDefault(a, 0L) + b);
        }

        long result = 0;
        for (Map.Entry<Integer, Long> entry : countMap.entrySet()) {
            long count = entry.getValue();
            result += count / k * entry.getKey();
            if (count % k != 0) {
                result += entry.getKey();
            }
        }

        System.out.println(result);
    }

}






