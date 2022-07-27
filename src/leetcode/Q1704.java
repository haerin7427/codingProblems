package leetcode;
// https://leetcode.com/problems/determine-if-string-halves-are-alike/
// title : 1704. Determine if String Halves Are Alike
// time : 5m
// Created by haerin on 2022/07/27

public class Q1704 {
    class Solution {
        public boolean halvesAreAlike(String s) {
            s = s.toUpperCase();
            String a = s.substring(0, s.length()/2);
            String b = s.substring(s.length()/2);
            
            a = a.replaceAll("[^AEIOU]","");
            b = b.replaceAll("[^AEIOU]","");
            
            if(a.length() == b.length()) return true;
            else return false;
        }
    }
}
