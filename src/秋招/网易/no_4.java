package 秋招.网易;

import java.util.*;

/**
 * @ClassName: no_4
 * @Description:
 * @Author: lww
 * @Date: 9/23/23 2:38 PM
 * @Version: V1
 **/


class TreeNode {
    public int value;
    public List<TreeNode> children;
    public TreeNode(int value) {
        this.value = value;
        this.children = new ArrayList<>();
    }
}
public class no_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        ArrayList<Integer> res = new ArrayList<>();
        TreeNode[] nodes = new TreeNode[n];
        for (int i = 0; i < n; i++) {
            nodes[i] = new TreeNode(i+1);
        }
        for (int i = 0; i < n - 1; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            nodes[u-1].children.add(nodes[v-1]);
            nodes[v-1].children.add(nodes[u-1]);
        }

        for (int i = 0; i < q; i++) {
            int m = sc.nextInt();
            Set<Integer> targetNode = new HashSet<>();
            for (int j = 0; j < m; j++) {
                int node = sc.nextInt();
                targetNode.add(node);
            }
            int pathNeed = minPaths(nodes[0], null, targetNode);
            res.add(pathNeed);
        }
        for (Integer element : res) {
            System.out.println(element);
        }
    }
    public static int minPaths(TreeNode node, TreeNode parent, Set<Integer> targetNodes) {
        if (targetNodes.contains(node.value)) {
            targetNodes.remove(node.value);
        }
        List<Integer> childrenPath = new ArrayList<>();
        for (TreeNode child : node.children) {
            if (child != parent) {
                List<Integer> childPath = new ArrayList<>();
                int childPathsNeed = minPaths(child, node, targetNodes);
                if (childPathsNeed > 0) {
                    childPath.add(childPathsNeed);
                }
                childrenPath.addAll(childPath);
            }
        }
        if (targetNodes.isEmpty()) {
            return childrenPath.size();
        } else {
            return 1 + childrenPath.size();
        }
    }
}









