package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class 找树左下角的值513 {
    public int findBottomLeftValue(TreeNode root) {
        if(root == null){
            return -1;
        }
        int res = root.val;
        boolean flag = false;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        queue.offer(null);
        TreeNode node;
        while (!queue.isEmpty()){
            node = queue.poll();
            if (node != null){
                if(node.left != null){
                    queue.offer(node.left);
                }
                if(node.right != null){
                    queue.offer(node.right);
                }
                if(!flag){
                    res = node.val;
                    flag = true;
                }
            }else{
                if(queue.size() > 0){
                    queue.offer(null);
                    flag = false;
                }
            }
        }
        return res;
    }
}
