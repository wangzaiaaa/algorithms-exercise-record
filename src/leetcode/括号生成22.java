package leetcode;

import java.util.LinkedList;
import java.util.List;

public class 括号生成22 {
    List<String> ans = new LinkedList<>();
    public List<String> generateParenthesis(int n) {
        dfs("",0,0,n);
        return ans;
    }
    public void dfs(String cur,int l,int r,int n){
        if(l > n || r > n || r > l) return;
        else if(l == n && r == n){
            ans.add(cur);
        }else{
            dfs(cur + '(',l + 1,r,n);
            dfs(cur + ')',l,r + 1,n);
        }
    }
}
