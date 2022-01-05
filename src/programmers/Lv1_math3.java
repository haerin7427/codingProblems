package programmers;

// https://programmers.co.kr/learn/courses/30/lessons/76501
// 음양 더하기
// time: 2m
// Create by haerin on 2022/01/05

public class Lv1_math3 {

    class Solution {
        public int solution(int[] absolutes, boolean[] signs) {
            int answer = 0;
            for(int i=0;i< signs.length; i++){
                answer += absolutes[i] * (signs[i] ? 1 : -1);
            }
            return answer;
        }
    }
    
}
