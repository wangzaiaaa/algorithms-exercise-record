package leetcode;

import java.util.Arrays;

public class 最短无序连续子数组581 {
    public int findUnsortedSubarray(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }else{
            int [] sorted = Arrays.copyOf(nums,nums.length);
            Arrays.sort(sorted);
            int left = Integer.MAX_VALUE,right = Integer.MIN_VALUE;
            for (int i = 0; i < nums.length; i++){
                if(nums[i] != sorted[i]){
                    left = Math.min(i,left);
                    right = Math.max(right,i);
                }
            }
            return left >= right ? 0 : right - left + 1;
        }
    }
}
