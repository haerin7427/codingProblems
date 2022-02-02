package programmers;

// https://programmers.co.kr/learn/courses/30/lessons/12903
// title : 가운데 글자 가져오기 
// time : 5m
// Create by haerin on 2022/02/02

public class Lv1_mid {
    class Solution {
        public String solution(String s) {
            String answer = "";
            int sLen = s.length();
            if(sLen % 2 == 0){
                answer += s.substring(sLen/2-1,sLen/2+1);
            }else{
                answer += s.charAt(sLen/2);
            }
            
            return answer;
        }
    }
}
