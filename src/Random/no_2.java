package Random;

/**
 * @ClassName: no_2
 * @Description: 两数之和
 * @Author: lww
 * @Date: 7/2/23 12:26 PM
 * @Version: V1
 **/
public class no_2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
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