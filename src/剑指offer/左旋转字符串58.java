package 剑指offer;

public class 左旋转字符串58 {
    public String reverseLeftWords(String s, int n) {
        if(s == null || s.length() == 0){
            return s;
        }else{
            n %= s.length();
            char [] array = new char[s.length()];
            for(int i = 0; i < s.length(); i++){
                char c = s.charAt(i);
                int index = (i + s.length() - n) % s.length();
                array[index] = c;
            }
            return String.valueOf(array);
        }
    }
}
