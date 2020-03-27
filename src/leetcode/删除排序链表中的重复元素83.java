package leetcode;

public class 删除排序链表中的重复元素83 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode res = new ListNode(Integer.MIN_VALUE);
        res.next = head;
        ListNode pre = res,cur = res.next;
        while(cur != null){
            while(cur != null && cur.val == pre.val){
                pre.next = cur.next;
                cur = cur.next;
            }
            if(cur != null){
                pre = pre.next;
                cur = cur.next;
            }

        }
        return res.next;
    }
}
