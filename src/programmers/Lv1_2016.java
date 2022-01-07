package programmers;

// https://programmers.co.kr/learn/courses/30/lessons/12901?language=java
// title : 2016년 
// time : 5년
// Create by haerin on 2022/01/07

public class Lv1_2016 {
    class Solution {
        public String solution(int a, int b) {
            String[] answer = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
            int[] days = {31,29,31,30,31,30,31,31,30,31,30,31};
            
            int sum_days = b;
            for(int i=0; i < a-1; i++)
                sum_days += days[i];
            int idx= sum_days%7;
            
            return answer[idx];
        }
    }
}
