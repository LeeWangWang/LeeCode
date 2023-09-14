package 秋招.小米;

import java.util.Arrays;

/**
 * @ClassName: test_2
 * @Description:
 * @Author: lww
 * @Date: 9/13/23 3:23 PM
 * @Version: V1
 **/
public class test_2 {
    public static int minMeetingRooms(int[][] intervals) {
        // 检查输入是否为空或面试时间段列表是否为空
        if (intervals == null || intervals.length == 0) {
            return 0;
        }
        int n = intervals.length;
        int[] startTimes = new int[n];
        int[] endTimes = new int[n];
        // 将面试时间段的开始时间和结束时间分别存储到数组中
        for (int i = 0; i < n; i++) {
            startTimes[i] = intervals[i][0];
            endTimes[i] = intervals[i][1];
        }
        // 对开始时间和结束时间数组进行排序
        Arrays.sort(startTimes);
        Arrays.sort(endTimes);
        int rooms = 0; // 当前使用的会议室数量
        int maxRooms = 0; // 最大同时使用的会议室数量
        int i = 0;
        int j = 0;
        // 使用两个指针遍历开始时间和结束时间数组
        while (i < n && j < n) {
            if (startTimes[i] < endTimes[j]) {
                // 如果一个面试的开始时间早于结束时间，则需要一个新的会议室
                rooms++;
                i++;
            } else {
                // 如果一个面试的开始时间晚于结束时间，则可以释放一个会议室
                rooms--;
                j++;
            }
            // 更新最大会议室数量
            maxRooms = Math.max(maxRooms, rooms);
        }
        return maxRooms;
    }
    public static void main(String[] args) {
        int[][] intervals = {{3, 7}, {2, 9}, {8, 10}};
        int result = minMeetingRooms(intervals);
        System.out.println("最少需要 " + result + " 个会议室。");
    }
}