package 秋招.深信服;

import java.util.*;

/**
 * @ClassName: no_2
 * @Description: 50%
 * @Author: lww
 * @Date: 9/12/23 6:12 PM
 * @Version: V1
 **/
public class no_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] keyName = sc.nextLine().split(",");
        String[] keyTime = sc.nextLine().split(",");
        for (int i = 0; i < keyName.length; i++) {
            String str = keyName[i];
            keyName[i] = str.replace("\"", "");
        }
        for (int i = 0; i < keyTime.length; i++) {
            String str = keyTime[i];
            keyTime[i] = str.replace("\"", "");
        }

        for (String str : keyName) {
            System.out.print(str + " ");
        }

        System.out.println();

        for (String str : keyTime) {
            System.out.print(str + " ");
        }
        System.out.println();

        List<String> result = getResult(keyName, keyTime);
        List<String> warning = new ArrayList<>();
        for (int i = 0; i < result.size(); i++) {
            String str = "\"" + result.get(i) + "\"";
            warning.add(str);
        }
        System.out.println(Arrays.toString(warning.toArray()));
    }

    public static List<String> getResult (String[] keyName, String[] keyTime) {
        Map<String, List<Integer>> employeeMap = new HashMap<>();
        List<String> warningList = new ArrayList<>();
        for (int i = 0; i < keyName.length; i++) {
            int timeDiff = caculateTime(keyTime[i]);
            String employeeName = keyName[i];

            if (!employeeMap.containsKey(employeeName)) {
                employeeMap.put(employeeName, new ArrayList<>());
            }
            employeeMap.get(employeeName).add(timeDiff);
        }

        for (Map.Entry<String, List<Integer>> entry : employeeMap.entrySet()) {
            if (entry.getValue().size() >= 3) {
                warningList.add(entry.getKey());
            }
        }

        Collections.sort(warningList);
        return warningList;
    }

    public static int caculateTime(String time) {
        String[] timeParts = time.split(":");
        int hours = Integer.parseInt(timeParts[0]);
        int minutes = Integer.parseInt(timeParts[1]);
        return hours*60+minutes;
    }
}