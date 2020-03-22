package leetcode;
class ListNode{
    int val;
    ListNode next;
    ListNode(int v){
        this.val = v;
    }
}
public class 两两交换链表中的节点24 {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }else{
            ListNode l1 = head,l2 = head.next,tmp = l2.next;
            l2.next = l1;
            l1.next = swapPairs(tmp);
            return l2;
        }
    }
}
