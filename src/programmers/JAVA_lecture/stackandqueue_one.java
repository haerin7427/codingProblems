package programmers.JAVA_lecture;
import java.util.*;

// title : 올바른 괄호
// time : 5m
// Create by haerin on 2022/05/09

public class stackandqueue_one {
    class Solution {
        boolean solution(String s) {
            
            boolean answer = true;
            Stack<Character> stack = new Stack<>();
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i) == '('){
                    stack.push('(');
                }else{
                    if(stack.empty()){
                        answer = false;
                        break;
                    }else
                        stack.pop();
                }
            }
            
            if(!stack.empty()) answer = false;
            return answer;
        }
    }
}
