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
    public boolean isPalindrome(String s) {
        if(s == null || s.length() == 0){
            return false;
        }
        StringBuilder sb = new StringBuilder();
        char c;
        for(int i = 0; i < s.length(); i++){
            c = s.charAt(i);
            if(check(c)){
                sb.append(c);
            }
        }
        String str = sb.toString();
        String rev = sb.reverse().toString();
        return str.equalsIgnoreCase(rev);
    }
    public boolean check(char c){
        if((c >='0' && c <= '9') || (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')){
            return true;
        }
        return false;
    }
}
