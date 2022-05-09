package programmers.JAVA_lecture;
import java.util.*;

// title : 기능 개발
// time : 40m
// Create by haerin on 2022/05/09


public class stackandqueue_two {
    class Solution {
        public int[] solution(int[] progresses, int[] speeds) {
            
            ArrayList<Integer> list = new ArrayList<>();
            int[] days = new int[progresses.length];
            for(int i=0; i<progresses.length; i++){
                days[i] = (int)Math.ceil((100-progresses[i])/(float)speeds[i]);
            }
            
            int goal_day = 0;
            for(int i=0; i<progresses.length; i++){
                if(days[goal_day] < days[i]){
                    list.add(i-goal_day);
                    goal_day = i;
                }
            }
            
            list.add(progresses.length-goal_day);
            
            int[] answer = new int[list.size()];
            int idx=0;
            for(int num : list)
                answer[idx++] = num;
            return answer;
        }

        public int[] solution2(int[] progresses, int[] speeds) {
        
            Queue<Integer> queue = new LinkedList<>();
            ArrayList<Integer> list = new ArrayList<>();
            
            for(int i=0; i<progresses.length; i++){
                int day = (int)Math.ceil((100-progresses[i])/(float)speeds[i]);
                
                if(!queue.isEmpty() && queue.peek() < day){
                    list.add(queue.size());
                    queue.clear();
                }
                queue.offer(day);
            }
            list.add(queue.size());
    
            int[] answer = new int[list.size()];
            int idx=0;
            for(int num : list)
                answer[idx++] = num;
            return answer;
        }
    }
}
