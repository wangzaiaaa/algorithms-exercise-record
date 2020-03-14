package leetcode;
import java.util.*;
public class 最长上升子序列300 {
    public int lengthOfLIS(int[] nums) {
        if(nums == null || nums.length ==0) return 0;
        int [] dp = new int [nums.length];
        dp[0] = 1;
        int res = 1,tmp = 0;
        Arrays.fill(dp,1);
        for(int i = 1; i < nums.length; i++){
            for(int j = i - 1; j >= 0; j--){
                if(nums[i] > nums[j]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
            res = Math.max(res,dp[i]);
        }
        return res;
    }
}
