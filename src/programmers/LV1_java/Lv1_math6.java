package programmers.LV1_java;

// https://programmers.co.kr/learn/courses/30/lessons/42840
// title : 모의고사
// time : 35m
// Create by haerin on 2022/01/06

public class Lv1_math6 {

    class Solution {
        public int[] solution(int[] answers) {
            int[] answer;
            int[] person1 = new int[answers.length];
            int[] person2 = new int[answers.length];
            int[] person3 = new int[answers.length];
    
            for(int i=1; i <= answers.length; i++){
    
                if(i%5 == 0)
                    person1[i-1] = 5;
                else
                    person1[i-1] = i%5;
            }
    
            int[] option = {1,3,4,5};
            for(int i=1; i <= answers.length; i++){
                if(i % 2 == 1)
                    person2[i-1] = 2;
                else{
                    int idx = i % 8;
                    if(idx == 0)
                        idx = 8;
    
                    person2[i-1] = option[idx/2-1];
                }
            }
    
            int[] opt = {3,1,2,4,5};
            for(int i=1; i <= answers.length; i++){
                int idx = (i %10) -1;
                if(idx == -1)
                    idx = 9;
                idx /= 2;
                person3[i-1] = opt[idx];
            }
    
            int[] scores = {0,0,0};
            for(int i=0; i < answers.length; i++){
                if(person1[i] == answers[i])
                    scores[0] += 1;
    
                if(person2[i] == answers[i])
                    scores[1] += 1;
    
                if(person3[i] == answers[i])
                    scores[2] += 1;
            }
    
    
            int max = 0;
            for(int i=0; i < 3; i++){
                if(max < scores[i])
                    max = scores[i];
            }
    
            int num_max =0;
            for(int i=0; i < 3; i++){
                if(max == scores[i])
                    num_max += 1;
            }
    
            answer = new int[num_max];
            int count =0;
            for(int i=0; i < 3; i++){
                if(max == scores[i]){
                    answer[count++] = i+1;
                }
            }
    
            return answer;
        }
    }
    
}
