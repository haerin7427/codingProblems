package programmers.LV2_java;
import java.util.*;

// https://programmers.co.kr/learn/courses/30/lessons/1844
// title : 게임 맵 최단거리
// time : 40m
// Created by haerin on 2022/07/01

public class LV2_game {
    class Solution {
        int[][] move = new int[][] {{0,1},{1,0},{0,-1},{-1,0}};
        
        class Position{
            int x;
            int y;
            int count;
            
            Position(int y, int x, int c){
                this.y = y;
                this.x = x;
                this.count = c;
            }
        }
        
        public int solution(int[][] maps) {
            int n = maps.length;
            int m = maps[0].length;
            
            boolean[][] isVisited = new boolean[n][m];
            
            Queue<Position> queue = new LinkedList<>();
            queue.offer(new Position(0,0,1));
            isVisited[0][0] = true;
            
            while(!queue.isEmpty()){
                Position p = queue.remove();  
                
                if(p.x == m-1 && p.y == n-1)
                    return p.count;
                
                
                int nc = p.count + 1;
                for(int i=0; i<4; i++){
                    int ny = p.y+move[i][0];
                    int nx = p.x+move[i][1];
                    
                    if(ny < 0 || nx < 0 || ny > n-1 || nx > m-1) continue;
                    if(maps[ny][nx] == 0 || isVisited[ny][nx] == true) continue;
                    
                    queue.offer(new Position(ny,nx,nc));
                    isVisited[ny][nx] = true;
                }
            }
            return -1;
        }
    }
}