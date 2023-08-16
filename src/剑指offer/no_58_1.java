package 剑指offer;

/**
 * @ClassName: no_58_1
 * @Description:
 * @Author: lww
 * @Date: 8/2/23 2:50 PM
 * @Version: V1
 **/
public class no_58_1 {
    public static String reverseWords(String s) {
        String[] strs = s.split(" ");
        String res = "";
        int len = strs.length - 1;
        for (int i = len; i > 0; i--) {
            res += strs[i];
            if(i > 1) {
                res += " ";
            }
        }
        return res;
    }
}