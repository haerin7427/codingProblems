package programmers.LV1_java;

// https://programmers.co.kr/learn/courses/30/lessons/12950
// title : 행렬의 덧셈
// time : 5m
// Create by haerin on 2022/02/25

public class Lv1_math18 {

    class Solution {
        public int[][] solution(int[][] arr1, int[][] arr2) {
            int[][] answer = new int[arr1.length][arr1[0].length];
            
            for(int x=0; x<arr1.length; x++)
                for(int y=0; y<arr1[0].length; y++){
                    answer[x][y] = arr1[x][y] + arr2[x][y];
                }
            
            return answer;
        }
    }

}