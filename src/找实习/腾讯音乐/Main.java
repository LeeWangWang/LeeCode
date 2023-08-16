package 找实习.腾讯音乐;

import java.util.Scanner;

public class Main {

    public static int[] constructArray(int n) {
        int size = n * (n + 1) / 2;
        int[] result = new int[size];
        int index = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                result[index++] = i;
            }
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < size - 1; i++) {
            if (result[i] == result[i + 1]) {
                int temp = result[i + 1];
                result[i + 1] = result[size - 1];
                result[size - 1] = temp;
            }
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
        return result;
    }

    public static int countGoodArrays(int n) {
        int mod = 1000000007;
        long[][] dp = new long[n + 1][3];
        dp[1][0] = dp[1][1] = dp[1][2] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i][0] = (dp[i-1][1] + dp[i-1][2]) % mod;
            dp[i][1] = (dp[i-1][0] + dp[i-1][2]) % mod;
            dp[i][2] = (dp[i-1][0] + dp[i-1][1]) % mod;
        }
        long sum = (dp[n][0] + dp[n][1] + dp[n][2]) % mod;
        long steepValue = (sum * 2) % mod;
        return (int) steepValue;
    }

    public static int sumOfSteepValues(int n) {
        final int MOD = 1000000007;
        long[][][] dp = new long[n + 1][3][3];
        // base cases
        for (int j = 0; j < 3; j++) {
            for (int k = 0; k < 3; k++) {
                dp[2][j][k] = 1;
            }
        }
        // recurrence relation
        for (int i = 3; i <= n; i++) {
            dp[i][0][1] = (dp[i - 1][1][2] + dp[i - 1][2][1]) % MOD;
            dp[i][0][2] = (dp[i - 1][1][2] + dp[i - 1][2][1]) % MOD;
            dp[i][1][0] = (dp[i - 1][0][2] + dp[i - 1][2][0]) % MOD;
            dp[i][1][2] = (dp[i - 1][0][1] + dp[i - 1][2][0]) % MOD;
            dp[i][2][0] = (dp[i - 1][0][1] + dp[i - 1][1][0]) % MOD;
            dp[i][2][1] = (dp[i - 1][0][2] + dp[i - 1][1][0]) % MOD;
        }
        // sum up values in dp[n][j][k]
        long sum = 0;
        for (int j = 0; j < 3; j++) {
            for (int k = 0; k < 3; k++) {
                sum += dp[n][j][k];
                sum %= MOD;
            }
        }
        return (int)sum;
    }

    public static int sumSteepValues(int n) {
        final int MOD = 1000000007;
        int[][] dp = new int[n + 1][3];
        dp[1][0] = dp[1][1] = dp[1][2] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i][0] = (dp[i-1][1] + dp[i-1][2]) % MOD;
            dp[i][1] = (dp[i-1][0] + dp[i-1][2]) % MOD;
            dp[i][2] = (dp[i-1][0] + dp[i-1][1]) % MOD;
        }
        long sum = 0;
        for (int i = 0; i < 3; i++) {
            int freq = dp[n][i];
            if (freq > 0) {
                int diff = Math.abs(i - ((i + 1) % 3));
                sum = (sum + (long) diff * freq) % MOD;
                diff = Math.abs(i - ((i + 2) % 3));
            }
        }
        return (int)sum;
    }

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 2;
        System.out.println(sumSteepValues(n));
    }


    public Node calculateSubtreeWeights(Node root) {
        if (root == null) {
            return null;
        }
        Node left = calculateSubtreeWeights(root.left);
        Node right = calculateSubtreeWeights(root.right);
        if (left != null && right != null) {
            root.val = Math.min(left.val, right.val);
            return new Node(left.val + right.val);
        } else if (left != null) {
            root.val = left.val;
            return new Node(left.val);
        } else if (right != null) {
            root.val = right.val;
            return new Node(right.val);
        } else {
            root.val = 0;
            return new Node(0);
        }
    }

}


class Node {
    int val;
    Node left;
    Node right;
    public Node(int val) {
        this.val = val;
    }
}



