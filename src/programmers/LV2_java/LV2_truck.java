package programmers.LV2_java;
import java.util.*;

// https://programmers.co.kr/learn/courses/30/lessons/42583
// title : 다리를 지나는 트럭
// time : 30m
// Create by haerin on 2022/06/22 + help

// Data structure : queue

public class LV2_truck {
    class Solution {
        public int solution(int bridge_length, int weight, int[] truck_weights) {
            Queue<Integer> q = new LinkedList<>();
            
            int time=0;
            int truck_idx=0;
            int sum_weight = 0;
            int pass_truck = 0;
            while(pass_truck < truck_weights.length){
                time += 1;
                
                if(q.size() == bridge_length){
                    int remove_truck = q.remove();
                    if(remove_truck != 0){
                    sum_weight -= remove_truck;
                        pass_truck += 1; 
                    }
                }
                
                if(truck_idx < truck_weights.length && truck_weights[truck_idx] + sum_weight <= weight){
                    sum_weight += truck_weights[truck_idx];
                    q.offer(truck_weights[truck_idx++]);
                }else
                    q.offer(0);
                
            }
            return time;
        }
    }
}