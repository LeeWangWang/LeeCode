package 秋招.腾讯;

import java.util.*;

/**
 * @ClassName: demo333
 * @Description:
 * @Author: lww
 * @Date: 8/26/23 3:00 PM
 * @Version: V1
 **/
public class demo333 {
    public static void main(String[] args) {
        // 输入的单词列表
        String[] words = {"splunk","elastic","splunk","clickhouse","elastic"};
        // 创建一个Hashmap来统计每个单词的出现次数
        Map <String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        //创建一个最小堆来保存出现次数最多的108个单词
        PriorityQueue<Map.Entry<String, Integer>> minHeap = new PriorityQueue<>(
                (a,b) -> a.getValue() - b.getValue()
        );

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            minHeap.offer(entry);
            if (minHeap.size() > 100)
                minHeap.poll();
        }

        //从最小堆中依次取出单词和出现次数，并反转顺序
        List<String> result = new ArrayList<>();
        while (!minHeap.isEmpty()) {
            result.add(minHeap.poll().getKey());
        }
        Collections.reverse(result);

        // 输出结果
        for (String word : result){
            System.out.println(word+ " " +wordCount.get(word));
        }
    }
}