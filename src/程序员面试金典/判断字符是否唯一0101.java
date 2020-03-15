package 程序员面试金典;

public class 判断字符是否唯一0101 {
    public boolean isUnique(String astr) {
        if(astr == null || astr.length() == 0) return true;
        int [] map = new int[256];
        for(int i = 0; i < astr.length(); i++){
            char c = astr.charAt(i);
            if(map[(int)c] != 0) return false;
            map[(int)c]++;
        }
        return true;
    }
}
