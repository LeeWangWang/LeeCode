package 秋招.京东;

/**
 * @ClassName: Mian
 * @Description:
 * @Author: lww
 * @Date: 8/30/23 7:30 PM
 * @Version: V1
 **/
public class Mian {
    public static void main(String[] args) {
        String str1 = "12374";
        String str2 = "1a22";
        String str3 = "-12374";
        System.out.println(StrToInt(str1));
        System.out.println(StrToInt(str2));
        System.out.println(StrToInt(str3));
    }
    public static int StrToInt(String str) {
        // 去除字符串中的加号
        str = str.replace("+", "");
        boolean flag = false;
        if(str.indexOf("-") == 0){
            // 如果字符串以负号开头，则去除负号，并设置标志位flag为true
            str = str.replace("-", "");
            flag = true;
        }
        // 将字符串转换为字节数组
        byte[] bytes = str.getBytes();
        byte b0 = '0';
        int num = 0;
        // 从字符串的末尾向前遍历字节数组
        for(int i = bytes.length - 1; i >= 0; i--){
            // 检查当前字符是否为数字
            if(bytes[i] >= b0 && bytes[i] <= b0 + 9){
                // 将字符转换为数字并累加到num变量上
                num += (bytes[i] - b0) * Math.pow(10, bytes.length - 1 - i);
            }else{
                // 如果遇到非法字符，则返回0
                return 0;
            }
        }
        // 根据标志位flag判断是返回正数还是负数
        return flag ? 0 - num : num;
    }


}