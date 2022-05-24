package programmers.JAVA_lecture;
import java.util.*;
// title : 더 맵게
// time : 8m
// Create by haerin on 2022/05/24

public class tree_one {
    class Solution {
        public int solution(int[] scoville, int K) {
            
            Queue<Integer> queue = new PriorityQueue<>();
            for(int i=0; i<scoville.length; i++)
                queue.offer(scoville[i]);
                    
            int count = 0;
            int min = queue.poll();
            while(min < K){
                count += 1;
                if(queue.isEmpty()){
                    count = -1;
                    break;
                }

                int second_min = queue.poll();
                queue.offer(min + second_min*2);
                min = queue.poll();
            }

            return count;
        }
    }                   
}
