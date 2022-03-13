package programmers.LV1_java;
import java.util.*;
// https://programmers.co.kr/learn/courses/30/lessons/1845
// title : 포켓몬
// time : 20m
// Create by haerin on 2022/01/13
// Update by haerin on 2022/01/19

public class Lv1_monster {

    class Solution {
        public int solution(int[] nums) {
            
            int n = nums.length;
            int answer = n/2;
            
            Set monsterSet = new HashSet();
            for(int monster : nums)
                monsterSet.add(monster);
            
            if(monsterSet.size() < n/2)
                answer = monsterSet.size();
            
            return answer;
        }
    }
    
}
