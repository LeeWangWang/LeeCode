package 秋招.京东;

import java.util.*;

/**
 * @ClassName: Main
 * @Description:
 * @Author: lww
 * @Date: 8/16/23 2:39 PM
 * @Version: V1
 **/
public class demo1 {
    public static void main(String[] args) {
        String input = "I am a Student";
        String[] words = input.split(" ");
        List<String> wordList = new ArrayList<>(Arrays.asList(words));
        Collections.sort(wordList, new Comparator<String>() {
            public int compare(String s1, String s2) {
                if (s1.length() != s2.length()) {
                    return s2.length() - s1.length();
                } else {
                    return wordList.indexOf(s1) - wordList.indexOf(s2);
                }
            }
        });
        for (String word : wordList) {

            String capitalizedWord;
            if (word.length() == 1) {
                capitalizedWord = word;
            } else {
                capitalizedWord = word.substring(0, 1).toUpperCase() + word.substring(1);
            }
            System.out.print(capitalizedWord + " ");
        }
    }

}