package test.理想汽车;

/**
 * @ClassName: test01
 * @Description: TODO
 * @Author: lww
 * @Date: 2023/4/20 14:01
 * @Version: V1
 **/

class ListNode {
    int val;
    ListNode next = null;
    public ListNode(int val) {
        this.val = val;
    }
}

public class test01 {

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * @param root ListNode类
     * @param Num int整型
     * @return int整型
     */
    public int GetLastNumNode (ListNode root, int Num) {
        // write code here
        ListNode fast = root;
        ListNode slow = root;
        int flag = 0;
        if (root == null || Num == 0) {
            return -1;
        }
        for (int i = 0; i < Num; i++) {
            if (fast != null) {
                fast = fast.next;
            } else {
                return -1;
            }
        }
//        while (fast != null && Num > 0) {
//            fast = fast.next;
//            flag++;
//            Num--;
//        }
//        if(flag < Num) {
//            return -1;
//        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow.val;
    }
}