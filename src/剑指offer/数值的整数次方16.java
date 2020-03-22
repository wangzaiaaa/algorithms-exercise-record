package 剑指offer;

public class 数值的整数次方16 {
    public double myPow(double x, int n) {
        if (x == 0) return 0;
        else if(n == 1) return x;
        else{
            long exponent = n;
            if(n < 0){
                x = 1 / x;
                exponent = -exponent;
            }
            double res = 1.0;
            while (exponent > 0){
                if((exponent & 1) == 1) res *= x;
                x *= x;
                exponent >>= 1;

            }
            return res;
        }
    }
}
