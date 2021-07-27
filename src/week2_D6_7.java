
// https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
// time : 10m
public class week2_D6_7 {

    class Solution {
        public String removeDuplicates(String s) {
            
            int idx = 0;
            
            while(idx < s.length()-1){
                
                if(s.charAt(idx) == s.charAt(idx+1)){
                    if(idx == 0){
                        s = s.substring(idx+2, s.length());
                    }else{
                        s = s.substring(0, idx) + s.substring(idx+2, s.length());
                        idx -= 1;
                    }
                }else
                    idx++;
            }
            
            return s;
        }
    }
}

// 참고!
// char[] ch = new char[S.length()];
//         int i = 0;
        
//         for(int j = 0; j < S.length(); j++){
//             if(i > 0 && ch[i - 1] == S.charAt(j)){
//                 i--;
//             }
//             else{
//                 ch[i] = S.charAt(j);
//                 i++;
//             }
//         }
//         return new String(ch, 0, i);
