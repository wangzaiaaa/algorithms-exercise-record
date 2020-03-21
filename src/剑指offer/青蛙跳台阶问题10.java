package 剑指offer;

public class 青蛙跳台阶问题10 {
    public int numWays(int n) {
        int f1 = 1,f2 = 2;
        if(n == 0) return 1;
        else if(n == 1) return 1;
        else{
            int tmp = 0;
            while(n > 2){
                tmp = f2;
                f2 = (f1 + f2) % 1000000007;
                f1 = tmp;
                n--;
            }
            return (f2 % 1000000007);
        }
    }
}
