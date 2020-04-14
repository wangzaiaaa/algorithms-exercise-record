package leetcode;

import java.util.Stack;

public class 两数相加445 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        while (l1 != null){
            stack1.push(l1.val);
            l1 = l1.next;
        }
        while (l2 != null){
            stack2.push(l2.val);
            l2 = l2.next;
        }
        ListNode res = new ListNode(0),cur = res;
        int carry = 0,num1,num2;
        while (!stack1.isEmpty() || !stack2.isEmpty() || carry != 0){
            num1 = (stack1.isEmpty() ? 0 : stack1.pop());
            num2 = (stack2.isEmpty() ? 0 : stack2.pop());
            int num = (num1 + num2 + carry) % 10;
            carry = (num1 + num2 + carry) / 10;
            cur.next = new ListNode(num);
            cur = cur.next;
        }
        cur = res.next;
        ListNode pre = null;
        while (cur != null){
            ListNode tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        return pre;
    }
}
