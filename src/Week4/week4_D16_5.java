package Week4;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/two-sum/
// time : 60m
// Create by haerin on 2021/08/09 + Discussion

public class week4_D16_5 {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            
            Map<Integer, Integer> numsToMap = new HashMap<>();
            for(int i = 0; i< nums.length; i++) {
                if(numsToMap.containsKey(target-nums[i])){
                    return new int[]{numsToMap.get(target-nums[i]), i};
                }
                numsToMap.put(nums[i], i);
            }
            return null;
            
        }
    }
}

