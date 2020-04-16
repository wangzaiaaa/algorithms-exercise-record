package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 在每个树行中找最大值515 {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        queue.offer(null);
        int max = Integer.MIN_VALUE;
        TreeNode node;
        while (!queue.isEmpty()){
            node = queue.poll();
            if(node != null){
                max = Math.max(max,node.val);
                if(node.left != null){
                    queue.offer(node.left);
                }
                if(node.right != null){
                    queue.offer(node.right);
                }
            }else{
                res.add(max);
                if(queue.size() > 0){
                    queue.offer(null);
                    max = Integer.MIN_VALUE;
                }
            }
        }
        return res;
    }
}
