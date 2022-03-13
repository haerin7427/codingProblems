package programmers.LV1_java;
// https://programmers.co.kr/learn/courses/30/lessons/12944
// title : 평균 구하기
// time : 1m
// Create by haerin on 2022/02/28

public class Lv1_math21 {

    class Solution {
        public double solution(int[] arr) {
            int sum = 0;
            for(int num : arr)
                sum += num;
            
            double answer = (double)sum / arr.length;
            return answer;
        }
    }
    
}
