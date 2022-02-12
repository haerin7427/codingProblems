package programmers;

// https://programmers.co.kr/learn/courses/30/lessons/12918
// title : 문자열 다루기 기본
// time : 10m
// Create by haerin on 2022/02/12

public class Lv1_string1 {
    class Solution {
        public boolean solution(String s) {
            boolean answer = false;
            if(isFourOrSix(s) && isNumber(s))
                answer = true;
            
            return answer;
        }
        
        private boolean isFourOrSix (String s){
            if(s.length() == 4 || s.length() == 6)
                return true;
            else
                return false;
        }
        
        private boolean isNumber (String s){
            boolean flag = true;
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i) < 48 || s.charAt(i) > 57){
                    flag = false;
                    break;
                }
            }
            
            return flag;
        }
    }
}
