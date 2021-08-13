package Week4;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/isomorphic-strings/
// time: 60m
// Create by haerin on 2021/08/13

public class week4_D20_1 {
    class Solution {
        public boolean isIsomorphic(String s, String t) {
             Map<Character, Character> map = new HashMap<Character, Character>();
            
            for(int i=0; i<s.length(); i++){
    
                if(map.containsKey(s.charAt(i))){ // key가 있는 경우
                    if(map.get(s.charAt(i)) != t.charAt(i)) // value가 다른 경우
                        return false;
                }else{
                    if(map.containsValue(t.charAt(i)))
                        return false;
                    else
                        map.put(s.charAt(i), t.charAt(i));
                }       
            }
            
            return true;
        }
    }
}
