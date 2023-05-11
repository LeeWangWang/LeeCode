package test.百度;

/**
 * @ClassName: Test5
 * @Description: TODO
 * @Author: lww
 * @Date: 2023/4/25 19:40
 * @Version: V1
 **/
public class Test5 {
    public static void main(String[] args) {
        int[] num = {1,-2,3,10,-4,7,2,-5};
        System.out.println(maxSubSum(num));
    }

    public static int maxSubSum(int[] a) {
        int len = a.length;
        int sum = 0;
        int maxSum = 0;
        for(int i=0; i<len; i++) {
            sum += a[i];
            if(sum > 0){
                if(sum > maxSum)
                    maxSum = sum;
            }
            else
                sum = 0;
        }
        return maxSum;
    }
}