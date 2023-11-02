package 秋招.数美;

/**
 * @ClassName: demo3
 * @Description:
 * @Author: lww
 * @Date: 11/2/23 3:29 PM
 * @Version: V1
 **/
public class demo3 {
    public static void main(String[] args) {
        String input1 = "abc";
        String input2 = "中国a";
        String input3 = "这个是原始地址abc";
        System.out.println(EncodeString(input1));
        System.out.println(EncodeString(input2));
        System.out.println(EncodeString(input3));
    }
    public static String EncodeString(String input) {
        if (input.length() < 4) {
            return input.substring(0, input.length()-1) + "*";
        } else if (input.length() == 4) {
            return input.substring(0, 1) + "*" + input.substring(input.length() - 1);
        } else {
            StringBuilder result = new StringBuilder(input.substring(0, 2));
            for (int i = 2; i < input.length(); i++) {
                result.append("*");
            }
            result.append(input.substring(input.length() - 2));
            return result.toString();
        }
    }
}