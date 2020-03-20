package leetcode;



import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class 二叉树的前序遍历144 {
    List<Integer> list = new ArrayList<>();

    public void preorder(TreeNode root){
        if(root == null) return;
        else{
            list.add(root.val);
            preorder(root.left);
            preorder(root.right);
        }
    }
    //    public List<Integer> preorderTraversal(TreeNode root) {
//        preorder(root);
//        return list;
//    }
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null){
            return list;
        }else{
            Stack<TreeNode> stack = new Stack<>();
            stack.push(root);
            TreeNode node = null;
            while (!stack.isEmpty()){
                node = stack.pop();
                list.add(node.val);
                if(node.right != null){
                    stack.push(node.right);
                }
                if(node.left != null){
                    stack.push(node.left);
                }
            }
        }
        return list;
    }
}