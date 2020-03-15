package leetcode;

import java.util.Stack;

/**
 * @author bonsoirzw
 * date 2020/3/14
 */
public class Solution {
    /**
     * 1.可以使用2个栈来模拟计算的过程，一个栈为操作数栈，另一个为操作符栈
     * 2.对字符串进行遍历，遍历的过程中，如果是数字字符则压入操作数栈，
     * 如果是+号或者-号放入操作符栈，如果是*号或者/号则取出栈顶元素和字符串的下一个字符进行运算
     * 运算结果放入操作数栈中
     * 3.进行上述过程，直到遍历完字符串和操作符栈为空
     * 4.返回操作数栈的栈顶元素
     * @param s 输入的字符串
     * @return
     */
    public static double compute(String s){
        //字符串为空 返回0
        if(s == null || "".equals(s)) return 0;
        //操作数栈
        Stack<Double> val = new Stack<>();
        //操作符栈
        Stack<Character> op = new Stack<>();
        //遍历字符串的指针
        int i = 0;
        while (i < s.length() || !op.isEmpty()){
            //字符串没有遍历完
            if(i < s.length()){
                //字符串中的字符
                char c = s.charAt(i);
                //该字符为数字字符就放入到操作数栈中
                if(c >= '0' && c <= '9'){
                    val.push((double)(c - '0'));
                }else{
                    //如果是+号或者-号放入操作符栈中
                    if(c == '+' || c == '-'){
                        op.push(c);
                    }else if(c == '*' || c == '/'){
                        double v1 = val.pop();
                        double v2 = s.charAt(++i) - '0';
                        //将结果压入栈中
                        if(c == '*'){
                            val.push(v1 * v2);
                        }else{
                            val.push(v1 / v2);
                        }
                    } else{ //异常字符直接返回结果0
                        return 0;
                    }
                }
                //处理下一个字符
                i++;
            }else{
                while (!op.isEmpty()){
                    char c = op.pop();
                    double v1 = val.pop(),v2 = val.pop();
                    //这里不会有* / 因为之前已经处理过了
                    switch (c){
                        case '+': val.push(v1 + v2);break;
                        case '-': val.push(v2 - v1);break;
                    }
                }
            }
        }
        return val.pop();

    }


    /**
     * 遇到“(” 我们不管 因为“(”有嵌套，我们不知道什么时候该处理
     *
     * 遇到数值将它压人val栈中
     *
     * 遇到“+”，“-”，“*”，“/”时将它压人ops栈中
     *
     * 遇到“)”时我们开始处理 因为一个“)”代表一个子表达式的介绍这时 我们取出第一个数 value=val.pop() 和符号ops.pop()
     *
     * 并令value = value +val.pop() 再把value压人val栈中 val.push(value)    注意符号是从ops中取出来的
     * @param str
     * @return
     */

    public static double computeImprove (String str){
        Stack<Double> val =  new Stack<>();
        Stack<String> ops = new Stack<>();
        int index = 0;
        while(index < str.length() || !ops.isEmpty()){
            if(index < str.length()){
                String s = str.substring(index,index+1);
                if(s.equals("(")) index++;
                else if(s.equals("+")
                        ||s.equals("-")
                        ||s.equals("*")
                        ||s.equals("/")){
                    ops.push(s);
                    index++;
                }
                else if(s.equals(")")){
                    String op = ops.pop();
                    double v = val.pop();
                    if(op.equals("+")) v=val.pop()+v;
                    else if(op.equals("-")) v=val.pop()-v;
                    else if(op.equals("*")) v = val.pop()*v;
                    else if(op.equals("/")) v = val.pop()/v;
                    val.push(v);
                    index++;
                }
                else{
                    char c = s.charAt(0);
                    int j = index;
                    while (c >= '0' && c <= '9'){
                        c = str.charAt(++j);
                    }
                    val.push(Double.parseDouble(str.substring(index,j)));
                    index = j;
                }
            }else{
                while (!ops.isEmpty()){
                    double v = val.pop();
                    String op = ops.pop();
                    if(op.equals("+")) v=val.pop()+v;
                    else if(op.equals("-")) v=val.pop()-v;
                    else if(op.equals("*")) v = val.pop()*v;
                    else if(op.equals("/")) v = val.pop()/v;
                    val.push(v);

                }
            }
        }
        return val.pop();
    }





    public static void main(String[] args) {
        System.out.println(compute("1+2*5"));
        System.out.println(computeImprove("5*(1+2)"));
    }



}
