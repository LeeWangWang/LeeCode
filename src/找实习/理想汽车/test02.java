package 找实习.理想汽车;

/**
 * @ClassName: test02
 * @Description: TODO
 * @Author: lww
 * @Date: 2023/4/20 14:13
 * @Version: V1
 **/
public class test02 {


    public static String SumTwoNum (String Num1, String Num2) {
        // write code here
        int m = Integer.parseInt(Num1);
        int n = Integer.parseInt(Num2);
        String sum = Integer.toString(m+n);
        return sum;
    }

    public static void main(String[] args) {
        String s1 = "123";
        String s2 = "10";
        System.out.println(SumTwoNum(s1, s2));
    }
}