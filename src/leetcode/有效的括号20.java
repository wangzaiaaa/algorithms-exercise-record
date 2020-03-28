package leetcode;

import java.util.Stack;

public class 有效的括号20 {
    public boolean isValid(String s) {
        if(s == null || s.length() == 0){
            return true;
        }else{
            Stack<Character> stack = new Stack<>();
            for(int i = 0; i < s.length(); i++){
                char c = s.charAt(i);
                if(c == '(' || c == '[' || c == '{'){
                    stack.push(c);
                }else{
                    if(c == ')'){
                        if(stack.isEmpty() || stack.pop() != '('){
                            return false;
                        }
                    }
                    if(c == ']'){
                        if(stack.isEmpty() || stack.pop() != '['){
                            return false;
                        }
                    }
                    if(c == '}'){
                        if(stack.isEmpty() || stack.pop() != '{'){
                            return false;
                        }
                    }
                }
            }
            return stack.isEmpty();
        }
    }
}
