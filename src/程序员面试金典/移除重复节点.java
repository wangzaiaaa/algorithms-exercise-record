package 程序员面试金典;

import java.util.HashSet;
import java.util.Set;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
public class 移除重复节点 {
    public ListNode removeDuplicateNodes(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }else{
            ListNode res = new ListNode(-1),pre = res,cur = head;
            pre.next = head;
            Set<Integer> set = new HashSet<>();
            while (cur != null){
                if(!set.contains(cur.val)){
                    pre.next = cur;
                    pre = pre.next;
                    set.add(cur.val);
                    cur = cur.next;
                }else{
                    cur = cur.next;
                }
            }
            pre.next = null;
            return res.next;
        }
    }
}
