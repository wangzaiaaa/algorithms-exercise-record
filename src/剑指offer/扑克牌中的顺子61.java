package 剑指offer;

import java.util.Arrays;

public class 扑克牌中的顺子61 {
    public boolean isStraight(int[] nums) {
        if(nums == null || nums.length == 0){
            return false;
        }else{
            Arrays.sort(nums);
            int countOfZero = 0,index = 0,interval = 0;
            while (index < nums.length && nums[index] == 0){
                countOfZero++;
                index++;
            }

            while (index + 1 < nums.length){
                if(nums[index+1] == nums[index]) return false;
                interval += (nums[index+1] - nums[index] - 1);
                index++;
            }
            return countOfZero >= interval;
        }
    }
}
