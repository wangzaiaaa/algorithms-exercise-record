package 程序员面试金典;

public class 一次编辑0105 {
    public boolean oneEditAway(String first, String second) {
        if(first == null || second == null){
            return false;
        }else if(Math.abs(first.length() - second.length()) > 1){
            return false;
        }else{
            int i = 0,j = 0,c = 0;
            while (i < first.length() && j < second.length()){
                char c1 = first.charAt(i),c2 = second.charAt(j);
                if(c1 == c2){
                    i++;
                    j++;
                }else if(i + 1 < first.length() && first.charAt(i+1) == c2){
                    i++;
                    c++;
                }else if(j + 1 < second.length() && second.charAt(j+1) == c1){
                    j++;
                    c++;
                }else{
                    i++;
                    j++;
                    c++;
                }
            }
            return (c + first.length() - i + second.length() - j) < 2;
        }
    }
}
