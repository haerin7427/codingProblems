package programmers.LV1_java;

//  https://programmers.co.kr/learn/courses/30/lessons/42862
// title : 체육복
// time : 10m
// Create by haerin on 2022/01/08

public class Lv1_borrow {
    class Solution {
        public int solution(int n, int[] lost, int[] reserve) {
            int answer = 0;
            int[] students = new int[n];
            for(int i=0; i < n; i++)
                students[i] = 1;
            for(int lostStudent : lost)
                students[lostStudent-1] -= 1;
            
            for(int reserveStudent : reserve)
                students[reserveStudent-1] += 1;
            
            for(int i=0 ; i<n; i++){
                if(students[i] == 0){
                    if( i != 0 && students[i-1] > 1){
                        students[i] = 1;
                        students[i-1] = 1; 
                    }else if(i != n-1 && students[i+1] > 1){
                        students[i] = 1;
                        students[i+1] = 1; 
                    }
                }
                
                if(students[i]  > 0)
                    answer+=1;
            }
                
            return answer;
        }
    }
}
