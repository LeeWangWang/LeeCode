package 找实习.面试;

import java.util.*;

/**
 * @ClassName: 环形数组切割
 * @Description: TODO
 * @Author: lww
 * @Date: 2023/3/26 14:54
 * @Version: V1
 **/
public class 阿里巴巴_报数 {

    public static boolean isPrime(int x) {
        if (x < 2) {
            return false;
        }
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nums.add(i + 1);
        }

        int cur = 0;
        while (nums.size() > 1) {
            int cnt = 0;
            System.out.println(cnt + "号报");
            while (true) {
                cur %= nums.size();
                if (isPrime(++cnt)) {
//                    System.out.println("出列：" + cur +" " + cnt);
                    nums.remove(cur);
                    cur--;
                }
                if (nums.size() == 1) {
                    break;
                }
                cur++;
                System.out.print(cnt);
            }
        }

        System.out.println(nums.get(0));
    }


}



