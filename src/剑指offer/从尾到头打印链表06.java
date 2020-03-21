package 剑指offer;

import java.util.Stack;
class ListNode{
    int val;
    ListNode next;
    ListNode(int v){
        this.val = v;
    }
}
public class 从尾到头打印链表06 {
    public int[] reversePrint(ListNode head) {
        if(head == null) return new int[0];
        else{
            Stack<Integer> stack = new Stack<>();
            while(head != null){
                stack.push(head.val);
                head = head.next;
            }
            int [] res = new int[stack.size()];
            int i = 0;
            while(!stack.isEmpty()){
                res[i++] = stack.pop();
            }
            return res;
        }
    }
}
