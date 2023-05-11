package test.面试;

/**
 * @ClassName: Test
 * @Description: TODO
 * @Author: lww
 * @Date: 2023/3/25 10:50
 * @Version: V1
 **/
public class StringIsEquals {
    public static int test_1(String s) {
        int len = s.length();
        int count = 1, max = 1;
        for (int i = 0; i < len - 1; i++) {
            char char1 = Character.toLowerCase(s.charAt(i));
            char char2 = Character.toLowerCase(s.charAt(i+1));
            if (char1 == char2) {
                count += 1;
            } else {
                count = 1;
            }
            if (count > max) {
                max = count;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        String str1 = "abbcccddddeeeeedcba";
        System.out.println(test_1(str1));
    }
}