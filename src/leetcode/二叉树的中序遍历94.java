package leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
public class 二叉树的中序遍历94 {
    List<Integer> res = new LinkedList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null){
            return res;
        }else{
            Stack<TreeNode> stack = new Stack<>();
            TreeNode tmp = root,node = null;
            while (tmp != null || !stack.isEmpty()){
                while (tmp != null){
                    stack.push(tmp);
                    tmp = tmp.left;
                }
                node = stack.pop();
                res.add(node.val);
                if(node.right != null){
                    tmp = node.right;
                }
            }
            return res;
        }
    }


}
