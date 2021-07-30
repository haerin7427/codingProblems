package Week2;

// https://programmers.co.kr/learn/courses/30/lessons/12901
// time : 20m
// Create by 김해린 on 2021/07/30

public class week2_D10_5 {

    class Solution {
        public String solution(int a, int b) {
            String answer = "";
            String[] name = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
            int[] days = {31,29,31,30,31,30,31,31,30,31,30,31};
            
            int totalDays = 0;
            
            for(int i = 0 ; i < a-1; i++)
                totalDays += days[i];
            
            totalDays += (b-1);
            
            int idx = totalDays % 7;
            
            idx += 5;
            
            if(idx > 6)
                answer = name[idx-7];
            else
                answer = name[idx];
            
            return answer;
        }
    }
    
}
