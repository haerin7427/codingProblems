package grind75;

// https://leetcode.com/problems/two-sum/description/
// title : 1.Two Sum
// time : 5m
// Create by haerin on 2023/01/01

class week1No1 {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            for(int x=0; x<nums.length-1; x++) {
                for(int y=x+1; y<nums.length; y++) {
                    if(nums[x] + nums[y] == target) {
                        return new int[]{x,y};
                    }
                }
            }
            return new int[]{0,0};
        }
    }
}