package Hot100;

/**
 * @ClassName: ListNode
 * @Description: 定义单链表
 * @Author: lww
 * @Date: 10/11/23 9:33 AM
 * @Version: V1
 **/
public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}