package leetcode;

import java.util.Arrays;
import java.util.PriorityQueue;

public class 最小的k个数40 {
    public int[] getLeastNumbers(int[] arr, int k) {
        if(arr == null || arr.length <= k){
            return arr;
        }else{
            PriorityQueue<Integer> pq = new PriorityQueue<>((o1,o2) -> (o2.compareTo(o1)));
            for(int i = 0; i < arr.length; i++){
                pq.offer(arr[i]);
                if(pq.size() > k){
                    pq.poll();
                }
            }
            int [] res = new int[pq.size()];
            for(int i = 0; i < res.length; i++){
                res[i] = pq.poll();
            }
            Arrays.sort(res);
            return res;
        }
    }
}
