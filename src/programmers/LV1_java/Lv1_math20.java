package programmers.LV1_java;

// https://programmers.co.kr/learn/courses/30/lessons/12947
// title : 하샤드 수
// time  : 1m
// Create by haerin on 2022/02/28

public class Lv1_math20 {
    class Solution {
        public boolean solution(int x) {
            boolean answer = true;
            int digit = 0;
            int num = x;
            
            while(true){
                digit += x%10;
                x /= 10;
                
                if(x < 10){
                    digit += x;
                    break;
                }
            }
            
            if(num % digit != 0)
                answer = false;
            return answer;
        }
    }
}
