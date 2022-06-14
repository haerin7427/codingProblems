package programmers.LV2_java;
import java.util.*;

// https://programmers.co.kr/learn/courses/30/lessons/42746
// title : 가장 큰 수 
// time : 25m
// Created by haerin on 2022/06/14

public class LV2_maxNum {
    class Solution {
        public String solution(int[] numbers) {
            
            String[] numList = new String[numbers.length];
            for(int i=0; i<numbers.length; i++)
                numList[i] = String.valueOf(numbers[i]);
            
            Arrays.sort(numList, new Comparator<String>(){
                    @Override
                    public int compare(String s1, String s2){
                        return (s2+s1).compareTo(s1+s2);
                    }
            });
            
            if(numList[0].equals("0")) return "0";
            
            StringBuffer sb = new StringBuffer();
            for(String n : numList)
                sb.append(n);
            return sb.toString();
        }
    }
}