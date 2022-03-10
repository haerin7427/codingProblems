package programmers;

// https://programmers.co.kr/learn/courses/30/lessons/12935#
// title : 제일 작은 수 제거하기
// time : 15m
// Create by haerin on 2022/03/10

public class Lv1_math27 {

    class Solution {
        public int[] solution(int[] arr) {
            int[] answer;
            if(arr.length == 1){
                answer = new int[1];
                answer[0] = -1;
            }else{
                int minValueIdx=0; int minValue = arr[0];
                for(int i=1; i<arr.length; i++){
                    if(minValue > arr[i]){
                        minValueIdx = i;
                        minValue = arr[i];
                    }
                }
                
                answer = new int[arr.length-1];
                int idx=0;
                for(int i=0; i<arr.length; i++){
                    if(minValueIdx != i){
                        answer[idx] = arr[i];
                        idx += 1;
                    }
                }
            }
            return answer;
        }
    }
    
}
