package test.米哈游;

import java.util.*;

/**
 * @ClassName: Mihoyo
 * @Description: TODO
 * @Author: lww
 * @Date: 2023/4/15 20:32
 * @Version: V1
 **/
public class Mihoyo {
    public static long getResult(String str) {
        if (str.length() % 2 != 0) {
            return 0;
        }
        int a = 0;
        int b = 0;
        String s1 = str.substring(0, str.length() / 2);
        String s2 = str.substring(str.length() / 2, str.length());
        long result = Long.parseLong(s1) + Long.parseLong(s2);
        return result;
    }

    public static void test1(int n) {
        switch (n) {
            case 0:
            case 1:
                System.out.println(n);
                return;
            case 2:
                System.out.println("3-1");
                return;
            case 3:
                System.out.println("3");
                return;
        }
        while (n / 3 > 1) {

        }
        int mi = (int) Math.pow(10, 1 / 3.0);
        int less = n - (int) Math.pow(3.0, (double) mi);
        switch (mi) {
            case 0:
                System.out.println(n);
                break;
            case 1:
                //System.out.println(3*plus + "+ 1");
                break;
            case 2:
                //System.out.println(3*plus + "+3-1");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        List<Integer> powersOfThree = new ArrayList<>();
        int powerOfThree = 1;
        while (powerOfThree <= n) {
            powersOfThree.add(powerOfThree);
            powerOfThree *= 3;
        }
        powersOfThree.add(powerOfThree);
        StringBuilder expression = new StringBuilder();
        for (int i = powersOfThree.size() - 1; i >= 0; i--) {
            int power = powersOfThree.get(i);
            if (n >= power) {
                n -= power;
                if (expression.length() > 0) {
                    expression.append(n >= 0 ? "+" : "-");
                }
                expression.append(power);
            }
        }

        System.out.println(expression);
    }
}
/*
使用Java解决下面的问题：
任何正整数都可以表示为若干个不相等的3的幂的和或差。例如，20=27+3-9-1,30=27+3等。
给定一个正整数，请你输出一个合法的表达式，请务必保证表达式只包含加号和减号，且每一项均为3的幂。为了保证答案唯一，你需要按每一项从大到小来输出。


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> nums = new ArrayList<>();
        while (n > 0) {
            int pow = (int) (Math.log(n) / Math.log(3));
            int num = (int) Math.pow(3, pow);
            nums.add(num);
            n -= num;
        }
        Collections.sort(nums, Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nums.size(); i++) {
            if (i > 0) {
                sb.append(nums.get(i) > nums.get(i - 1) ? "+" : "-");
            }
            sb.append(nums.get(i));
        }
        System.out.println(sb.toString());
    }
}


*/