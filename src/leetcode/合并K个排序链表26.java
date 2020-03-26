package leetcode;

import java.util.PriorityQueue;

public class 合并K个排序链表26 {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0){
            return null;
        }else{
            PriorityQueue<ListNode> pq = new PriorityQueue<>((l1,l2) -> (l1.val - l2.val));
            ListNode res = new ListNode(0),cur = res,node = null;
            for(int i = 0; i < lists.length; i++){
                if(lists[i] != null){
                    pq.offer(lists[i]);
                }
            }
            while (!pq.isEmpty()){
                node = pq.poll();
                cur.next = node;
                cur = cur.next;
                node = node.next;
                if(node != null){
                    pq.offer(node);
                }
            }
            return res.next;
        }
    }
}
