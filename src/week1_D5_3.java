
// https://programmers.co.kr/learn/courses/30/lessons/42883
// time : 60m + search
public class week1_D5_3 {

    class Solution {
        public String solution(String number, int k) {
            int idx = 0;
            
            while(k > 0  ){
                
                if(idx >= number.length()-1){
                    number = number.substring(0, number.length()-k+1);
                    k = 0;
                }else if(number.charAt(idx) < number.charAt(idx+1)){
                    
                    if(idx == 0)
                        number = number.substring(idx+1, number.length());
                    else{
                        number = number.substring(0, idx) + number.substring(idx+1, number.length());
                        idx -= 1;
                    }
                    k -= 1;
                    
                }else
                    idx++;
                
            }
            
            return number;
        }
    }


    class Solution {
        public String solution(String number, int k) {
    
            StringBuilder sb = new StringBuilder(number);
            for (int i = 0; i+1 < sb.length() && k>0; i++) {
    
                if(sb.charAt(i) != '9' && sb.charAt(i) < sb.charAt(i+1)) {
                    sb.deleteCharAt(i);
                    i=-1;
                    k--;
                }
            }
            if(k!=0)
                sb.delete(sb.length()-k, sb.length());
            return sb.toString();
    
        }
    }
    
}