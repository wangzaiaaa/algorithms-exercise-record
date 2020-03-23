package 剑指offer;

import java.util.LinkedList;
import java.util.Queue;

public class 滑动窗口的最大值59 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums == null || nums.length == 0 || k <= 1){
            return nums;
        }else{
            LinkedList<Integer> queue = new LinkedList<>();
            int [] res = new int[nums.length - k + 1];
            int index = 0;
            for (int i = 0; i < nums.length; i++){
                while (!queue.isEmpty() && nums[i] >= nums[queue.peekLast()]){
                    queue.pollLast();
                }
                queue.offerLast(i);
                if(i - queue.peekFirst() == k){
                    queue.pollFirst();
                }
                if(i >= k){
                    res[index++] = nums[queue.peekFirst()];
                }
            }
            return res;
        }
    }
}
