package programmers;

// https://programmers.co.kr/learn/courses/30/lessons/17682
// title : [1차] 다트게임
// time : 30m
// Create by haerin on 2022/02/25

public class Lv1_dart {

    class Solution {
        public int solution(String dartResult) {
            
            char[] charDart = dartResult.toCharArray();
            int[] stages = new int[3];
            int answer = 0;
            
            int idx = -1;
            for(int i=0; i < dartResult.length(); i++){
                
                if(charDart[i] >= '0' && charDart[i] <= '9'){
                    idx+=1;
    
                    if(charDart[i+1] == '0'){
                        i += 1;
                        stages[idx] = 10;
                    }else
                        stages[idx] = Integer.parseInt(String.valueOf(charDart[i]));
    
                }else if(charDart[i] == 'D'){
                    stages[idx] *= stages[idx];
                }else if(charDart[i] == 'T'){
                    stages[idx] *= (stages[idx]*stages[idx]);
                }else if(charDart[i] == '*'){
                    stages[idx] *= 2;
                    if(idx>0)
                        stages[idx-1] *= 2;
                }else if(charDart[i] == '#'){
                    stages[idx] *= -1;
                }
            }
            
            for(int i=0; i<3; i++){
                answer += stages[i];
            }
            return answer;
        }
    }
    
}
