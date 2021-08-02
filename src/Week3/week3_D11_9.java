package Week3;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/spiral-matrix/
// time: 30m
// Create by 김해린 on 2021/08/02
// 다음에는 visit 없이 풀어보기!

public class week3_D11_9 {

    class Solution {
        public List<Integer> spiralOrder(int[][] matrix) {
            int[] dx = {1,0,-1,0};
            int[] dy = {0,1,0,-1};
            
            int[][] visit = new int[matrix.length][matrix[0].length];
            int x =0, y=0; int idx =0;
            List<Integer> list = new ArrayList<>(); 
            list.add(matrix[y][x]);
            visit[y][x] = 1;
            
            if(matrix[0].length == 1)
                idx =1;
            
            while(true){

                int count = 0;
                int len;
                if(dx[idx] == 0)
                    len = matrix.length-1;
                else
                    len = matrix[0].length-1;

                
                for(int i =0; i <len; i++){

                    x += dx[idx];
                    y += dy[idx];
  
                    if(visit[y][x] == 0){
                        visit[y][x] = 1;
                        list.add(matrix[y][x]);
                        count++;
                    }else{
                        x -= dx[idx];
                        y -= dy[idx];
                        break;
                    }
                        
                }
                
                idx += 1;
                if(idx>3)
                    idx -= 4;
                
                if(count == 0)
                    break;
            }
            return list;
            
        }
    }
    
}
