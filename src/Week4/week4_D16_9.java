package Week4;

// https://leetcode.com/problems/stone-game/
// time: 35m
// Create by haerin on 2021/08/24 + Discussion

public class week4_D16_9 {

    class Solution {
        public boolean stoneGame(int[] piles) {
            int a=0, b=0, l=piles.length-1, i=0;
            boolean f=true;
            
            while(l>=i){
                if(f){
                    //alice
                    if(piles[i]>piles[l]){
                        a+=piles[i];
                        i++;
                    }else{
                        a+=piles[l];
                        l--;
                    }
                    f=false;
                }else{
                    //bob
                    if(piles[i]<piles[l]){
                        b+=piles[i];
                        i++;
                    }else{
                        b+=piles[l];
                        l--;
                    }
                    f=true;
                }
            }
            
            return a>b?true:false; 
        }
    }
    
}
