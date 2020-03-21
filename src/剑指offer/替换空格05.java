package 剑指offer;

public class 替换空格05 {
    public String replaceSpace(String s) {
        if(s == null || s.equals("")) return s;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c != ' '){
                sb.append(c);
            }else{
                sb.append("%20");
            }
        }
        return sb.toString();
    }
}
