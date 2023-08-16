package 找实习.面试;
import java.util.*;

/**
 * @ClassName: MeteorShower
 * @Description: TODO
 * @Author: lww
 * @Date: 2023/3/25 10:19
 * @Version: V1
 **/

public class MeteorShower {

    static class Meteor implements Comparable<Meteor> {
        int start;
        int end;
        Meteor(int s, int e) {
            start = s;
            end = e;
        }
        public int compareTo(Meteor m) {
            return start - m.start;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int n = Integer.parseInt(str);
        Meteor[] meteors = new Meteor[n];

        String line1 = scanner.nextLine(); // 读取一行输入
        String[] parts1 = line1.split(" "); // 将输入按照空格分割成多个部分
        int[] nums1 = new int[parts1.length]; // 创建一个整数数组
        for (int i = 0; i < parts1.length; i++) {
            nums1[i] = Integer.parseInt(parts1[i]); // 将每个部分解析成整数并存储到数组中
        }

        String line2 = scanner.nextLine(); // 读取一行输入
        String[] parts2 = line2.split(" "); // 将输入按照空格分割成多个部分
        int[] nums2 = new int[parts2.length]; // 创建一个整数数组
        for (int i = 0; i < parts2.length; i++) {
            nums2[i] = Integer.parseInt(parts2[i]); // 将每个部分解析成整数并存储到数组中
        }

        for (int i = 0; i < n; i++) {
            meteors[i] = new Meteor(nums1[i], nums2[i]);
        }
        Arrays.sort(meteors);
        int maxCount = 0;
        int maxTime = 0;
        int currentCount = 0;
        for (int i = 0; i < n; i++) {
            Meteor meteor = meteors[i];
            currentCount++;
            int j = i + 1;
            while (j < n && meteors[j].start <= meteor.end) {
                currentCount++;
                j++;
            }
            if (currentCount > maxCount) {
                maxCount = currentCount;
                maxTime = meteor.end;
            }
            i = j - 1;
            currentCount = 0;
        }
        System.out.println(maxCount + " " + countMaxTimes(meteors, maxTime));
    }

    static int countMaxTimes(Meteor[] meteors, int maxTime) {
        int count = 0;
        for (Meteor meteor : meteors) {
            if (meteor.start <= maxTime && meteor.end >= maxTime) {
                count++;
            }
        }
        return count;
    }
}
