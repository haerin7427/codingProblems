package Week3;

import java.util.Arrays;

// https://leetcode.com/problems/wiggle-sort-ii/
// time : 50m
// Create by 김해린 on 2021/08/03

public class week3_D12_7 {

    class Solution {
        public void wiggleSort(int[] nums) {
            int idx1 = nums.length/2;
            int idx2 = nums.length;
            Arrays.sort(nums);
            
            if(nums.length %2 != 0)
                idx1 +=1;
    
            int[] ans = new int[nums.length];
            for(int i =0; i<nums.length;i++)
                if(i%2== 0)
                    ans[i] = nums[--idx1];
                else
                    ans[i] = nums[--idx2];
            
            for(int i =0; i<nums.length;i++)
                nums[i] = ans[i];  
        }
    }
    
}
