package leetcode;
import java.util.*;

// https://leetcode.com/problems/pascals-triangle/
// title : 118.Pascal's Triangle
// time : 10m
// Created by haerin on 2022/07/13

public class Q118 {
    class Solution {
        public List<List<Integer>> generate(int numRows) {
            
            int[][] triangle = new int[numRows][];
            triangle[0] = new int[]{1};
            
            for(int y=1; y<numRows; y++){
                triangle[y] = new int[y+1];
                
                for(int x=0; x<triangle[y].length; x++){
                    if(x == 0 || x == triangle[y].length-1)
                        triangle[y][x]=1;
                    else
                        triangle[y][x]= triangle[y-1][x-1] + triangle[y-1][x];
                }
            }
            
            List<List<Integer>> answer = new ArrayList<>();
            for(int[] y : triangle){
                List<Integer> list = new ArrayList<>();
                for(int x : y)
                    list.add(x);
                answer.add(list);
            }
            return answer;
        }
    }
}