package programmers.LV2_java;
import java.util.*;

// https://programmers.co.kr/learn/courses/30/lessons/42578
// title : 위장
// time : 10m
// Create by haerin on 2022/03/14

public class LV2_clothes {
    class Solution {
        public int solution(String[][] clothes) {
            
            HashMap<String, Integer> info = new HashMap<>();
            
            for(int i=0; i<clothes.length; i++)
                info.put(clothes[i][1], info.getOrDefault(clothes[i][1], 0) + 1);
            
            int answer = 1;
            for(String key :info.keySet())
                answer *= (info.get(key)+1);
            answer -= 1;
            
            return answer;
        }
    }
}
