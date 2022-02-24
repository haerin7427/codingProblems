package programmers;
import java.util.*;

// https://programmers.co.kr/learn/courses/30/lessons/12915?language=java
// title : 문자열 내 마음대로 정렬하기
// time : 30m
// Create by haerin on 2022/02/24

// 1. 2번째글자 비교
// 2. 사전 순 검사

public class Lv1_string4 {


    class Solution {
        public String[] solution(String[] strings, int n) {
            
            String[] answer = stringSort(strings, n);
            return answer;
        }
        
        private String[] stringSort (String[] strings, int n){
            
            Arrays.sort(strings, new Comparator<String>(){
                @Override
                public int compare(String s1, String s2){
                    if (s1.charAt(n) > s2.charAt(n)) {
                        return 1;
                    } else if (s1.charAt(n) == s2.charAt(n)) {
                        return s1.compareTo(s2);
                    } else {
                        return -1;
                    }
                }
            });
            
            return strings;
        }
    }

}
