package Week4;

import java.util.ArrayList;

// https://leetcode.com/problems/intersection-of-two-arrays/
// time: 20m
// Create by haerin on 2021/08/25

public class week4_D17_5 {

    class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            ArrayList ans = new ArrayList();
            if(nums1.length < nums2.length)
               return getList(nums1, nums2);
            else
                return getList(nums2, nums1);  
        }
        
        private int[] getList(int[] nums1, int[] nums2){
            
            ArrayList ans = new ArrayList();
            ArrayList list_num2 = new ArrayList();
            for(int i=0; i<nums2.length; i++)
                list_num2.add(nums2[i]);
            
            for(int i=0; i<nums1.length; i++)
                if(!ans.contains(nums1[i]) && list_num2.contains(nums1[i]))
                    ans.add(nums1[i]);
            
            int[] arr = new int[ans.size()];
            for(int i=0; i<ans.size(); i++)
                arr[i] = (int)ans.get(i);
            
            return arr;
        }
    }
    
}
