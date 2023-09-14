package 秋招.深信服;

import java.util.*;

/**
 * @ClassName: Main
 * @Description:
 * @Author: lww
 * @Date: 9/12/23 7:52 PM
 * @Version: V1
 **/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        // 遍历T
        for (int t = 0; t < T; t++) {
            // 数字的数量
            int n = sc.nextInt();
            sc.nextLine();
            // 创建链表数组，每个链表代表一行
            LinkedList<Integer>[] rows = new LinkedList[n+1];

            // 对于每个数字，读取数值和下一行的索引，然后将数值添加到对应的链表中
            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();
                int nextRow = sc.nextInt();
                if (rows[nextRow] == null) {
                    rows[nextRow] = new LinkedList<>();
                }
                rows[nextRow].add(num);
            }
            // 创建一个结果链表
            List<Integer> result = new ArrayList<>();
            int currentRow = 1;

            // 当前行不为0时，将当前行的所有数字添加到结果链表中，然后将当前行加1
            while (currentRow != 0) {
                LinkedList<Integer> row = rows[currentRow];
                while (!row.isEmpty()) {
                    result.add(row.pollLast());
                }
                currentRow++;
            }
            for (int i = 0; i < result.size(); i++) {
                System.out.println(result.get(i));
                if (i < result.size() - 1) {
                    System.out.println(" ");
                }
            }
            if (t < T-1) {
                System.out.println();
            }
        }
    }
}









