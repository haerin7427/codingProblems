package programmers;

// https://programmers.co.kr/learn/courses/30/lessons/81301?language=java
// title : 숫자 문자열과 영단어 
// time : 15m
// Create by haerin on 2022/01/11

public class Lv1_digitWord {

    class Solution {
        public int solution(String s) {
            
            String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven","eight","nine"};
            
            for(int i=0; i < 10; i++)
                s = s.replaceAll(words[i],Integer.toString(i));
    
            return Integer.parseInt(s);
        }
    }
    
}
