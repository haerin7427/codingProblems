package programmers.LV2_java;
import java.util.*;

// https://programmers.co.kr/learn/courses/30/lessons/42883
// title : 큰 수 만들기
// time : 45m
// Create by haerin on 2022/03/22

public class LV2_bigNumber {

    class Solution {
        public String solution(String number, int k) {
            StringBuilder answer = new StringBuilder();
            int startIdx = 0;
            
            for(int limit = k; limit<number.length(); limit++){
                
                char maxValue = number.charAt(startIdx);
                int maxIdx = startIdx;
                
                for(int i=startIdx+1; i<=limit; i++){
                    if(maxValue < number.charAt(i)){
                        maxValue = number.charAt(i);
                        maxIdx = i;
                    }
                }
                
                answer.append(maxValue);
                startIdx = maxIdx+1;
                
            }
            return answer.toString();
        }
        
    }
    
}
