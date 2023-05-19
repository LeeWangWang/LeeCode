package 剑指offer;

/**
 * @ClassName: no_27
 * @Description: 二叉树的镜像
 * @Author: lww
 * @Date: 2023/5/18 17:59
 * @Version: V1
 **/
public class no_27 {
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) return null;
        TreeNode tem = root.left;
        root.left = mirrorTree(root.right);
        root.right = mirrorTree(tem);
        return root;
    }
}