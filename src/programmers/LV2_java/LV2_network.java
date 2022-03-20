package programmers.LV2_java;

// https://programmers.co.kr/learn/courses/30/lessons/43162
// title : 네트워크
// time : 25m
// Create by haerin on 2022/03/20

public class LV2_network {
    class Solution {
        public int solution(int n, int[][] computers) {
            int answer = 0;
            boolean[] isVisited = new boolean[n];
            
            for(int i=0; i<n; i++)
                isVisited[i] = false;
            for(int i=0; i<n; i++){
                if(isVisited[i] == false){
                    answer += 1;
                    dfs(n, computers, isVisited, i);
                }
            }
            
            return answer;
        }
        
        public void dfs(int n, int[][] computers, boolean[] isVisited, int node){
            
            isVisited[node] = true;
            
            for(int i=0; i<n; i++){
                if(computers[node][i] == 1 && isVisited[i] == false)
                    dfs(n, computers, isVisited, i);
            }
            
        }
    }
}
