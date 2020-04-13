package leetcode;



public class 重排链表143 {
    public void reorderList(ListNode head) {
       if (head == null || head.next == null){
           return;
       }else{
           ListNode mid = findMiddle(head);
           ListNode node2 = reverseListNode(mid),node1 = head;
           while (node2 != null){
               ListNode tmp1 = node1.next,tmp2 = node2.next;
               node1.next = node2;
               node2.next = tmp1;
               node1 = tmp1;
               node2 = tmp2;
           }
       }
    }
    public ListNode findMiddle(ListNode head){
        if(head == null || head.next == null)
        {
            return head;
        }
        ListNode fast = head,slow = head;
        while (!(fast == null || fast.next == null)){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public ListNode reverseListNode(ListNode head){
        ListNode pre = null,cur = head,tmp = null;
        while (cur != null){
            tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        return cur;
    }
}
