package 剑指offer;

import java.util.ArrayList;

public class 和为s的连续正数序列57 {
    public static int[][] findContinuousSequence(int target) {
        if(target <= 2){
            return new int[0][0];
        }else{
            ArrayList<ArrayList<Integer>> res = new ArrayList<>();
            int l = 1,r = 2,cur = 3;
            while (r <= target / 2 + 1){
                if(cur < target){
                    r += 1;
                    cur += r;
                }else if(cur == target){
                    ArrayList<Integer> list = new ArrayList<>();
                    for(int i = l; i <= r; i++){
                        list.add(i);
                    }
                    res.add(list);
                    cur -= l;
                    l++;
                }else{
                    while (target <= cur){
                        cur -= l;
                        l++;
                        if(cur == target){
                            ArrayList<Integer> list = new ArrayList<>();
                            for(int i = l; i <= r; i++){
                                list.add(i);
                            }
                            res.add(list);
                        }
                    }
                }
            }
            int [][] ans = new int[res.size()][];
            for(int i = 0; i < res.size(); i++){
                ArrayList<Integer> curList = res.get(i);
                ans[i] = new int[curList.size()];
                for(int j = 0; j < curList.size(); j++){
                    ans[i][j] = curList.get(j);
                }
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        System.out.println(findContinuousSequence(7));
    }
}
