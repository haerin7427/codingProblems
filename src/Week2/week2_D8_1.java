package Week2;

// https://programmers.co.kr/learn/courses/30/lessons/49995
// time : 120m
// help : https://dev-note-97.tistory.com/253

public class week2_D8_1 {

    class Solution {
        public int solution(int[] cookie) {
            int[] forward = new int[cookie.length];
            int[] backward = new int[cookie.length];
            int answer = 0;
            int len = cookie.length;
            
            if(cookie.length == 1)
                return answer;
            
            forward[0] = cookie[0];
            backward[len-1] = cookie[len-1];
            for(int i = 1 ; i < len; i++){
                forward[i] = forward[i-1] + cookie[i];
                backward[len -1-i] = backward[len-1 - i+1] + cookie[len-1-i];
            }
            
            int leftP, rightP, leftBias, rightBias;
            for(int i = 0; i < len-1;i++){
                leftP = i;
                rightP = i+1;
                leftBias = backward[i+1];
                rightBias = forward[i];
                
                while(rightP < len && forward[rightP] - rightBias < answer)
                    rightP += 1;
                
                while(leftP > -1 && backward[leftP] - leftBias < answer)
                    leftP -= 1;
                
                while(leftP > -1 && rightP < len){
                
                    int leftScore = backward[leftP] - leftBias;
                    int rightScore = forward[rightP] - rightBias;
                    
                    if(leftScore == rightScore){
                        answer = leftScore;
                        leftP -= 1;
                        rightP += 1;
                    }else if(leftScore < rightScore){
                        leftP -= 1;
                    }else
                        rightP += 1;
                }
            }
            
            return answer;
        }
    }
    
}
