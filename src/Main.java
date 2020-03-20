import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            String s = in.nextLine();
            String [] str = s.split(" ");
            if(solution(str[0],str[1]) || solution(str[0],new StringBuilder(str[1]).reverse().toString())){
                System.out.println("TRUE");
            }else{
                System.out.println("FALSE");
            }
        }
        in.close();


    }
    public static boolean solution(String s1,String s2){
        if(s1 == null || s2 == null){
            return false;
        }else{
            int r = 0;
            for(int i = 0; i < s1.length(); i++){
                if(r < s2.length() && s1.charAt(i) == s2.charAt(r)){
                    r++;
                }
            }
            if(r == s2.length()){
                return true;
            }else{
                return false;
            }
        }
    }






}
