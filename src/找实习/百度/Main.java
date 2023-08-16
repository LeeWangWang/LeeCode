package 找实习.百度;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int flag = 0;
        int index = 0;
        int c = 1;
        StringBuilder builder = new StringBuilder("");
        while (n > 0) {
            flag = 0;
            for (int i = 0; i < 1000000; i++) {
                flag += i;
                if (flag > n) {
                    flag -= i;
                    index = i-1;
                    break;
                }
            }
            if (c == 1) {
                for (int i = 0; i < index; i++) {
                    builder.append("r");
                }
                c++;
            } else if (c == 2) {
                for (int i = 0; i < index; i++) {
                    builder.append("e");
                }
                c++;
            } else {
                for (int i = 0; i < index; i++) {
                    builder.append("d");
                }
                c = 1;
            }
            n = n - flag;
        }
        System.out.println(builder.toString());
    }
}


/*
class TreeNode {
    char color;
    List<TreeNode> friends;

    public TreeNode(char color) {
        this.color = color;
        friends = new ArrayList<>();
    }

    void setFriend(TreeNode node) {
        friends.add(node);
    }
}

public class Main {

    static int getDfs(TreeNode node, TreeNode pre) {
        int sum = 1;
        for(TreeNode friend : node.friends) {
            if (friend != pre) {
                int result = getDfs(friend, node);
                if (friend.color != node.color) {
                    sum += result;
                } else {
                    sum += result - 1;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        TreeNode[] treeNodes = new TreeNode[n];
        char[] colors = scanner.next().toCharArray();
        for (int i = 0; i < n; i++) {
            treeNodes[i] = new TreeNode(colors[i]);
        }
        int[][] res = new int[n-1][2];
        for (int i = 1; i < n; i++) {
            int u = scanner.nextInt() - 1;
            int v = scanner.nextInt() - 1;
            res[i-1] = new int[]{u, v};

            treeNodes[u].setFriend(treeNodes[v]);
            treeNodes[v].setFriend(treeNodes[u]);
        }
        int sum = 0;
        for (int i = 0; i < res.length; i++) {
            int num1 = getDfs(treeNodes[res[i][0]], treeNodes[res[i][1]]);
            int num2 = getDfs(treeNodes[res[i][1]], treeNodes[res[i][0]]);
            sum += num1 > num2 ? num1-num2 : num2-num1;
        }
        System.out.println(sum);
    }
}*/


/*

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int n = Integer.parseInt(s);
        String[] strs = new String[n];
        for (int i = 0; i < n; i++) {
            strs[i] = scanner.nextLine();
        }
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            if (strs[i].length() != 5) {
                result[i] = "No";
            } else {
                if (strs[i].contains("B") && strs[i].contains("a") && strs[i].contains("i") &&
                        strs[i].contains("d") && strs[i].contains("u")) {
                    result[i] = "Yes";
                } else {
                    result[i] = "No";
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(result[i]);
        }
    }
}
 */

/*
4
Baidu
baidu
Baidu
bbdu
 */
