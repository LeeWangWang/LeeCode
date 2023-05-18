package 剑指offer;

/**
 * @ClassName: no_25
 * @Description: 合并两个排序的链表
 * @Author: lww
 * @Date: 2023/5/18 15:15
 * @Version: V1
 **/
public class no_25 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0), cur = head;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        if (l1 != null)
            cur.next = l1;
        else
            cur.next = l2;
        return head.next;
    }
}