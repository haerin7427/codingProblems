package programmers;
import java.util.*;

// https://programmers.co.kr/learn/courses/30/lessons/12919
// title : 서울에서 김서방 찾기 
// time : 5m
// Create by haerin on 2022/02/04

public class Lv1_kim {
    class Solution {
        public String solution(String[] seoul) {
            
            int idx = Arrays.asList(seoul).indexOf("Kim");
            String answer = "김서방은 " + idx + "에 있다";
            
            return answer;
        }
    }
}
