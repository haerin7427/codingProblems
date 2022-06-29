package programmers.LV2_java;
import java.util.*;

// https://programmers.co.kr/learn/courses/30/lessons/12909
// title : 올바른 괄호
// time : 3m
// Created by haerin on 2022/06/29

public class LV2_couple{
    class Solution {
        boolean solution(String s) {
            boolean answer = true;
            Stack<Integer> stack = new Stack<>();
            
            for(char c : s.toCharArray()){
                if(c == '(')
                    stack.push(1);
                else{
                    if(stack.isEmpty()) return false;
                    else stack.pop();
                }
            }
            
            if(!stack.isEmpty()) answer = false;
            return answer;
        }
    }
}