package 剑指offer;

import java.util.*;

public class n个骰子的点数60 {
    static Map<Integer,Integer> map = new HashMap<>();
    public static double[] twoSum(int n) {
        bfs(n,0,0);
        Set<Integer> set = map.keySet();
        int [] sortedSet = new int[set.size()];
        int index = 0;
        for(int num : set){
            sortedSet[index++] = num;
        }
        System.out.println();
        double[] res = new double[sortedSet.length];
        double total = Math.pow(6,n);
        index = 0;
        for(int num : sortedSet){
            res[index++] = map.get(num) / total;
        }
        return res;
    }
    public static void bfs(int n,int layel,int cur){
        if(layel > n){
            return;
        }else{
            if (layel == n){
                map.put(cur,map.getOrDefault(cur,0) + 1);
            }
            for(int i = 1; i <= 6; i++){
                bfs(n,layel + 1,cur + i);
            }
        }
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        double[] test = twoSum(10);
        long end = System.currentTimeMillis();
        for(double i : test){
            System.out.printf(i + " ");
        }
        System.out.println();
        System.out.println("cost " + (end - start) + " ms");
    }
}
