package 剑指offer;

/**
 * @ClassName: no_24
 * @Description: 反转链表
 * @Author: lww
 * @Date: 2023/5/18 14:45
 * @Version: V1
 **/
public class no_24 {
    public ListNode reverseList(ListNode head) {
        ListNode cur = head, pre = null;
        while (cur != null) {
            ListNode tem = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tem;
        }
        return pre;
    }
}