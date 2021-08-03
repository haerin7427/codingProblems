package Week3;

import java.util.Arrays;

// https://leetcode.com/problems/kth-largest-element-in-a-stream/
// time : 40m
// Create by 김해린 on 2021/08/31

public class week3_D12_3 {

    class KthLargest {
        private static int[] arraySort = new int[20000];
        private static int k_large;
        private static int count;
        
        public KthLargest(int k, int[] nums) {
            Arrays.sort(nums);
            for(int i=0; i<nums.length;i++)
                this.arraySort[i] = nums[i];
            this.k_large = k;
            this.count = nums.length;
            
        }
        
        public int add(int val) {
            //System.out.println("val: " + val);
    
            arraySort[count] = val;
            count+=1;
            Arrays.sort(arraySort,0,count);
            
            return arraySort[count-k_large];
        }
    }
    
}
