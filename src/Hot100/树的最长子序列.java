package Hot100;

import java.util.*;

/**
 * @ClassName: 树的最长子序列
 * @Description:
 * @Author: lww
 * @Date: 10/11/23 6:33 PM
 * @Version: V1
 **/
class TreeNode {
    int val;
    List<TreeNode> children;
    TreeNode(int val) {
        this.val = val;
        this.children = new ArrayList<>();
    }
}

public class 树的最长子序列 {
    private static int longestConsecutive(TreeNode root) {
        if (root == null)
            return 0;
        return dfs(root, root.val, 0);
    }
    private static int dfs(TreeNode node, int target, int currentStreak) {
        if (node == null)
            return currentStreak;
        if (node.val == target + 1) {
            currentStreak++;
        } else {
            currentStreak = 1; // 重新开始计算
        }
        int maxStreak = currentStreak;
        for (TreeNode child : node.children) {
            maxStreak = Math.max(maxStreak, dfs(child, node.val, currentStreak));
        }
        return maxStreak;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);

        root.children.add(node2);
        root.children.add(node4);
        node2.children.add(node5);
        node2.children.add(node6);

        int longest = longestConsecutive(root);
        System.out.println("最长连续子序列的长度: " + longest); // 应该输出 3 (4 -> 5 -> 6)
    }
}