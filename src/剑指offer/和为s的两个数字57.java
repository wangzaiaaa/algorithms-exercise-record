package 剑指offer;

public class 和为s的两个数字57 {
    public int[] twoSum(int[] nums, int target) {
        if(nums == null || nums.length == 0){
            return nums;
        }else{
            int l = 0,r = nums.length - 1,cur = 0;
            while (l < r){
                cur = nums[l] + nums[r];
                if(cur == target){
                    return new int[]{nums[l],nums[r]};
                }else if(cur < target){
                    l++;
                }else {
                    r--;
                }
            }
            return new int[]{-1,-1};
        }
    }
}
