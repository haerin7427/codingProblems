package programmers.LV1_java;

// https://programmers.co.kr/learn/courses/30/lessons/12916
// title : 문자내 p와 y의 개수
// time : 5m
// Create by haerin on 2022/01/28

public class Lv1_math15 {
    class Solution {
        boolean solution(String s) {
            boolean answer = false;
            s = s.toLowerCase();
            
            int numP=0, numY =0;
            int idxP = s.indexOf("p");
            while(idxP>-1){
                numP += 1;
                idxP = s.indexOf("p",idxP+1);
            }
            
            int idxY = s.indexOf("y");
            while(idxY>-1){
                numY += 1;
                idxY = s.indexOf("y",idxY+1);
            }
                
            
            if(numP == numY)
                answer = true;
            return answer;
        }
    }
}
