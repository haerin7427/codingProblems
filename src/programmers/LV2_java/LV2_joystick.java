package programmers.LV2_java;

// https://programmers.co.kr/learn/courses/30/lessons/42860
// title : 조이스틱
// time : 30m + help
// Created by haerin on 2022/06/18

public class LV2_joystick {

    class Solution {
        public int solution(String name) {
            
            int answer = 0;
            int move = name.length() - 1;
            
            for(int i = 0; i < name.length(); i++) {
                answer += Math.min(name.charAt(i) - 'A', 26 - (name.charAt(i) - 'A'));
                
                if (i < name.length() - 1 && name.charAt(i + 1) == 'A') {
                    int A_endIdx = i + 1;
                    while(A_endIdx < name.length() && name.charAt(A_endIdx) == 'A')
                        A_endIdx++;
                    
                    move = Math.min(move, i * 2 + (name.length() - A_endIdx));
                    move = Math.min(move, i + (name.length() - A_endIdx) * 2);
                }
            }
            answer += move;
            
            return answer;
        }
    }
}
