package Week1;
import java.util.Arrays;
import java.util.Comparator;

// https://leetcode.com/problems/two-city-scheduling/
// time : 55m

public class week1_D1_9 {

    class Solution {
        public int twoCitySchedCost(int[][] costs) {
            int totalCost = 0;
            int aCount = 0;
            int bCount = 0;
            int limitNum = costs.length / 2;

            
            //Array 만들기
            int[][] gapArray = new int[costs.length][2];
            for(int i = 0; i < costs.length; i++){
                gapArray[i][0] = i;
                gapArray[i][1] = Math.abs(costs[i][0]-costs[i][1]);
            }
            
            
            
            //sort
            Arrays.sort(gapArray, new Comparator<int[]>(){
                @Override 
                public int compare(int[] num1, int[] num2){
                    if(num1[1] == num2[1])
                        return Integer.compare(num1[0],num2[0]);
                    else
                        return Integer.compare(num1[1],num2[1]);
                }
            });
            
            // for(int i =0; i < gapArray.length;i++ )
            //         System.out.println(i+"th : "+gapArray[i][1]+" ("+gapArray[i][0]+") ");
        
            
            
            //decide
            for(int i = gapArray.length-1; i > -1; i--){
                
                
                if( ((costs[gapArray[i][0]][0] < costs[gapArray[i][0]][1]) && (aCount < limitNum)) || ((costs[gapArray[i][0]][0] > costs[gapArray[i][0]][1]) && (bCount >= limitNum)) ){
                    aCount++;
                    
                    totalCost += costs[gapArray[i][0]][0];
                    
                }else{
                    bCount++;
                    totalCost += costs[gapArray[i][0]][1];
                }
            }
            
            return totalCost;
         }
            
    }
    
}
