package programmers.LV2_java;

// https://programmers.co.kr/learn/courses/30/lessons/12924
// title : 숫자의 표현
// time : 3m
// Created by haerin on 2022/06/15

public class LV2_number {

    class Solution {
        public int solution(int n) {
            int answer = 1;
            for(int start_num=1; start_num<n; start_num++){
                
                int sum=0;
                for(int num=start_num; num<n; num++){
                    sum+= num;
                    
                    if(sum >= n) break;
                }
                if(sum == n) answer+=1;
            }
            return answer;
        }
    }
    
}
