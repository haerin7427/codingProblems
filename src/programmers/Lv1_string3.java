package programmers;

// https://programmers.co.kr/learn/courses/30/lessons/12930
// title : 이상한 문자 만들기
// time : 10m
// Create by haerin on 2022/02/15

public class Lv1_string3 {
    class Solution {
        public String solution(String s) {
            s = s.toLowerCase();
            String answer = "";
            int isCheck = 0;
            for(int i=0; i<s.length(); i++){
                char temp = s.charAt(i);
                if(temp != ' '){
                    if(isCheck%2 == 0){
                        temp -= 32;
                    }
                    answer += temp;
                    isCheck+=1;
                }else{
                    answer += ' ';
                    isCheck = 0;
                }
                    
            }
            return answer;
        }
    }
}
