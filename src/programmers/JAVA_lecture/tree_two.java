package programmers.JAVA_lecture;
import java.util.*;

// title : 가장 먼 노드
// time : 20m
// Create by haerin on 2022/05/24

public class tree_two {
    class Solution {
        
        class Node{
            int n;
            int dist=0;
            boolean isVisited=false;
            List<Node> links = new LinkedList<>();
            
            Node(int n){this.n = n;}
        }
        
        public int solution(int n, int[][] edge) {
            List<Node> list = new ArrayList<>();
            for(int i=0; i<n; i++) list.add(new Node(i+1));
            
            for(int[] e : edge){
                Node n1 = list.get(e[0]-1);
                Node n2 = list.get(e[1]-1);
                
                n1.links.add(n2);
                n2.links.add(n1);
            }
            
            int max_dist=0;
            Queue<Node> q = new LinkedList<>();
            Node first_node = list.get(0);
            first_node.isVisited = true;
            q.offer(first_node);
            
            while(!q.isEmpty()){
                Node now = q.poll();
                
                for(Node link_node : now.links){
                    if(link_node.isVisited) continue;
                    
                    link_node.isVisited = true;
                    link_node.dist = now.dist+1;
                    q.offer(link_node);
                    max_dist = Math.max(max_dist, link_node.dist);
                }
            }
            
            int answer = 0;
            for(Node node : list)
                if(max_dist == node.dist) answer += 1;
            
            return answer;
        }
    }
}
