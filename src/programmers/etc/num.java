package programmers.etc;

// 프로그래머스 "올바른 괄호의 개수"
// Create by haerin on 2022/05/10

public class num {
    class Solution {
        
        int answer = 0;
        public int solution(int n) {
            
            dfs(0,0,n);
            return answer;
        }
        
        public void dfs(int left, int right, int n ){
            if(left < right) return;
            
            if(left > n || right > n) return;
            
            if(left == n && right == n){
                answer += 1;
                return;
            }
            
            dfs(left+1, right, n);
            dfs(left, right+1, n);
        }
    }
    
}
