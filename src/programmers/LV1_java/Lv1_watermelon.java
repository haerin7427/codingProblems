package programmers.LV1_java;

// https://programmers.co.kr/learn/courses/30/lessons/12922
// title : 수박수박수박수박수박수?
// time : 3m
// Create by haerin on 2022/02/07

public class Lv1_watermelon {
    class Solution {
        public String solution(int n) {
            String answer = "";
            if(n % 2 == 0){
                for(int i=0; i < n /2; i++)
                    answer += "수박";
            }else{
                for(int i=0; i < n /2; i++)
                    answer += "수박";
                answer += "수";
            }
            
            return answer;
        }
    }
}
