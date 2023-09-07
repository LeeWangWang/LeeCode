package 秋招.得物;

import java.util.Scanner;

/**
 * @ClassName: test_2
 * @Description:
 * @Author: lww
 * @Date: 8/31/23 10:34 AM
 * @Version: V1
 **/
public class test_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        scanner.nextLine();
        String candyString = scanner.nextLine();
        int result = isBeautiful(candyString, x);
        System.out.println(result);
    }

    public static int isBeautiful(String string, int x) {
        int n = string.length();
        for (int i = 0; i <= n - x; i++) {
            String subString = string.substring(i, i + x);
            if (isPalindrome(subString)) {
                return 1;
            }
        }
        return 0;
    }

    public static boolean isPalindrome(String string) {
        StringBuilder reversed = new StringBuilder(string).reverse();
        return string.equals(reversed.toString());
    }
}



/*
def is_beautiful(string, x)
    n = len(string

    # 遍历字符串，检查每个长度为 x 的子串是否回文
    for i in range(n - x + 1):
        sub_string = string[i:i + x]
        if sub_string == sub_string[::-1]: # 断子串是否为回文串
            return 1 # 如果存在满足条件的子串，返回1表示漂亮
    return 0 # 如果没有满足条件的子串，返回0表示不漂亮

# 输入长度和子串要求
n, x = map(int, input().split())
#输入糖葫芦串
candy_string= input()
#调用函数判断是否漂亮并输出结果
result = is_beautiful(candy_string, x)
print(result)

*/
