package leetcode;

import java.util.ArrayList;
import java.util.List;

public class 易混淆数1056 {
    public static boolean confusingNumber(int N) {
        StringBuilder sb = new StringBuilder();
        while (N != 0){
            sb.append((char)('0' + N % 10));
            N /= 0;
        }
        String str = sb.reverse().toString();
        sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            char c = getRotationChar(str.charAt(i));
            if(c == 'X') return false;
            sb.append(c);
        }
        return !sb.reverse().toString().equals(str);
    }

    public static char getRotationChar(char c){
        char ret = ' ';
        switch (c){
            case '0' : ret = '0'; break;
            case '1' : ret = '1'; break;
            case '6' : ret = '9'; break;
            case '8' : ret = '8'; break;
            case '9' : ret = '6'; break;
            default: ret = 'X';break;
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(confusingNumber(89));
    }
}
