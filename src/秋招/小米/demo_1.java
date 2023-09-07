package 秋招.小米;

import java.util.*;

/**
 * @ClassName: demo_1
 * @Description:
 * @Author: lww
 * @Date: 9/2/23 4:50 PM
 * @Version: V1
 **/
public class demo_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int targetFreq = scanner.nextInt();
        String dataStr = scanner.next();

        String[] dataPairs = dataStr.split(",");
        int closestFreq = -1;
        double closestLoss = Double.MAX_VALUE;

        for (String dataPair : dataPairs) {
            String[] parts = dataPair.split(":");
            int freq = Integer.parseInt(parts[0]);
            double loss = Double.parseDouble(parts[1]);

            double diff = Math.abs(freq - targetFreq);

            if (diff < closestLoss) {
                closestLoss = diff;
                closestFreq = freq;
            } else if (diff == closestLoss) {
                closestLoss = (closestLoss + diff) / 2.0;
            }
        }

        System.out.printf("%.1f%n", closestLoss);
    }
}



