package programmers;

// https://programmers.co.kr/learn/courses/30/lessons/70128
// time : 3m
// create by haerin on 2022/01/03

public class Lv1_math1 {

    class Solution {
        public int solution(int[] a, int[] b) {
            int answer = 0;
            for(int i=0; i < a.length; i++){
                answer += a[i]*b[i];
            }
            return answer;
        }
    }
    
}
