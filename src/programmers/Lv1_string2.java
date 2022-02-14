package programmers;
import java.util.*;

// https://programmers.co.kr/learn/courses/30/lessons/12917
// title : 문자열 내림차순으로 배치하기
// time : 10m
// Create by haerin on 2022/02/14

public class Lv1_string2 {
    class Solution {
        public String solution(String s) {

            String strArr[] = s.split("");
            Arrays.sort(strArr);
            Collections.reverse(Arrays.asList(strArr)); 

            return String.join("",strArr);
        }
    }
}
