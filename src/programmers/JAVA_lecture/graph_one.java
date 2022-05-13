package programmers.JAVA_lecture;
import java.util.*;

// 프로그래머스 "네트워크"
// Create by haerin on 2022//05/13

public class graph_one {
    class Solution {
        public int solution(int n, int[][] computers) {
            
            Boolean[] isVisited = new Boolean[computers.length];
            for(int i=0; i<isVisited.length; i++)
                isVisited[i] = false;
            
            int answer = 1;
            Stack<Integer> stack = new Stack<>();
            stack.push(0);
            isVisited[0] = true;
            
            while(!stack.empty()){
                int index = stack.pop();
                
                for(int i=0; i<computers.length; i++){
                    if(i == index) continue;
                    if(computers[index][i] == 1 && !stack.contains(i) && !isVisited[i]){
                        stack.push(i);
                        isVisited[i] = true;
                    }
                }
                
                if(!stack.empty()) continue;
                for(int i=0; i<computers.length; i++){
                    if(!stack.contains(i) && !isVisited[i]){
                        answer += 1;
                        stack.push(i);
                        isVisited[i] = true;
                        break;
                    }
                }
                
            }
            return answer;
        }

        public int solution2(int n, int[][] computers) {
            int answer = 0;
            Boolean[] isVisited = new Boolean[computers.length];
            for(int i=0; i<isVisited.length; i++)
                isVisited[i] = false;
            
            for(int i=0; i<isVisited.length; i++){
                if(!isVisited[i]){
                    answer+=1;
                    dfs(computers,isVisited,i);
                }
            }
            return answer;
        }
        
        public void dfs(final int[][] computers, Boolean[] isVisited, int n){
            
            for(int i=0; i<computers.length; i++){
                if(computers[n][i] == 1 && !isVisited[i]){
                    isVisited[i] = true;
                    dfs(computers,isVisited,i);
                }
            }
        }

    
    }
}
