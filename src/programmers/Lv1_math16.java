package programmers;

// https://programmers.co.kr/learn/courses/30/lessons/12925
// title : 문자열을 정수로 바꾸기
// time : 10m
// Create by haerin on 2022/02/01

public class Lv1_math16 {
    class Solution {
        public int solution(String s) {

            int isNegative = 0;
            if(s.charAt(0) == '-'){
                isNegative = 1;
                s = s.substring(1);
            }else if(s.charAt(0) == '+')
                s = s.substring(1);

            int answer = 0;
            for(int i = 0; i < s.length(); i++){
                int num = s.charAt(i) - '0';
                num *= Math.pow(10, s.length()-i-1);
                answer += num;
            }
            
            if(isNegative == 1)
                answer *= -1;
            
            return answer;
        }
    }
}
