package 秋招.深信服;

import java.util.*;

/**
 * @ClassName: no_1
 * @Description: 100%
 * @Author: lww
 * @Date: 9/12/23 6:12 PM
 * @Version: V1
 **/
public class no_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] serverA = sc.nextLine().split(" ");
        String[] serverB = sc.nextLine().split(" ");
        sc.close();
        int[] memoryA = new int[serverA.length];
        int[] memoryB = new int[serverB.length];

        for (int i = 0; i < serverA.length; i++) {
            memoryA[i] = Integer.parseInt(serverA[i]);
        }
        for (int i = 0; i < serverB.length; i++) {
            memoryB[i] = Integer.parseInt(serverB[i]);
        }
        getResult2(memoryA, memoryB);

    }

    public static void getResult2(int[] memoryA, int[] memoryB) {
        int sumA = 0, sumB = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : memoryA) {
            sumA += i;
            map.put(i, i);
        }
        for (int i : memoryB) {
            sumB += i;
        }
        int diff = (sumA- sumB)/2;

        if (diff == 0) {
            System.out.println("fail");
            return;
        }

        for (int i : memoryB) {
            if (map.containsKey(i + diff)) {
                System.out.println((i+diff) + " " + i);
                return;
            }
        }
        System.out.println("fail");
    }

    public static void getResult1(int[] memoryA, int[] memoryB) {
        int totalA = Arrays.stream(memoryA).sum();
        int totalB = Arrays.stream(memoryB).sum();
        int diff = totalA - totalB;
        if (diff % 2 != 0) {
            System.out.println("fail");
            return;
        }
        diff /= 2;

        Set<Integer> memorySet = new HashSet<>();
        for (int memory : memoryB) {
            memorySet.add(memory);
        }
        boolean found = false;
        for (int memory : memoryA) {
            int targetInB = memory - diff;
            if (memorySet.contains(targetInB)) {
                if (memory == targetInB)
                    System.out.println("fail");
                else {
                    System.out.println(memory + " " + targetInB);
                }
                found = true;
                return;
            }
        }
        if (!found) {
            System.out.println("fail");
        }
    }

}