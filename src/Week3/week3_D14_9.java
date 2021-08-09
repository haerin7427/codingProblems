package Week3;

// https://leetcode.com/problems/decode-string/
// time: 5:12
// Create by haerin on 2021/08/09

public class week3_D14_9 {
    
}

//testcast
// "3[a]2[bc]"
// "3[a2[c]]"

// class Solution {
//     public String decodeString(String s) {
        
//         for(int i=0; i < s.length(); i++){
//             int startP =0;
//             int EndP = 0;
//             //System.out.println("1i: "+i);
            
//             if('0' < s.charAt(i) && s.charAt(i) <= '9'){
//                 startP =1;
//                 int secSP=-1;
//                 //System.out.println("2i: "+i);
                
//                 for(int k = i+2; k< s.length(); k++){
//                     //System.out.println("3i: "+i);
//                     //System.out.println("1k: "+k);
                    
                    
//                     if(s.charAt(k) == ']'){
//                         EndP += 1;
//                         //System.out.println("4i: "+i);
                        
//                         if(startP - EndP == 1)
//                             s = s.substring(0,secSP)+ decodeString(s.substring(secSP,k+1)) + s.substring(k+1,s.length());
//                         else if(startP == EndP){
//                             String temp = s.substring(i+2,k);
//                             //System.out.println("temp: "+ temp+"("+k+")");
//                             //System.out.println("5i: "+i);
                            
//                             String str="";
//                             for(int h=0; h < s.charAt(i)-'0';h++)
//                                 str += temp;
//                             s = s.substring(0,i)+ str + s.substring(k+1,s.length());
//                             i += str.length()-1;
//                             break;
//                         }
                        
//                     }else if('0' < s.charAt(k) && s.charAt(k) <= '9'){
//                         startP += 1;
//                         if(startP == 2)
//                             secSP = k;
//                         k+=1;
//                     }
//                 }
//             }
//         }
        
//         return s;
        
//     }
// }