package leetcode;

public class 回文子串647 {
    public int countSubstrings(String s) {
        if(s == null || s.length() == 0){
            return 0;
        }else{
            int [][] dp = new int [s.length()][s.length()];
            int res = 0;
            for(int i = 0; i < s.length(); i++){
                dp[i][i] = 1;
                res++;
            }
            for(int i = 1; i < s.length(); i++){
                for(int j = 0; j < s.length() - i; j++){
                    int z = i + j;
                    if(s.charAt(j) == s.charAt(z) && (j + 1 == z || dp[j+1][z-1] == 1)){
                        dp[j][z] = 1;
                        res++;
                    }
                }
            }
            return res;
        }
    }
}
