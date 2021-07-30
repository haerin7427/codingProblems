package Week1;

// https://leetcode.com/problems/repeated-string-match/
// time : 20m

public class week1_D2_9 {

    class Solution {
        public int repeatedStringMatch(String a, String b) {
            
            for(int i = 0; i < b.length(); i++){
                
                if(a.contains(b.substring(i,i+1)) == false)
                    return - 1;       
            }
            
            int count =0;
            String testString = new String();
            
            while(testString.length() - a.length() + 1 <= b.length()){
                
                
                testString = testString + a;
                count++;            
                
                if(testString.contains(b) == true)
                    return count;
    
            }
            
            return -1;
              
        }
    }



}