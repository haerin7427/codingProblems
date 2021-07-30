package Week1;
// https://leetcode.com/problems/student-attendance-record-i/
// time : 10m

public class week1_D3_1 {

    class Solution {
        public boolean checkRecord(String s) {
            
            int countA =0, countL =0;
            
            for(int i = 0; i < s.length(); i++){
                
                if(s.charAt(i) == 'L')
                    countL++;
                else if(s.charAt(i) == 'A' ){
                    countA++;
                    countL = 0;
                }else
                    countL = 0;
                
                if(countA >= 2 || countL >= 3)
                    return false;
            }
            
            return true;
        }
    }
    
}
