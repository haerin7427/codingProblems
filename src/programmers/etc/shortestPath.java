package programmers.etc;
import java.util.*;

// 프로그래머스 "게임 맵 최단거리"

public class shortestPath {

    class Solution {
        int answer;
        public int solution(int[][] maps) {
            int row = maps.length;
            int col = maps[0].length;
            if(maps[row-1][col-2] == 0 && maps[row-2][col-1] == 0 && maps[row-2][col-2] == 0)
                return -1;
            
            Boolean[][] isVisited = new Boolean[row][col];
            for(int y=0; y<row; y++)
                for(int x=0; x<col; x++)
                    isVisited[y][x] = false;
            
            answer = row*col+1;
            isVisited[0][0] = true;
            dfs(maps,isVisited, 0,0,1);
            
            if(answer == row*col+1) answer = -1;
            return answer;
        }
        
        public void dfs(int[][] maps, Boolean[][] isVisited, int y, int x, int count){
            
            if(x == maps[0].length-1 && y == maps.length-1){
                if(answer > count) answer = count;
                return;
            }
            
            int[] dx = {-1,0,0,1};
            int[] dy = {0,1,-1,0};
            
            
            for(int i=0; i<4; i++){
                int nx = x+dx[i];
                int ny = y+dy[i];
                
                if(nx<0 || nx>=maps[0].length || ny<0 || ny>=maps.length) continue;
                
                if(maps[ny][nx] == 1 && isVisited[ny][nx] == false){
                    isVisited[ny][nx] = true;
                    dfs(maps,isVisited, ny,nx,count+1);
                    isVisited[ny][nx] = false;
                    
                }
            }
            
        }
    }
    
    class Solution2 {
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
            return bfs(maps);
        }
        
        int bfs(int[][] maps){
            
            int row = maps.length;
            int col = maps[0].length;
            
            int[] dy = {1,-1,0,0};
            int[] dx = {0,0,1,-1};
            
            Queue<Location> queue = new LinkedList<>();
            Boolean[][] isVisited = new Boolean[row][col];
            for(int i=0; i<isVisited.length; i++)
                for(int j=0; j<isVisited[0].length; j++)
                    isVisited[i][j] = false;
            
            int count = -1;
            queue.offer(new Location(0,0,1));
            isVisited[0][0] = true;
            
            while(!queue.isEmpty()){
                
                Location now = queue.remove();
                if(now.x == col-1 && now.y == row-1){
                    count = now.cnt;
                    break;
                }  
    
                for(int i=0; i<4; i++){
                    int nx = now.x + dx[i];
                    int ny = now.y + dy[i];
                    
                    if(nx < 0 || nx >= col || ny < 0 || ny >= row ) continue;
                    if(maps[ny][nx] == 0 || isVisited[ny][nx]) continue;
                    queue.offer(new Location(nx,ny,now.cnt+1));
                    isVisited[ny][nx] = true;
                }
            }
            
            return count;
            
        }
    }
}
