package Week3;

import java.util.Stack;

// https://leetcode.com/problems/sort-array-by-parity-ii/
// time: 15m
// Create by 김해린 on 2021/08/03

public class week3_D12_1 {
    class Solution {
        public int[] sortArrayByParityII(int[] nums) {
            
            
            Stack<Integer> oddS = new Stack<Integer>();
            Stack<Integer> evenS = new Stack<Integer>();
            
            for(int i = 0; i < nums.length; i++)
                if(nums[i] %2 == 0)
                    evenS.push(nums[i]);
                else
                    oddS.push(nums[i]);
            
            for(int i = 0; i <nums.length; i++)
                if(i % 2 == 0)
                    nums[i] = evenS.pop();
                else
                    nums[i] = oddS.pop();
            return nums;
        }
    }
}


// int even = 0, odd = 1;
//         while(true){
//             while(even < A.length && A[even] % 2 == 0) /*(1)*/
//                 even += 2;
//             while(odd < A.length && A[odd] % 2 != 0) /*(2)*/
//                 odd += 2;
//             if(odd >= A.length || even >= A.length) return A;
			
// 			/*(3)*/
//             int temp = A[even];
//             A[even] = A[odd];
//             A[odd] = temp;
//         }
