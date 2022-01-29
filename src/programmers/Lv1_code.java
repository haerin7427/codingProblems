package programmers;

// https://programmers.co.kr/learn/courses/30/lessons/12926
// title : 시저 암호
// time : 15m
// Create by haerin on 2022/01/29

public class Lv1_code {

    class Solution {
        public String solution(String s, int n) {
            String answer = "";
            
            for(int i=0; i < s.length(); i++){
                char temp = s.charAt(i);
                if('A' <= temp && temp <= 'Z'){
                    if(temp + n > 'Z')
                        temp += (n - 26);
                    else
                        temp += n;
                        
                }else if('a' <= temp && temp <= 'z'){
                    if(temp + n > 'z')
                        temp += (n - 26);
                    else
                        temp += n;
                }
                answer += temp;
            }
            return answer;
        }
    }
    
}
