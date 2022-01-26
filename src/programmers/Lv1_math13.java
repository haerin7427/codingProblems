package programmers;

// https://programmers.co.kr/learn/courses/30/lessons/12921
// title : 소수 찾기
// time : 5m
// Create by haerin on 2022/01/26

public class Lv1_math13 {
    class Solution {
        public int solution(int n) {
            int answer = 0;
            
            for(int i=2; i<= n; i++){
                int isCorrect = 0;
                for(int k=2; k*k <= i; k++){
                    if(i % k == 0){
                        isCorrect = 1;
                        break;
                    }
                }
                if(isCorrect == 0){
                    answer += 1;
                }
            }
            return answer;
        }
    }
}
