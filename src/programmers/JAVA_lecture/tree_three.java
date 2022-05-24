package programmers.JAVA_lecture;
import java.util.*;
// title : 순위
// time : 30m
// Create by haerin on 2022/05/24 + video

public class tree_three {

    class Solution {
        class Node{
            int n;
            int cnt_win=0;
            int cnt_lose=0;
            Boolean isVisted = false;
            List<Node> links = new LinkedList<>();
            
            Node(int n){ this.n = n; }
        }
        public int solution(int n, int[][] results) {
            List<Node> list = new ArrayList<>();
            for(int i=0; i<n; i++) list.add(new Node(i+1));
            
            for(int[] result : results){
                Node winner = list.get(result[0]-1);
                Node loser = list.get(result[1]-1);
                winner.links.add(loser);
            }
            
            for(Node winner : list){
                
                for(Node node : list) {node.isVisted = false;}
                
                Queue<Node> q = new LinkedList<>();
                
                winner.isVisted = true;
                q.offer(winner);
                
                while(!q.isEmpty()){
                    Node now = q.poll();
                    
                    for(Node loser : now.links){
                        if(loser.isVisted) continue;
                        loser.isVisted = true;
                        
                        q.offer(loser);
                        winner.cnt_win += 1;
                        loser.cnt_lose += 1;
                    }
                }
            }
            
            int answer = 0;
            for(Node node : list ){
                if(node.cnt_win + node.cnt_lose == n-1) answer+=1;
            }
            return answer;
        }
    }
    
}
