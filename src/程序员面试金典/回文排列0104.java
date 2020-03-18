package 程序员面试金典;

import java.util.HashSet;
import java.util.Set;

public class 回文排列0104 {
    public boolean canPermutePalindrome(String s) {
        if(s == null || s.length() == 0){
            return false;
        }else{
            Set<Character> set = new HashSet<>();
            for(int i = 0; i < s.length(); i++){
                char c = s.charAt(i);
                if (set.contains(c)){
                    set.remove(c);
                }else{
                    set.add(c);
                }
            }
            return set.size() <= 1;
        }
    }
}
