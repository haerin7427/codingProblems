package Week4;

import java.util.Stack;

// https://leetcode.com/problems/two-sum/
// time : 40m
// Create by haerin on 2021/08/09
public class week4_D16_5 {
    class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Stack<Integer> stack = new Stack<>();
       
        
        for(int i =nums.length-1; i >-1; i--){
            //System.out.println("i/target : "+i+"/"+target);
            
            if(nums[i] <= target){
                //System.out.println("1");
                target -= nums[i];
                stack.push(i);
            }
            

            if(0 == i && target != 0){
                //System.out.println("2");
                int idx = stack.pop();
                target += nums[idx];
                i = idx;
            }
            //System.out.println("end i/target : "+i+"/"+target);
        }
        
        int idx = stack.size();
        int[] ans = new int[idx];
        while(!stack.empty())
            ans[--idx] = stack.pop();
        
        return ans;
        
    }
}
}

