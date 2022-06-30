package programmers.LV2_java;
import java.util.*;

// https://programmers.co.kr/learn/courses/30/lessons/12973
// title : 짝지어 제거하기
// time : 30m
// Created by haerin on 2022/06/30

public class LV2_remove {
    class Solution
    {
        public int solution(String s)
        {
            int answer = 1;
            Stack<Character> stack = new Stack<>();
            
            for(char c : s.toCharArray()){
                if(stack.isEmpty() || stack.peek() != c)
                    stack.push(c);
                else
                    stack.pop();    
            }
            if(!stack.isEmpty()) answer = 0;

            return answer;
        }
    }
}