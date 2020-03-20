package 剑指offer;

public class 调整数组顺序使奇数位于偶数前面21 {
    public int[] exchange(int[] nums) {
        if(nums == null || nums.length == 0) return nums;
        int l = 0,r = nums.length - 1;
        while (l < r){
            while (l < nums.length && (nums[l] & 1) == 1) l++;
            while (r >= 0 && (nums[r] & 1) == 0) r--;
            if(l >= r) break;
            swap(nums,l,r);
        }
        return nums;
    }
    public void swap(int [] nums,int i,int j){
        nums[i] = nums[i] ^ nums[j];
        nums[j] = nums[i] ^ nums[j];
        nums[i] = nums[i] ^ nums[j];
    }
}
