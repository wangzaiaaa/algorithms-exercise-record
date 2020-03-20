package 剑指offer;

public class 二叉搜索树的最近公共祖先68 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return root;
        else if(p == null) return q;
        else if(q == null) return p;
        else if(p.val < root.val && q.val < root.val) return lowestCommonAncestor(root.left,p,q);
        else if(p.val > root.val && q.val > root.val) return lowestCommonAncestor(root.right,p,q);
        return root;
    }
}
