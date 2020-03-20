package 剑指offer;

public class 数组中数字出现的次数56 {
    public int[] singleNumbers(int[] nums) {
        if(nums == null || nums.length < 2){
            return nums;
        }else{
            int res = 0;
            for (int i = 0; i < nums.length; i++){
                res = (res ^ nums[i]);
            }
            int k = findDiffDight(res);
            int num1 = 0,num2 = 0;
            for(int i = 0; i < nums.length; i++){
                if(((nums[i] >> k) & 1) == 1){
                    num1 = (num1 ^ nums[i]);
                }else{
                    num2 = (num2 ^ nums[i]);
                }
            }
            return new int[]{num1,num2};
        }

    }
    public int findDiffDight(int num){
        for(int i = 0; i <= 31; i++){
            if(((num >> i) & 1) == 1){
                return i;
            }
        }
        return -1;
    }
}
