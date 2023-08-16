package 找实习.小红书;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @ClassName: no_01
 * @Description:
 * @Author: lww
 * @Date: 8/6/23 7:26 PM
 * @Version: V1
 **/
public class no_01 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        long totalTime = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 7; i++) {
            String startTime = sc.nextLine();
            String endTime = sc.nextLine();

            Date start = sdf.parse(startTime);
            Date end = sdf.parse(endTime);
            long minutes;

            if (end.before(start)) {
                long untilMidnight = (24*60) - (start.getHours()*60 + start.getMinutes());
                long afterMidnight = end.getHours() * 60 + end.getMinutes();
                minutes = untilMidnight + afterMidnight;
            } else {
                minutes = (end.getTime() - start.getTime()) / (60*1000);
            }
            totalTime += minutes;
        }
        System.out.println(totalTime);
    }
}









