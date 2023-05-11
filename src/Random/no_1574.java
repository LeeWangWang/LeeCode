package Random;

/**
 * @ClassName: Random.no_1574
 * @Description: TODO
 * @Author: lww
 * @Date: 2023/3/25 17:07
 * @Version: V1
 **/
public class no_1574 {
    public static int findLengthOfShortestSubarray(int[] arr) {
        int length = arr.length;
        int j = length-1;
        if (length <= 1) {
            return 0;
        }
        int num = 0;
        int flag;
        for (int i = 0; i < length-1; i++) {
            // 如果后一个值比前一个值小 10>4, i=4
            if (arr[i] > arr[i+1]) {
                int res = i;
                //
                while (arr[res] < arr[res-1]) {
                    num += 1;
                }
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int[] num1 = {1,2,3,10,4,2,3,5};
        int[] num2 = {5,4,3,2,1};
        int[] num3 = {1,2,3};
//        System.out.println(num1.length);
        System.out.println(findLengthOfShortestSubarray(num1));
        System.out.println(findLengthOfShortestSubarray(num2));
        System.out.println(findLengthOfShortestSubarray(num3));
    }
}


/*

小美因乐于助人的突出表现获得了老师的嘉奖。老师允许小美从一堆n个编号分别1,2...n的糖果中选择任意
多个糖果作为奖励(每种编号的糖果各一个) ，但为了防止小美一次吃太多糖果有害身体健康， 老师设定了一
个限制:如果选择了编号为i的糖果，那么就不能选择编号为i-1, i-2, i+1, i+2的四个糖果了。在小美看来，
每个糖果都有一个对应的美味值，小美想让她选出的糖果的美味值之和最大!作为小美的好朋友，请你帮帮她？


 */

