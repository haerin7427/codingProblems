package Week3;

// https://leetcode.com/problems/decode-string/
// time: 80m
// Create by haerin on 2021/08/09

public class week3_D14_9 {

    class Solution {
        public String decodeString(String s) {
            int numC =0;
            for(int i=0; i < s.length(); i++){
                int startP =0;
                int EndP = 0;
                                
                if('0' <= s.charAt(i) && s.charAt(i) <= '9'){
                    numC+=1;
                    startP =1;
                    int secSP=-1;
                    if(s.charAt(i+1) =='['){
                        
                        for(int k = i+2; k< s.length(); k++){
                    
                        
                        
                        if(s.charAt(k) == ']'){
                            EndP += 1;
                            
                            if(startP - EndP == 1){
                                String mid = decodeString(s.substring(secSP,k+1));
                                
                                
                                int len = s.substring(k+1,s.length()).length();
                                s = s.substring(0,secSP)+ mid + s.substring(k+1,s.length());
                                k = s.length() - len -1;
                                
                                
                            }else if(startP == EndP){
                                
                                String temp = s.substring(i+2,k);
                                
                                
                                System.out.println("s:"+ s);
                                 int w = i-numC+1;
                                 int f = i+1;
    
                                String str="";
                                for(int h=0; h < Integer.parseInt(s.substring(i-numC+1, i+1));h++)
                                    str += temp;
                                s = s.substring(0,i-numC+1)+ str + s.substring(k+1,s.length());
                                i = i-numC +str.length()-1;
                                numC =0;
                                break;
                            }
                            
                        }else if('0' <= s.charAt(k) && s.charAt(k) <= '9'){
                            startP += 1;
                            if(startP == 2)
                                secSP = k;
                            k+=1;
                        }
                    }
                    }
                    
                }
            }
            
            return s;
            
        }
    }
    
}

