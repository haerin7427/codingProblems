package programmers;

// https://programmers.co.kr/learn/courses/30/lessons/82612
// title : 부족한 금액 계산하기
// time : 2m
// Create by haerin on 2022/01/25

public class Lv1_math12 {

    class Solution {
        public long solution(int price, int money, int count) {
            long sum = 0;
            for(int i =1; i <= count; i++)
                sum += price * i;
            
            long answer = sum - money;
            return answer > 0 ? answer: 0;
        }
    }
    
}
