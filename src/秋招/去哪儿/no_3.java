package 秋招.去哪儿;

import java.util.*;

/**
 * @ClassName: no_3
 * @Description: 80%
 * @Author: lww
 * @Date: 9/15/23 3:02 PM
 * @Version: V1
 **/
class ListNode {
    int val;
    ListNode next = null;
    public ListNode() {
    }
    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class no_3 {

    public static void main(String[] args) {
        ListNode n1 = new  ListNode(1);
        ListNode n2 = new  ListNode(2);
        ListNode n3 = new  ListNode(3);
        n1.next = n2;
        n2.next = n3;
        ListNode head = new ListNode();
        head.next = n1;
        System.out.println(lengthL(head));
    }

    public static int lengthL (ListNode head) {
        // write code here
        int length = 0;
        if (head == null) {
            return 0;
        }
        while (head.next != null) {
            length++;
            head = head.next;
        }
        return length;
    }
}