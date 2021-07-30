package Week2;
import java.util.ArrayDeque;

// https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string-ii/
// time - 45m (time limit exceeded) + discuss

public class week2_D7_9 {

    class Solution {
        public String removeDuplicates(String s, int k) {
            // ArrayDeque has better performance than Stack and LinkedList
            ArrayDeque<Adjacent> st = new ArrayDeque<>(s.length());
            for (char c : s.toCharArray()) {
                if (!st.isEmpty() && st.peekLast().ch == c) {
                    st.peekLast().freq++; // Increase the frequency
                } else {
                    st.addLast(new Adjacent(c, 1));
                }

                if (st.peekLast().freq == k) // If reach enough k duplicate letters -> then remove
                    st.removeLast();
            }
            StringBuilder sb = new StringBuilder();
            for (Adjacent a : st) {
                sb.append(String.valueOf(a.ch).repeat(a.freq));
            }
            return sb.toString();
        }
        
        class Adjacent {
            char ch;
            int freq;
            public Adjacent(char ch, int freq) {
                this.ch = ch;
                this.freq = freq;
            }
        }
        
    }

    
    
}


// class Solution {
//     public String removeDuplicates(String s, int k) {
//         int idx = 0;
//         int check =0;
//         while(idx < s.length() -k +1){            
//             check = 0;
//             for(int i = 1 ; i < k; i++){
//                 if(s.charAt(idx) != s.charAt(idx+i)){
//                     check = 1;
//                     break;
//                 }
//             }
//             if(check == 0){
//                 if(idx == 0){
//                     s = s.substring(k,s.length());
//                 }else{
//                     s = s.substring(0,idx) + s.substring(idx+k,s.length());            
//                     if(idx -k +1 < 0)
//                         idx = 0;
//                     else
//                         idx -= (k-1);
//                 }
//             }else
//                 idx += 1;
//         }
//         return s;
//     }
// }


// class Solution {
//     public String removeDuplicates(String s, int k) {
//         int idx = 0;
//         //int check =0;
//         while(idx < s.length() -k +1){             
//             StringBuilder sb = new StringBuilder();
//             for(int i = 0 ; i < k; i++)
//                 sb.append(s.charAt(idx));       
//             if(sb.substring(0,k).equals(s.substring(idx,idx+k)) == true){      
//                 if(idx == 0){
//                     s = s.substring(k,s.length());
//                 }else{
//                     s = s.substring(0,idx) + s.substring(idx+k,s.length());                 
//                     if(idx -k +1 < 0)
//                         idx = 0;
//                     else
//                         idx -= (k-1);
//                 }
//             }else
//                 idx += 1;
//             sb.setLength(0);
//         }   
//         return s;  
//     }
// }