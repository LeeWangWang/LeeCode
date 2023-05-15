package 剑指offer;

/**
 * @ClassName no_11
 * @Description 旋转数组的最小数字
 * @Author JoshLee
 * @Date 2023/5/14 18:21
 * @Version: V1
 */
public class no_11 {
    public int minArray(int[] numbers) {
        int i=0, j=numbers.length-1;
        while (i<j) {
            int m=(i+j)/2;
            if (numbers[m] > numbers[j]) i = m+1;
            else if (numbers[m] < numbers[j]) j=m;
            else j--;
        }
        return numbers[i];
    }
    public static void main(String[] args) {
    }
}
