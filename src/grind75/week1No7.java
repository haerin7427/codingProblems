package grind75;
// https://leetcode.com/problems/valid-anagram/
// title : 242. Valid Anagram
// time : 5m
// 유형 : 배열
// Created by haerin on 2023/01/13
import java.util.*;
public class week1No7 {
    class Solution {
        public boolean isAnagram(String s, String t) {
            char[] s_arr = s.toCharArray();
            Arrays.sort(s_arr);
            String new_s = new String(s_arr);
    
            char[] t_arr = t.toCharArray();
            Arrays.sort(t_arr);
            String new_t = new String(t_arr);
            return new_s.equals(new_t);
        }
    }
    // 속도, 메모리 둘다 solution2가 훨씬 나음
    class Solution2 {
        public boolean isAnagram(String s, String t) {
            int[] count = new int[26];
            for(char c : s.toCharArray()) {
                count[c-'a'] += 1;
            }
            for(char c : t.toCharArray()) {
                count[c-'a'] -= 1;
            }
            for(int c : count) {
                if(c != 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
