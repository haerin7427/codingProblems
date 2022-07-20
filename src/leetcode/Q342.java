package leetcode;

// https://leetcode.com/problems/power-of-four/
// title : 342. Power of Four
// time : 5m
// Created by haerin on 2022/07/20

public class Q342 {
    class Solution {
        public boolean isPowerOfFour(int n) {

            while(Math.abs(n) > 1){
                if(n%4 != 0)
                    return false;
                n /= 4;
            }

            if(n == 1)
                return true;
            else
                return false;
        }
    }
}
