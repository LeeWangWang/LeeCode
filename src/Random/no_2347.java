package Random;

import java.util.HashMap;

/**
 * @title: Random.no_2347
 * @description:
 * @author: 李旺旺
 * @date: 2023/2/20 18:59
 * @version: 1.0
 */
public class no_2347 {
    public static String bestHand(int[] ranks, char[] suits) {
        int flag = 0;
        if (suits[0] == suits[1] && suits[0] == suits[2] && suits[0] == suits[3] && suits[0] == suits[4] ) {
            return "Flush";
        } else {
            HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
            for (int rank : ranks) {
                if (hashMap.containsKey(rank)) {
                    hashMap.replace(rank, hashMap.get(rank)+1);
                } else {
                    hashMap.put(rank, 1);
                    flag++;
                }
            }
            System.out.println(flag);
            for (int rank : ranks) {
                if (hashMap.get(rank) >= 3) {
                    return "Three of a Kind";
                }
            }
            for (int rank : ranks) {
                if (hashMap.get(rank) == 2) {
                    return "Pair";
                }
            }
            return "High Card";
        }
    }
    public static void main(String[] args) {

//        int[] ranks = new int[]{13,2,3,1,9};
//        char[] suits = new char[] {'a','a','a','a','a'};

//        int[] ranks = new int[]{4,4,2,2,4};
//        char[] suits = new char[] {'d','a','a','b','c'};

        int[] ranks = new int[]{10,10,2,12,12};
        char[] suits = new char[] {'d','a','a','b','c'};

        String result = bestHand(ranks, suits);
        System.out.println(result);
    }
}
