package 剑指offer;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class 队列的最大值59 {
    Queue<Integer> queue = new LinkedList();
    Deque<Integer> asist = new LinkedList();


    public int max_value() {
        if(asist.isEmpty()){
            return -1;
        }
        return asist.peek();
    }

    public void push_back(int value) {
        queue.offer(value);
        while (!asist.isEmpty() && asist.peekLast() < value){
            asist.pollLast();
        }
        asist.offerLast(value);
    }

    public int pop_front() {
        if(queue.isEmpty()){
            return -1;
        }
        int res = queue.poll();
        if(!asist.isEmpty() && asist.peekFirst() == res){
            asist.pollFirst();
        }
        return res;
    }
}
