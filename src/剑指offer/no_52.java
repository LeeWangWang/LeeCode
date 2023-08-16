package 剑指offer;

import java.util.HashMap;

/**
 * @ClassName: no_52
 * @Description:
 * @Author: lww
 * @Date: 2023/6/27 21:37
 * @Version: V1
 **/
public class no_52 {
    ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode A = headA, B = headB;
        while (A != B) {
            A = A != null ? A.next : headB;
            B = B != null ? B.next : headA;
        }
        return A;

    }
}