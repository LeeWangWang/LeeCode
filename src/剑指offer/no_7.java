package 剑指offer;

import Tools.TreeNode;
import java.util.*;

/**
 * @ClassName: no_7
 * @Description: 重建二叉树
 * @Author: lww
 * @Date: 2023/5/11 15:42
 * @Version: V1
 **/

public class no_7 {
    /*
    输入某二叉树的前序遍历和中序遍历的结果，请构建该二叉树并返回其根节点。
    假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
     */
    HashMap<Integer, Integer> map = new HashMap<>();//标记中序遍历
    int[] preOrder;// 保留的先序遍历，方便递归时依据索引查看先序遍历的值
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preOrder = preorder;
        // 将中序遍历的值及索引放在map中，方便递归时获取左子树与右子树的数量及其根的索引
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return recur(0,0,inorder.length-1);
    }

    TreeNode recur(int pre_root, int in_left, int in_right) {
        if (in_left > in_right) return null;// 相等的话就是自己
        TreeNode root = new TreeNode(preOrder[pre_root]);//获取root节点
        int idx = map.get(preOrder[pre_root]);//获取在中序遍历中根节点所在索引，以方便获取左子树的数量
        //左子树的根的索引为先序中的根节点+1
        //递归左子树的左边界为原来的中序in_left
        //递归左子树的右边界为中序中的根节点索引-1
        root.left = recur(pre_root+1, in_left, idx-1);
        //右子树的根的索引为先序中的 当前根位置 + 左子树的数量 + 1
        //递归右子树的左边界为中序中当前根节点+1
        //递归右子树的右边界为中序中原来右子树的边界
        root.right = recur(pre_root + (idx - in_left)+1, idx+1, in_right);
        return root;
    }

    public static void main(String[] args) {
        // 前序遍历
        int[] preorder = {3,9,20,15,7};

        // 中序遍历
        int[] inorder = {9,3,15,20,7};
        int[] a = {-1}, b = {-1};
    }
}