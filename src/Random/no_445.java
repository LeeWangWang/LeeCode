package Random;

/**
 * @ClassName: no_445
 * @Description:
 * @Author: lww
 * @Date: 7/3/23 10:07 AM
 * @Version: V1
 **/
public class no_445 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverseList(l1);
        l2 = reverseList(l2);
        ListNode l3 = addTwo(l1, l2);
        return reverseList(l3);
    }

    // 反转链表
    private ListNode reverseList(ListNode head) {
        ListNode pre = null, cur = head;
        while (cur != null) {
            ListNode nxt = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nxt;
        }
        return pre;
    }

    // 链表之和
    private ListNode addTwo(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode cur = head;
        int pre = 0;
        while (l1 != null || l2 != null) {
            int x = l1 == null ? 0 : l1.val;
            int y = l2 == null ? 0 : l2.val;

            int sum = x + y + pre;

            pre = sum/ 10;
            sum = sum % 10;
            cur.next = new ListNode(sum);

            cur = cur.next;
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }
        if (pre == 1)
            cur.next = new ListNode(pre);
        return head.next;
    }

}