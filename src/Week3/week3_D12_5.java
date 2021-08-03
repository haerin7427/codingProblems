package Week3;

// https://leetcode.com/problems/next-greater-element-i/
// time : 15m
// Create by 김해린 on 2021/08/03

public class week3_D12_5 {
    class Solution {
        public int[] nextGreaterElement(int[] nums1, int[] nums2) {
            
            int[] ans = new int[nums1.length];
            
            for(int i=0; i < nums1.length; i++){
                ans[i] = -1;
                for(int h=0; h < nums2.length-1; h++){
                    if(nums1[i] == nums2[h] ){
                        
                        for(int k = h+1;k <nums2.length;k++){
                            if(nums2[h] < nums2[k]){
                                ans[i] = nums2[k];
                                break;
                            }
                        }
                        break;
                    }
                }
            }
            return ans;
        }
    }
}
