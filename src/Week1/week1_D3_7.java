package Week1;

// https://leetcode.com/problems/lemonade-change/
// time : 10m

public class week1_D3_7 {

    class Solution {
        public boolean lemonadeChange(int[] bills) {
            int[] changes = new int[3];
            
            for(int i = 0; i < bills.length; i++){
                if(bills[i] == 5)
                    changes[0]++;
                else if(bills[i] == 10){
                    if(changes[0]>0){
                        changes[0]--;
                        changes[1]++;
                    }else{
                        return false;
                    }
                }else if(bills[i] == 20){
                    if(changes[0]>0 && changes[1]>0){
                        changes[0]--;
                        changes[1]--;
                        changes[2]++;
                    }else if(changes[0]>2 ){
                        changes[0] -= 3;
                        changes[2]++;
                    }else{
                        return false;
                    }
                    
                }
            }
            return true;
        }
    }
    
}
