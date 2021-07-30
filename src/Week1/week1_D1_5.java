package Week1;

// https://leetcode.com/problems/plus-one
// time : 20m

public class week1_D1_5 {
    

    class Solution {
        public int[] plusOne(int[] digits) {
            
            for(int i = digits.length-1; i >= 0 ; i--){
    
                if(digits[i] == 9){ //더하기할 위치의 수가 9일 때
                    if(i == 0){   //ex. 9, 99, 999, 9999 이런 경우
                        int[] newDigits = new int[digits.length+1];
                        newDigits[0] = 1;
                        return newDigits;
                        
                        
                    }else
                        digits[i] = 0;
                    
                }else{
                    digits[i] += 1;
                    break;
                }
            }
            
            return digits;
            
        }
    }
}
