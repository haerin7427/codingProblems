package programmers.JAVA_lecture;
import java.util.*;

// 프로그래머스 "H-Index"
// Create by haerin on 2022//05/13

public class sort_four {

    class Solution {
        public int solution(int[] citations) {
            int answer = 0;
            
            int h=0;
            while(true){
                int count = 0;
                
                for(int i=0; i<citations.length; i++)
                    if(h <= citations[i])
                        count+=1;
                
                if(count == 0) break;
                if(count >= h) answer = h;
                
                h+=1;
            }
            
            return answer;
        }

        public int solution2(int[] citations) {
            
            Arrays.sort(citations);
            
            int answer = 0;
            for(int i=0; i<citations.length; i++){
                int h = citations.length - i;
                if(h <= citations[i]){
                    answer = h;
                    break;
                }
            }

            return answer;
        }

    }
    
}
