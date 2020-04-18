package leetcode;

public class 盛最多水的容器11 {
    public int maxArea(int[] height) {
        if(height == null || height.length <= 1){
            return 0;
        }
        int l = 0,r = height.length - 1,res = 0;
        while(l < r){
            res = Math.max(res,Math.min(height[l],height[r]) * (r-l));
            if(height[l] > height[r]) r--;
            else l++;
        }
        return res;
    }
}
