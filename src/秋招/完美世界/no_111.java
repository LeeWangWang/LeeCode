package 秋招.完美世界;

import java.util.*;

/**
 * @ClassName: no_111
 * @Description:
 * @Author: lww
 * @Date: 8/26/23 7:22 PM
 * @Version: V1
 **/
public class no_111 {

    private static class Item {
        int indexA;
        int indexB;
        String current;
        public  Item(int indexA, int indexB, String current) {
            this.indexA = indexA;
            this.indexB = indexB;
            this.current = current;
        }
    }
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 返回合并后的结果的数量即可
     * @param A string字符串一维数组 数组A
     * @param B string字符串一维数组 数组B
     * @return int整型
     */
    public int combineArrays (String[] A, String[] B) {
        List<String> combine = new ArrayList<>();
        Queue<Item> queue = new LinkedList<>();
        queue.offer(new Item(0, 0, ""));
        while (!queue.isEmpty()) {
            Item currentItem = queue.poll();
            if (currentItem.indexA == A.length && currentItem.indexB == B.length) {
                combine.add(currentItem.current);
                continue;
            }
            if (currentItem.indexA < A.length) {
                queue.offer(new Item(currentItem.indexA+1, currentItem.indexB, currentItem.current+A[currentItem.indexA]));
            }
            if (currentItem.indexB < B.length) {
                queue.offer(new Item(currentItem.indexA, currentItem.indexB+1, currentItem.current+B[currentItem.indexB]));
            }
        }
        return combine.size();
    }
}