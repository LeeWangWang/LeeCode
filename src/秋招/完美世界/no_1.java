package 秋招.完美世界;

import java.util.*;

/**
 * @ClassName: no_1
 * @Description:
 * @Author: lww
 * @Date: 8/26/23 6:28 PM
 * @Version: V1
 **/
public class no_1 {

    /**
     * 返回合并后的结果的数量即可
     * @param A string字符串一维数组 数组A
     * @param B string字符串一维数组 数组B
     * @return int整型
     */
    public int combineArrays (String[] A, String[] B) {
        List<String> combine = new ArrayList<>();
        return combineStr(A,B,0,0);
    }

    public static int combineStr(String[] A, String[] B, int indexA, int indexB) {
        if (A.length == indexA && B.length == indexB) {
            return 1;
        }
        int lenA = combineStr(A, B, indexA+1, indexB);
        int lenB = combineStr(A, B, indexA, indexB+1);

        return lenA+lenB;
    }
}