package grind75;
// https://leetcode.com/problems/binary-search/
// title : 704. Binary Search
// time : 15m
// type : BFS
// Created by haerin on 2023/01/15
public class week1No8 {class Solution {
    public int search(int[] nums, int target) {
        int left=0;
        int right = nums.length-1;

        while(left <= right) {
            int mid = (left+right)/2;

            if(nums[mid] == target) {
                return mid;
            } else if(nums[mid] < target) {
                if(left == mid)
                    left += 1;
                else
                    left = mid;
            } else {
                if(right == mid) 
                    right -= 1;
                else
                    right = mid;
            }
        }
        return -1;
    }
}

    
}
