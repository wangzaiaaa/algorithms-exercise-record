package leetcode;

import java.util.Map;
import java.util.Stack;

public class 最长有效括号32 {
    public static int longestValidParentheses(String s) {
        if(s == null || s.length() < 2){
            return 0;
        }
        int res = 0,cur = 0;
        int [] array = new int[s.length()];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
           char c = s.charAt(i);
           if(c == '('){
               stack.push(i);
           }else{
               if(!stack.isEmpty()){
                   stack.pop();
               }else{
                   array[i] = 1;
               }
           }
        }
        while (!stack.isEmpty()) array[stack.pop()] = 1;
        for(int i = 0; i < array.length; i++){
            System.out.printf(array[i] + " ");
        }
        res = find(array);
        return res;
    }
    public static int find(int [] array){
        int res = 0,l = 0,r = 0;
        while (l < array.length && r < array.length){
            while (l < array.length && array[l] != 0) l++;
            r = l;
            while (r < array.length && array[r] == 0) r++;
            res = Math.max(res,r - l);
            l = r;
        }
        return res;
    }

    public static void main(String[] args) {
        longestValidParentheses("(()");
    }

}
