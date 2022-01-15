package programmers;

// https://programmers.co.kr/learn/courses/30/lessons/64061
// title : 크레인 인형뽑기 게임
// time : 45m
// Create by haerin on 2022/01/15

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
            
            int[] store = new int[ssize*ssize];
            int idx=0;
            int answer = 0;
            
            for(int num : moves){
                if(numDoll[num-1] != 0){
                    int yPos = ssize - numDoll[num-1];
                    
                    if(idx != 0 && store[idx-1] == board[yPos][num-1]){
                        store[idx] = 0;
                        idx -= 1;
                        answer += 2;
                    }else{
                        store[idx] = board[yPos][num-1];
                        idx += 1;
                    }
                    
                    board[yPos][num-1] = 0;
                    numDoll[num-1] -= 1;
                }
            }
            
            return answer;
        }
    }
}
