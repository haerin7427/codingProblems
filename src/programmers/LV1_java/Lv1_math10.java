package programmers.LV1_java;

// https://programmers.co.kr/learn/courses/30/lessons/12912
// title : 두 정수 사이의 합
// time : 5m
// Create by haerin on 2022/01/22

public class Lv1_math10 {

    class Solution {
        public long solution(int a, int b) {
            
            if(a > b){
                int tmp = a;
                a = b;
                b = tmp;
            }
            
            long answer = ((long)b * (b+1) / 2) - ((long)a * (a-1) / 2);
            return answer;
        }
    }
    
}
