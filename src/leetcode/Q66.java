package leetcode;
import java.math.*;

// https://leetcode.com/problems/plus-one/
// title : 66. Plus One
// time : 30m
// Created by haerin on 2022/07/14

public class Q66 {
    class Solution {
        public int[] plusOne(int[] digits) {
            digits[digits.length-1] += 1;
            
            for(int i=digits.length-1; i>=0; i--){
                if(digits[i] > 9){
                    digits[i] = 0;
                    if(i > 0)
                        digits[i-1] += 1;
                    else
                        return getNewArray(digits);
                }else 
                    break;
            }
            
            return digits;
        }
        
        private int[] getNewArray(int[] digits){
            int[] answer = new int[digits.length+1];
            answer[0] = 1;
            for(int i=0; i<digits.length; i++){
                answer[i+1] = digits[i];
            }
            return answer;
        }
    }
}