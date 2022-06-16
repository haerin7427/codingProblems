package programmers.LV2_java;

// https://programmers.co.kr/learn/courses/30/lessons/12899
// title : 124 나라의 숫자
// time : 20m + help
// Created by haerin on 2022/06/16

public class LV2_124 {

    public static void main(String[] args) {
        class Solution {
            public String solution(int n) {
                String[] rules = {"4", "1", "2"};
                String answer = "";
              
                while(n > 0){
                      int remainder = n % 3;
                      n /= 3;
        
                      if(remainder == 0) n-=1;
        
                      answer = rules[remainder] + answer;
                 }
              
                return answer;
            }
        }
    }
    
}
