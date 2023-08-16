package 找实习.数美;

import java.util.*;

/**
 * @ClassName: test03
 * @Description: TODO
 * @Author: lww
 * @Date: 2023/5/19 15:00
 * @Version: V1
 **/
public class test03 {
    public static void main(String[] args) {
        String text = "想知道如果提高王者荣耀水平，上分把妹不是梦，加微信:17252sugats78，加QQ:34676328889";
        int[] labels = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,2,0,3,4,4,4,4,4,4,4,4,4,4,4,4,0,0,1,2,0,3,4,4,4,4,4,4,4,4,4,4};

        ArrayList<String> keywords = new ArrayList<>();
        ArrayList<String> contactInformation = new ArrayList<>();

        for (int i = 0; i < text.length(); i++) {
            if (labels[i] == 1) { // 判断是否为关键字开头
                String keyword = "";
                while (i < text.length() && (labels[i] == 1 || labels[i] == 2)) { // 可能为关键字中间或结尾
                    keyword += text.charAt(i);
                    i++;
                }
                keywords.add(keyword);
                i--;
            } else if (labels[i] == 3) { // 判断是否为串开头
                String info = "";
                while (i < text.length() && (labels[i] == 3 || labels[i] == 4)) { // 可能为串中间或结尾
                    info += text.charAt(i);
                    i++;
                }
                contactInformation.add(info);
                i--;
            }
        }
        System.out.println("关键字:" + keywords.toString() + "，串" + contactInformation.toString());
    }
}





