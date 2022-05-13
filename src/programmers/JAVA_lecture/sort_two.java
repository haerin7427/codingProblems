package programmers.JAVA_lecture;
import java.util.*;

// 프로그래머스 "문자열 내 마음대로 정렬하기"
// Create by haerin on 2022//05/13

public class sort_two {
    class Solution {
        public String[] solution(String[] strings, int n) {
            
            Arrays.sort(strings, new Comparator<String>(){
                @Override
                public int compare(String s1, String s2){
                    if(s1.substring(n,n+1).equals(s2.substring(n,n+1)))
                        return s1.compareTo(s2);
                    else
                        return s1.substring(n,n+1).compareTo(s2.substring(n,n+1));
                }
            });
            return strings;
        }
    }
}
