package 秋招.小米;

import java.util.Arrays;

/**
 * @ClassName: Main
 * @Description:
 * @Author: lww
 * @Date: 9/13/23 3:05 PM
 * @Version: V1
 **/
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Main {

    public ListNode reverseBetween(ListNode head, int m, int n) {
        // 创建一个虚拟头结点，用于简化边界情况的处理
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head; // 将虚拟头结点指向原链表的头结点

        ListNode pre = dummyNode; // 初始化指向虚拟头结点
        for (int i = 0; i < m - 1; i++) {
            pre = pre.next; // 移动pre指针到第m-1个节点
        }
        ListNode cur = pre.next; // cur指向第m个节点
        ListNode next;

        // 反转从第m个节点到第n个节点的部分
        for (int i = 0; i < n - m; i++) {
            next = cur.next; // next指向cur的下一个节点
            cur.next = next.next; // 将cur的next指向next的下一个节点，实现节点反转
            next.next = pre.next; // 将next的next指向pre的next，将next插入到pre后面
            pre.next = next; // 更新pre的next，完成插入操作
        }
        return dummyNode.next; // 返回反转后的链表的头结点
    }

}





