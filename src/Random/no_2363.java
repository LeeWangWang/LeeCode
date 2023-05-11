package Random;

import java.util.*;

/**
 * @title: Random.no_2363
 * @description: 合并相似的物品
 * @author: 李旺旺
 * @date: 2023/2/28 16:50
 * @version: 1.0
 */

class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < items1.length; i++) {
            map.put(items1[i][0], map.getOrDefault(items1[i][0], 0) + items1[i][1]); // {value, weight}
        }
        for (int i = 0; i < items2.length; i++) {
            map.put(items2[i][0], map.getOrDefault(items2[i][0], 0) + items2[i][1]);
        }
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            list.add(new ArrayList<>(Arrays.asList(entry.getKey(), entry.getValue())));
        }
        return list;
    }
}

public class no_2363 {
    public static void main(String[] args) {
        int [][] list1 = {{1,1},{4,5},{3,8}};
        int [][] list2 = {{3,1},{1,5}};
        Solution solution = new Solution();
        System.out.println(solution.mergeSimilarItems(list1, list2));
    }
}
