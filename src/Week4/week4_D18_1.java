package Week4;

// https://leetcode.com/problems/counting-bits/
// time: 20m
// Create by haerin on 2021/08/11

public class week4_D18_1 {

    class Solution {
        public int[] countBits(int n) {
            
            int[] ans = new int[n+1];
            
            while(n> -1){
                int num = n;
                
                do{
                    if(num%2 ==1)
                        ans[n] += 1;
                    num = num/2;
                }while(num > 1);
                
                if(num==1)
                    ans[n] += 1;
                n -= 1;
            }
            return ans;  
        }
    }
    
}
