package 秋招.亚信安全;

import java.util.*;

/**
 * @ClassName: Demo1
 * @Description:
 * @Author: lww
 * @Date: 10/15/23 7:02 PM
 * @Version: V1
 **/
public class Demo1 {
    public static void main(String[] args) {
        String[] ss = {"A","B","B","B","A"};
        System.out.println(ss.length);
    }
    public static int getMaxCount (String[] pos) {
        // write code here
        int n = pos.length;
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return pos[0].equals("A") ? 0 : 1;
        } else if (n == 2) {
            return pos[0].equals("A")||pos[1].equals("A") ? 0 : 1;
        }
        List<Integer> list = new ArrayList<>();
        list.add(-1);
        for (int i = 0; i < n; i++) {
            if (pos[i].equals("A")) {
                list.add(i+1);
                if (i == 0) {
                    list.clear();
                }
            }
        }
        if (list.get(list.size() - 1) != n) {
            list.add(n + 2);
        }
        int left = list.get(0);
        int ans = 0;
        for (Integer i : list) {
            int temp = i - left - 1;
            if (temp % 2 == 0) {
                temp -= 1;
            }
            ans += temp / 2;
            left = i;
        }
        return ans;
    }
}