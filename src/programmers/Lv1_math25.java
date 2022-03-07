package programmers;
// https://programmers.co.kr/learn/courses/30/lessons/12954
// title : x만큼 간격이 있는 n개의 숫자
// time : 5m
// Create by haerin on 2022/03/07

public class Lv1_math25 {
    class Solution {
        public long[] solution(int x, int n) {
            long[] answer = new long[n];
            for(int i=1; i<=n; i++)
                answer[i-1] = (long)x*i;
            
            return answer;
        }
    }
}
