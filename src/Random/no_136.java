package Random;

/**
 * @ClassName: no_136
 * @Description:
 * @Author: lww
 * @Date: 10/16/23 11:12 AM
 * @Version: V1
 **/
public class no_136 {

    public int singleNumber(int[] nums) {
        int ans = 0;
        for (int num : nums) {
            ans ^= num;
        }
        return ans;
    }
}