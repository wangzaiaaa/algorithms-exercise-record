package 剑指offer;

public class 斐波那契数列10 {
    public int fib(int n) {
        int f1 = 0,f2 = 1;
        if(n == 0) return 0;
        else if(n == 1) return 1;
        else{
            int tmp = 0;
            while(n >= 2){
                tmp = f2;
                f2 = (f1 + f2) % 1000000007;
                f1 = tmp;
                n--;
            }
            return (f2 % 1000000007);
        }
    }
}
