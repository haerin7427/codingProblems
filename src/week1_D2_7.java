

// https://leetcode.com/problems/backspace-string-compare/
// 1. s 문자열 정리
// 2. t 문자열 정리
// 3. 같은 지 검사
// time : 20m

public class week1_D2_7 {

class Solution {
    public boolean backspaceCompare(String s, String t) {
        
        for(int i = 0; i < s.length(); i++){
            char test = s.charAt(i);
            
            if(test == '#'){
                if(i == 0){
                    s = s.substring(1,s.length());
                    i--;
                }else{
                    s = s.substring(0,i-1)+s.substring(i+1 ,s.length());
                    i -= 2;
                }
                
            }
        }

        for(int i = 0; i < t.length(); i++){
            char test = t.charAt(i);
            
            if(test == '#'){
                if(i == 0){
                    t = t.substring(1, t.length());
                    i -= 1;
                }else{
                    t = t.substring(0,i-1)+t.substring(i+1 ,t.length());
                    i -= 2;
                }
                
            }
        }
        
        if(s.equals(t))
            return true;
        else
            return false;
        
    }
}
    
}
