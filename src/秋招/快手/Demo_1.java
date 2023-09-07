package 秋招.快手;

/**
 * @ClassName: Demo_1
 * @Description:
 * @Author: lww
 * @Date: 8/31/23 11:24 AM
 * @Version: V1
 **/

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val; this.next = next;
    }
}

public class Demo_1 {
    public static void main(String[] args) {
        ListNode head = new ListNode();
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        ListNode res = reverseList(head);
        while (res.next != null) {
            System.out.print(res.val + " ");
            res = res.next;
        }
    }
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null; // 定义一个指向当前节点前一个节点的指针，初始值为null
        ListNode curr = head; // 定义一个指向当前节点的指针，初始值为head
        while (curr != null) { // 当当前节点不为null时执行循环
            ListNode next = curr.next; // 定义一个指向当前节点后一个节点的指针
            curr.next = prev; // 将当前节点指向前一个节点，实现反转链表的操作
            prev = curr; // 将prev指针移动到下一个节点
            curr = next; // 将curr指针移动到下一个节点
        }
        return prev; // 返回反转后的链表的头节点
    }
}

