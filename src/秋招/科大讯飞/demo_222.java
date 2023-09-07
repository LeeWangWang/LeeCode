package 秋招.科大讯飞;


import java.util.*;

/**
 * @ClassName: demo_222
 * @Description:
 * @Author: lww
 * @Date: 8/26/23 8:10 PM
 * @Version: V1
 **/
public class demo_222 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            String template = sc.nextLine();
            result[i] = getCount(str, template);
        }
        for (int num : result) {
            System.out.println(num);
        }
    }
    public static int getCount(String str, String template) {
        int count = 0;
        int n1 = str.length();
        int m1 = template.length();
        if (n1 == m1)
            count++;
        boolean strNum = false ;
        boolean strLetter = false ;
        boolean strOther = false ;
        boolean temNum = false;
        boolean temLetter = false;
        boolean temOther = false;
        for (int i=0; i < n1; i++) {
            char c = str.charAt(i);
            if (c >= '0' && c <= '9') {
                strNum = true;
            } else if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                strLetter = true;
            } else {
                strOther = true;
            }
        }
        for (int i = 0; i < m1; i++) {
            char c = template.charAt(i);
            if (c >= '0' && c <= '9') {
                temNum = true;
            } else if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'z')) {
                strLetter = true;
            } else {
                strOther = true;
            }
        }
        for (int i = 0; i < m1; i++) {
            char c = template.charAt(i);
            if (c >= '0' && c <= '9') {
                temNum = true;
            } else if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'z')) {
                temLetter = true;
            } else {
                temOther = true;
            }
        }
        if (strNum == temNum && strLetter == temLetter & strOther == temOther) {
            count++;
        }
        return count;
    }
}