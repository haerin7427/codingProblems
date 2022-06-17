package programmers.LV2_java;

// https://programmers.co.kr/learn/courses/30/lessons/42860
// title : 조이스틱
// time : 30m + ...
// Created by haerin on 2022/06/17

public class LV2_joystick {

    class Solution {
        public int solution(String name) {
            int answer = 0;
            char[] now = new char[name.length()];
            for(int i=0; i<now.length; i++){
                now[i] = 'A';
            }
            
            int idx = 0;
            while(true){
                
                if(name.charAt(idx) != now[idx]){
                    int option_up = name.charAt(idx) - 'A';
                    int option_down = 1 + ('Z' - name.charAt(idx));
                    answer += Math.min(option_up,option_down);
                    now[idx] = name.charAt(idx);
                }
                
                if(String.valueOf(now).equals(name)) break;
                
                int op1_next_idx = idx + 1;
                int op2_next_idx = idx - 1;
                
                if(op1_next_idx >= now.length) op1_next_idx = 0;
                if(op2_next_idx < 0) op2_next_idx = now.length - 1;
                
                if(name.charAt(op1_next_idx) == 'A'){
                    idx = op2_next_idx;
                }else
                    idx = op1_next_idx;
                answer += 1;          
            }
            return answer;
        }
    }
    
}
