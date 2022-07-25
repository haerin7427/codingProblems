package leetcode;

// https://leetcode.com/problems/valid-perfect-square/
// title : 367. Valid Perfect Square
// time : 1m
// Created by haerin on 2022/07/25

public class Q367 {
    class Solution {
        public boolean isPerfectSquare(int num) {
            int n = (int)Math.sqrt(num);
            
            if(Math.pow(n,2) == num) 
                return true;
            else 
                return false;
        }
    }
}