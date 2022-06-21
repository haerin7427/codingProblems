package programmers.LV2_java;
import java.util.*;

// https://programmers.co.kr/learn/courses/30/lessons/42626
// title : 더 맵게
// time : 7m
// Created by haerin on 2022/06/21

public class LV2_spicy {
    class Solution {
        public int solution(int[] scoville, int K) {
            PriorityQueue<Integer> order = new PriorityQueue<>();
            for(int i=0; i<scoville.length; i++)
                order.add(scoville[i]);
            
            int answer = 0;
            while(order.peek() < K){
                answer +=1;
                int first = order.remove();
                int second = order.remove();
                
                order.add(first + second*2);
                if(order.size()<2 && order.peek() < K){
                    answer = -1;
                    break;
                }
            }
            
            return answer;
        }
    }
}
