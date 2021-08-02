package Week3;

// https://leetcode.com/problems/island-perimeter/
// time : 20m
// Create by 김해린 on 2021/08/02

public class week3_D11_1{

    public int islandPerimeter(int[][] grid) {
        
        int row = grid.length;
        int col = grid[0].length;
        int ans = 0;
        for(int y = 0; y < row; y++)
            for(int x = 0; x < col; x++){
                if(grid[y][x] == 1){
                    
                    if(x == 0 || grid[y][x-1] == 0)
                        ans += 1;
                    
                    if(x == col-1 || grid[y][x+1] == 0)
                        ans += 1;
                    
                    if(y == 0 || grid[y-1][x] == 0)
                        ans += 1;
                    
                    if(y == row-1 || grid[y+1][x] == 0)
                        ans += 1;

                }
            }
        
        return ans; 
    }

}