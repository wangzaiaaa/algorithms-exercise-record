package 剑指offer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class 第一个只出现一次的字符50 {
    public char firstUniqChar(String s) {
        if(s == null || s.equals("")) return ' ';
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            map.put(c,map.getOrDefault(c,0) + 1);
        }
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(map.get(c) == 1){
                return c;
            }
        }
        return ' ';
    }
}
