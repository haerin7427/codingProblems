package programmers.LV1_java;

// https://programmers.co.kr/learn/courses/30/lessons/12940#
// title : 최대공약수와 최소공배수
// time : 10m
// Create by haerin on 2022/03/03

public class Lv1_math23 {

    class Solution {
        public int[] solution(int n, int m) {
            int[] answer = {1,n*m};
            int max = 0;
            if(n > m)
                max = n;
            else 
                max = m;
            
            for(int i=max; i>1;i--){
                if(n%i==0 && m%i==0){
                    answer[0] = i;
                    
                    for(int k=1; i*k<=n*m; k++){
                        if((i*k)%n==0 && (i*k)%m==0){
                            answer[1] = i*k;
                            break;
                        }
                    }
                    
                    break;
                }
            }            
            
            return answer;
        }
    }
    
}
