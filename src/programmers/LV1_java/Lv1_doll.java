package programmers.LV1_java;
import java.util.*; 

// https://programmers.co.kr/learn/courses/30/lessons/64061
// title : 크레인 인형뽑기 게임
// time : 15m
// Create by haerin on 2022/01/15
// Updated by haerin on 2022/01/19

public class Lv1_doll {

    class Solution {
        public int solution(int[][] board, int[] moves) {
            
            int ssize = board.length;        
            int[] numDoll = new int[ssize];
            
            for(int i=0;i<ssize; i++){
                for(int k=ssize-1; k>-1; k--){
                    if(board[k][i]==0){
                        break;
                    }else
                        numDoll[i] +=1;
                }
            }
            
            int answer = 0;
            Stack<Integer> stack = new Stack<>(); 
    
            for(int num : moves){
                if(numDoll[num-1] != 0){
                    int yPos = ssize - numDoll[num-1];
                    
                    if(!stack.empty() && stack.peek().intValue() == board[yPos][num-1]){
                        stack.pop();
                        answer += 2;
                    }else{
                        stack.push(board[yPos][num-1]);
                    }
                    
                    board[yPos][num-1] = 0;
                    numDoll[num-1] -= 1;
                }
            }
            
            return answer;
        }
    }
}
