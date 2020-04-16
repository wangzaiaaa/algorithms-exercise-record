package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class N叉树的层序遍历429 {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null){
            return null;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        queue.offer(null);
        Node node;
        List<Integer> list = new ArrayList<>();
        while (!queue.isEmpty()){
            node = queue.poll();
            if(node != null){
                list.add(node.val);
                for(Node child : node.children){
                    if(child != null){
                        queue.offer(child);
                    }
                }
            }else{
                res.add(list);
                if(queue.size() > 0){
                    queue.offer(null);
                    list = new ArrayList<>();
                }
            }
        }
        return res;
    }
}
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
