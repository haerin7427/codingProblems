package Week1;

// https://leetcode.com/problems/longest-common-prefix/
// time : 25m
public class week1_D2_3 {

    class Solution {
        public String longestCommonPrefix(String[] strs) {
            
            int minLen = 200;
            for(int i = 0; i < strs.length;i++){
                if(minLen > strs[i].length())
                    minLen = strs[i].length();
            }
            int isDone = 0;
            int numPre = 0;
            
    
            
            
            
            for(int i = 0; i < minLen; i++){
                char checkWord = strs[0].charAt(i);
                for(int h = 1; h < strs.length; h++){
                    if(checkWord != strs[h].charAt(i)){
                        isDone = 1;
                        break;
                    }
                }
                
                if(isDone == 1)
                    break;
                else
                    numPre++;
                
            }
            
            if(numPre > 0) 
                return strs[0].substring(0,numPre);
            else
                return "";
        }
    }
    
}
