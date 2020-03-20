package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class 二叉树的后序遍历145 {
    List<Integer> res = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root == null){
            return res;
        }else{
            Stack<TreeNode> stack = new Stack<>();
            stack.push(root);
            TreeNode node = null;
            while (!stack.isEmpty()){
                node = stack.pop();
                res.add(node.val);
                if(node.left != null){
                    stack.push(node.left);
                }
                if(node.right != null){
                    stack.push(node.right);
                }
            }
            Collections.reverse(res);
            return res;
        }
    }
}
