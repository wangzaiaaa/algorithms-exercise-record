package DailyClock;

public class 按摩师20200324 {
    class Solution {
        public int massage(int[] nums) {
            if(nums == null || nums.length == 0){
                return 0;
            }else{
                int [] dp = new int[nums.length];

                dp[0] = nums[0];
                int res = dp[0];
                for(int i = 1; i < nums.length; i++){
                    if(i > 1){
                        dp[i] = Math.max(dp[i-1],dp[i-2] + nums[i]);

                    }else{
                        dp[i] = Math.max(nums[i],dp[i-1]);
                    }
                    res = Math.max(res,dp[i]);
                }
                return res;
            }
        }
    }
}
