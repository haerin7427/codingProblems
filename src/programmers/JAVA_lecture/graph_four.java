package programmers.JAVA_lecture;
import java.util.*;

// 프로그래머스 "게임 맵 최단거리"
// Create by haerin on 2022//05/13

public class graph_four {
    class Solution {
        
        class Location{
            int x;
            int y;
            int cnt;
            
            Location(int x, int y, int cnt){
                this.x = x;
                this.y = y;
                this.cnt = cnt;
            }
        }
    
        public int solution(int[][] maps) {
            int[][] isVisited = new int[maps.length][maps[0].length];
            
            return bfs(maps,isVisited );
        }
        
        
        public int bfs(int[][] maps, int[][] isVisited){
            int[] dx = {1,0,-1,0};
            int[] dy = {0,1,0,-1};
            
            Queue<Location> queue = new LinkedList<>();
            queue.offer(new Location(0,0,1));
            
            while(!queue.isEmpty()){
                Location now = queue.remove();
                
                if(now.x == maps[0].length-1 && now.y == maps.length-1)
                    return now.cnt;
                
                for(int i=0; i<4; i++){
                    
                    int nx = now.x + dx[i];
                    int ny = now.y + dy[i];
                    
                    if(nx < 0 || ny < 0 || nx >= maps[0].length || ny >= maps.length) continue;
                    if(maps[ny][nx] == 0 || isVisited[ny][nx] == 1) continue;
                    
                    queue.offer(new Location(nx,ny,now.cnt+1));
                    isVisited[ny][nx] = 1;
                }
            }
            return -1;
            
            
        }
    }
}
