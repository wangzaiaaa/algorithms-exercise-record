package leetcode;

public class 旋转链表61 {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k <= 0){
            return head;
        }else{
            int len = 0;
            ListNode l1 = head,l2 = head;
            while (l1 != null){
                len++;
                l1 = l1.next;
            }
            ListNode [] arr = new ListNode[len];
            ListNode [] arr2 = new ListNode[len];
            int index = 0;
            while (l2 != null){
                arr[index++] = l2;
                l2 = l2.next;
            }
            k %= len;
            for(int i = 0; i < arr.length; i++){
                int targetIndex = (i + k) % len;
                arr2[targetIndex] = arr[i];
            }
            ListNode res = new ListNode(0),cur = res;
            for(int i = 0; i < len; i++){
                cur.next = arr2[i];
                cur = cur.next;
            }
            cur.next = null;
            return res.next;
        }
    }
}
