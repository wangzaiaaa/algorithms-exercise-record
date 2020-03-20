package 剑指offer;

public class 在排序数组中查找数字53 {
    public int search(int[] nums, int target) {
        if(nums == null || nums.length == 0) return 0;
        int right = 0,left = 0,i = 0,j = nums.length - 1;
        while (i <= j){
            int m = i + ((j-i) >> 1);
            if(target < nums[m]) j = m - 1;
            else i = m + 1;
        }
        right = i;
        i = 0;
        j = nums.length - 1;
        while (i <= j){
            int m = i + ((j - i) >> 1);
            if(nums[m] < target) i = m + 1;
            else j = m - 1;
        }
        left = j;
        return right - left - 1;

    }
}
