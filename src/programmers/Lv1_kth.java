package programmers;
import java.util.Arrays;

// https://programmers.co.kr/learn/courses/30/lessons/42748
// k번째 수 구하기
// time: 15m
// Create by haerin on 2021/01/06

public class Lv1_kth {

    class Solution {
        public int[] solution(int[] array, int[][] commands) {
            int[] answer = new int[commands.length];
            
            for(int idx=0; idx < commands.length; idx++){
                int i = commands[idx][0]-1, j = commands[idx][1], k = commands[idx][2]-1;
                
                int[] newArray = Arrays.copyOfRange(array, i, j);
                Arrays.sort(newArray);
                
                answer[idx] = newArray[k];
            }
            
            return answer;
        }
    }
    
}
