package Week2;

// https://leetcode.com/problems/binary-search/
// time : 23m

public class week2_D8_5 {
    
    class Solution {
        public int search(int[] nums, int target) {
            
            int idx = nums.length / 2;
            int minR = -1;
            int maxR = nums.length;
            
            while(true){
                int prev = idx;
                if(nums[idx] == target){
                    return idx;
                }
                else if(nums[idx] > target){    //target이 더 큰 경우,
                    idx = (minR + idx) /2;
                    maxR = prev;
                }else {                         //target이 더 작은 경우,
                    idx = (idx + maxR) /2;     
                    minR = prev;
                }
                
                if(prev == idx)
                    break;
            }
            
            return -1;
        }
    }
    
}
