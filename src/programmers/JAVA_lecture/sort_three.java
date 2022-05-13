package programmers.JAVA_lecture;

// 프로그래머스 "JadenCase 문자열 만들기"
// Create by haerin on 2022//05/13

public class sort_three {

    class Solution {
        public String solution(String s) {
            s = s.toLowerCase();
            
            StringBuffer sb = new StringBuffer();
            char last = ' ';
            for(char c : s.toCharArray()){
                if(last == ' ') c = Character.toUpperCase(c);
                
                sb.append(c);
                last = c;
            }
            return sb.toString();
        }
    }
}
