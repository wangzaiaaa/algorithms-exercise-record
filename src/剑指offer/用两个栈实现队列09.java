package 剑指offer;

import java.util.Stack;

public class 用两个栈实现队列09 {
    Stack<Integer> s1 = new Stack<>(),s2 = new Stack<>();

    public void appendTail(int value) {
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        s1.push(value);
    }

    public int deleteHead() {
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        if(s2.isEmpty()){
            return -1;
        }
        return s2.pop();
    }
}
