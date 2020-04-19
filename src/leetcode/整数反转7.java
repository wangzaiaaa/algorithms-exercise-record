package leetcode;

public class 整数反转7 {
    public int reverse(int x) {
        int max = Integer.MAX_VALUE,min = Integer.MIN_VALUE;
        public int reverse(int x) {
            long res = 0;
            while(x != 0){
                res = res * 10 + x % 10;
                x /= 10;
                if(res < min || res > max) return 0;
            }
            return (int)res;
        }
    }
}
