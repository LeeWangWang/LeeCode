package 找实习.面试;

import java.util.*;

/**
 * @ClassName: HasStatic
 * @Description: TODO
 * @Author: lww
 * @Date: 2023/4/6 20:34
 * @Version: V1
 **/
public class HasStatic {

    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> dic = new HashMap<>();
        int res = 0, tmp = 0;
        for(int j = 0; j < s.length(); j++) {
            int i = dic.getOrDefault(s.charAt(j), -1); // 获取索引 i
            dic.put(s.charAt(j), j); // 更新哈希表
            tmp = tmp < j - i ? tmp + 1 : j - i; // dp[j - 1] -> dp[j]
            res = Math.max(res, tmp); // max(dp[j - 1], dp[j])
        }
        return res;
    }

    public static void main(String[] args) {
        String str1 = "pwwkew";
        String str2 = "internentHelowrold";
        String str3 = "interdddinter";
        System.out.println(lengthOfLongestSubstring(str1));
        System.out.println(lengthOfLongestSubstring(str2));
        System.out.println(lengthOfLongestSubstring(str3));
    }
}




