package 剑指offer;

import java.util.*;

/**
 * @ClassName: no_9
 * @Description: 用两个栈实现队列
 * @Author: lww
 * @Date: 2023/5/11 15:22
 * @Version: V1
 **/
public class no_9 {
    /*
    用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，
    分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead操作返回 -1 )
     */

    LinkedList<Integer> A, B;
    public void CQueue() {
        A = new  LinkedList<Integer>();
        B = new  LinkedList<Integer>();
    }
    // 尾部添加
    public void appendTail(int value) {
        A.addLast(value);
    }
    // 删除头部
    public int deleteHead() {
        if (!B.isEmpty()) return B.removeLast();
        if (A.isEmpty()) return -1;
        while (!A.isEmpty()) {
            B.addLast(A.removeLast());
        }
        return B.removeLast();
    }

    /**
     * Your CQueue object will be instantiated and called as such:
     * CQueue obj = new CQueue();
     * obj.appendTail(value);
     * int param_2 = obj.deleteHead();
     */

}