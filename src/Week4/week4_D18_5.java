package Week4;

// https://leetcode.com/problems/climbing-stairs/
// time: 10m
// Create by haerin on 2021/09/01

public class week4_D18_5 {

    class Solution {
        public int climbStairs(int n) {
            
            int dp[]=new int[n+1];
            dp[0]=1;
            dp[1]=1;
            
            for(int i=2;i<=n;i++){
                dp[i]=dp[i-1]+dp[i-2];
            }
            
            return dp[n];
            
        }
    }
    
}
