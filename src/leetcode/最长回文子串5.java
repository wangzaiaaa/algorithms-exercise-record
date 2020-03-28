package leetcode;

public class 最长回文子串5 {
    public String longestPalindrome(String s) {
        if(s == null || s.length() == 0){
            return s;
        }else{
            String res = s.substring(0,1);
            for(int i = 0; i < s.length(); i++){
                int [] arr1 = expand(s,i,i);
                int [] arr2 = expand(s,i,i+1);
                if(arr1[1] - arr1[0] - 1 > res.length()){
                    res = s.substring(arr1[0]+1,arr1[1]);
                }
                if(arr2[1] - arr2[0] - 1 > res.length()){
                    res = s.substring(arr2[0]+1,arr2[1]);
                }
            }
            return res;
        }
    }
    public int[] expand(String s,int l,int r){
        while(l >=0 && r < s.length() && s.charAt(l) == s.charAt(r)){
            l--;
            r++;
        }
        return new int[]{l,r};
    }
}
