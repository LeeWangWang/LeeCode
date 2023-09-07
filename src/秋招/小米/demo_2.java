package 秋招.小米;

import java.util.*;

/**
 * @ClassName: demo_2
 * @Description:
 * @Author: lww
 * @Date: 9/2/23 4:37 PM
 * @Version: V1
 **/
public class demo_2 {
    public static void main(String[] args) {
        String input = "1:10,2:12,3:10"; // 输入的任务描述字符串
        int batteryCapacity = 4800; // Xiaomi MiX Fold 3的电池容量，单位为mAh
        int minimum = calculate(input, batteryCapacity);
        if (minimum != -1) {
            System.out.println("手机能够串行完成全部任务的最低初始电量为: " + minimum + " mAh");
        } else {
            System.out.println("无法完成全部任务，初始电量超过手机电池容量");
        }
    }
    public static int calculate(String input, int batteryCapacity) {
        String[] tasks = input.split(",");
        int currentBattery = 0;
        int minimum = 0;
        for (String task : tasks) {
            String[] taskInfo = task.split(":");
            int taskConsumption = Integer.parseInt(taskInfo[0]);
            int taskMin = Integer.parseInt(taskInfo[1]);
            // 如果当前电量不足以运行该任务，补充电量至达到最低初始电量
            if (currentBattery < taskMin) {
                int deficit = taskMin - currentBattery;
                minimum += deficit;
                currentBattery += deficit;
            }
            // 执行任务，减少电量
            currentBattery -= taskConsumption;
            // 如果当前电量为负数，说明无法完成任务
            if (currentBattery < 0) {
                return -1;
            }
        }
        return minimum;
    }
}


