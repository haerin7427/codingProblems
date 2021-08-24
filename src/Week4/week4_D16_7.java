package Week4;

// https://leetcode.com/problems/uncrossed-lines/
// time: 15m
// Create by haerin on 2021/08/24 + Discussion

public class week4_D16_7 {

    class Solution {
        public int maxUncrossedLines(int[] nums1, int[] nums2) {
            
            int n = nums1.length; int m = nums2.length;
            int[][] dp = new int[n+1][m+1];  
            
            for(int x=1; x <=n; x++){
                for(int y=1; y <=m; y++){
                    // dp[x][y]는 nums1[0~x-1]까지의 수와 nums2[0~y-1]까지의 수 조합으로 그을 수 있는 선의 개수를 저장
                    if(nums1[x-1] == nums2[y-1]){
                        dp[x][y] = 1 + dp[x-1][y-1];
                    }else{
                        dp[x][y] = Math.max(dp[x-1][y] , dp[x][y-1]);
                    }

                }
            }

            return dp[n][m];
    
        }
    }
    
}
