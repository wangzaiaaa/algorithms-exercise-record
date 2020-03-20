package 剑指offer;

public class 表示数值的字符串20 {
    int index = 0;
    public boolean isNumber(String s) {
        if(s == null || s.trim().equals("")){
            return false;
        }else{
            s = s.trim();
            boolean A = scanInteger(s),B = false;
            if(index < s.length() && s.charAt(index) == '.'){
                index++;
                B = scanUnsignedInteger(s);
            }
            if(index < s.length() && (s.charAt(index) == 'e' || s.charAt(index) == 'E')){
                index++;
                Boolean C = scanInteger(s);
                if(!C) return false;
            }
            return index == s.length() && (A || B);
        }
    }
    public boolean scanUnsignedInteger(String s){
        int start = index;
        while (index < s.length() && s.charAt(index) >= '0' && s.charAt(index) <= '9'){
            index++;
        }
        return index > start;
    }
    public boolean scanInteger(String s){
        if(index < s.length() && (s.charAt(index) == '+' || s.charAt(index) == '-')){
            index++;
        }
        return scanUnsignedInteger(s);
    }


}
