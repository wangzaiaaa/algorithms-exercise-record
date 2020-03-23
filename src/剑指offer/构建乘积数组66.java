package 剑指offer;

import java.util.Arrays;

public class 构建乘积数组66 {
    public int[] constructArr(int[] a) {
        if(a == null || a.length == 0){
            return a;
        }else{
            int [] left = new int[a.length];
            int [] right = new int[a.length];
            Arrays.fill(left,1);
            Arrays.fill(right,1);
            left[0] = a[0];
            right[right.length-1] = a[a.length-1];
            for(int i = 1; i < left.length; i++){
                left[i] = left[i-1] * a[i];
            }
            for(int i = right.length - 2;i >= 0; i--){
                right[i] = right[i+1] * a[i];
            }
            int [] res = new int[a.length];
            for(int i = 0; i < res.length; i++){
                if(i == 0){
                    res[i] = right[i+1];
                }else if(i == res.length - 1){
                    res[i] = left[i-1];
                }else{
                    res[i] = left[i-1] * right[i+1];
                }
            }
            return res;
        }
    }
}
