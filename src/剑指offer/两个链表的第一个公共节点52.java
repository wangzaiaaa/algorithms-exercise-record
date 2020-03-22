package 剑指offer;

import java.util.HashSet;
import java.util.Set;

public class 两个链表的第一个公共节点52 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }else{
            Set<ListNode> set = new HashSet<>();
            ListNode tmp = headA;
            while (tmp != null){
                set.add(tmp);
                tmp = tmp.next;
            }
            tmp = headB;
            while (tmp != null){
                if(set.contains(tmp)){
                    return tmp;
                }
                tmp = tmp.next;
            }
            return null;
        }
    }
}
