package leetcode;

// https://leetcode.com/problems/add-digits/
// title : 258. Add Digits
// time : 5m
// Created by haerin on 2022/07/17

public class Q258 {
    class Solution {
        public int addDigits(int num) {

            while(num > 9){
                String s = String.valueOf(num);
                int sum = 0;
                for(char c : s.toCharArray())
                    sum += c - '0';
                num = sum;
            }

            return num;
        }
    }
}
