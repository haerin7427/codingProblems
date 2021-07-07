
// https://leetcode.com/problems/two-city-scheduling/
// time : 

public class week1_D1_9 {

    class Solution {
        public int twoCitySchedCost(int[][] costs) {
            int totalCost = 0;
            int aCount = 0;
            int bCount = 0;
            int limitNum = costs.length / 2;

            
            //Array 만들기
            int[][] gapArray = new int[limitNum][2];
            for(int i = 0; i < limitNum; i++){
                gapArray[i][0] = 2*i;
                gapArray[i][1] = Math.abs(costs[i][0]-costs[i][1]);
            }
            
            //sort
            
            
            //decide
            for(int i =0; i < gapArray.length; i++){
                
                
                if( (costs[gapArray[i][0]] < costs[gapArray[i][0]+1] && aCount < limitNum) || (costs[i] > costs[i+1] && bCount >= limitNum){
                    
                }
            }
        }
    }
    
}
