package programmers;

// https://programmers.co.kr/learn/courses/30/lessons/12934
// title : 정수 제곱근 판별
// time : 4m
// Create by haerin on 2022/03/09

public class Lv1_math26 {

    class Solution {
        public long solution(long n) {
            long num = (long)Math.sqrt(n);
            long answer = -1;
            
            if(Math.pow(num,2) == n)
                answer = (long)Math.pow(num+1,2);
            return answer;
        }
    }
    
}
