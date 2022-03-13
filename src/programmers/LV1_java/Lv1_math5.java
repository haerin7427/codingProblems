package programmers.LV1_java;

// https://programmers.co.kr/learn/courses/30/lessons/86051
// title : 없는 숫자 더하기 
// time : 3m
// Create by haerin on 2022/01/05

public class Lv1_math5 {

    class Solution {
        public int solution(int[] numbers) {
            int answer = 45; //0~9까지 합
            
            for(int num : numbers)
                answer -= num;
            
            return answer;
        }
    }
    
}
