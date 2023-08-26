package 秋招.小红书;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @ClassName: no_1
 * @Description:
 * @Author: lww
 * @Date: 8/19/23 10:00 AM
 * @Version: V1
 **/
public class no_1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        long totalMinutes = 0;

        for (int i = 0; i < 7; i++) {
            String startTimestr = scanner.nextLine();
            String endTimeStr = scanner.nextLine();

            Date startTime = sdf.parse(startTimestr);
            Date endTime = sdf.parse(endTimeStr);

            long durationMinutes ;
            if (endTime.before(startTime)) {
                long untilMidnight = (24 * 60) - (startTime.getHours() * 60 + startTime.getMinutes());
                long afterMidnight = endTime.getHours() * 60 + endTime.getMinutes();
                durationMinutes = untilMidnight + afterMidnight;
            } else {
                durationMinutes = (endTime.getTime() - startTime.getTime()) / (60 * 1000);
            }
            totalMinutes += durationMinutes;
        }
        System.out.println(totalMinutes);
    }
}