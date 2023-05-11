package Random;

/**
 * @title: Random.no_21
 * @description: 合并两个有序链表
 *      将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 * @author: 李旺旺
 * @date: 2023/2/28 21:34
 * @version: 1.0
 */

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
public class no_21 {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(-1);
        ListNode curr = head;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) { // 链表list1的值小
                curr.next = list1;
                list1 = list1.next;
            } else {
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }
        if (list1 == null) {
            curr.next = list2;
        } else {
            curr.next = list1;
        }
        return head.next;
    }
    public static void main(String[] args) {
        ListNode node1 = new ListNode();
        node1.val = 1;

        ListNode n1 = new ListNode();
        node1.next = n1;
        n1.val = 2;

        ListNode n2 = new ListNode();
        n1.next = n2;
        n2.val = 4;

        ListNode node2 = new ListNode();
        node2.val = 1;

        ListNode m1 = new ListNode();
        node2.next = m1;
        m1.val = 3;

        ListNode m2 = new ListNode();
        m1.next = m2;
        m2.val = 4;

        ListNode l1 = node1;
        ListNode l2 = node1;

        ListNode rr = mergeTwoLists(node1, node2);
        while (rr != null) {
            System.out.print(rr.val + " ");
            rr = rr.next;
        }
    }
}
