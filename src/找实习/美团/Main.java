package 找实习.美团;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        float sum = 0;
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
            sum += nums[i];
        }
        int m = scanner.nextInt();
        int[] t = new int[m];
        String[] o = new String[m];
        for (int i = 0; i < m; i++) {
            t[i] = scanner.nextInt();
            o[i] = scanner.next();
        }
        float[] result = new float[m];

        for (int i = 0; i < m; i++) {
            int k = t[i];
            result[i] = 0;
            if (o[i].equals("+"))
                result[i] = sum;

            else if (o[i].equals("-"))
                result[i] = sum - (float)nums[k-1] - (float)nums[k] + (float)(nums[k-1] - nums[k]);

            else if (o[i].equals("*"))
                result[i] = sum - (float)nums[k-1] - (float)nums[k] + (float)(nums[k-1] * nums[k]);

            else if (o[i].equals("/"))
                result[i] = sum - (float)nums[k-1] - (float)nums[k] + ((float)nums[k-1] / (float)nums[k]);
        }

        for (int i = 0; i < m; i++) {
            System.out.print(result[i] + " ");
        }
    }
}



/*public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int star_num = scanner.nextInt();
        int[] star = new int[star_num];
        int ops_num = scanner.nextInt();
        int[] ops = new int[ops_num];
        int[] x_arr = new int[ops_num];
        int[] y_arr = new int[ops_num];
        for (int i = 0; i < ops_num; i++) {
            ops[i] = scanner.nextInt();
        }
        for (int i = 0; i < ops_num; i++) {
            x_arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < ops_num; i++) {
            y_arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < ops_num; i++) {
            if (ops[i] == 0) {
                star[x_arr[i]-1] = y_arr[i];
            }
            if (ops[i] == 1) {
                int sum = 0;
                for (int j = 0; j <= y_arr[i] - x_arr[i]; j++) {
                    sum = sum + star[x_arr[i] + j - 1];
                }
                System.out.print(sum + " ");
            }
        }
    }
}*/








/*

public class Main {
    public static int[] QuickSort(int[] array, int start, int end) {
        if (array.length < 1 || start < 0 || end >= array.length || start > end)
            return null;
        int smallIndex = getPart(array, start, end);
        if (smallIndex > start)
            QuickSort(array, start, smallIndex-1);
        if (smallIndex < end)
            QuickSort(array, smallIndex-1, end);
        return array;
    }

    public static int getPart(int[] array, int start, int end) {
        int point = (int)(start + Math.random() * (end-start+1));
        int small = start - 1;
        swap(array, point, end);
        for (int i = start; i <= end; i++) {
            if (array[i] <= array[end]) {
                small++;
                if (i > small)
                    swap(array, i, small);
            }
        }
        return small;
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        nums = QuickSort(nums, 0, n-1);
        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            int temp = nums[i+1] - nums[i];
            sum += temp;
        }
        System.out.println(sum);
    }
}*/
