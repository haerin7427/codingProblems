package programmers.LV1_java;

// https://programmers.co.kr/learn/courses/30/lessons/86491
// title : 최소직사각형
// time : 5m
// Create by haerin on 2022/01/14

public class Lv1_square {

    class Solution {
        public int solution(int[][] sizes) {
            
            
            for(int i=0; i < sizes.length; i++){
                if(sizes[i][0] < sizes[i][1]){
                    int temp = sizes[i][1];
                    sizes[i][1] = sizes[i][0];
                    sizes[i][0] = temp;
                }
            }
            
            int maxOne=sizes[0][0], maxTwo=sizes[0][1];
            for(int i=1;i<sizes.length; i++){
                if(maxOne < sizes[i][0]){
                    maxOne = sizes[i][0];
                }
                
                if(maxTwo < sizes[i][1]){
                    maxTwo = sizes[i][1];
                }
            }
            int answer = maxOne * maxTwo;
            return answer;
        }
    }
    
}
