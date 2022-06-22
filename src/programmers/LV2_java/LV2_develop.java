package programmers.LV2_java;
import java.util.*;

// https://programmers.co.kr/learn/courses/30/lessons/42586
// title : 기능개발
// time : 25m
// Created by haerin on 2022/06/22

public class LV2_develop {
    class Solution {
        class Task{
            int progress;
            int speed;
            
            Task(int p, int s){
                progress = p;
                speed = s;
            }
            
            void developing(){
                progress += speed;
            }
        }
        public int[] solution(int[] progresses, int[] speeds) {
            
            List<Integer> answer_list = new LinkedList<>();
            Queue<Task> queue = new LinkedList<>();
            for(int i=0; i<progresses.length; i++)
                queue.offer(new Task(progresses[i], speeds[i]));
            
            while(!queue.isEmpty()){
                while(queue.peek().progress < 100){
                    for(Task q : queue)
                        q.developing();
                }
                
                int count = 0;
                while(!queue.isEmpty() && queue.peek().progress >= 100){
                    queue.remove();
                    count+=1;
                }
                answer_list.add(count);
            }
            
            int[] answer = new int[answer_list.size()];
            int idx=0;
            for(int num : answer_list)
                answer[idx++] = num;
            return answer;
        }
    }
}