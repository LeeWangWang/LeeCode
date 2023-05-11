package Random;

/**
 * @title: Random.no_13
 * @description: 罗马数字转整数
 * @author: 李旺旺
 * @date: 2023/2/27 20:10
 * @version: 1.0
 */
public class no_13 {
    private int getValue(char c) {
        switch (c) {
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
            default: return 0;
        }
    }
    public int romanToInt(String s) {
        int result = 0;
        int num1 = getValue(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            int num2 = getValue(s.charAt(i));
            if (num1 < num2) {
                result -= num1;
            } else {
                result += num1;
            }
            num1 = num2;
        }
        result += num1;
        return result;
    }
    public static void main(String[] args) {
        no_13 no = new no_13();
        String s1 = "III";
        String s2 = "IV";
        String s3 = "IX";
        String s4 = "LVIII";
        String s5 = "MCMXCIV";
        System.out.println(no.romanToInt(s1));
        System.out.println(no.romanToInt(s2));
        System.out.println(no.romanToInt(s3));
        System.out.println(no.romanToInt(s4));
        System.out.println(no.romanToInt(s5));
    }
}
