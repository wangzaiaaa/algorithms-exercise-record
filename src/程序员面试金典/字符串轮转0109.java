package 程序员面试金典;

public class 字符串轮转0109 {
//    public boolean isFlipedString(String s1, String s2) {
//        if(s1 == null || s2 == null || s1.length() != s2.length()){
//            return false;
//        }else if(s1.equals(s2)){
//            return true;
//        }else{
//            boolean flag = false;
//            for(int i = 0; i < s1.length(); i++){
//                String leftOfS1 = s1.substring(0,i);
//                String rightOfS1 = s1.substring(i,s1.length());
//                String leftOfS2 = s2.substring(0,s2.length()-i);
//                String rightOfS2 = s2.substring(s2.length()-i,s2.length());
//                if(leftOfS1.equals(rightOfS2) && rightOfS1.equals(leftOfS2)){
//                    flag = true;
//                    break;
//                }
//            }
//            return flag;
//        }
//    }
    public boolean isFlipedString(String s1, String s2) {
        if(s1 == null || s2 == null || s1.length() != s2.length()){
            return false;
        }else if(s1.equals(s2)){
            return true;
        }else{
            s1 = s1 + s1;
            return s1.contains(s2);
        }
    }

}
