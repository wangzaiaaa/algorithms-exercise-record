package leetcode;

public class 删除排序链表中的重复元素82 {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }else{
            ListNode res = new ListNode(Integer.MIN_VALUE);
            res.next = head;
            ListNode cur = res;
            while(cur.next != null && cur.next.next != null){
                if(cur.next.val == cur.next.next.val){
                    ListNode tmp = cur.next;
                    while(tmp != null && tmp.next != null && tmp.val == tmp.next.val){
                        tmp = tmp.next;
                    }
                    cur.next = tmp.next;
                }else{
                    cur = cur.next;
                }
            }
            return res.next;
        }
    }
}
