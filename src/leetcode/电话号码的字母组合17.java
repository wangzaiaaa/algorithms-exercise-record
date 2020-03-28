package leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class 电话号码的字母组合17 {
    public List<String> letterCombinations(String digits) {
        List<String> list = new LinkedList<>();
        if(digits == null || digits.length() == 0){
            return list;
        }else{
            dfs(list,"",0,digits);
            return list;
        }

    }
    public void dfs(List<String> list,String sb,int layel,String digits){
        if(layel == digits.length()){
            list.add(sb.toString());
        }else{
            String s = getCurString(digits.charAt(layel));
            for(int i = 0; i < s.length(); i++){
                dfs(list,sb + s.charAt(i),layel + 1,digits);
            }
        }
    }
    public String getCurString(char num){
        String res = "";
        switch (num){
            case '2' : res = "abc"; break;
            case '3' : res = "def"; break;
            case '4' : res = "ghi"; break;
            case '5' : res = "jkl"; break;
            case '6' : res = "mno"; break;
            case '7' : res = "pqrs"; break;
            case '8' : res = "tuv"; break;
            case '9' : res = "wxyz"; break;
        }
        return res;
    }
}
