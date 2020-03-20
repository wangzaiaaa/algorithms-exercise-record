package 剑指offer;

public class 二叉搜索树的第k大节点54 {
    public int kthLargest(TreeNode root, int k) {
        if(root == null || k <= 0) return -1;
        int num = sumOfTreeNode(root.right);
        if(num == k-1){
            return root.val;
        }else if(num > k-1){
            return kthLargest(root.right,k);
        }else{
            return kthLargest(root.left,k-num-1);
        }
    }
    public int sumOfTreeNode(TreeNode node){
        return node == null ? 0 : 1 + sumOfTreeNode(node.left) + sumOfTreeNode(node.right);
    }
}
