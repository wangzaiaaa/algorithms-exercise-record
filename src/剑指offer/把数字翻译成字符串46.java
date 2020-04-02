package 剑指offer;

public class 把数字翻译成字符串46 {
    public static int translateNum(int num) {
        if(num >= 0 && num <= 9){
            return 1;
        }
        String s = String.valueOf(num);
        int [] dp = new int[s.length()];
        dp[0] = 1;
        for (int i = 1; i < s.length(); i++){
            if(check(s,i)){
                dp[i] = dp[i-1] + 1;
            }else{
                dp[i] = dp[i-1];
            }
        }
        return dp[s.length() - 1];
    }
    public static boolean check(String s,int i){
        int num = Integer.valueOf(s.substring(i-1,i+1));
        return num >= 10 && num <= 25;
    }

    public static void main(String[] args) {
        System.out.println(translateNum(25));
    }
}
