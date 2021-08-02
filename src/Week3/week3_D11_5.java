package Week3;

import java.util.Stack;

// https://leetcode.com/problems/baseball-game/
// time: 20m
// Create by 김해린 on 2021/08/02

public class week3_D11_5 {
    class Solution {
        public int calPoints(String[] ops) {
            Stack<Integer> stack = new Stack<>();
            
            for(int i = 0; i < ops.length; i++){
                 
                if(ops[i].equals("C")){
                    stack.pop();
                }else if(ops[i].equals("D")){
                    stack.push(stack.peek()*2);
                }else if(ops[i].equals("+")){
                    int num1 = stack.pop();
                    int num2 = stack.peek();
                    stack.push(num1);
                    stack.push(num1+num2);
                }else
                    stack.push(Integer.parseInt(ops[i]));
            }
            
            int sum = 0;
            while(!stack.empty())
                sum += stack.pop();
            return sum;
        }
    }
}
