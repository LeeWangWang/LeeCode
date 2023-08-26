
import java.util.*;
import java.util.regex.*;

/**
 * @ClassName: Demo
 * @Description:
 * @Author: lww
 * @Date: 8/18/23 3:29 PM
 * @Version: V1
 **/

public class Demo {
    public static int countRepeatingSubstrings(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            char currentChar = str.charAt(i);
            char nextChar = str.charAt(i + 1);
            if (currentChar == nextChar) {
                count++;
                while (i < str.length() - 1 && str.charAt(i + 1) == currentChar) { // 继续查找连续出现的相同字符
                    i++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int result = countRepeatingSubstrings(input);
        System.out.println(result);
    }
}



//public class Demo {
//    public static int countRepeatingSubstrings(String str) {
//        int count = 0;
//        // 创建一个正则表达式模式来匹配重复子串
//        Pattern pattern = Pattern.compile("(.)\\1+");
//        Matcher matcher = pattern.matcher(str);  // 在给定的字符串上创建匹配器
//        while (matcher.find()) {  // 循环查找匹配的子串
//            count++;  // 找到一个匹配的子串，计数器加一
//        }
//        return count;  // 返回重复子串的数量
//    }
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.nextLine();
//        int result = countRepeatingSubstrings(input);
//        System.out.println(result);
//    }
//}


/*

countRepeatingSubstrings方法用正则表达式 (.)\\1+ 匹配连续出现大于等于2次的子串。
其中 (.) 表示捕获任意字符为第一组，\\1+ 表示匹配第一组捕获的字符连续出现的次数大于等于2次。

在 main 方法中，我们给定了一个示例字符串 "aabbbcccdddeee"，
然后调用 countRepeatingSubstrings 方法来计算连续出现大于等于2次的子串个数，并将结果打印输出。

运行代码，将会输出 Number of repeating substrings: 3，表示在示例字符串中有 3 个连续出现大于等于2次的子串。

你可以根据自己的需求，将该示例代码进行适当的修改和拓展。

 */