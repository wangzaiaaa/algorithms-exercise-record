package leetcode;

import java.util.Stack;

public class 链表中的下一个更大节点1019 {
    public int[] nextLargerNodes(ListNode head) {
        if(head == null){
            return new int[0];
        }else if(head.next == null){
            return new int[1];
        }else{
            int len = getLenOfListNode(head);
            int [] data = new int[len];
            int [] res = new int[len];
            Stack<Integer> stack = new Stack<>();
            int index = 0;
            while (head != null){
                data[index++] = head.val;
                head = head.next;
            }
            for(int i = 0; i < len; i++){
                if(stack.isEmpty() || data[stack.peek()] >= data[i]){
                    stack.push(i);
                }else{
                    while (!stack.isEmpty() && data[stack.peek()] < data[i]){
                        res[stack.pop()] = data[i];
                    }
                    stack.push(i);
                }
            }
            return res;
        }
    }
    public int getLenOfListNode(ListNode head){
        return head == null ? 0 : 1 + getLenOfListNode(head.next);
    }
}
