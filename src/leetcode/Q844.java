package leetcode;
import java.util.*;
// https://leetcode.com/problems/backspace-string-compare/
// title : 844. Backspace String Compare
// time : 5m
// Created by haerin on 2022/07/28

public class Q844 {
class Solution {
    public boolean backspaceCompare(String s, String t) {
        LinkedList<Character> s_list = new LinkedList<>();
        LinkedList<Character> t_list = new LinkedList<>();
        
        for(char c : s.toCharArray()){
            if(c == '#'){
                if(s_list.size() != 0)
                s_list.removeLast();
            }else
                s_list.add(c);
        }
        
        for(char c : t.toCharArray()){
            if(c == '#'){
                if(t_list.size() != 0)
                 t_list.removeLast();
            }else
                t_list.add(c);
        }
        
        if(s_list.toString().equals(t_list.toString())) return true;
        else return false;
    }
}
    
}
