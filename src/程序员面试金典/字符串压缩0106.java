package 程序员面试金典;

import java.util.Scanner;

public class 字符串压缩0106 {
    public String compressString(String S) {
        if(S == null || "".equals(S)){
            return S;
        }else{
            StringBuilder sb = new StringBuilder();
            int l = 0,r = 0;
            while (r < S.length()){
                if(S.charAt(r) == S.charAt(l)){
                    r++;
                }else{
                    sb.append(S.charAt(l));
                    sb.append("" + (r-l));
                    l = r;
                }
            }
            sb.append(S.charAt(l));
            sb.append("" + (r-l));
            String res = sb.toString();
            return res.length() < S.length() ? res : S;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.nextLine().trim();
        in.close();
        if(S == null || "".equals(S)){
            System.out.println(S);
        }else{
            StringBuilder sb = new StringBuilder();
            int l = 0,r = 0;
            while (r < S.length()){
                if(S.charAt(r) == S.charAt(l)){
                    r++;
                }else{
                    sb.append(S.charAt(l));
                    sb.append("" + (r-l));
                    l = r;
                }
            }
            sb.append(S.charAt(l));
            sb.append("" + (r-l));
            String res = sb.toString();
            System.out.println(res);
        }
    }
}
