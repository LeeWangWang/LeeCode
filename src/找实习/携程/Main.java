package 找实习.携程;

import java.util.*;

public class Main {

    public static void sout(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] result = new int[n];
        for (int i = 0; i < n ; i++) {
            result[i] = i+1;
        }
        int flag = 1;
        int count = 0;
        while (flag <= n) {
            if (count < k-1) {
                int temp = result[flag-1];
                result[flag-1] = result[flag];
                result[flag] = temp;
                count++;
                flag += 2;
            } else {
                int temp = result[flag-1];
                result[flag-1] = result[n-1];
                result[n-1] = temp;
                break;
            }
        }
        sout(result);
    }
}



/*public class Main {

    static List<List<int[]>> graph;
    static boolean[] visited;
    static int[] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
//        int[][] tree = new int[n-1][3];
//        for(int i = 0; i < n-1; i++){
//            for(int j = 0; j < 3; j++){
//                tree[i][j] = sc.nextInt();
//            }
//            sc.nextLine();
//        }

        graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < n - 1; i++) {
            int u = sc.nextInt() - 1;
            int v = sc.nextInt() - 1;
            int w = sc.nextInt();
            graph.get(u).add(new int[]{v, w});
            graph.get(v).add(new int[]{u, w});
        }
        visited = new boolean[n];

        dp = new int[n];
        dfs(0);
        System.out.println(dp[0]);
    }

    public static void dfs(int u) {
        visited[u] = true;
        for(int[] edge : graph.get(u)) {
            int v = edge[0];
            int w = edge[1];
            if (! visited[v]) {
                dfs(v);
                dp[u] = Math.max(dp[u], dp[v] + w);
            }
        }
    }

}*/


/*public class Main {
    public static int gePlus(int n) {
        int result = 1;
        while (n > 0) {
            result *= n--;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int min_x = 1;
        int min_y = 1;
        int min_diff = n;
        for (int x = 3; x < n+1; x++) {
            if (x == 2) continue;
            for (int y = 0; y < n+1; y++) {
                if (y == 2) continue;
                int diff = Math.abs(gePlus(x) * y - y - n);
                if (diff < min_diff) {
                    min_diff = diff;
                    min_x = x;
                    min_y = y;
                }
            }
        }
        System.out.println(min_x +" "+ min_y);
    }
}*/



/*
1.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int len = str.length();
        char[] nums = str.toCharArray();
        int result = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] == '0' || nums[i] == '6' || nums[i] == '9') {
                result += 1;
            }
            if (nums[i] == '8') {
                result += 2;
            }
        }
        System.out.println(result);
    }
}
 */

/*
2.

public class Main {

    public static void sout(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] result = new int[n];
        int num = 1;
        for (int i = k; i >= 1 ; i--) {
            result[i-1] = num++;
        }
        for(int i = k+1; i <= n; i++) {
            result[i-1] = num++;
        }
        sout(result);

        for (int i = 1; i <= k; i++) {
            int max = i-1;
            for (int j = i; j < n; j++) {
                if (result[j] > result[max]) {
                    max = j;
                }
            }
            if(max != i-1) {
                int temp = result[i-1];
                result[i-1] = result[max];
                result[max] = temp;
            }
            if (i+1 < n && result[i-1] > result[i] && result[i-1] > result[i+1]){
                int temp = result[i];
                result[i] = result[i+1];
                result[i+1] = temp;
            }
        }
        sout(result);
    }
}
 */





