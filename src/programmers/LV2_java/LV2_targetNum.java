package programmers.LV2_java;

// https://programmers.co.kr/learn/courses/30/lessons/43165
// title : 타겟 넘버
// time : 20m
// Create by haerin on 2022/03/20

public class LV2_targetNum {

    class Solution {

        public int solution(int[] numbers, int target) {
            int ans = dfs(numbers, 0, target, 0);
            return ans;
        }
        
        public int dfs(int[] numbers, int depth, int target, int sum){
            if(depth == numbers.length){
                if(sum == target)
                    return 1;
                else 
                    return 0;
            }else
                return dfs(numbers, depth+1, target, sum+numbers[depth]) + dfs(numbers, depth+1, target, sum-numbers[depth]);
        }
    }
    
}
