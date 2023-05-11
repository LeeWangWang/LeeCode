/**
 * @ClassName: 层序遍历
 * @Description: TODO
 * @Author: lww
 * @Date: 2023/5/6 14:43
 * @Version: V1
 **/

import java.util.*;

public class 层序遍历 {
//    public static ArrayList<ArrayList<Integer>> Main(TreeNode root) {
//        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
//        Queue<TreeNode> queue = new ArrayDeque<TreeNode>();
//        queue.add(root);
//        while (!queue.isEmpty()) {
//            ArrayList<Integer> row = new ArrayList<>();
//            int n = queue.size();
//            for (int i = 0; i < n; i++) {
//                TreeNode cur = queue.poll();
//                row.add(cur.val);
//                if (cur.left != null)
//                    queue.add(cur.left);
//                if (cur.right != null)
//                    queue.add(cur.right);
//            }
//            res.add(row);
//        }
//        return res;
//    }

    public static void quickSort(int[] arr, int low, int high) {
        int i, j, temp, t;
        if (low > high)
            return;
        i = low;
        j = high;
        temp = arr[low];
        while (i < j) {
            // 先看右边，依次往左递减
            while (temp <= arr[j] && i < j) {
                j--;
            }
            // 再看左边，依次往右递增
            while (temp >= arr[i] && i < j) {
                i++;
            }
            //交换
            if (i < j) {
                t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }
        }
        // 将基准与i和j相等位置的数字交换
        arr[low] = arr[i];
        arr[i] = temp;
        //递归调用
        quickSort(arr, low, j-1);
        quickSort(arr, j+1, high);
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,8,1,2,5,7};
        
        quickSort(nums, 0,nums.length-1);
        for (int i = 0; i < nums.length; i++) {
            
        }
    }

}