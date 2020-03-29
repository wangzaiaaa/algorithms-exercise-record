package leetcode;

import java.util.Stack;

public class 验证二叉搜索树98 {
    public boolean isValidBST(TreeNode root) {
        double nextVal = -Double.MAX_VALUE;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root,node = null;
        while(cur != null || !stack.isEmpty()){
            while(cur != null){
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            if(cur.val <= nextVal) return false;
            nextVal = cur.val;
            cur = cur.right;
        }
        return true;
    }
}
