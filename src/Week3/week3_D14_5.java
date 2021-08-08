package Week3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/intersection-of-two-arrays-ii/
// time: 40m
// Create by 김해린 on 2021/08/08

public class week3_D14_5 {

    class Solution {
        public int[] intersect(int[] nums1, int[] nums2) {
            
            if(nums1==null || nums2==null)
                return null;
            
            if(nums1.length < nums2.length)
                return find(nums2, nums1);
            else
                return find(nums1, nums2);
            
        }
        
        private int[] find(int[] model, int[] test){
            
            Arrays.sort(model);
            Arrays.sort(test);
            List<Integer> ans = new ArrayList<Integer>();
            
    
            int start=0;
            
            for(int i=0; i < test.length; i++){
                
                for(int k=start; k < model.length; k++){
                
                    if(model[k] == test[i]){
                        ans.add(test[i]);
                        start=k+1;
                        break;
                    }
                }
                
                
                
            }
            
            int[] arrayAns = new int[ans.size()];
            int size=0;
            for(int temp : ans)
              arrayAns[size++] = temp;
    
            return arrayAns;
          
    
        }
    }
    
    
}
