package programmers;

// https://programmers.co.kr/learn/courses/30/lessons/12937
// title : 짝수와 홀수
// time : 1m
// Create by haerin on 2022/03/01

public class Lv1_math22 {
    class Solution {
        public String solution(int num) {
            String answer = "Odd";
            if(num % 2 == 0)
                answer = "Even";
            return answer;
        }
    }
}
