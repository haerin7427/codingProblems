package Week2;

// https://leetcode.com/problems/majority-element/
// time : 30m
public class week2_D7_3 {

    class Solution {
        public int majorityElement(int[] nums) {
            
            
            int count = nums.length;
            
            int[][] arr = new int[count][2];
            int arr_num = 0;
            
            for(int i = 0; i < count; i++){
                
                int idx = 0;
                while(idx < arr_num){
                    if(arr[idx][0] == nums[i]){
                        arr[idx][1] += 1;
                    
                        if(arr[idx][1] > count/2 )
                            return arr[idx][0]; 
                        
                        break;
                    }
                    idx += 1;
                }
                
                
                if(idx == arr_num){
                    arr[arr_num][0] = nums[i];
                    arr[idx][1] += 1;
                    
                    if(arr[idx][1] > count/2 )
                        return arr[idx][0]; 
                    arr_num += 1;
                }
            }
            
            
            return 0;
            
        }
    }
    
}

// new idea
// int len = nums.length;
//         Arrays.sort(nums);
//         return nums[len/2];
