package programmers.LV2_java;
import java.util.*;

// https://programmers.co.kr/learn/courses/30/lessons/42747
// title : H-index
// time : 15m
// Created by haerin on 2022/07/03

public class LV2_Hindex {
    class Solution {
        public int solution(int[] citations) {
            int limit = citations[0];
            for(int i=1; i<citations.length; i++)
                if(limit < citations[i])
                    limit = citations[i];
            
            int max=0;
            for(int h=0; h<=limit; h++){
                int up=0; int down=0;
                for(int i=0; i<citations.length; i++){
                    
                    if (citations[i] >= h) up +=1;
                    if (citations[i] <= h) down +=1;
                }
                if(up >= h && down <= h && max < h)
                    max = h;
            }
            return max;
        }
    }
}
