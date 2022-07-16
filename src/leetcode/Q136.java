package leetcode;
import java.util.HashMap;

// https://leetcode.com/problems/single-number/
// title : 136. Single Number
// time : 5m
// Created by haerin on 2022/07/16

public class Q136 {
    class Solution {
        public int singleNumber(int[] nums) {
            HashMap<Integer, Integer> box = new HashMap<>();
            
            for(int num : nums)
                box.put(num, box.getOrDefault(num, 0)+1);
            int answer = 0;
            for(int num : box.keySet())
                if(box.get(num) == 1){
                    answer = num;
                    break;
                }
            
            return answer;
        }
    }
}