package programmers.LV1_java;
import java.util.Arrays;

// https://programmers.co.kr/learn/courses/30/lessons/12982?language=java
// title : 예산
// time : 3m
// Create by haerin on 2022/01/06

public class Lv1_budget {

    class Solution {
        public int solution(int[] d, int budget) {
            int answer = d.length;
            Arrays.sort(d);
            
            for(int i=0; i < d.length; i++){
                if(budget < d[i]){
                    answer = i;
                    break;
                }else
                    budget -= d[i];
            }
            return answer;
        }
    }
    
}
