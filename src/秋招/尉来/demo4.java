package 秋招.尉来;

import java.util.*;

/**
 * @ClassName: demo4
 * @Description:
 * @Author: lww
 * @Date: 8/25/23 10:40 AM
 * @Version: V1
 **/
public class demo4 {
    static int n;
    static int root;
    static int[] fa = new int[500005];
    static int[] lch = new int[500005];
    static int[] rch = new int[500005];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        root = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            fa[i] = sc.nextInt();
            lch[i] = sc.nextInt();
            rch[i] = sc.nextInt();
        }
        sc.nextLine();
        int node = sc.nextInt();
        TreeNode treeRoot = buildTree(root);
        int result = inorderSuccessor(treeRoot, node);
        System.out.println(result);
    }

    private static TreeNode buildTree(int root) {
        if (root == 0) {
            return null;
        }
        TreeNode node = new TreeNode(root);
        node.left = buildTree(lch[root]);
        node.right = buildTree(rch[root]);
        return node;
    }

    public static int inorderSuccessor(TreeNode root, int p) {
        Deque<TreeNode> stack = new ArrayDeque<TreeNode>();
        TreeNode prev = null, curr = root;
        while (!stack.isEmpty() || curr != null) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            if (prev != null && prev.val == p) {
                return prev.val;
            }
            prev = curr;
            curr = curr.right;
        }
        return 0;
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
}




