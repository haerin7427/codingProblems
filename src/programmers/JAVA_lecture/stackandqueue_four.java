package programmers.JAVA_lecture;
import java.util.*;

// title : 프린터
// time : 1h
// Create by haerin on 2022/05/09 + video

public class stackandqueue_four {

    class Solution {
        class Paper{
            int priority;
            boolean isMine;
            
            Paper(int p, boolean m){
                priority = p;
                isMine = m;
            }
        }

        public int solution(int[] priorities, int location) {

            List<Paper> queue = new LinkedList<>();

            for(int i=0; i<priorities.length; i++)
                queue.add(new Paper(priorities[i], i == location));

            int count = 0;
            int answer = 0;
            while(!queue.isEmpty()){
                Paper now = queue.remove(0);

                Boolean isPossible = true;
                for(Paper p : queue){
                    if(now.priority < p.priority){
                        isPossible = false;
                        break;
                    }
                }

                if(isPossible == true){
                    count+=1;

                    if(now.isMine) {
                        answer = count;
                        break;
                    }
                }else{
                    queue.add(now);
                }
            }
            return answer; 
        }
    } 
}
