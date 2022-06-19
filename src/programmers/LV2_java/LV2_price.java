package programmers.LV2_java;

// https://programmers.co.kr/learn/courses/30/lessons/42584
// title : 주식가격
// time : 5m
// Created by haerin on 2022/06/20

public class LV2_price {

    class Solution {
        public int[] solution(int[] prices) {
            int[] answer = new int[prices.length];
            
            for(int i=0; i<prices.length; i++){
                for(int j=i+1; j<prices.length; j++){
                    answer[i]  += 1;
                    if(prices[i] > prices[j])
                        break;
                }
            }
            return answer;
        }
    }
    
}
