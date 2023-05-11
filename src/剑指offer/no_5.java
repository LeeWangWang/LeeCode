package 剑指offer;

/**
 * @ClassName: no_5
 * @Description: TODO
 * @Author: lww
 * @Date: 2023/5/4 09:57
 * @Version: V1
 **/
public class no_5 {
    public static String replaceSpace(String s) {
        String sss = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ')
                sss += s.charAt(i);
            else
                 sss += "%20";
        }
        return sss;
    }

    public static void main(String[] args) {
        String s1 = "We are happy.";
        String s2 = "   ";
        System.out.println(replaceSpace(s1));
        System.out.println(replaceSpace(s2));
    }
}