package Hot100;

/**
 * @ClassName: 链表逆序相加
 * @Description:
 * @Author: lww
 * @Date: 10/11/23 9:33 AM
 * @Version: V1
 **/
public class 链表逆序相加 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(4);
        ListNode l3 = new ListNode(3);
        l1.next = l2;
        l2.next = l3;
        soutListNode(l1);
        ListNode l4 = new ListNode(5);
        ListNode l5 = new ListNode(6);
        ListNode l6 = new ListNode(4);
        l4.next = l5;
        l5.next = l6;
        soutListNode(l4);
        ListNode listNode = addTwoNumbers(l1, l4);
        soutListNode(listNode);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode cur = head;
        int pre = 0;
        while (l1 != null || l2 != null) {
            // 存储两个节点的值
            int x = l1 == null ? 0 : l1.val;
            int y = l2 == null ? 0 : l2.val;

            // 求和
            int sum = x + y + pre;

            // 判断进位
            pre = sum > 9 ? 1 : 0;
            cur.next = new ListNode(sum%10);

            // 下一个节点
            cur = cur.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        if (pre == 1) {
            cur.next = new ListNode(1);
        }
        return head.next;
    }
    public static void soutListNode (ListNode list) {
        while (list != null) {
            System.out.print(list.val + " ");
            list = list.next;
        }
        System.out.println();
    }
}