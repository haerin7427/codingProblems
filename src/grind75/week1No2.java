package grind75;
import java.util.*;

// https://leetcode.com/problems/valid-parentheses/
// title : 20. Valid Parentheses
// time : 7m
// Create by haerin on 2023/01/03

public class week1No2 {

    class Solution {
        public boolean isValid(String s) {
            Stack stack = new Stack();
    
            for(char c : s.toCharArray()) {
                if( c == '(' || c == '{' || c == '[')
                    stack.push(c);
                else {
                    if(stack.empty()) return false;
                    if(stack.peek().equals('(')  && c == ')') {
                        stack.pop();
                        continue;
                    }else if(stack.peek().equals('[') && c == ']') {
                        stack.pop();
                        continue;
                    }else if(stack.peek().equals('{') && c == '}') {
                        stack.pop();
                        continue;
                    }
                    return false;
                }
            }   
            if(stack.empty()) 
                return true;
            else 
                return false;
        }
    }
    
}
