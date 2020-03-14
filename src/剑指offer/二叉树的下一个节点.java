package 剑指offer;
class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}
public class 二叉树的下一个节点 {

    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        if(pNode == null) return null;
        TreeLinkNode res = null;
        if(pNode.right != null){
            res = pNode.right;
            while(res.left != null){
                res = res.left;
            }
        }else{
            TreeLinkNode parent = pNode.next;
            while(parent != null && parent.right == pNode){
                pNode = parent;
                parent = parent.next;
            }
            res = parent;
        }
        return res;
    }
}




