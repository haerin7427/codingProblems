package programmers.LV1_java;

// https://programmers.co.kr/learn/courses/30/lessons/17681
// title : [1차]비밀지도
// time : 10m
// Create by haerin on 2022/02/25

public class Lv1_secret {

    class Solution {
        public String[] solution(int n, int[] arr1, int[] arr2) {
            String[] answer = new String[n];
            
            for(int i=0; i<n; i++)
                answer[i] = "";
            
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    int num1 = arr1[i] % 2;
                    int num2 = arr2[i] % 2;
                    
                    if(num1 == 0 && num2 == 0){
                        answer[i] += " ";
                    }else{
                        answer[i] += "#";
                    }
                    arr1[i] /= 2;
                    arr2[i] /= 2;
                }
                StringBuffer sb = new StringBuffer(answer[i]);
                answer[i] = sb.reverse().toString();
            }
            
            return answer;
        }
    }
    
}
