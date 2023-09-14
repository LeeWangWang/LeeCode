package 秋招.小米;

/**
 * @ClassName: test_1
 * @Description:
 * @Author: lww
 * @Date: 9/13/23 3:14 PM
 * @Version: V1
 **/
public class test_1 {
    public static void main(String[] args) {
        String str = "***a*b*cd**e*";
        char[] res = resort(str.toCharArray());
        System.out.println(res);
    }

    public static char[] resort(char[] input){
        // 标记初始位置为字符数组的最后一个位置
        int mark = input.length - 1;
        // 记录星号的数量
        int asteriskNum = 0;
        for( ; mark >= 0 ; mark--){ // 从字符数组的最后一个位置开始往前遍历
            char c = input[mark]; // 获取当前位置的字符
            if(c != '*'){ // 如果当前字符不是星号
                input[mark + asteriskNum] = c; // 将当前字符放置到标记位置，同时考虑星号的数量
            }else{
                asteriskNum++; // 如果当前字符是星号，则星号的数量加1
            }
        }
        for( int i = 0 ; i < asteriskNum ; i++){ // 将剩余的星号放置到字符数组的前面
            input[i] = '*';
        }
        return input; // 返回处理后的字符数组
    }
}