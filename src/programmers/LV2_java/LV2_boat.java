package programmers.LV2_java;
import java.util.*;

// https://school.programmers.co.kr/learn/courses/30/lessons/12936
// title : 구명보트
// time : 10m
// Created by haerin on 2022/07/05

public class LV2_boat {
    class Solution {
        public int solution(int[] people, int limit) {
            Arrays.sort(people);
            int p1=0; int p2 = people.length-1;
            
            int answer = 0;
            while(p1<p2){
                if(people[p1] + people[p2] <= limit){
                    p1 +=1;
                }
                p2 -=1;
                answer += 1;
            }
            
            if(p1 == p2) answer += 1;
            return answer;
        }
    }
}