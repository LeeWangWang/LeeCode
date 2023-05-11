package Random;

/**
 * @title: Random.no_367
 * @description: 有效的完全平方数
 * @author： 李旺旺
 * @date： 2021/11/4 10:05
 * @version: 1.0
 */
public class no_367 {

    /**
     * 时间复杂度：O(log n)
     * 空间复杂度：O(1)
     */
    public static boolean isPerfectSquare(int num) {
        if (num < 0) {
            return false;
        }
        if (num <= 1) {
            return true;
        }
        int beginNum = 1;
        int endNum = num/2;
        while (beginNum <= endNum){
            int midNum = beginNum + (endNum-beginNum)/2;
            long temp = (long) midNum * (long) midNum;
            if (temp == num){
                return true;
            }else if (temp > num){
                endNum = midNum - 1;
            }else {
                beginNum = midNum + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(25));
        System.out.println(isPerfectSquare(1914));
        System.out.println(isPerfectSquare(128881));
        System.out.println(isPerfectSquare(73702225));
        System.out.println(isPerfectSquare(92064025));
        System.out.println(isPerfectSquare(2147483645));
    }
}


