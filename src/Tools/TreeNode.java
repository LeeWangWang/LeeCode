package Tools;

/**
 * @ClassName: Tools.TreeNode
 * @Description: 定义二叉树
 * @Author: lww
 * @Date: 9/14/23 9:28 PM
 * @Version: V1
 **/
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode() {}
    public TreeNode(int val) { this.val = val; }
    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
