package 秋招.天翼云;

/**
 * @ClassName: no_2
 * @Description:
 * @Author: lww
 * @Date: 9/14/23 9:12 PM
 * @Version: V1
 **/
public class no_2 {
    public static void main(String[] args) {
        int h = 50000;
        System.out.println(minSkills(h));
    }
    public static int minSkills(int h) {

        int count = 0;
        if (h == 1)
            return 1;
        if (h == 2 || h == 3)
            return 2;
        while (h > 0) {
            if (h >= 4) {
                count += 2;
                h -= 4;
            } else {
                count += 1;
                h = 0;
            }
        }
        return count;
    }
}