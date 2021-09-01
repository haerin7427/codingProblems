package Week4;

// https://leetcode.com/problems/maximum-subarray/
// time: 40m
// Create by haerin on 2021/08/24 + Discussion

public class week4_D17_1 {

    class Solution {
        public int maxSubArray(int[] nums) {
    
            int sum=nums[0], max=nums[0];
            for(int i=1;i<nums.length;i++){
                if(sum<0) // 합이 음수값으로 나오는 부분들은 지워버림
                    sum=nums[i];
                else
                    sum=sum+nums[i];
    
                max=Math.max(max,sum);
            }
            
            return max;
        }
    }
    
}
