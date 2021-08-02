package Week3;

// https://leetcode.com/problems/search-in-rotated-sorted-array/
// time: 10m
// Create by 김해린 on 2021/08/02

public class week3_D11_7 {

    class Solution {
        public int search(int[] nums, int target) {
            
            for(int i =0; i < nums.length;i++)
                if(nums[i] == target)
                    return i;
            return -1;
            
        }
    }
    
}
