package programmers.LV2_java;

// https://programmers.co.kr/learn/courses/30/lessons/42883
// title : 큰 수 만들기
// time : 27m + ??
// Create by haerin on 2022/03/21

public class LV2_bigNumber {

    class Solution {
        public String solution(String number, int k) {
            String answer = "";
            
            for(int i=0; i<k; i++){
                String limit = findBigNumber(number);
                
                if(number.substring(0,1).equals(limit))
                    number = removeMinNumberWithLimit(number, "");
                else
                    number = removeMinNumberWithLimit(number, limit);
            }
            return number;
        }
        
        public String findBigNumber(String number){
            
            int idx=0; String max = number.substring(0,1);
                
            for(int h=1; h<number.length(); h++)
                if(Integer.parseInt(max) < Integer.parseInt(number.substring(h,h+1))){
                    idx = h;
                    max = number.substring(h,h+1);
            }
            return number.substring(idx,idx+1);
            
        }
        
        public String removeMinNumberWithLimit(String number, String limit){
            
            
            int max=1; int idx=0; char min = number.charAt(0);    
            for(int h=1; h<number.length(); h++){
                if(number.substring(h,h+1).equals(limit)){
                    max = h;
                    break;
                }
                if(min > number.charAt(h)){
                    idx = h;
                    min = number.charAt(h);
                }
            }
            number = number.substring(0,idx) + number.substring(idx+1);
            return number; 
        }
    }
    
}
