package Week3;

// https://leetcode.com/problems/range-sum-query-immutable/
// time : 15m + help
// Create by 김해린 on 2021/08/02

public class week3_D11_3 {
    class NumArray {
    
        private static int[] sum;
    
        public NumArray(int[] nums) {
            for (int i = 1; i < nums.length; ++i)
                nums[i] += nums[i - 1];
            this.sum = nums;
        }
        
        public int sumRange(int left, int right) {
            return sum[right] - (left == 0 ? 0 : sum[left - 1]);
        }
    }
}


