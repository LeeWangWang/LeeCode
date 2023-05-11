package test.面试;


import java.util.*;

public class 最小的数组元素和 {

    public static void main(String[] args) {

        // 1 4 6 8

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        // 对原数组进行排序
        Arrays.sort(nums);

        // 初始化一个数组用于保存每个数所能除以的最小素数
        int[] smallestPrimeFactors = new int[101];

        // 对 smallestPrimeFactors 进行初始化，使得每个数所能除以的最小素数都为其本身
        for (int i = 1; i <= 100; i++) {
            smallestPrimeFactors[i] = i;
        }

        // 预处理每个数所能除以的最小素数
        for (int i = 2; i <= 100; i++) {
            if (smallestPrimeFactors[i] == i) {
                for (int j = i * i; j <= 100; j += i) {
                    smallestPrimeFactors[j] = Math.min(smallestPrimeFactors[j], i);
                }
            }
        }

        // 对原数组进行 k 次操作
        for (int i = 0; i < k; i++) {
            // 取出当前数组中最小的数
            int smallestNum = nums[i];
            // 如果当前数大于1，且其所能除以的最小素数小于它本身，就将其除以该最小素数
            while (smallestNum > 1 && smallestPrimeFactors[smallestNum] < smallestNum) {
                smallestNum /= smallestPrimeFactors[smallestNum];
                // 将得到的新数插入到原数组中
                int j = i + 1;
                while (j < n && nums[j] < smallestNum) {
                    nums[j - 1] = nums[j];
                    j++;
                }
                nums[j - 1] = smallestNum;
            }
        }

        // 计算操作结束后，数组的所有元素之和的最小值
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }
        System.out.println(sum);
    }
}

