package test.面试;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName: test_4
 * @Description: TODO
 * @Author: lww
 * @Date: 2023/3/26 10:37
 * @Version: V1
 **/
public class test_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [] a = new int [n];
        int [] b = new int [n];
        String [] s = br.readLine().split(" ");
        for(int i=0;i<n;i++){
            a[i] = Integer.parseInt(s[i]);
        }
        s = br.readLine().split(" ");
        for(int i=0;i<n;i++){
            b[i] = Integer.parseInt(s[i]);
        }
        if(n==1){
            System.out.println(a[0]*b[0]);
            return;
        }
        // 简单的贪心思路应该是不行的 5 1 2 3 4 2
        // 区间dp,将取数看做是逆着的加数
        int [][] dp = new int [n+1][n+1];
        for(int x=1;x<=n;x++){
            dp[x][x] = a[x-1]*b[n-1];
        }
        for(int len=2;len<=n;len++){
            for(int i=1; i+len-1<=n;i++){
                int j = i+len-1;
                dp[i][j] = Math.max(dp[i+1][j]+a[i-1]*b[n-len],dp[i][j-1]+a[j-1]*b[n-len]);
            }
        }
        System.out.println(dp[1][n]);
    }
}


