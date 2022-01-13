package programmers;
import java.util.Comparator;
import java.util.Arrays;

// https://programmers.co.kr/learn/courses/30/lessons/42889
// title : 실패율
// time : 45m
// Create by haerin on 2022/01/13

public class Lv1_fail {

    class Solution {
        public int[] solution(int N, int[] stages) {
            int[] answer = new int[N];
            int[][] allStages = new int[2][N+1];
            
            for(int i=0; i<=N;i++)
                allStages[0][i] = 0;
            
            for(int stageNum : stages)
                allStages[0][stageNum-1] += 1;
            
            allStages[1][0] = stages.length;
            for(int i=1; i <N; i++){
                allStages[1][i] = allStages[1][i-1] - allStages[0][i-1];
            }
            
            float[][] idxFail = new float[N][2];
            
            for(int i=0; i<N; i++){
                idxFail[i][0] = i+1;
                
                if(allStages[1][i] == 0)
                    idxFail[i][1] = 0;
                else
                    idxFail[i][1] = (float)allStages[0][i] / allStages[1][i];
            }
            
            Arrays.sort(idxFail ,new Comparator<float[]>(){
                @Override
                public int compare(float[] p1, float[] p2){
                    if(p1[1] != p2[1] ){
                        if(p1[1] < p2[1])
                            return 1;
                        else
                            return -1;
                    }else {
                        return Float.compare(p1[0],p2[0]);
                    }
                }
            });
            
            for(int i=0; i<N; i++){
                answer[i] = (int)idxFail[i][0];
            }
            
            return answer;
        }
    }
    
}
