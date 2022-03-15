package programmers.LV2_java;

// https://programmers.co.kr/learn/courses/30/lessons/42842
// title : 카펫
// time : 15m
// Create by haerin on 2022/03/15

public class LV2_carpet {

    class Solution {
        public int[] solution(int brown, int yellow) {
            int sum_block = brown + yellow;
            int[] answer = new int[2];
            
            
            for(int height=3; height<=sum_block/3; height++){
                
                if(brown == 2*(height + sum_block/height)-4 && yellow == (height-2) * (sum_block/height-2)){
                    if(height >sum_block/height){
                        answer[0] = height;
                        answer[1] = sum_block/height;
                    }else{
                        answer[0] = sum_block/height;
                        answer[1] = height;
                    }
                    
                    break;
                }
            }
            
            return answer;
        }
    }
    
}
