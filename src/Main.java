import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String newStr = new StringBuffer(str).reverse().toString();
        List<String> strList = new ArrayList<>();
        StringBuffer stringBuffer = new StringBuffer();
        HashMap<String, Long> map = new HashMap<>();
        for (int i = 0; i < newStr.length(); i++) {
            map.put(String.valueOf(newStr.charAt(i)), map.getOrDefault(String.valueOf(newStr.charAt(i)), 0L) + 1);
            if (!strList.contains(String.valueOf(newStr.charAt(i)))) {
                stringBuffer.append(newStr.charAt(i));
                strList.add(String.valueOf(newStr.charAt(i)));
            }
        }
        TreeMap<Long, List<String>> mapString = new TreeMap<>();
        Set<Map.Entry<String, Long>> entries = map.entrySet();
        Iterator<Map.Entry<String, Long>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Long> next = iterator.next();
            if (!mapString.containsKey(next.getValue())) {
                // 不存在，放入Map里面
                mapString.put(next.getValue(), Arrays.asList(next.getKey()));
            } else {
                // 存在，增加
                List<String> stringList1 = mapString.get(next.getValue());
                List<String> stringListNew = new ArrayList<>();
                stringListNew.add(next.getKey());
                stringListNew.addAll(stringList1);
                mapString.put(next.getValue(), stringListNew);
            }
        }

        // 根据个数排序
        Iterator<Map.Entry<Long, List<String>>> iteratorSort = mapString.entrySet().iterator();
        List<String> finalList = new ArrayList<>();
        while (iteratorSort.hasNext()) {
            Map.Entry<Long, List<String>> next = iteratorSort.next();
            List<String> value = next.getValue();
            value = value.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
            finalList.addAll(value);
        }
        for (int i = finalList.size() - 1; i >= 0; i--) {
            System.out.print(finalList.get(i));
        }
    }
}
