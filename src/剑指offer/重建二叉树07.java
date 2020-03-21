package 剑指offer;

public class 重建二叉树07 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder == null || inorder == null || preorder.length != inorder.length){
            return null;
        }else{
            return buildTree(preorder,inorder,0,preorder.length-1,0,inorder.length-1);
        }
    }

    public TreeNode buildTree(int [] pre,int [] in,int ps,int pe,int is,int ie){
        if(ps > pe) return null;
        TreeNode node = new TreeNode(pre[ps]);
        int val = pre[ps];
        int index = is;
        while (index <= ie && in[index] != val) index++;
        node.left = buildTree(pre,in,ps+1,ps+index-is,is,index-1);
        node.right = buildTree(pre,in,ps+index-is+1,pe,index+1,ie);
        return node;
    }
}
