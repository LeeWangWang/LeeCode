package 秋招;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @ClassName: tttttt
 * @Description:
 * @Author: lww
 * @Date: 8/28/23 11:22 AM
 * @Version: V1
 **/
// 一个字符串，返回一个不包含重复字符的最长的子串 abca abc bca
public class tttttt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String substr=longSubString(str);
        System.out.println(substr);
    }
    public static String longSubString(String str){
        Set<Character> occ=new HashSet<Character>();
        int n=str.length();
        int left=0,right=0;
        int maxlen=0;
        String maxSubString="";
        while(right<n){
            if(!occ.contains(str.charAt(right))){
                occ.add(str.charAt(right));
                if(right-left+1 > maxlen){
                    maxlen=right-left+1;
                    maxSubString=str.substring(left,right+1);
                }
                right++;
            }else{
                occ.remove(str.charAt(left));
                left++;
            }
        }
        return maxSubString;
    }
}

// select * from student where email in(select email from student group by email having count(*)>1);