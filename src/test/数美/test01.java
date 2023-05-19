package test.数美;

/**
 * @ClassName: 数美
 * @Description: TODO
 * @Author: lww
 * @Date: 2023/5/19 14:31
 * @Version: V1
 **/
public class test01 {
    public static void main(String[] args) {
        int[] num1 = {1,2,4,5};
        int[] num2 = {3,5,7,9,9};
        int len1 = num1.length;
        int len2 = num2.length;
        int[] array = new int[num1.length+num2.length];
        int m=0, n=0;
        for (int i = 0; i < array.length; i++) {
            if (m < len1 && n < len2) {
                if (num1[m] < num2[n]) {
                    array[i] = num1[m];
                    m++;
                } else {
                    array[i] = num2[n];
                    n++;
                }
            } else if (m < len1) {
                array[i] = num1[m];
                m++;
            } else if (n < len2) {
                array[i] = num2[n];
                n++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}