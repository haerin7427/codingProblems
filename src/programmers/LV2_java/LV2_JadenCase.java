package programmers.LV2_java;
import java.util.*;

// https://programmers.co.kr/learn/courses/30/lessons/12951#
// title : JadenCase 문자열 만들기
// time : 10m
// Created by haerin on 2022/06/26

public class LV2_JadenCase {
    class Solution {
        public String solution(String s) {
            StringTokenizer st = new StringTokenizer(s, " ");
            StringBuffer sb = new StringBuffer();
            
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i) == ' ') sb.append(" ");
                else{
                    int end_idx = s.substring(i).indexOf(" ");
                    
                    if(end_idx == -1) end_idx = s.length();
                    else end_idx += i;
                    
                    if('a' <= s.charAt(i) && s.charAt(i) <= 'z')
                        sb.append((char)(s.charAt(i)-32));
                    else
                        sb.append(s.charAt(i));
                    
                    sb.append(s.substring(i+1, end_idx).toLowerCase());
                    i = end_idx - 1;
                }
            }
            return sb.toString();
        }
    } 
}