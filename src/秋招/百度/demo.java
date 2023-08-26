package 秋招.百度;

import java.util.*;

/**
 * @ClassName: demo
 * @Description:
 * @Author: lww
 * @Date: 8/18/23 11:29 AM
 * @Version: V1
 **/
public class demo {
    public static void main(String[] args) {
        int n = 100; // 总人数
        int k = 4; // 报数的次数
        List<Integer> circle = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            circle.add(i);
        }
        int currentIndex = 0;
        while(circle.size() > 1) {
            // 根据当前位置和报数次数计算下一个人的位置
            currentIndex = (currentIndex + k - 1) % circle.size();
            // 移除当前位置的人
            circle.remove(currentIndex);
        }
        int lastPersonPosition = circle.get(0); // 最后剩下的人在原来的位置
        System.out.println("最后剩下的人在原来的位置是：" + lastPersonPosition);
    }
}

