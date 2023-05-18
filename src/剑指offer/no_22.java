package 剑指offer;

/**
 * @ClassName: no_22
 * @Description: 链表中倒数第k个节点
 * @Author: lww
 * @Date: 2023/5/18 14:38
 * @Version: V1
 **/
public class no_22 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode cur = head;
        ListNode flag = head;
        int length = 0;
        while (flag != null) {
            length++;
            flag = flag.next;
        }
        int res = length - k;
        while (res > 0) {
            cur = cur.next;
            res--;
        }
        return cur;
    }
}