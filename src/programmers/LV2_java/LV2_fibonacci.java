package programmers.LV2_java;

// https://programmers.co.kr/learn/courses/30/lessons/12945
// title : 피보나치 수
// time :20m
// Create by haerin on 2022/03/13

public class LV2_fibonacci {
    class Solution {
        public int solution(int n) {
            return fibonacci(n) % 1234567;
        }
        
        public int fibonacci(int n){
            int ans=0, num1=0, num2=1;
            for(int i=2; i<=n; i++){
                ans = (num1+num2) % 1234567;
                num1 = num2; num2 = ans;
            }
            return ans;
        }
    }
}
