package 剑指offer;

import Tools.TreeNode;

/**
 * @ClassName no_28
 * @Description 对称的二叉树
 * @Author JoshLee
 * @Date 2023/5/19 20:26
 * @Version: V1
 */
public class no_28 {
    public boolean isSymmetric(TreeNode root) {
        return root == null ? true : recur(root.left, root.right);
    }
    public boolean recur(TreeNode L, TreeNode R) {
        if (L == null && R == null) return true;
        if (L == null || R == null || L.val != R.val) return false;
        return recur(L.left, R.right) && recur(L.right, R.left);
    }
}
