package programmers;

// https://programmers.co.kr/learn/courses/30/lessons/12928
// title : 약수의 합
// time : 1m
// Create by haerin on 2022/01/23

public class Lv1_math11 {

    class Solution {
        public int solution(int n) {
            int answer = 0;
            for(int i = 1; i <= n; i++){
                if(n % i == 0)
                    answer += i;
            }
            return answer;
        }
    }
    
}
