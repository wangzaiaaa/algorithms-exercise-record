package 剑指offer;

public class 翻转单词顺序58 {
    public String reverseWords(String s) {
        if(s == null){
            return s;
        }else{
            s = s.trim();
            String [] arr = s.split(" +");
            StringBuilder sb = new StringBuilder();
            for(int i = arr.length - 1; i >= 0; i--){
                sb.append(arr[i]);
                if(i != 0){
                    sb.append(" ");
                }
            }
            return sb.toString();
        }
    }
}
