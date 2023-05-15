package 剑指offer;

/**
 * @ClassName: no_6
 * @Description: 从尾到头打印链表
 * @Author: lww
 * @Date: 2023/5/11 15:09
 * @Version: V1
 **/

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class no_6 {
    /*
    输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
     */
    public static int[] reversePrint(ListNode head) {

        int length = 0, i = 0;
        ListNode flag = head;
        while (flag != null) {
            length++;
            flag = flag.next;
        }
        int[] num = new int[length];
        ListNode node = head;
        while (node != null) {
            num[length-1] = node.val;
            node = node.next;
            length--;
        }
        return num;
    }
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(3);
        ListNode node6 = new ListNode(6);
        ListNode node7 = new ListNode(9);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        int[] result = reversePrint(node1);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}