package programmers.JAVA_lecture;

// title : 주식 가격
// time : 20m
// Create by haerin on 2022/05/09

public class stackandqueue_three {

    class Solution {
        public int[] solution(int[] prices) {
            
            int[] answer = new int[prices.length];
            for(int i=0; i<prices.length; i++){
                int count =0;
                for(int j= i+1; j<prices.length; j++){
                    count+=1;
                    if(prices[i] > prices[j])
                        break;
                }
                        
                answer[i] = count;
            }
            return answer;
        }
    }
    
}
