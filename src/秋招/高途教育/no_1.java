package 秋招.高途教育;

import java.util.*;

 /**
 * @ClassName: no_111
 * @Description: 100%
 * @Author: lww
 * @Date: 9/12/23 4:09 PM
 * @Version: V1
 **/
public class no_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String[] strings = sc.nextLine().split(",");

        List<StringWithTransformedFrom> transform = new ArrayList<>();

        for (String str : strings) {
            String tran = transformString(s, str);
            transform.add(new StringWithTransformedFrom(str, tran));
        }
        Collections.sort(transform, new StringComparator());
        List<String> res = new ArrayList<>();
        for (StringWithTransformedFrom sss : transform) {
            res.add(sss.original);
        }
        System.out.println(res);
    }
    public static String transformString(String s, String str) {
        int[] chars = new int[26];
        for (char c : s.toCharArray()) {
            chars[c-'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            sb.append(chars[c-'a']);
        }
        return sb.toString();
    }
}

class StringComparator implements Comparator<StringWithTransformedFrom> {
    @Override
    public int compare(StringWithTransformedFrom o1, StringWithTransformedFrom o2) {
        return o1.transformed.compareTo(o2.transformed);
    }
}

class StringWithTransformedFrom {
    String original;
    String transformed;
    public StringWithTransformedFrom (String original, String transformed) {
        this.original = original;
        this.transformed = transformed;
    }
}

