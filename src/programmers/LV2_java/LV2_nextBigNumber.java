package programmers.LV2_java;

// https://programmers.co.kr/learn/courses/30/lessons/12911
// title : 다음 큰 숫자
// time : 5m
// Created by haerin on 2022/06/24

public class LV2_nextBigNumber {

    class Solution {
        public int solution(int n) {
            int n_number_one = count_one(n);
            int number = n+1;
            while(true){
                if(n_number_one == count_one(number))
                    break;
                number += 1;
            }
            return number;
        }
        
        public int count_one(int n){
            int count = 0;
            while(n >= 2){
                if(n%2 == 1) count+=1;
                n /= 2;
            }
            if(n%2 == 1) count+=1;
            return count;
        }
    }
    
}
