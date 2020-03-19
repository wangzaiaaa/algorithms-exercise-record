package leetcode;

import java.util.Stack;

public class 买股票的最佳时机121 {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0){
            return 0;
        }else{
            Stack<Integer> stack = new Stack<>();
            int res = 0,bottom = 0;
            for(int i = 0; i < prices.length; i++){
                while (!stack.isEmpty() && stack.peek() > prices[i]) {
                    res = Math.max(res,stack.pop() - bottom);
                }
                stack.push(prices[i]);
                if(stack.size() == 1){
                    bottom = prices[i];
                }
            }
            while (!stack.isEmpty()){
                res = Math.max(res,stack.pop() - bottom);
            }
            return res;
        }
    }
}
