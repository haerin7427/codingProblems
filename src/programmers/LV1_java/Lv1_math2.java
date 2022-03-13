package programmers.LV1_java;

// https://programmers.co.kr/learn/courses/30/lessons/77884
// time : 3m 
// Create by haerin on 2022/01/04 + help
// 약수의 개수가 홀수, 짝수인지 확인할 떄 제곱수인지 확인!

public class Lv1_math2 {

    class Solution {
        public int solution(int left, int right) {
            int answer = 0;
            for(int i=left; i <= right; i++){
                
                if(i % Math.sqrt(i)==0)
                    answer -= i;
                else 
                    answer += i;
            }
            return answer;
        }
    }
    
}
