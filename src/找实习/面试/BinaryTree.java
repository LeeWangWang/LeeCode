package 找实习.面试;

import java.util.*;

/**
 * @ClassName: BinaryTree
 * @Description: TODO
 * @Author: lww
 * @Date: 2023/3/25 10:40
 * @Version: V1
 **/

public class BinaryTree {
    public static void main(String[] args) {
        int n = 7;
        TreeNode root = buildTree(n);
        if (root == null) {
            System.out.println("No solution exists.");
        } else {
            System.out.println("The binary tree with " + n + " nodes has the following values:");
            printTree(root);
        }
    }

    private static TreeNode buildTree(int n) {
        // Use a queue to keep track of nodes to be processed
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode root = new TreeNode(-1);
        queue.add(root);
        int i = 1;

        while (i <= n) {
            TreeNode node = queue.poll();
            if (node == null) {
                // If the queue is empty, but there are still nodes to add, then no solution exists
                return null;
            }
            node.val = i++;

            // Add left and right children to the queue
            node.left = new TreeNode(-1);
            node.right = new TreeNode(-1);
            queue.add(node.left);
            queue.add(node.right);

            // Check if the absolute difference between the sums of values at odd and even levels is no more than 1
            if (!checkBalance(root)) {
                return null;
            }
        }
        return root;
    }

    private static boolean checkBalance(TreeNode root) {
        int sumEven = 0;
        int sumOdd = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level = 1;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (level % 2 == 0) {
                    sumEven += node.val;
                } else {
                    sumOdd += node.val;
                }
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            level++;
        }
        return Math.abs(sumEven - sumOdd) <= 1;
    }

    private static void printTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.print(node.val + " ");
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
        System.out.println();
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

