package programmers.LV1_java;

// https://programmers.co.kr/learn/courses/30/lessons/68935
// title : 3진법 뒤집기
// time : 10m
// Create by haerin on 2022/01/13

public class Lv1_math7 {

    class Solution {
        public int solution(int n) {
            int answer = 0;
            String tmp = "";
            
            while(n>=3){
                tmp += Integer.toString(n%3);
                n = n/3;
            }
            tmp += Integer.toString(n);
            
            int len = tmp.length();
            for(int i=0; i < len; i++){
                int num = Integer.parseInt(tmp.substring(i,i+1));
                answer += num * Math.pow(3,len-1-i);
            }
            return answer;
        }
    }
    
}
