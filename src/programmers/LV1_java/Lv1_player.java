package programmers.LV1_java;
import java.util.HashMap;

// https://programmers.co.kr/learn/courses/30/lessons/42576?language=java
// time : 20m
// create by haerin on 2022/01/02 + help

public class Lv1_player {
    class Solution {
        public String solution(String[] participant, String[] completion) {
            String answer = "";
            HashMap<String, Integer> hm = new HashMap<>();
            for (String player : participant) 
                hm.put(player, hm.getOrDefault(player, 0) + 1);
            
            for (String player : completion) 
                hm.put(player, hm.get(player) - 1);

            for (String key : hm.keySet()) {
                if (hm.get(key) != 0){
                    answer = key;
                }
            }
            return answer;
        }
    }
}
