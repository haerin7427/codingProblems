package programmers.LV2_java;

// https://programmers.co.kr/learn/courses/30/lessons/62048#
// title : 멀쩡한 사각형
// time : 15m
// Created by haerin on 2022/06/27

public class LV2_square {
    class Solution {
        public long solution(int w, int h) {
            long answer = 0;
            for(int i=1; i<w; i++)
                answer += (long)((double)i*h/w);
            
            return answer*2;
        }
    }
}