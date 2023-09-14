package 秋招.腾讯;

/**
 * @ClassName: Main1
 * @Description:
 * @Author: lww
 * @Date: 9/10/23 8:07 PM
 * @Version: V1
 **/
import java.util.*;

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }
 }
public class Main1 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 返回节点权值1个数比0的个数多一的路径数
     * @param root TreeNode类 权值为0和1的二叉树根节点
     * @return int整型
     */
    public int pathNumber (TreeNode root) {
        // write code here
        int count = countPath(root, 0, 0);
        return count;
    }
    public static int countPath(TreeNode node, int ones, int zeros) {
        if (node == null)
            return 0;
        ones += (node.val == 1) ? 1 : 0;
        zeros += (node.val == 0) ? 1 : 0;
        if (node.left == null && node.right == null) {
            if (ones == zeros + 1)
                return 1;
            else
                return 0;
        }
        int left = countPath(node.left, ones, zeros);
        int right = countPath(node.right, ones, zeros);
        return left + right;
    }
}




