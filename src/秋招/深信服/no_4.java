package 秋招.深信服;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: no_4
 * @Description: 100%
 * @Author: lww
 * @Date: 9/12/23 7:25 PM
 * @Version: V1
 **/
public class no_4 {

    public String substr (String a, String b) {
        // write code here
        Map<Character, Integer> targetChars = new HashMap<>();
        for (char c : b.toCharArray()) {
            targetChars.put(c, targetChars.getOrDefault(c, 0) + 1);
        }
        int left = 0;
        int minLen = Integer.MAX_VALUE;
        int minLeft = 0;
        int count = b.length();

        for (int right = 0; right < a.length(); right++) {
            char rightChar = a.charAt(right);

            if (targetChars.containsKey(rightChar)) {
                targetChars.put(rightChar, targetChars.get(rightChar) + 1);
                if (targetChars.get(rightChar) >= 0) {
                    count--;
                }
            }

            while (count == 0) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    minLeft = left;
                }

                char leftChar = a.charAt(left);
                if (targetChars.containsKey(leftChar)) {
                    targetChars.put(leftChar, targetChars.get(leftChar) + 1);
                    if (targetChars.get(leftChar) > 0) {
                        count++;
                    }
                }
                left++;
            }
        }

        if (minLen == Integer.MAX_VALUE) {
            return "";
        }

        return a.substring(minLeft, minLeft + minLen);
    }
}