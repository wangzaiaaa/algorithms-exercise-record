package 程序员面试金典;

public class 判定是否为互为字符重排0102 {
    public boolean CheckPermutation(String s1, String s2) {
        if(s1 == null && s2 == null) return false;
        else if(s1 == null || s2 == null || s1.length() != s2.length()) return false;
        else{
            int [] map1 = new int[128];
            int [] map2 = new int[128];
            char c1 = ' ',c2 = ' ';
            for(int i = 0; i < s1.length(); i++){
                c1 = s1.charAt(i);
                c2 = s2.charAt(i);
                map1[(int)c1]++;
                map2[(int)c2]++;
            }
            for(int i = 0; i < map1.length; i++){
                if(map1[i] != map2[i]) return false;
            }
            return true;
        }
    }
}
