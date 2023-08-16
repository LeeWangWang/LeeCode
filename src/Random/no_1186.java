package Random;

/**
 * @ClassName: no_1186
 * @Description: 删除一次得到子数组最大和,
 * 给你一个整数数组，返回它的某个 非空 子数组（连续元素）在执行一次可选的删除操作后，所能得到的最大元素总和。
 * 换句话说，你可以从原数组中选出一个子数组，并可以决定要不要从中删除一个元素（只能删一次哦），
 * （删除后）子数组中至少应当有一个元素，然后该子数组（剩下）的元素总和是所有子数组之中最大的。
 * 注意，删除一个元素后，子数组 不能为空。
 * @Author: lww
 * @Date: 2023/6/27 15:13
 * @Version: V1
 **/
public class no_1186 {

    /**
     *
     **/
    public static int maximumSum(int[] arr) {
        int dp0 = arr[0], dp1 = 0, res = arr[0];
        for (int i = 1; i < arr.length; i++) {
            dp1 = Math.max(dp0, dp1 + arr[i]);
            dp0 = Math.max(dp0, 0) + arr[i];
            res = Math.max(res, Math.max(dp0, dp1));
        }
        return res;
    }

    public static void main(String[] args) {
        int[] sum1 = {1, -2, 0, 3,};
        int[] sum2 = {1, 2, 3, -5, 6, 8, -1};
        System.out.println(maximumSum(sum1));
        System.out.println(maximumSum(sum2));
    }
}