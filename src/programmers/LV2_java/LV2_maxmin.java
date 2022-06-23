package programmers.LV2_java;
import java.util.*;

// https://programmers.co.kr/learn/courses/30/lessons/12939
// title : 최댓값과 최솟값
// time : 3m
// Created by haerin on 2022/06/23

public class LV2_maxmin {
    class Solution {
        public String solution(String s) {
            
            String[] str = s.split(" ");
            int[] arr = new int[str.length];
            
            for(int i=0; i<str.length; i++)
                arr[i] = Integer.parseInt(str[i]);
            Arrays.sort(arr);
            
            StringBuffer sb = new StringBuffer();
            sb.append(arr[0]).append(" ").append(arr[arr.length-1]);
            return sb.toString();
        }
    }
}