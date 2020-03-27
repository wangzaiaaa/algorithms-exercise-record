package leetcode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class 卡牌分组914 {
    public boolean hasGroupsSizeX(int[] deck) {
        if(deck == null || deck.length == 0){
            return false;
        }else{
            int [] counts = new int[10000];
            for(int i = 0; i < deck.length; i++){
                counts[deck[i]]++;
            }
            int gcd = 0;
            for(int i = 0; i < counts.length; i++){
                if(i == 0){
                    gcd = counts[i];
                }else{
                    if(counts[i] != 0){
                        gcd = gcd(gcd,counts[i]);
                    }
                }
            }
            return gcd >= 2;
        }
    }
    public int gcd(int a,int b){
        int tmp = 0;
        while (b != 0){
            tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }
}

