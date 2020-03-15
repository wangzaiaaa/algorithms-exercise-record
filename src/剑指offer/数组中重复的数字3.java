package 剑指offer;

import java.util.HashSet;
import java.util.Set;

public class 数组中重复的数字3 {
    public int findRepeatNumber(int[] nums) {
        if(nums == null || nums.length == 0) return -1;
        int res = -1;
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(set.contains(nums[i])){
                res = nums[i];
                break;
            }
            set.add(nums[i]);
        }
        return res;
    }
}
