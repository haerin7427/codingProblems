package Week4;

// https://leetcode.com/problems/roman-to-integer/
// time: 20m
// Create by haerin on 2021/08/24

public class week4_D16_3 {
    class Solution {
        public int romanToInt(String s) {
            
            // String[] symbols = {"I","V","X","L","C","D","M"};
            // int[] values = {1,5,10,50,100,500,1000};
            int ans=0;
            for(int i=s.length()-1; i>-1; i--){
                if(s.charAt(i)=='I')
                    ans+=1;
                else if(s.charAt(i)=='V'){
                    ans+=5;
                    
                    if(i>0 &&s.charAt(i-1) =='I'){
                        ans-=1;
                        i-=1;
                    }
                }else if(s.charAt(i)=='X'){
                    ans+=10;
                    
                    if(i>0 && s.charAt(i-1) =='I'){
                        ans-=1;
                        i-=1;
                    }
                }else if(s.charAt(i)=='L'){
                    ans+=50;
                    
                    if(i>0 &&s.charAt(i-1) =='X'){
                        ans-=10;
                        i-=1;
                    }
                }else if(s.charAt(i)=='C'){
                    ans+=100;
                    
                    if(i>0 &&s.charAt(i-1) =='X'){
                        ans-=10;
                        i-=1;
                    }
                }else if(s.charAt(i)=='D'){
                    ans+=500;
                    
                    if(i>0 &&s.charAt(i-1) =='C'){
                        ans-=100;
                        i-=1;
                    }
                }else if(s.charAt(i)=='M'){
                    ans+=1000;
                    
                    if(i>0 && s.charAt(i-1) =='C'){
                        ans-=100;
                        i-=1;
                    }
                }
                
            }
            
            return ans;
            
        }
    }
    
}
