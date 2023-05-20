package 剑指offer;

import java.util.Stack;

/**
 * @ClassName no_30
 * @Description TODO
 * @Author JoshLee
 * @Date 2023/5/20 16:46
 * @Version: V1
 */
public class no_30 {
    Stack<Integer> A, B;
    public void MinStack() {
        A = new Stack<>();
        B = new Stack<>();
    }
    public void push(int x) {
        A.add(x);
        if (B.empty() || B.peek() >= x)
            B.add(x);
    }
    public void pop() {
        if (A.pop().equals(B.peek()))
            B.pop();
    }
    public int top() {
        return A.peek();
    }
    public int min() {
        return B.peek();
    }
}
