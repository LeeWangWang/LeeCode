package 秋招.用友;

import java.util.*;

/**
 * @ClassName: no_1
 * @Description:
 * @Author: lww
 * @Date: 9/4/23 7:38 PM
 * @Version: V1
 **/
public class no_1 {
    /**
     * @Description: 现在给定行有的城市和航班，以及出发城市srC， 你的任务是找到从 sCr城市出发到其他所有城市最便宜
     * 机票价格列表。 假设两个城市之问机票价格不会超过Integer.MAX_V
     * @Param: [n, flights, src]
     * @Return: int[]
     * @Author: lww
     * @Date: 9/7/23
     **/
    public int[] findAllCheapestPrice (int n, int[][] flights, int src) {
        // write code here
        // 一个数组保存最便宜对机票价格
        int[] prices = new int[n];
        Arrays.fill(prices, Integer.MAX_VALUE);
        prices[src] = 0;

        // 一个队列保存待处理城市
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(src);

        // 一个Map保存每个城市的邻接城市及其对应价格
        Map<Integer, List<int[]>> map = new HashMap<>();
        for (int[] flight : flights) {
            int from = flight[0];
            int to = flight[1];
            int price = flight[2];
            if (!map.containsKey(from)) {
                map.put(from, new ArrayList<>());
            }
            map.get(from).add(new int[]{to, price});
        }

        // 使用BFS遍历城市
        while (!queue.isEmpty()) {
            int curCity = queue.poll();
            if (map.containsKey(curCity)) {
                for (int[] city : map.get(curCity)) {
                    int nextCity = city[0];
                    int priceCity = city[1];
                    if (prices[curCity] + priceCity < prices[nextCity]) {
                        prices[nextCity] = prices[curCity] + priceCity;
                        queue.offer(nextCity);
                    }
                }
            }
        }
        // 将无法到达的城市的价格设为-1

        for (int i = 0; i < n; i++) {
            if (prices[i] == Integer.MAX_VALUE) {
                prices[i] = -1;
            }
        }
        return prices;
    }
}













