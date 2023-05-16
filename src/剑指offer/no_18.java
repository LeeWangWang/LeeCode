package 剑指offer;

/**
 * @ClassName no_18
 * @Description TODO
 * @Author JoshLee
 * @Date 2023/5/16 21:49
 * @Version: V1
 */
public class no_18 {
    public ListNode deleteNode(ListNode head, int val) {
        if (head.val == val) head = head.next;
        ListNode cur = head.next;
        ListNode before = head;
        while (cur != null) {
            if (cur.val == val) {
                before.next = cur.next;
            }
            cur = cur.next;
            before = before.next;
        }
        return head;
    }
}


