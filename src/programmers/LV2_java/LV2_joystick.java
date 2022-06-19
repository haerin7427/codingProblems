package programmers.LV2_java;

// https://programmers.co.kr/learn/courses/30/lessons/42860
// title : 조이스틱
// time : 30m + help
// Created by haerin on 2022/06/19

public class LV2_joystick {
    class Solution {
        public int solution(String name) {
            
            int num_change_alpha = 0;
            int num_move_cursor = name.length()-1; //default
            
            for(int i=0; i< name.length(); i++){
                num_change_alpha += Math.min(name.charAt(i)-'A', 'Z'-name.charAt(i)+1);
                
                int idx = i+1; 
                while(idx<name.length() && name.charAt(idx) == 'A')
                    idx++;
                
                // index i가 방향 회전 포인트 일 경우, 최솟값 구하기
                num_move_cursor = Math.min(num_move_cursor, i*2 + (name.length()-idx)); // right to left
                num_move_cursor = Math.min(num_move_cursor, (name.length()-idx)*2 + i); // left to right
            }
            
            return num_change_alpha+num_move_cursor;
        }
    }
}
