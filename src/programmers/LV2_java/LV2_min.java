package programmers.LV2_java;
import java.util.*;

// https://programmers.co.kr/learn/courses/30/lessons/12941
// title : 최솟값 만들기
// time : 2m
// Created by haerin on 2022/06/25

public class LV2_min {
    class Solution
    {
        public int solution(int []A, int []B)
        {
            int answer = 0;
            
            Arrays.sort(A);
            Arrays.sort(B);
            
            for(int i=0; i<A.length; i++)
                answer += (A[i] * B[B.length-1-i]);

            return answer;
        }
    }
}