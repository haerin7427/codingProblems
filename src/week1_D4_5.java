
// https://leetcode.com/problems/power-of-four/
// time : 10m

public class week1_D4_5 {

    class Solution {
        public boolean isPowerOfFour(int n) {
            
            if(n <= 0)
                return false;
            else if(n == 1)
                return true;
            
            
            while(n >= 4){
                if(n % 4 == 0)
                    n = n / 4;
                else 
                    return false;
            }
            
            if(n != 1)
                return false;
            else
                return true;
        }
    }
    
}
