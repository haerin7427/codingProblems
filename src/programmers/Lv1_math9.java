package programmers;

// https://programmers.co.kr/learn/courses/30/lessons/87389
// title : 나머지가 1이 되는 수 찾기
// time : 1m
// Create by haerin on 2022/01/21

public class Lv1_math9 {

    class Solution {
        public int solution(int n) {
            
            n -= 1;
            int answer = 2;
            while(n % answer != 0)
                answer += 1;
            
            return answer;
        }
    }
    
}
