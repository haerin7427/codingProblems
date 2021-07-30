
// https://programmers.co.kr/learn/courses/30/lessons/62048
// time : 30m
// Create by 김해린 on 2021/07/30

public class week2_D10_7 {

    class Solution {
        public long solution(int w, int h) {
            
            long answer = 0;
            double a = -1 * h / (double)w;
            
            for(int x = 1 ; x < w ;x++){
                answer += (Math.floor(x * a)+ h); 
            }
            
            return answer*2;
        }
    }
    
}
