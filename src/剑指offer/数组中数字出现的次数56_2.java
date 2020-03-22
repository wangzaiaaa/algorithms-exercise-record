package 剑指offer;

public class 数组中数字出现的次数56_2 {
    public int singleNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }else{
            int res = 0;
            for (int i = 0; i <= 31; i++){
                int num = 0;
                for(int j = 0; j < nums.length; j++){
                    num += ((nums[j] >> i) & 1);
                }
                res += ((num % 3) << i);
            }
            return res;
        }
    }
}
