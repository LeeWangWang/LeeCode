package 数据结构;

import Tools.TreeNode;
import java.util.*;

/**
 * @ClassName: levelOrder
 * @Description: 层序遍历二叉树
 * @Author: lww
 * @Date: 9/14/23 9:26 PM
 * @Version: V1
 **/
public class BinaryTreeLevelOrder {
    public List<List<Integer>> Solution(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<TreeNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> row = new ArrayList<>();
            int n = queue.size();
            for (int i = 0; i < n; i++) {
                TreeNode cur = queue.poll();
                row.add(cur.val);
                if (cur.left != null)
                    queue.add(cur.left);
                if (cur.right != null)
                    queue.add(cur.right);
            }
            res.add(row);
        }
        return res;
    }
}