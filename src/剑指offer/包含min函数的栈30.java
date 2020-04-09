package 剑指offer;

import java.util.Stack;

public class 包含min函数的栈30 {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> min = new Stack<>();
    /** initialize your data structure here. */

    public void push(int x) {
        stack.push(x);
        if(min.isEmpty() || x < min.peek()){
            min.push(x);
        }else{
            min.push(min.peek());
        }
    }

    public void pop() {
        if(!stack.isEmpty()){
            stack.pop();
            min.pop();
        }
    }

    public int top() {
        if(!stack.isEmpty()){
            return stack.peek();
        }
        return -1;
    }

    public int min() {
        if(!min.isEmpty()){
            return min.peek();
        }
        return -1;
    }
}
