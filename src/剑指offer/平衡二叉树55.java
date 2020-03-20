package 剑指offer;

public class 平衡二叉树55 {
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        if(Math.abs(height(root.right)-height(root.left)) > 1) return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }
    public int height(TreeNode node){
        return node == null ? 0 : 1 + Math.max(height(node.left),height(node.right));
    }
}
