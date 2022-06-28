package programmers.LV2_java;

// https://programmers.co.kr/learn/courses/30/lessons/12949
// title : 행렬의 곱셈
// time : 5m
// Created by haerin on 2022/06/28

public class LV2_multi {
    class Solution {
        public int[][] solution(int[][] arr1, int[][] arr2) {
            int[][] answer = new int[arr1.length][arr2[0].length];
            
            for(int y=0; y<answer.length; y++){
                for(int x=0; x<answer[0].length; x++){
                    
                    for(int j=0; j<arr1[0].length; j++)
                        answer[y][x] += arr1[y][j] * arr2[j][x];
                }
            }
            return answer;
        }
    }
}