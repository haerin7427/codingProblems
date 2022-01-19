package programmers;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

// https://programmers.co.kr/learn/courses/30/lessons/42889
// title : 실패율
// time : 25m
// Create by haerin on 2022/01/13
// Update by haerin on 2022/01/19

public class Lv1_fail {

    class Solution {
        public int[] solution(int N, int[] stages) {
            
            
            int[] players = new int[N+1];
            for(int stageNum : stages)
                players[stageNum-1] += 1;
            
            List<STAGE> stageInfo = new ArrayList<>();
            int numP = stages.length;
            for(int i=0; i<N; i++){
                float failure = 0;
                if(numP > 0)
                    failure = players[i] / (float)numP;
                
                STAGE s = new STAGE(i+1, failure);
                stageInfo.add(s);
                numP -= players[i];
            }
            
            Collections.sort(stageInfo, Collections.reverseOrder());
            
            int[] answer = new int[N];
            for(int i=0; i<N; i++){
                answer[i] = stageInfo.get(i).step;
            }
            return answer;
        }
        
        private class STAGE implements Comparable<STAGE>{
            public int step;
            public float failure;
            
            public STAGE(int s, float f){
                this.step = s;
                this.failure = f;
            }
            
            @Override
              public int compareTo(STAGE o){
                if (failure < o.failure ) {
                    return -1;
                }
                if (failure > o.failure ) {
                    return 1;
                }
                return 0;
              }
        }
    }
    
}
