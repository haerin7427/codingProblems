package programmers.etc;
// 프로그래머스 "정수 삼각형"
public class integerTriangle {

    class Solution {
        int answer = 0;
        public int solution(int[][] triangle) {
            
            int depth = triangle.length-1;
            for(int y=1; y<triangle[depth].length; y++){
                
                for(int x=0; x<triangle[y].length; x++){
                    if(x == 0) triangle[y][x] += triangle[y-1][x];
                    else if(x == triangle[y].length-1) triangle[y][x] += triangle[y-1][x-1];
                    else{
                        if(triangle[y-1][x] > triangle[y-1][x-1])
                            triangle[y][x] += triangle[y-1][x];
                        else
                            triangle[y][x] += triangle[y-1][x-1];
                    }
                }
            }
    
            
            
            
            int max = 0;
            for(int i=0; i<triangle[depth].length; i++)
                if(max < triangle[depth][i] ) max = triangle[depth][i];
            return max;
        }
        
        
    }
    
}
