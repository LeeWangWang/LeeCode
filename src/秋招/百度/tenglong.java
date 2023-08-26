package 秋招.百度;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class tenglong {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/秋招/百度/test.txt"));
            String line;
            int count = 0;
            // 这里添加
            StringBuilder sb = new StringBuilder();

            while ((line = reader.readLine()) != null) {
                // 这里改成这个
                sb.append(line); // 就这一行
            }
            String text = sb.toString();
            count = countOccurrences(text, "腾龙");
            reader.close();
            System.out.println("腾龙出现的次数：" + count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // 测试一下试试
    public static int countOccurrences(String text, String target) {
        int count = 0;
        int index = 0;
        while ((index = text.indexOf(target, index)) != -1) {
            count++;
            index += target.length();
        }
        return count;
    }
}
