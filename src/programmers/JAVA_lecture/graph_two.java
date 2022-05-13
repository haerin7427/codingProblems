package programmers.JAVA_lecture;

// 프로그래머스 "타겟 넘버"
// Create by haerin on 2022//05/13

public class graph_two {

    class Solution {
        int count = 0;
        public int solution(int[] numbers, int target) {
            dfs(numbers, 0, 0, target);
            return count;
        }
        
        public void dfs(int[] numbers, int num, int index, int target){
            
            if(index == numbers.length) {
                if(num == target) count += 1;
            }else{
                dfs(numbers, num-numbers[index],index+1, target);
                dfs(numbers, num+numbers[index],index+1, target);
            }
        }
    }

    class Solution2 {
        public int solution(int[] numbers, int target) {
            return dfs(numbers, 0, 0, target);
        }
        
        public int dfs(final int[] numbers, int num, int index, final int target){
            
            if(index == numbers.length) {
                if(num == target)
                    return 1;
                else 
                    return 0;
            }
            
            return dfs(numbers, num-numbers[index],index+1, target) + dfs(numbers, num+numbers[index],index+1, target);
        }
    }
    
}
