package 程序员面试金典;

public class 删除中间节点 {
    public void deleteNode(ListNode node) {
        if(node == null || node.next == null){
            return;
        }else{
            ListNode tmp = node.next;
            node.val = tmp.val;
            node.next = tmp.next;
        }
    }
}
