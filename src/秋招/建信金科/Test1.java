package 秋招.建信金科;

import java.util.*;

/**
 * @ClassName: Test1
 * @Description:
 * @Author: lww
 * @Date: 10/14/23 7:41 PM
 * @Version: V1
 **/
public class Test1 {
    public int countSeq (String mystr) {
        // write code here
        mystr = mystr.toLowerCase();
        Map<Character, Integer> hm = new HashMap<>();
        int n = mystr.length();
        for (int i = 0; i < n; i++) {
            char c = mystr.charAt(i);
            if (hm.containsKey(c)) {
                hm.put(c, hm.get(c) + 1);
            } else {
                hm.put(c, 1);
            }
        }
        if (!hm.containsKey('c') || !hm.containsKey('b') || !hm.containsKey('f') || !hm.containsKey('t')) {
            return 0;
        }
        int cNum = hm.get('c');
        int bNum = hm.get('b');
        int fNum = hm.get('f');
        int tNum = hm.get('t');
        int ans = 0;
        while (cNum >= 2 && bNum >= 1 && fNum >= 1 && tNum >= 1) {
            ans++;
            cNum-=2;
            bNum-=1;
            fNum-=1;
            tNum-=1;
        }
        return ans;
    }
}